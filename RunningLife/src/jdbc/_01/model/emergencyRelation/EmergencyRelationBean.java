package jdbc._01.model.emergencyRelation;

public class EmergencyRelationBean {
//	  [relationID] int,
//	  [relationName] varchar(20),
	private int relationID;
	private String relationName;
	public EmergencyRelationBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmergencyRelationBean(int relationID, String relationName) {
		super();
		this.relationID = relationID;
		this.relationName = relationName;
	}
	public int getRelationID() {
		return relationID;
	}
	public void setRelationID(int relationID) {
		this.relationID = relationID;
	}
	public String getRelationName() {
		return relationName;
	}
	public void setRelationName(String relationName) {
		this.relationName = relationName;
	}
	
}
