package org.chase.kspcontrol.common.data;

import java.io.IOException;

import krpc.client.RPCException;

public class Orbit extends NetworkObject<Orbit> {
	
	private double apoapsis;
	private double apoapsisAltitude;
	private double periapsis;
	private double periapsisAltitude;
	private double semiMajorAxis;
	private double semiMinorAxis;
	private double radius;
	private double speed;
	private double period;
	private double timeToApoapsis;
	private double timeToPeriapsis;
	private double eccentricity;
	private double inclination;
	private double longitudeOfAscendingNode;
	private double argumentOfPeriapsis;
	private double meanAnomalyAtEpoch;
	private double epoch;
	private double meanAnomaly;
	private double eccentricAnomaly;
	private double trueAnomaly;
	private double orbitalSpeed;
	private double timeToSOIChange;
	
	public static Orbit createInstance(krpc.client.services.SpaceCenter.Orbit orbit) throws RPCException, IOException {
		Orbit orbitData = new Orbit();
		
		orbitData.setApoapsis(orbit.getApoapsis());
		orbitData.setApoapsisAltitude(orbit.getApoapsisAltitude());
		orbitData.setArgumentOfPeriapsis(orbit.getArgumentOfPeriapsis());
		orbitData.setEccentricAnomaly(orbit.getEccentricAnomaly());
		orbitData.setEccentricity(orbit.getEccentricity());
		orbitData.setEpoch(orbit.getEpoch());
		orbitData.setInclination(orbit.getInclination());
		orbitData.setLongitudeOfAscendingNode(orbit.getLongitudeOfAscendingNode());
		orbitData.setMeanAnomaly(orbit.getMeanAnomaly());
		orbitData.setMeanAnomalyAtEpoch(orbit.getMeanAnomalyAtEpoch());
		orbitData.setOrbitalSpeed(orbit.getOrbitalSpeed());
		orbitData.setPeriapsis(orbit.getPeriapsis());
		orbitData.setPeriapsisAltitude(orbit.getPeriapsisAltitude());
		orbitData.setPeriod(orbit.getPeriod());
		orbitData.setRadius(orbit.getRadius());
		orbitData.setSemiMajorAxis(orbit.getSemiMajorAxis());
		orbitData.setSemiMinorAxis(orbit.getSemiMinorAxis());
		orbitData.setSpeed(orbit.getSpeed());
		orbitData.setTimeToApoapsis(orbit.getTimeToApoapsis());
		orbitData.setTimeToPeriapsis(orbit.getTimeToPeriapsis());
		orbitData.setTimeToSOIChange(Double.isNaN(orbit.getTimeToSOIChange()) ? -1 : orbit.getTimeToSOIChange());
		orbitData.setTrueAnomaly(orbit.getTrueAnomaly());

		return orbitData;
	}

	@Override
	public String getPrefix() {
		return "ORBIT";
	}

	/**
	 * @return the apoapsis
	 */
	public double getApoapsis() {
		return apoapsis;
	}

	/**
	 * @param apoapsis the apoapsis to set
	 */
	public void setApoapsis(double apoapsis) {
		this.apoapsis = apoapsis;
	}

	/**
	 * @return the apoapsisAltitude
	 */
	public double getApoapsisAltitude() {
		return apoapsisAltitude;
	}

	/**
	 * @param apoapsisAltitude the apoapsisAltitude to set
	 */
	public void setApoapsisAltitude(double apoapsisAltitude) {
		this.apoapsisAltitude = apoapsisAltitude;
	}

	/**
	 * @return the periapsis
	 */
	public double getPeriapsis() {
		return periapsis;
	}

	/**
	 * @param periapsis the periapsis to set
	 */
	public void setPeriapsis(double periapsis) {
		this.periapsis = periapsis;
	}

	/**
	 * @return the periapsisAltitude
	 */
	public double getPeriapsisAltitude() {
		return periapsisAltitude;
	}

	/**
	 * @param periapsisAltitude the periapsisAltitude to set
	 */
	public void setPeriapsisAltitude(double periapsisAltitude) {
		this.periapsisAltitude = periapsisAltitude;
	}

	/**
	 * @return the semiMajorAxis
	 */
	public double getSemiMajorAxis() {
		return semiMajorAxis;
	}

	/**
	 * @param semiMajorAxis the semiMajorAxis to set
	 */
	public void setSemiMajorAxis(double semiMajorAxis) {
		this.semiMajorAxis = semiMajorAxis;
	}

	/**
	 * @return the semiMinorAxis
	 */
	public double getSemiMinorAxis() {
		return semiMinorAxis;
	}

	/**
	 * @param semiMinorAxis the semiMinorAxis to set
	 */
	public void setSemiMinorAxis(double semiMinorAxis) {
		this.semiMinorAxis = semiMinorAxis;
	}

	/**
	 * @return the radius
	 */
	public double getRadius() {
		return radius;
	}

