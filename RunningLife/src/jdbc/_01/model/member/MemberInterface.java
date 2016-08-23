package jdbc._01.model.member;

import java.util.List;

public interface MemberInterface {
	public int insert(MemberBean menberVO);
	public int update(MemberBean menberVO);
	public int delete(MemberBean menberVO);
	public MemberBean selectOne(String menberVO);
	public List<MemberBean> selectAll(MemberBean menberVO);
}
