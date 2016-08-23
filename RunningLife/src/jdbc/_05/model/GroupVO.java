package jdbc._05.model;

public class GroupVO {
	private int eventID;
	private int groupID;
	private String groupName;
	private float distance;
	
	public GroupVO() {
		super();
	}

	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public int getGroupID() {
		return groupID;
	}
	public void setGroupID(int groupID) {
		this.groupID = groupID;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public float getDistance() {
		return distance;
	}
	public void setDistance(float distance) {
		this.distance = distance;
	}
	
}
//CREATE TABLE [group] (
//		  [eventID] int ,
//		  [groupID] int IDENTITY(1,1),
//		  [groupName] varchar(20),
//		  [distance] float,
//		  PRIMARY KEY ([groupID],[eventID]),
//		  FOREIGN KEY ([eventID]) REFERENCES [event]([eventID]) 
//
//		);