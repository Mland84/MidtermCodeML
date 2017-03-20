package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

import com.cisc181.eNums.eMajor;

public class Course  extends Semester{

	private UUID Courseid;
	private String Coursename;
	private int Gradepoints;
	private eMajor Major;
	
	public Course(){
		
	}
	
	public Course(String Coursename, int Gradepoints, eMajor Major){
		super ( );
		this.Courseid = Courseid.randomUUID();
		this.Coursename= Coursename;
		this.Gradepoints = Gradepoints;
		this.Major=Major;
	}
	
	
	public eMajor getMajor() {
		return Major;
	}


	public void setMajor(eMajor major) {
		Major = major;
	}


	public UUID getCourseid() {
		return Courseid;
	}
	public void setCourseid(UUID courseid) {
		Courseid = courseid;
	}
	public String getCoursename() {
		return Coursename;
	}
	public void setCoursename(String coursename) {
		Coursename = coursename;
	}
	public int getGradepoints() {
		return Gradepoints;
	}
	public void setGradepoints(int gradepoints) {
		Gradepoints = gradepoints;
	}

}
