package jdbc._05.model;

import java.util.List;

public interface IGroupJDBCDAO {
	public int insert(GroupVO group);
	public int update(GroupVO group);
	public int delete(int eventID,int groupID);
	public GroupVO findByPrimaryKey(int eventID,int groupID);
	public List<GroupVO> findAll();
}
