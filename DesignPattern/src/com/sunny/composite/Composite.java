/**
* File name�� Composite.java
* Author��        wangpj
* Create Date�� 2013-12-20
* Description:
* 
 */

package com.sunny.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author wangpj
 *
 */
public class Composite implements Component {

	/**
     * �����洢��϶����а��������������
     */
	private List<Component> childComponents = new ArrayList<Component>();
	
	 /**
     * ��϶��������
     */
    private String name;
	
    /**
     * ���췽����������϶��������
     * @param name    ��϶��������
     */
    public Composite(String name){
        this.name = name;
    }
	
    /**
     * �ۼ�������������һ���ӹ�������
     */
    public void addChild(Component child){
    	childComponents.add(child);
    }
    
    /**
     * �ۼ���������ɾ��һ���ӹ�������
     * user: wangpj
     * tags: @param index
     * date: 2013-12-20
     * void
     */
    public void removeChild(int index) {
		childComponents.remove(index);
	}
    
    /**
     * �ۼ������������������ӹ�������
     */
    public List<Component> getChild(){
        return childComponents;
    }
    
    /**
     * ������������ṹ
     * @param preStr ǰ׺����Ҫ�ǰ��ղ㼶ƴ�ӿո�ʵ���������
     */
	@Override
	public void printStruct(String preStr) {
		System.out.println(preStr + " + " + name);
		
		if(childComponents != null){
			for (Component component : childComponents) {
				component.printStruct(preStr);
			}
		}

	}

}
