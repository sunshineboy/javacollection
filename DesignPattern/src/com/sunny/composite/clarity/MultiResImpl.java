/**
 * File name： MultiResImpl.java
 * Author：        wangpj
 * Create Date： 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.clarity;

import java.util.Iterator;
import java.util.Vector;

/**
 * @author wangpj
 * 
 */
public class MultiResImpl implements IRes {
	/** 购物车 */
	private Vector<IRes> car = new Vector<IRes>();
	private static float totle = 0.0f;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunny.composite.security.IRes#pay()
	 */
	@Override
	public void pay() {
		if (!car.isEmpty()) {
			System.out.println("名称            价格");

			shopping();

			System.out.println("\n总价:" + totle + "元");
		} else {
			System.out.println("您好，你没有购买任何物品，不用买单！");
		}
	}

	/**
	 * user: wangpj tags: date: 2013-12-24 void
	 */
	private void shopping() {
		Iterator<IRes> iterator = car.iterator();

		IRes iRes = null;// 临时对象
		SingleResImpl res = null;
		while (iterator.hasNext()) {
			iRes = iterator.next();
			if (iRes instanceof SingleResImpl) {
				res = (SingleResImpl) iRes;
				synchronized (this) {
					totle += res.getMoney();
				}
				System.out.println(res.getName() + "      " + res.getMoney()
						+ "元");
			} else {
				((MultiResImpl) iRes).shopping();
			}
		}
	}

	@Override
	public void addRes(IRes iRes) {
		car.add(iRes);
	}

	@Override
	public void removeRes(IRes iRes) {
		car.remove(iRes);
	}

}
