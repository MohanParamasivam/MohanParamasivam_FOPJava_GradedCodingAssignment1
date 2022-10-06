package com.gl.GCA1.MainDriver;

import com.gl.GCA1.Departments.*;

public class MainDriver {
	public static void main(String [] args) {
		
	// Creating objects for various departments
	adminDepartment admin = new adminDepartment();
	hrDepartment hr = new hrDepartment();
	techDepartment tech = new techDepartment();
	
	//Invoking or calling methods of Admin department
	System.out.println("Welcome to " + admin.departmentName());
	System.out.println(admin.getTodaysWork());
	System.out.println(admin.getWorkDeadline());
	System.out.println(admin.isTodayAHoliday());
	System.out.println("");
	
	//Invoking or calling methods of HR department
	System.out.println("Welcome to " + hr.departmentName());
	System.out.println(hr.doActivity());
	System.out.println(hr.getTodaysWork());
	System.out.println(hr.getWorkDeadline());
	System.out.println(hr.isTodayAHoliday());
	System.out.println("");
	
	//Invoking or calling methods of Tech department
	System.out.println("Welcome to " + tech.departmentName());
	System.out.println(tech.getTodaysWork());
	System.out.println(tech.getWorkDeadline());
	System.out.println(tech.getTechStackInformation());
	System.out.println(tech.isTodayAHoliday());
	}

}