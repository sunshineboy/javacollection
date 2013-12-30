/**
 * File name�� MultiResImpl.java
 * Author��        wangpj
 * Create Date�� 2013-12-23
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
	/** ���ﳵ */
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
			System.out.println("����            �۸�");

			shopping();

			System.out.println("\n�ܼ�:" + totle + "Ԫ");
		} else {
			System.out.println("���ã���û�й����κ���Ʒ�������򵥣�");
		}
	}

	/**
	 * user: wangpj tags: date: 2013-12-24 void
	 */
	private void shopping() {
		Iterator<IRes> iterator = car.iterator();

		IRes iRes = null;// ��ʱ����
		SingleResImpl res = null;
		while (iterator.hasNext()) {
			iRes = iterator.next();
			if (iRes instanceof SingleResImpl) {
				res = (SingleResImpl) iRes;
				synchronized (this) {
					totle += res.getMoney();
				}
				System.out.println(res.getName() + "      " + res.getMoney()
						+ "Ԫ");
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
