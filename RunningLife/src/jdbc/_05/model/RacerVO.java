package jdbc._05.model;

import java.sql.Timestamp;

public class RacerVO {
	private int eventID;
	private int teamID;
	private String memberID;
	private String clothes;
	private Timestamp score;
	
	public RacerVO() {
		super();
	}

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

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getClothes() {
		return clothes;
	}

	public void setClothes(String clothes) {
		this.clothes = clothes;
	}

	public Timestamp getScore() {
		return score;
	}

	public void setScore(Timestamp score) {
		this.score = score;
	}
	
}
//CREATE TABLE [racer] (
//		  [eventID] int ,
//		  [groupID] int ,
//		  [memberID] char(36),
//		  [clothes] varchar(3),
//		  [score] time(2)
//		  PRIMARY KEY([eventID],[groupID],[memberID]),
//		  FOREIGN KEY ([groupID],[eventID]) REFERENCES [group]([groupID],[eventID]),
//		  FOREIGN KEY ([memberID]) REFERENCES [member]([memberID]) 
//		);
