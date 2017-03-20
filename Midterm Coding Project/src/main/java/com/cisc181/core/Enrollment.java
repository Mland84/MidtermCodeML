package com.cisc181.core;

import java.util.UUID;

public class Enrollment extends Section {
	private UUID Enrollmentid;
	private double Grade;

	private Enrollment(){
		super();
	}

	public Enrollment(UUID Studentid, UUID Sectionid) {
		super(Studentid, Sectionid);
		this.Enrollmentid = Enrollmentid;
		this.Grade = Grade;

	}

	public UUID getEnrollmentid() {
		return Enrollmentid;
	}

	public void setEnrollmentid(UUID enrollmentid) {
		Enrollmentid = enrollmentid;
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

}
