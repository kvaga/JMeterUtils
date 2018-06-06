package ru.kvaga.jmeter.projects.emias;

import java.util.ArrayList;
import java.util.Date;

public class EMIASResourceSchedule {
	private ArrayList<EMIASTimePeriod> timePeriods;
	private String cabinetName;
	private Date workTime;
	private int complexResourceId;
	public ArrayList<EMIASTimePeriod> getTimePeriods() {
		return timePeriods;
	}
	public void setTimePeriods(ArrayList<EMIASTimePeriod> timePeriods) {
		this.timePeriods = timePeriods;
	}
	public String getCabinetName() {
		return cabinetName;
	}
	public void setCabinetName(String cabinetName) {
		this.cabinetName = cabinetName;
	}
	public Date getWorkTime() {
		return workTime;
	}
	public void setWorkTime(Date workTime) {
		this.workTime = workTime;
	}
	public int getComplexResourceId() {
		return complexResourceId;
	}
	public void setComplexResourceId(int complexResourceId) {
		this.complexResourceId = complexResourceId;
	}

	
}
