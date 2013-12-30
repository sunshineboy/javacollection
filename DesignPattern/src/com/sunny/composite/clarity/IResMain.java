/**
* File name�� IResMain.java
* Author��        wangpj
* Create Date�� 2013-12-24
* Description:
* 
 */

package com.sunny.composite.clarity;

import com.sunny.composite.clarity.IRes;
import com.sunny.composite.clarity.MultiResImpl;
import com.sunny.composite.clarity.SingleResImpl;

/**
 * @author wangpj
 *
 */
public class IResMain {

	/**
	 * user: wangpj
	 * tags: @param args
	 * date: 2013-12-24
	 * void
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/** ��֧ѩ�� */
		IRes singleIRes = new SingleResImpl("ѩ��", 1.5f);
		/** �� */
		singleIRes.pay();

		/** ������ˣ������˸����ﳵ������㶫�� */
		IRes mutiIRes = new MultiResImpl();

		/** ��һ¥���ʳ�� */
		IRes one = new MultiResImpl();
		/** ��һ¥��Ķ������빺�ﳵ */
		mutiIRes.addRes(one);

		/** ��Ϊ�ǰ�ȫ��ʽ�����ģʽ����˲���͸����ֻ����ȷ������ת�ͣ�Ȼ���ټ��빺�ﳵ�� */
		one.addRes(new SingleResImpl("����", 28.5f));
		one.addRes(new SingleResImpl("Сǿ", 28.5f));
		one.addRes(new SingleResImpl("��ܽ��", 28.5f));
		one.addRes(new SingleResImpl("�츣��", 28.5f));
		one.addRes(new SingleResImpl("����", 28.5f));
		one.addRes(new SingleResImpl("ŵ����", 28.5f));

		/** �ڶ�¥���ʳ�� */
		IRes two = new MultiResImpl();
		/** ��һ¥��Ķ������빺�ﳵ */
		mutiIRes.addRes(two);
		two.addRes(new SingleResImpl("�·�", 130.5f));
		two.addRes(new SingleResImpl("����", 10f));

		IRes bao = new MultiResImpl();
		two.addRes(bao);// �ѹ���С��װ�ڶ�¥���ﳵ��
		bao.addRes(new SingleResImpl("�ֱ�", 100f));

		/** �ص�һ¥��������ƻ������ */
		one.addRes(new SingleResImpl("ƻ��", 10.0f));
		one.addRes(new SingleResImpl("��", 3.0f));
		/** ����֮ǰ�Ұѿ������ˣ���Ϊ���ﻹ�е��� */
		one.removeRes(new SingleResImpl("Сǿ", 28.5f));
		/** ������̨һ���ԶԹ��ﳵ������Ʒ�� */
		mutiIRes.pay();
	}

}
