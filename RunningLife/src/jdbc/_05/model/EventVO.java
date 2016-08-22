package jdbc._05.model;

import java.sql.Timestamp;

public class EventVO {
	private int eventID;
	private String locationID;
	private String name;
	private Timestamp time;
	private int applyFee;
	private Timestamp applyStart;
	private Timestamp applyEnd;
	private String commnet;
	private String eventPhotoPath;
	
	public EventVO() {
		super();
	}
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public String getLocationID() {
		return locationID;
	}
	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getTime() {
		return time;
	}
	public void setTime(Timestamp time) {
		this.time = time;
	}
	public int getApplyFee() {
		return applyFee;
	}
	public void setApplyFee(int applyFee) {
		this.applyFee = applyFee;
	}
	public Timestamp getApplyStart() {
		return applyStart;
	}
	public void setApplyStart(Timestamp applyStart) {
		this.applyStart = applyStart;
	}
	public Timestamp getApplyEnd() {
		return applyEnd;
	}
	public void setApplyEnd(Timestamp applyEnd) {
		this.applyEnd = applyEnd;
	}
	public String getCommnet() {
		return commnet;
	}
	public void setCommnet(String commnet) {
		this.commnet = commnet;
	}
	public String getEventPhotoPath() {
		return eventPhotoPath;
	}
	public void setEventPhotoPath(String eventPhotoPath) {
		this.eventPhotoPath = eventPhotoPath;
	}
	
}
//CREATE TABLE [event] (
//		  [eventID] INT IDENTITY(1,1) ,
//		  [locationID] char(3) ,
//		  [name] nvarchar(20),
//		  [time] datetime,
//		  [applyFee] int,
//		  [applyStart] datetime,
//		  [applyEnd] datetime,
//		  [comment] nvarchar(200),
//		  [eventPhotoPath] varchar(200),
//		  PRIMARY KEY ([eventID]),
//		  FOREIGN KEY ([locationID]) REFERENCES [location]([locationID]),
//		);