	/**
	 * @param radius the radius to set
	 */
	public void setRadius(double radius) {
		this.radius = radius;
	}

	/**
	 * @return the speed
	 */
	public double getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(double speed) {
		this.speed = speed;
	}

	/**
	 * @return the period
	 */
	public double getPeriod() {
		return period;
	}

	/**
	 * @param period the period to set
	 */
	public void setPeriod(double period) {
		this.period = period;
	}

	/**
	 * @return the timeToApoapsis
	 */
	public double getTimeToApoapsis() {
		return timeToApoapsis;
	}

	/**
	 * @param timeToApoapsis the timeToApoapsis to set
	 */
	public void setTimeToApoapsis(double timeToApoapsis) {
		this.timeToApoapsis = timeToApoapsis;
	}

	/**
	 * @return the timeToPeriapsis
	 */
	public double getTimeToPeriapsis() {
		return timeToPeriapsis;
	}

	/**
	 * @param timeToPeriapsis the timeToPeriapsis to set
	 */
	public void setTimeToPeriapsis(double timeToPeriapsis) {
		this.timeToPeriapsis = timeToPeriapsis;
	}

	/**
	 * @return the eccentricity
	 */
	public double getEccentricity() {
		return eccentricity;
	}

	/**
	 * @param eccentricity the eccentricity to set
	 */
	public void setEccentricity(double eccentricity) {
		this.eccentricity = eccentricity;
	}

	/**
	 * @return the inclination
	 */
	public double getInclination() {
		return inclination;
	}

	/**
	 * @param inclination the inclination to set
	 */
	public void setInclination(double inclination) {
		this.inclination = inclination;
	}

	/**
	 * @return the longitudeOfAscendingNode
	 */
	public double getLongitudeOfAscendingNode() {
		return longitudeOfAscendingNode;
	}

	/**
	 * @param longitudeOfAscendingNode the longitudeOfAscendingNode to set
	 */
	public void setLongitudeOfAscendingNode(double longitudeOfAscendingNode) {
		this.longitudeOfAscendingNode = longitudeOfAscendingNode;
	}

	/**
	 * @return the argumentOfPeriapsis
	 */
	public double getArgumentOfPeriapsis() {
		return argumentOfPeriapsis;
	}

	/**
	 * @param argumentOfPeriapsis the argumentOfPeriapsis to set
	 */
	public void setArgumentOfPeriapsis(double argumentOfPeriapsis) {
		this.argumentOfPeriapsis = argumentOfPeriapsis;
	}

	/**
	 * @return the meanAnomalyAtEpoch
	 */
	public double getMeanAnomalyAtEpoch() {
		return meanAnomalyAtEpoch;
	}

	/**
	 * @param meanAnomalyAtEpoch the meanAnomalyAtEpoch to set
	 */
	public void setMeanAnomalyAtEpoch(double meanAnomalyAtEpoch) {
		this.meanAnomalyAtEpoch = meanAnomalyAtEpoch;
	}

	/**
	 * @return the epoch
	 */
	public double getEpoch() {
		return epoch;
	}

	/**
	 * @param epoch the epoch to set
	 */
	public void setEpoch(double epoch) {
		this.epoch = epoch;
	}

	/**
	 * @return the meanAnomaly
	 */
	public double getMeanAnomaly() {
		return meanAnomaly;
	}

	/**
	 * @param meanAnomaly the meanAnomaly to set
	 */
	public void setMeanAnomaly(double meanAnomaly) {
		this.meanAnomaly = meanAnomaly;
	}

	/**
	 * @return the eccentricAnomaly
	 */
	public double getEccentricAnomaly() {
		return eccentricAnomaly;
	}

	/**
	 * @param eccentricAnomaly the eccentricAnomaly to set
	 */
	public void setEccentricAnomaly(double eccentricAnomaly) {
		this.eccentricAnomaly = eccentricAnomaly;
	}

	/**
	 * @return the trueAnomaly
	 */
	public double getTrueAnomaly() {
		return trueAnomaly;
	}

	/**
	 * @param trueAnomaly the trueAnomaly to set
	 */
	public void setTrueAnomaly(double trueAnomaly) {
		this.trueAnomaly = trueAnomaly;
	}

	/**
	 * @return the orbitalSpeed
	 */
	public double getOrbitalSpeed() {
		return orbitalSpeed;
	}

	/**
	 * @param orbitalSpeed the orbitalSpeed to set
	 */
	public void setOrbitalSpeed(double orbitalSpeed) {
		this.orbitalSpeed = orbitalSpeed;
	}

	/**
	 * @return the timeToSOIChange
	 */
	public double getTimeToSOIChange() {
		return timeToSOIChange;
	}

	/**
	 * @param timeToSOIChange the timeToSOIChange to set
	 */
	public void setTimeToSOIChange(double timeToSOIChange) {
		this.timeToSOIChange = timeToSOIChange;
	}
	
	

}
