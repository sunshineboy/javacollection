/**
* File name： Composite.java
* Author：        wangpj
* Create Date： 2013-12-20
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
     * 用来存储组合对象中包含的子组件对象
     */
	private List<Component> childComponents = new ArrayList<Component>();
	
	 /**
     * 组合对象的名字
     */
    private String name;
	
    /**
     * 构造方法，传入组合对象的名字
     * @param name    组合对象的名字
     */
    public Composite(String name){
        this.name = name;
    }
	
    /**
     * 聚集管理方法，增加一个子构件对象
     */
    public void addChild(Component child){
    	childComponents.add(child);
    }
    
    /**
     * 聚集管理方法，删除一个子构件对象
     * user: wangpj
     * tags: @param index
     * date: 2013-12-20
     * void
     */
    public void removeChild(int index) {
		childComponents.remove(index);
	}
    
    /**
     * 聚集管理方法，返回所有子构件对象
     */
    public List<Component> getChild(){
        return childComponents;
    }
    
    /**
     * 输出对象的自身结构
     * @param preStr 前缀，主要是按照层级拼接空格，实现向后缩进
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
