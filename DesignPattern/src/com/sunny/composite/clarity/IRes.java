/**
 * File name�� IRes.java
 * Author��        wangpj
 * Create Date�� 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.clarity;

/**
 * @author wangpj
 * 
 */
public interface IRes {

	/** �����µ���Ʒ */
	public void addRes(IRes res);

	/** �Ż���Ʒ */
	public void removeRes(IRes res);

	/** ������,ʾ���Ե���ҵ���� */
	public void pay();
}
