package ru.kvaga.jmeter.projects.emias;

import java.util.ArrayList;

public class EMIASScheduleResult {
	private int doctorSpecialityCode;
	private ArrayList<EMIASTimePeriod> schedules;
	private String doctorSpeciality;
	private String doctorFio;
	private int lpuId;
	private String availableResourceName;
	private int availableResourceId;
	public int getDoctorSpecialityCode() {
		return doctorSpecialityCode;
	}
	public void setDoctorSpecialityCode(int doctorSpecialityCode) {
		this.doctorSpecialityCode = doctorSpecialityCode;
	}
	public ArrayList<EMIASTimePeriod> getSchedules() {
		return schedules;
	}
	public void setSchedules(ArrayList<EMIASTimePeriod> schedules) {
		this.schedules = schedules;
	}
	public String getDoctorSpeciality() {
		return doctorSpeciality;
	}
	public void setDoctorSpeciality(String doctorSpeciality) {
		this.doctorSpeciality = doctorSpeciality;
	}
	public String getDoctorFio() {
		return doctorFio;
	}
	public void setDoctorFio(String doctorFio) {
		this.doctorFio = doctorFio;
	}
	public int getLpuId() {
		return lpuId;
	}
	public void setLpuId(int lpuId) {
		this.lpuId = lpuId;
	}
	public String getAvailableResourceName() {
		return availableResourceName;
	}
	public void setAvailableResourceName(String availableResourceName) {
		this.availableResourceName = availableResourceName;
	}
	public int getAvailableResourceId() {
		return availableResourceId;
	}
	public void setAvailableResourceId(int availableResourceId) {
		this.availableResourceId = availableResourceId;
	}
}
