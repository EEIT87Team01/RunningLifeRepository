package jdbc._05.model;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.List;

public class TeamTest {

	public static void main(String[] args) {
		TeamVO team = new TeamVO();
		team.setEventID(3);
		team.setTeamID(4);
		team.setTeamName("五五");
		team.setDistance((float) 32.0);
		
		TeamJDBCDAO teamJDBCDAO = new TeamJDBCDAO();
		try {
			teamJDBCDAO.getConnection();
//			teamJDBCDAO.insert(team);
//			teamJDBCDAO.update(team);
//			teamJDBCDAO.delete(1, 1);
			
//			team =teamJDBCDAO.findByPrimaryKey(1, 1);
//			System.out.printf("10s",team.getEventID());
//			System.out.printf("10s",team.getTeamID());
//			System.out.printf("10s",team.getTeamName());
//			System.out.printf("10s\n",team.getDistance());
			
			List<TeamVO>teams  =teamJDBCDAO.findAll();
			Iterator<TeamVO> it =teams.iterator();
			while(it.hasNext()){
				team =  it.next();
				System.out.printf("%10s",team.getEventID());
				System.out.printf("%10s",team.getTeamID());
				System.out.printf("%10s",team.getTeamName());
				System.out.printf("%10s\n",team.getDistance());
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
