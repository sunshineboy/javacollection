/**
 * File name： Dependency.java
 * Author：        wangpj
 * Create Date： 2013-12-30
 * Description:依赖(Dependency)关系是类与类之间的联接。
 * 依赖关系表示一个类依赖于另一个类的定义。例如，一个人(Person)可以买车(car)和房子(House)，
 * Person类依赖于Car类和House类的定义，因为Person类引用了Car和House。
 * 与关联不同的是，Person类里并没有Car和House类型的属性，
 * Car和House的实例是以参量的方式传入到buy()方法中去的。
 * 一般而言，依赖关系在Java语言中体现为局域变量、方法的形参，或者对静态方法的调用。
 * 
 */

package com.sunny.principle;

/**
 * @author wangpj 类与类之间的关系:依赖
 */
public class Dependency {

}

class Car {
	public void run() {
		System.out.println("汽车在奔跑");
	}

	public static void run1() {
		System.out.println("汽车在奔跑");
	}
}

class Driver {

	// 使用形参的方式发生依赖关系
	public void driver1(Car car) {
		car.run();
	}

	// 使用局部变量的方式发生依赖关系
	public void driver2() {
		Car car = new Car();
		car.run();
	}

	// 使用静态方法调用的方式发生依赖关系
	public void driver3() {
		Car.run1();
	}

}