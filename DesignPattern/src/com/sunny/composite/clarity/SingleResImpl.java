/**
 * File name： SingleResImpl.java
 * Author：        wangpj
 * Create Date： 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.clarity;

/**
 * @author wangpj 单一物品 树叶构件
 */
public class SingleResImpl implements IRes {

	/** 物品名称 */
	private String name;
	/** 价钱 */
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
		System.out.println("购买了一件物品[" + getName() + "],价钱是[" + getMoney()
				+ "]元");
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

	/** 重写equals */
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
