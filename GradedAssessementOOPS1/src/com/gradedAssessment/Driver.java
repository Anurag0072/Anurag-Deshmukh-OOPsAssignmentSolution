package com.gradedAssessment;

import com.gradedAssessment.service.AdminDepartmrnt;
import com.gradedAssessment.service.HrDepartment;
import com.gradedAssessment.service.TechDepartment;

public class Driver {

	public static void main(String[] args) {
		AdminDepartmrnt ad = new AdminDepartmrnt();
		HrDepartment hr = new HrDepartment();
		TechDepartment td = new TechDepartment();
		
		System.out.println(ad.departmentName());
		System.out.println(ad.getTodaysWork());
		System.out.println(ad.getWorkDeadline());
		System.out.println(ad.isTodayAHoliday());
		System.out.println(""
				+ ""
				+ "");
		System.out.println(hr.departmentName());
		System.out.println(hr.doActivity());
		System.out.println(hr.getTodaysWork());
		System.out.println(hr.getWorkDeadline());
		System.out.println(hr.isTodayAHoliday());
		System.out.println(""
				+ ""
				+ "");
		System.out.println(td.departmentName());
		System.out.println(td.getTodaysWork());
		System.out.println(td.getWorkDeadline());
		System.out.println(td.getTechStackInformation());
		System.out.println(td.isTodayAHoliday());
		
		
	}

}
