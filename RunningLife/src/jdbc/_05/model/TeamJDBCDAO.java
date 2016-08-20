package jdbc._05.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.microsoft.sqlserver.jdbc.SQLServerException;

public class TeamJDBCDAO implements ITeamJDBCDAO {
	private final String INSERT_STMT = "INSERT INTO team(eventID,teamName,distance)VALUES (?,?,?)";
	private final String UPDATE_STMT = "UPDATE team SET eventID=?,teamName=?,distance=? WHERE eventID=? and teamID=?";
	private final String DELETE_STMT = "DELETE FROM team WHERE eventID=? and teamID=?";
	private final String FIND_BY_PRIMARYKEY_STMT = "SELECT * FROM team WHERE eventID=? and teamID=?";
	private final String FIND_ALL_STMT = "SELECT * FROM team";
	public int count =0;
	private Connection conn = null;
	public void getConnection() throws SQLException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=RunningLife";
		String user = "sa2";
		String password = "sa1234";
		conn = DriverManager.getConnection(url,user,password);
	}
	@Override
	public int insert(TeamVO team) {
		try {
			PreparedStatement pstmt=conn.prepareStatement(INSERT_STMT);
			pstmt.setInt(1, team.getEventID());
			pstmt.setString(2, team.getTeamName());
			pstmt.setFloat(3, team.getDistance());
			count = pstmt.executeUpdate();
			System.out.println("新增小組成功");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int update(TeamVO team) {
		try {
			PreparedStatement pstmt=conn.prepareStatement(UPDATE_STMT);
			pstmt.setInt(1, team.getEventID());
			pstmt.setString(2, team.getTeamName());
			pstmt.setFloat(3, team.getDistance());
			pstmt.setInt(4, team.getEventID());
			pstmt.setInt(5, team.getTeamID());
			count = pstmt.executeUpdate();
			System.out.println("更新小組完成");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int delete(int eventID, int teamID) {
		try {
			PreparedStatement pstmt=conn.prepareStatement(DELETE_STMT);
			pstmt.setInt(1, eventID);
			pstmt.setInt(2, teamID);
			count = pstmt.executeUpdate();
			System.out.println("刪除小組完成");
		} catch (SQLException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		return count;
	}

	@Override
	public TeamVO findByPrimaryKey(int eventID, int teamID) {
		TeamVO team = new TeamVO();
		try {
			PreparedStatement pstmt=conn.prepareStatement(FIND_BY_PRIMARYKEY_STMT);
			pstmt.setInt(1, eventID);
			pstmt.setInt(2, teamID);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				team.setEventID(rs.getInt("eventID"));
				team.setTeamID(rs.getInt("teamID"));
				team.setTeamName(rs.getString("teamName"));
				team.setDistance(rs.getFloat("distance"));
			}
			System.out.println("查詢小組完成");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return team;
	}

	@Override
	public List<TeamVO> findAll() {
		List<TeamVO> teams= new ArrayList<TeamVO>();
		TeamVO team = null;
		try {
			PreparedStatement pstmt=conn.prepareStatement(FIND_ALL_STMT);
			ResultSet rs =pstmt.executeQuery();
			while(rs.next()){
				team = new TeamVO();
				team.setEventID(rs.getInt("eventID"));
				team.setTeamID(rs.getInt("teamID"));
				team.setTeamName(rs.getString("teamName"));
				team.setDistance(rs.getFloat("distance"));
				teams.add(team);
			}
			System.out.println("列出小組完成");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return teams;
	}

}
