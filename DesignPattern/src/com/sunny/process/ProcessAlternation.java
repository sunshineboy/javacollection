/**
 * File name£º ProcessAlternation.java
 * Author£º        wangpj
 * Create Date£º 2013-12-16
 * Description:
 * 
 */

package com.sunny.process;

import java.util.List;

import com.sunny.process.ProcessVisitor;

/**
 * @author wangpj
 * 
 */
public class ProcessAlternation extends ProcessComposite {

	/**
	 * Create an alternation with the given name.
	 * 
	 * @param name
	 *            the name of this process alternation
	 */
	public ProcessAlternation(String name) {
		super(name);
	}

	/**
	 * Create an alternation with the given name and containing the given
	 * subprocesses.
	 * 
	 * @param name
	 *            the name of this alternation
	 * @param subprocesses
	 *            the children of this alternation
	 */
	public ProcessAlternation(String name, ProcessComponent[] subprocesses) {
		super(name, subprocesses);
	}

	/**
	 * Create an alternation with the given name and containing the given
	 * subprocesses.
	 */
	public ProcessAlternation(String name, List subprocesses) {
		super(name, subprocesses);
	}

	/**
     * This hook lets visitors add behaviors to the process composite. The point
     * here is to call back the visitor indicating the type of this node, namely
     * ProcessAlternation.
     */
    public void accept(ProcessVisitor v) {
        v.visit(this);
    }
}
