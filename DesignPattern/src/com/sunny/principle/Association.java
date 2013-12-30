/**
 * File name： Association.java
 * Author：        wangpj
 * Create Date： 2013-12-30
 * Description:关联(Association）关系是类与类之间的联接，它使一个类知道另一个类的属性和方法。
 * 关联可以是双向的，也可以是单向的。在Java语言中，关联关系一般使用成员变量来实现。
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
		System.out.println("汽车在奔跑");
	}

	public static void run1() {
		System.out.println("汽车在奔跑");
	}
}

class Driver1 {

	// 使用成员变量的形式发生关联关系
	Car1 car;
	
	public void driver1() {
		car.run();
	}
	
	//使用方法形参的方式发生关联关系
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