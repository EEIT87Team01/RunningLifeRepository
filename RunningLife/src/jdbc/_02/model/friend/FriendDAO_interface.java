package jdbc._02.model.friend;

import java.util.List;

public interface FriendDAO_interface {
	public int insert(FriendVO friendVO);
	public int delete(String MemberIDL, String MemberIDS);
	public int update(FriendVO friendVO);
	public List<FriendVO> findByMemberID(String MemberID);
	public FriendVO findByTwoMemberID(String MemberIDL, String MemberIDS);
	public List<FriendVO> getAll();
	
}
