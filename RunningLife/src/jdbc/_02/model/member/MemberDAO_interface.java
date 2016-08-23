package jdbc._02.model.member;

import java.util.List;

public interface MemberDAO_interface {
	public int insert(MemberVO memberVo);
	public int update(MemberVO memberVo);
	public int delete(String memberID);
	public MemberVO findByID(String memberID);
	public List<MemberVO> gelAll();
	public MemberVO findByFirstName(String firstName);
}
