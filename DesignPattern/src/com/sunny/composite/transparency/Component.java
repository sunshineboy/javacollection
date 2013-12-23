/**
 * File name： Compoent.java
 * Author：        wangpj
 * Create Date： 2013-12-23
 * Description:
 * 
 */

package com.sunny.composite.transparency;

import java.util.List;

/**
 * @author wangpj
 * 
 */
public abstract class Component {

	/**
	 * 输出组件自身的名称 user: wangpj tags: @param preStr date: 2013-12-23 void
	 */
	public abstract void printStruts(String preStr);

	/**
	 * 聚集管理方法，增加一个子构件对象
	 * 
	 * @param child
	 *            子构件对象
	 */
	public void addChild(Component child) {
		/**
		 * 缺省实现，抛出异常，因为叶子对象没有此功能 或者子组件没有实现这个功能
		 */
		throw new UnsupportedOperationException("对象不支持此功能");
	}

	/**
	 * 聚集管理方法，删除一个子构件对象
	 * 
	 * @param index
	 *            子构件对象的下标
	 */
	public void removeChild(int index) {
		/**
		 * 缺省实现，抛出异常，因为叶子对象没有此功能 或者子组件没有实现这个功能
		 */
		throw new UnsupportedOperationException("对象不支持此功能");
	}

	/**
	 * 聚集管理方法，返回所有子构件对象
	 */
	public List<Component> getChild() {
		/**
		 * 缺省实现，抛出异常，因为叶子对象没有此功能 或者子组件没有实现这个功能
		 */
		throw new UnsupportedOperationException("对象不支持此功能");
	}
}
