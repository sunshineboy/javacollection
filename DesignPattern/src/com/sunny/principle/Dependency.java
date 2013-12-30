/**
 * File name�� Dependency.java
 * Author��        wangpj
 * Create Date�� 2013-12-30
 * Description:����(Dependency)��ϵ��������֮������ӡ�
 * ������ϵ��ʾһ������������һ����Ķ��塣���磬һ����(Person)������(car)�ͷ���(House)��
 * Person��������Car���House��Ķ��壬��ΪPerson��������Car��House��
 * �������ͬ���ǣ�Person���ﲢû��Car��House���͵����ԣ�
 * Car��House��ʵ�����Բ����ķ�ʽ���뵽buy()������ȥ�ġ�
 * һ����ԣ�������ϵ��Java����������Ϊ����������������βΣ����߶Ծ�̬�����ĵ��á�
 * 
 */

package com.sunny.principle;

/**
 * @author wangpj ������֮��Ĺ�ϵ:����
 */
public class Dependency {

}

class Car {
	public void run() {
		System.out.println("�����ڱ���");
	}

	public static void run1() {
		System.out.println("�����ڱ���");
	}
}

class Driver {

	// ʹ���βεķ�ʽ����������ϵ
	public void driver1(Car car) {
		car.run();
	}

	// ʹ�þֲ������ķ�ʽ����������ϵ
	public void driver2() {
		Car car = new Car();
		car.run();
	}

	// ʹ�þ�̬�������õķ�ʽ����������ϵ
	public void driver3() {
		Car.run1();
	}

}