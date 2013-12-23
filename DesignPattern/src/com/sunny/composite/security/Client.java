/**
 * File name�� Client.java
 * Author��        wangpj
 * Create Date�� 2013-12-20
 * Description:
 * 
 */

package com.sunny.composite.security;

/**
 * @author wangpj
 * 
 */
public class Client {

	/**
	 * user: wangpj tags: @param args date: 2013-12-20 void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Composite root = new Composite("��װ");
		Composite c1 = new Composite("��װ");
		Composite c2 = new Composite("Ůװ");

		Leaf leaf1 = new Leaf("����");
		Leaf leaf2 = new Leaf("�п�");
		Leaf leaf3 = new Leaf("ȹ��");
		Leaf leaf4 = new Leaf("��װ");

		root.addChild(c1);
		root.addChild(c2);
		
		c1.addChild(leaf1);
		c1.addChild(leaf2);
		c2.addChild(leaf3);
		c2.addChild(leaf4);
		
		root.printStruct("");
	}

}