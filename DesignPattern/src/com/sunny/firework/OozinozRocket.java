/**
 * File name£º OozinozRocket.java
 * Author£º        wangpj
 * Create Date£º 2013-12-11
 * Description:
 * 
 */

package com.sunny.firework;

import com.sunny.simulation.RocketSim;

/**
 * @author wangpj
 * 
 */
public class OozinozRocket extends PhysicalRocket implements RocketSim {

	private double time;
	
	/**
	 * @param burnArea
	 * @param burnRate
	 * @param fuelMass
	 * @param totalMass
	 */
	public OozinozRocket(double burnArea, double burnRate, double fuelMass,
			double totalMass) {
		super(burnArea, burnRate, fuelMass, totalMass);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunny.simulation.RocketSim#getMass()
	 */
	@Override
	public double getMass() {
		return getMass(time);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunny.simulation.RocketSim#getThrust()
	 */
	@Override
	public double getThrust() {
		return getThrust(time);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sunny.simulation.RocketSim#setSimTime(double)
	 */
	@Override
	public void setSimTime(double t) {
		// TODO Auto-generated method stub

	}

	/**
	 * @return the time
	 */
	public double getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(double time) {
		this.time = time;
	}

	


}
