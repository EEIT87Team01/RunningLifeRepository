package jdbc._01.model.member;

import java.util.List;

public interface MemberInterface {
	public int insert(MemberBean memberVO);
	public int update(MemberBean memberVO);
	public int delete(MemberBean memberVO);
	public MemberBean selectOne(String memberID);
	public List<MemberBean> selectAll(MemberBean memberVO);
}
