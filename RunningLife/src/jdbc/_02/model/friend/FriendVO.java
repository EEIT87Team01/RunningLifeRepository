package jdbc._02.model.friend;

import jdbc._02.model.member.MemberJDBCDAO;
import jdbc._02.model.member.MemberVO;

public class FriendVO implements java.io.Serializable{
	
	private MemberVO memberIDL;
	private MemberVO memberIDS;
	private String relationL;
	private String relationS;

	public FriendVO(String memberIDL,String memberIDS){
		MemberJDBCDAO mDAO = new MemberJDBCDAO();
		
		this.memberIDL = mDAO.findByID(memberIDL);
		this.memberIDS = mDAO.findByID(memberIDS);
	}
	
	public FriendVO(String memberIDL,String memberIDS,String relationL,String relationS){
		MemberJDBCDAO mDAO = new MemberJDBCDAO();
		
		this.memberIDL = mDAO.findByID(memberIDL);
		this.memberIDS = mDAO.findByID(memberIDS);
		this.relationL = relationL;
		this.relationS = relationS;
	}
	
	public FriendVO(MemberVO memberIDL,MemberVO memberIDS){
		this.memberIDL = memberIDL;
		this.memberIDS = memberIDS;
	}

	public MemberVO getMemberIDL() {
		return memberIDL;
	}


	public void setMemberIDL(MemberVO memberIDL) {
		this.memberIDL = memberIDL;
	}


	public MemberVO getMemberIDS() {
		return memberIDS;
	}


	public void setMemberIDS(MemberVO memberIDS) {
		this.memberIDS = memberIDS;
	}


	public String getRelationL() {
		return relationL;
	}


	public void setRelationL(String relationL) {
		this.relationL = relationL;
	}


	public String getRelationS() {
		return relationS;
	}


	public void setRelationS(String relationS) {
		this.relationS = relationS;
	}
}
