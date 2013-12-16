/**
* File name£º ProcessStep.java
* Author£º        wangpj
* Create Date£º 2013-12-16
* Description:
* 
 */

package com.sunny.process;

import java.util.Set;

/**
 * @author wangpj
 *
 */
public class ProcessStep extends ProcessComponent {
	
    /**
     * Create a step with the given name.
     * 
     * @param name
     *            the name of this process step
     */
    public ProcessStep(String name) {
        super(name);
    }
	
	
	/* (non-Javadoc)
	 * @see com.sunny.process.ProcessComponent#getStepCount(java.util.Set)
	 */
	@Override
	public int getStepCount(Set visited) {
		visited.add(name);
		return 1;
	}

}
