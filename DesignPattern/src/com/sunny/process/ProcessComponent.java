/**
 * File name£º ProcessComponent.java
 * Author£º        wangpj
 * Create Date£º 2013-12-16
 * Description:
 * 
 */

package com.sunny.process;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangpj
 * 
 */
public abstract class ProcessComponent {

	protected String name;

	public ProcessComponent() {
	}
	
	public ProcessComponent(String name) {
		this.name = name;
	}
	
	
	/**
	 * user: wangpj
	 * tags: 
	 * date: 2013-12-16
	 * void
	 */
	private int getStepCount() {
		// TODO Auto-generated method stub
		return getStepCount(new HashSet<>());
	}
	
	
	
	/**
	 * user: wangpj
	 * tags: @param hashSet
	 * tags: @return
	 * date: 2013-12-16
	 * int
	 */
	public abstract int getStepCount(Set visited);

	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	
	/**
	 * @return
	 * @see java.lang.String#toString()
	 */
	public String toString() {
		return name;
	}

}
