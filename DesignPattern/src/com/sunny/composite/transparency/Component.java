/**
 * File name�� Compoent.java
 * Author��        wangpj
 * Create Date�� 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.transparency;

import java.util.List;

/**
 * @author wangpj
 * 
 */
public abstract class Component {

	/**
	 * ��������������� user: wangpj tags: @param preStr date: 2013-12-23 void
	 */
	public abstract void printStruts(String preStr);

	/**
	 * �ۼ�������������һ���ӹ�������
	 * 
	 * @param child
	 *            �ӹ�������
	 */
	public void addChild(Component child) {
		/**
		 * ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û�д˹��� ���������û��ʵ���������
		 */
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}

	/**
	 * �ۼ���������ɾ��һ���ӹ�������
	 * 
	 * @param index
	 *            �ӹ���������±�
	 */
	public void removeChild(int index) {
		/**
		 * ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û�д˹��� ���������û��ʵ���������
		 */
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}

	/**
	 * �ۼ������������������ӹ�������
	 */
	public List<Component> getChild() {
		/**
		 * ȱʡʵ�֣��׳��쳣����ΪҶ�Ӷ���û�д˹��� ���������û��ʵ���������
		 */
		throw new UnsupportedOperationException("����֧�ִ˹���");
	}
}
