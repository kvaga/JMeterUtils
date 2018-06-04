package ru.kvaga.jmeter.projects.emias;

import java.util.Date;

public class EMIASTimePeriod {
	private Date endTime;
	boolean allowedAppointment;
	private Date startTime;
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public boolean getAllowedAppointment() {
		return allowedAppointment;
	}
	public void setAllowedAppointment(boolean allowedAppointment) {
		this.allowedAppointment = allowedAppointment;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
}
