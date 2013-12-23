/**
 * File name�� Composite.java
 * Author��        wangpj
 * Create Date�� 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.transparency;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangpj
 * 
 */
public class Composite extends Component {

	/**
	 * �����洢��϶����а��������������
	 */
	private List<Component> childComponents = new ArrayList<Component>();

	/**
	 * ��϶��������
	 */
	private String name;

	/**
	 * ���췽����������϶��������
	 * 
	 * @param name
	 *            ��϶��������
	 */
	public Composite(String name) {
		this.name = name;
	}

	/**
	 * �ۼ�������������һ���ӹ�������
	 * 
	 * @param child
	 *            �ӹ�������
	 */
	public void addChild(Component child) {
		childComponents.add(child);
	}

	/**
	 * �ۼ���������ɾ��һ���ӹ�������
	 * 
	 * @param index
	 *            �ӹ���������±�
	 */
	public void removeChild(int index) {
		childComponents.remove(index);
	}

	/**
	 * �ۼ������������������ӹ�������
	 */
	public List<Component> getChild() {
		return childComponents;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.sunny.composite.transparency.Component#printStruts(java.lang.String)
	 */
	@Override
	public void printStruts(String preStr) {
		// TODO Auto-generated method stub
		// �Ȱ��Լ����
		System.out.println(preStr + "+" + this.name);
		// ��������������������ô�������Щ���������
		if (this.childComponents != null) {
			// ��������ո񣬱�ʾ������������ո�
			preStr += "  ";
			// �����ǰ������Ӷ���
			for (Component c : childComponents) {
				// �ݹ����ÿ���Ӷ���
				c.printStruts(preStr);
			}
		}
	}

}
