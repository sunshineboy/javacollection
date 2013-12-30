/**
 * File name： IRes.java
 * Author：        wangpj
 * Create Date： 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.clarity;

/**
 * @author wangpj
 * 
 */
public interface IRes {

	/** 加入新的物品 */
	public void addRes(IRes res);

	/** 放回物品 */
	public void removeRes(IRes res);

	/** 购物买单,示意性的商业方法 */
	public void pay();
}
