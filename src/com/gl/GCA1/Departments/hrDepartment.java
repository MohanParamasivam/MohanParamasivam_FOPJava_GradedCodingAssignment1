package com.gl.GCA1.Departments;

public class hrDepartment extends superDepartment{
	
	public String departmentName() {
		return "HR Department";
	}
	
	public String doActivity() {
		return "team Lunch";
	}
	
	public String getTodaysWork() {
		return "Fill today's timesheet and mark your attendance";	
	}
	
	public String getWorkDeadline() {
		return "Complete by EOD";
	}
	
	
}