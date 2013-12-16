/**
 * File name£º OozinozRocket.java
 * Author£º        wangpj
 * Create Date£º 2013-12-11
 * Description:
 * 
 */

package com.sunny.firework;

import com.sunny.simulation.Skyrocket;

/**
 * @author wangpj
 * 
 */
public class OozinozSkyRocket extends Skyrocket {

	private PhysicalRocket physicalRocket;

	public OozinozSkyRocket(PhysicalRocket physicalRocket) {
		super(physicalRocket.getMass(0), physicalRocket.getThrust(0),
				physicalRocket.getBurnTime());
		this.physicalRocket = physicalRocket;
	}

	public double getMass() {
		return physicalRocket.getMass(simTime);
	}

	public double getThrust() {
		return physicalRocket.getThrust(simTime);
	}

}
