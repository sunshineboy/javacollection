/**
 * File name£º ProcessSequence.java
 * Author£º        wangpj
 * Create Date£º 2013-12-16
 * Description:
 * 
 */

package com.sunny.process;

import java.util.List;

import com.sunny.process.ProcessComponent;
import com.sunny.process.ProcessVisitor;

/**
 * @author wangpj
 * 
 */
public class ProcessSequence extends ProcessComposite {

	/**
	 * @param name
	 */
	public ProcessSequence(String name) {
		super(name);
	}

	/**
	 * Create a sequence with the given name and containing the given
	 * subprocesses.
	 * 
	 * @param name
	 *            the name of this sequence
	 * @param subprocesses
	 *            the children of this sequence
	 */
	public ProcessSequence(String name, ProcessComponent[] subprocesses) {
		super(name, subprocesses);
	}

	/**
	 * Create a sequence with the given name and containing the given
	 * subprocesses.
	 * 
	 * @param name
	 *            the name of this sequence
	 * @param subprocesses
	 *            the children of this sequence
	 */
	public ProcessSequence(String name, List subprocesses) {
		super(name, subprocesses);
	}

	/**
	 * This hook lets visitors add behaviors to the process composite. The point
	 * here is to call back the visitor indicating the type of this node, namely
	 * ProcessSequence.
	 * 
	 * @param v
	 *            the visitor
	 */
	public void accept(ProcessVisitor v) {
		v.visit(this);
	}
}
