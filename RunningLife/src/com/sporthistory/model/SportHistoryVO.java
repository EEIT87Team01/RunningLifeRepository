package com.sporthistory.model;

import java.sql.Timestamp;
import com.utility.model.*;

public class SportHistoryVO {
	private String recordID = null;//YYYYMMDD + seq(6)
	private String memberID = null;//UUID
	private Timestamp startDateTime = null; 
	private Timestamp endDateTime = null;
	private PathVO path = null;
	private String duration = null;//hhhmmss
	private Double fastestSpeed = null;
	private Double length = null;//km
	private LocationVO location = null;
	
	public String getRecordID() {
		return recordID;
	}
	public void setRecordID(String recordID) {
		this.recordID = recordID;
	}
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public Timestamp getStartDateTime() {
		return startDateTime;
	}
	public void setStartDateTime(Timestamp startDateTime) {
		this.startDateTime = startDateTime;
	}
	public Timestamp getEndDateTime() {
		return endDateTime;
	}
	public void setEndDateTime(Timestamp endDateTime) {
		this.endDateTime = endDateTime;
	}
	public PathVO getPath() {
		return path;
	}
	public void setPath(PathVO path) {
		this.path = path;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public Double getFastestSpeed() {
		return fastestSpeed;
	}
	public void setFastestSpeed(Double fastestSpeed) {
		this.fastestSpeed = fastestSpeed;
	}
	public Double getLength() {
		return length;
	}
	public void setLength(Double length) {
		this.length = length;
	}
	public LocationVO getLocation() {
		return location;
	}
	public void setLocation(LocationVO location) {
		this.location = location;
	}
}
