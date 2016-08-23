package jdbc._05.model;

import java.util.List;

public interface IRacerJDBCDAO {
	public int insert(RacerVO team);
	public int update(RacerVO team);
	public int delete(String memberID,int eventID,int teamID);
	public RacerVO findByPrimaryKey(String memberID,int eventID,int teamID);
	public List<RacerVO> findAll();
}
