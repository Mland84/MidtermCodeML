package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Semester  {
	private UUID Semesterid;
	private Date Startdate;
	private Date Enddate;

	public Semester(){
		
	}

	public Semester( Date Startdate, Date EndDate ) {
	
		this.Semesterid = Semesterid.randomUUID();
		this.Startdate = Startdate;
		this.Enddate = Enddate;
	}

	public UUID getSemesterid() {
		return Semesterid;
	}

	public void setSemesterid(UUID semesterid) {
		Semesterid = semesterid;
	}

	public Date getStartdate() {
		return Startdate;
	}

	public void setStartdate(Date startdate) {
		Startdate = startdate;
	}

	public Date getEnddate() {
		return Enddate;
	}

	public void setEnddate(Date enddate) {
		Enddate = enddate;
	}

}
