package com.gradedAssessment.service;

public class AdminDepartmrnt extends SuperDepartment {
	
	
	public String departmentName() {
		
		return "Welcome to Admin Department";
	}
	public String getTodaysWork() {
		return "Complete your Document submission";
	}
	public String getWorkDeadline() {
		return "Complete By EOD";
	}
	public void Holiday() {
		super.isTodayAHoliday();
	}

}
