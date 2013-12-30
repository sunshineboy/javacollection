/**
 * File name�� Aggregation.java
 * Author��        wangpj
 * Create Date�� 2013-12-30
 * Description:�ۺ�(Aggregation) ��ϵ�ǹ�����ϵ��һ�֣���ǿ�Ĺ�����ϵ��
 * �ۺ�������͸���֮��Ĺ�ϵ�����磬�������������ࡢ��̥�࣬�Լ������������֮��Ĺ�ϵ������͸���Ĺ�ϵ��
 * �������ϵһ�����ۺϹ�ϵҲ��ͨ��ʵ������ʵ�ֵġ�
 * ���ǹ�����ϵ���漰���������Ǵ���ͬһ����ϵģ����ھۺϹ�ϵ�У��������Ǵ��ڲ�ƽ�Ȳ���ϵģ�һ���������壬��һ�������֡�
 * 
 */

package com.sunny.principle;

/**
 * @author wangpj ������֮��Ĺ�ϵ���ۺϹ�ϵ
 */
public class Aggregation {

}

class Car2 {

	public void run() {
		System.out.println("�����ڱ���");
	}
}

class Driver2 {
	// ʹ�ó�Ա������ʽʵ�־ۺϹ�ϵ
	Car2 car2;

	public void driver() {
		car2.run();
	}

	public Car2 getCar2() {
		return car2;
	}

	public void setCar2(Car2 car2) {
		this.car2 = car2;
	}

}