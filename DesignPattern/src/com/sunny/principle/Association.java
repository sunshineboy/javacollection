/**
 * File name�� Association.java
 * Author��        wangpj
 * Create Date�� 2013-12-30
 * Description:����(Association����ϵ��������֮������ӣ���ʹһ����֪����һ��������Ժͷ�����
 * ����������˫��ģ�Ҳ�����ǵ���ġ���Java�����У�������ϵһ��ʹ�ó�Ա������ʵ�֡�
 * 
 */

package com.sunny.principle;

/**
 * @author wangpj
 * 
 */
public class Association {

}

class Car1 {
	public void run() {
		System.out.println("�����ڱ���");
	}

	public static void run1() {
		System.out.println("�����ڱ���");
	}
}

class Driver1 {

	// ʹ�ó�Ա��������ʽ����������ϵ
	Car1 car;
	
	public void driver1() {
		car.run();
	}
	
	//ʹ�÷����βεķ�ʽ����������ϵ
	public void driver1(Car car1) {
		car1.run();
	}

	public Car1 getCar() {
		return car;
	}

	public void setCar(Car1 car) {
		this.car = car;
	}

}