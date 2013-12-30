/**
* File name： Composition.java
* Author：        wangpj
* Create Date： 2013-12-30
* Description:组合(Composition) 关系是关联关系的一种，是比聚合关系强的关系。
* 它要求普通的聚合关系中代表整体的对象负责代表部分对象的生命周期，组合关系是不能共享的。
* 代表整体的对象需要负责保持部分对象和存活，在一些情况下将负责代表部分的对象湮灭掉。
* 代表整体的对象可以将代表部分的对象传递给另一个对象，由后者负责此对象的生命周期。
* 换言之，代表部分的对象在每一个时刻只能与一个对象发生组合关系，由后者排他地负责生命周期。部分和整体的生命周期一样。
* 
 */

package com.sunny.principle;

/**
 * @author wangpj
 *
 */
public class Composition {

}

class Car3{
	public void run(){
		System.out.println("汽车在奔跑");
	}
}

class Driver3{
	Car3 car3;
	
	//使用构造方法的参数形式来实现组合关系
	public Driver3(Car3 car3){
		this.car3 = car3;
	}
	
}