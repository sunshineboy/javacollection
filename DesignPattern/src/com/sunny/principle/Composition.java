/**
* File name�� Composition.java
* Author��        wangpj
* Create Date�� 2013-12-30
* Description:���(Composition) ��ϵ�ǹ�����ϵ��һ�֣��ǱȾۺϹ�ϵǿ�Ĺ�ϵ��
* ��Ҫ����ͨ�ľۺϹ�ϵ�д�������Ķ���������ֶ�����������ڣ���Ϲ�ϵ�ǲ��ܹ���ġ�
* ��������Ķ�����Ҫ���𱣳ֲ��ֶ���ʹ���һЩ����½���������ֵĶ����������
* ��������Ķ�����Խ������ֵĶ��󴫵ݸ���һ�������ɺ��߸���˶�����������ڡ�
* ����֮�������ֵĶ�����ÿһ��ʱ��ֻ����һ����������Ϲ�ϵ���ɺ��������ظ����������ڡ����ֺ��������������һ����
* 
 */

package com.sunny.principle;

/**
 * @author wangpj
 *
 */
public class Composition {

}

class Car3{
	public void run(){
		System.out.println("�����ڱ���");
	}
}

class Driver3{
	Car3 car3;
	
	//ʹ�ù��췽���Ĳ�����ʽ��ʵ����Ϲ�ϵ
	public Driver3(Car3 car3){
		this.car3 = car3;
	}
	
}