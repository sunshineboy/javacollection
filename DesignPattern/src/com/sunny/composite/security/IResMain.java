/**
 * File name�� IResMain.java
 * Author��        wangpj
 * Create Date�� 2013-12-24
 * Description:
 * 
 */

package com.sunny.composite.security;

/**
 * @author wangpj
 * 
 */
public class IResMain {

	/**
	 * user: wangpj tags: @param args date: 2013-12-24 void
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
		((MultiResImpl) mutiIRes).addRes(one);

		/** ��Ϊ�ǰ�ȫ��ʽ�����ģʽ����˲���͸����ֻ����ȷ������ת�ͣ�Ȼ���ټ��빺�ﳵ�� */
		((MultiResImpl) one).addRes(new SingleResImpl("����", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("Сǿ", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("��ܽ��", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("�츣��", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("����", 28.5f));
		((MultiResImpl) one).addRes(new SingleResImpl("ŵ����", 28.5f));

		/** �ڶ�¥���ʳ�� */
		IRes two = new MultiResImpl();
		/** ��һ¥��Ķ������빺�ﳵ */
		((MultiResImpl) mutiIRes).addRes(two);
		((MultiResImpl) two).addRes(new SingleResImpl("�·�", 130.5f));
		((MultiResImpl) two).addRes(new SingleResImpl("����", 10f));

		IRes bao = new MultiResImpl();
		((MultiResImpl) two).addRes(bao);// �ѹ���С��װ�ڶ�¥���ﳵ��
		((MultiResImpl) bao).addRes(new SingleResImpl("�ֱ�", 100f));

		/** �ص�һ¥��������ƻ������ */
		((MultiResImpl) one).addRes(new SingleResImpl("ƻ��", 10.0f));
		((MultiResImpl) one).addRes(new SingleResImpl("��", 3.0f));
		/** ����֮ǰ�Ұѿ������ˣ���Ϊ���ﻹ�е��� */
		((MultiResImpl) one).removeRes(new SingleResImpl("Сǿ", 28.5f));
		/** ������̨һ���ԶԹ��ﳵ������Ʒ�� */
		mutiIRes.pay();
	}

}
