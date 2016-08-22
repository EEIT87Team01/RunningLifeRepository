package jdbc._05.model;

import java.util.List;

public interface IRacerJDBCDAO {
	public int insert(RacerVO group);
	public int update(RacerVO group);
	public int delete(String memberID,int eventID,int groupID);
	public RacerVO findByPrimaryKey(String memberID,int eventID,int groupID);
	public List<RacerVO> findAll();
}
