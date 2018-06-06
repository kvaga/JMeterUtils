package ru.kvaga.jmeter.projects.emias;

import java.util.Date;

public class EMIASSchedule {
	private Date date;
	private EMIASResourceSchedule resourceSchedule;
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public EMIASResourceSchedule getResourceSchedule() {
		return resourceSchedule;
	}
	public void setResourceSchedule(EMIASResourceSchedule resourceSchedule) {
		this.resourceSchedule = resourceSchedule;
	}
	
	
}
