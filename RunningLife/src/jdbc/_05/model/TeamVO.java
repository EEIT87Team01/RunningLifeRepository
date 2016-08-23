package jdbc._05.model;

public class TeamVO {
	private int eventID;
	private int teamID;
	private String teamName;
	private float distance;
	public int getEventID() {
		return eventID;
	}
	public void setEventID(int eventID) {
		this.eventID = eventID;
	}
	public int getTeamID() {
		return teamID;
	}
	public void setTeamID(int teamID) {
		this.teamID = teamID;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
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
//		  [teamID] int IDENTITY(1,1),
//		  [groupName] varchar(20),
//		  [distance] float,
//		  PRIMARY KEY ([teamID],[eventID]),
//		  FOREIGN KEY ([eventID]) REFERENCES [event]([eventID]) 
//
//		);