package com.sunny.composite.transparency;

public class Leaf extends Component {
	/**
	 * Ҷ�Ӷ��������
	 */
	private String name;

	/**
	 * ���췽��������Ҷ�Ӷ��������
	 * 
	 * @param name
	 *            Ҷ�Ӷ��������
	 */
	public Leaf(String name) {
		this.name = name;
	}

	/**
	 * ���Ҷ�Ӷ���Ľṹ��Ҷ�Ӷ���û���Ӷ���Ҳ�������Ҷ�Ӷ��������
	 * 
	 * @param preStr
	 *            ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӵĿո�ʵ���������
	 */
	@Override
	public void printStruts(String preStr) {
		System.out.println(preStr + "-" + name);
	}

}