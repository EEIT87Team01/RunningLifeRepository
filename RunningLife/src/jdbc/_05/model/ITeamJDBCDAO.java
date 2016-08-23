package jdbc._05.model;

import java.util.List;

public interface ITeamJDBCDAO {
	public int insert(TeamVO Team);
	public int update(TeamVO Team);
	public int delete(int eventID,int TeamID);
	public TeamVO findByPrimaryKey(int eventID,int TeamID);
	public List<TeamVO> findAll();
}
