/**
 * File name�� SingleResImpl.java
 * Author��        wangpj
 * Create Date�� 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.clarity;

/**
 * @author wangpj ��һ��Ʒ ��Ҷ����
 */
public class SingleResImpl implements IRes {

	/** ��Ʒ���� */
	private String name;
	/** ��Ǯ */
	private float money;

	public SingleResImpl(String name, float money) {
		this.name = name;
		this.money = money;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunny.composite.security.IRes#pay()
	 */
	@Override
	public void pay() {
		System.out.println("������һ����Ʒ[" + getName() + "],��Ǯ��[" + getMoney()
				+ "]Ԫ");
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the money
	 */
	public float getMoney() {
		return money;
	}

	/**
	 * @param money
	 *            the money to set
	 */
	public void setMoney(float money) {
		this.money = money;
	}

	/** ��дequals */
	public boolean equals(Object obj) {
		SingleResImpl res = (SingleResImpl) obj;
		return res.getName().equals(getName()) && res.getMoney() == getMoney();
	}

	/* (non-Javadoc)
	 * @see com.sunny.composite.clarity.IRes#addRes(com.sunny.composite.clarity.IRes)
	 */
	@Override
	public void addRes(IRes res) {
		// TODO Auto-generated method stub
	}

	/* (non-Javadoc)
	 * @see com.sunny.composite.clarity.IRes#removeRes(com.sunny.composite.clarity.IRes)
	 */
	@Override
	public void removeRes(IRes res) {
		// TODO Auto-generated method stub
		
	}
}
