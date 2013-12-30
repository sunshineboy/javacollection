/**
 * File name： Aggregation.java
 * Author：        wangpj
 * Create Date： 2013-12-30
 * Description:聚合(Aggregation) 关系是关联关系的一种，是强的关联关系。
 * 聚合是整体和个体之间的关系。例如，汽车类与引擎类、轮胎类，以及其它的零件类之间的关系便整体和个体的关系。
 * 与关联关系一样，聚合关系也是通过实例变量实现的。
 * 但是关联关系所涉及的两个类是处在同一层次上的，而在聚合关系中，两个类是处在不平等层次上的，一个代表整体，另一个代表部分。
 * 
 */

package com.sunny.principle;

/**
 * @author wangpj 类与类之间的关系：聚合关系
 */
public class Aggregation {

}

class Car2 {

	public void run() {
		System.out.println("汽车在奔跑");
	}
}

class Driver2 {
	// 使用成员变量形式实现聚合关系
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