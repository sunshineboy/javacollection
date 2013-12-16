/**
* File name£º ProcessStep.java
* Author£º        wangpj
* Create Date£º 2013-12-16
* Description:
* 
 */

package com.sunny.process;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import com.sunny.process.ProcessComponent;

/**
 * @author wangpj
 *
 */
public class ProcessComposite extends ProcessComponent {
	
	
	protected List subprocesses;
	
	/**
     * Create a process composite with the given name.
     * @param name this process composite's name
     */
    public ProcessComposite(String name) {
        this(name, new ArrayList());
    }
	
    /**
     * Create a composite with the given name and containing the given
     * subprocesses.
     * @param name the identity of this composite
     * @param subprocesses the children of this composite
     */
    public ProcessComposite(String name, List subprocesses) {
        super(name);
        this.subprocesses = subprocesses;
    }
    
	
    /**
     * Create a composite with the given name and containing the given
     * subprocesses.
     * @param name the identity of this composite
     * @param existingProcesses the children of this composite
     */
    public ProcessComposite(String name, ProcessComponent[] existingProcesses) {
    	super(name);
    	subprocesses = new ArrayList<>();
    	for (int i = 0; i < existingProcesses.length; i++) {
    		subprocesses.add(existingProcesses[i]);
		}
    	
    	
    }


	protected void add(ProcessComponent c) {
		subprocesses.add(c);
	}
	
	
	
	/* (non-Javadoc)
	 * @see com.sunny.process.ProcessComponent#getStepCount(java.util.Set)
	 */
	@Override
	public int getStepCount(Set visited) {
		visited.add(getName());
		int count = 0;
		for (int i = 0; i < subprocesses.size(); i++) {
			ProcessComponent pc = (ProcessComponent) subprocesses.get(i);
			if(!visited.contains(pc)){
				count += pc.getStepCount(visited);
			}
		}
		return count;
	}



}
