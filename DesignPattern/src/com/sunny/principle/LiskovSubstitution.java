/**
 * File name£∫ LiskovSubstitution.java
 * Author£∫        wangpj
 * Create Date£∫ 2013-12-30
 * Description:¿Ô œÃÊªª‘≠‘Ú
 * 
 */

package com.sunny.principle;

/**
 * @author wangpj
 * 
 */
public class LiskovSubstitution {

	/**
	 * user: wangpj tags: @param args date: 2013-12-30 void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b = new B();
		System.out.println("100-50=" + b.func1(100, 50));
		System.out.println("100-80=" + b.func1(100, 80));
		System.out.println("100+20+100=" + b.func2(100, 20));
	}

}

class A {
	public int func1(int a, int b) {
		return a - b;
	}
}

class B extends A {
	public int func1(int a, int b) {
		return a + b;
	}

	public int func2(int a, int b) {
		return func1(a, b) + 100;
	}
}