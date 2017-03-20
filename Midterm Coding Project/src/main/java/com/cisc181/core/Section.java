package com.cisc181.core;

import java.util.Date;
import java.util.UUID;

public class Section extends Course {
	private UUID Sectionid;
	private int RoomNo;

	
	public Section(UUID Courseid, UUID Semesterid, UUID Sectionid, int RoomNo , Date Startdate, Date Enddate){
		super();
		this.Sectionid = Sectionid.randomUUID();
		this.RoomNo = RoomNo;
	}

	public Section(UUID studentid, UUID sectionid2) {
		
	}

	public Section() {
		
	}

	public UUID getSectionid() {
		return Sectionid;
	}

	public void setSectionid(UUID sectionid) {
		Sectionid = sectionid;
	}

	public int getRoomNo() {
		return RoomNo;
	}

	public void setRoomNo(int roomNo) {
		RoomNo = roomNo;
	}

}
