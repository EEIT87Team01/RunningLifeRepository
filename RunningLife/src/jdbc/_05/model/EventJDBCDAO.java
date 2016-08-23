package jdbc._05.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EventJDBCDAO implements IEventJDBCDAO {
	private final String INSERT_STMT = "INSERT INTO event VALUES (?,?,?,?,?,?,?,?)";
	private final String UPDATE_STMT = "UPDATE event SET locationID=?,name=?,time=?,applyFEE=?,applyStart=?,applyEnd=?,comment=?,eventPhotoPath=? WHERE eventID=?";
	private final String DELETE_STMT = "DELETE FROM event WHERE eventID=?";
	private final String FIND_BY_PRIMARYKEY_STMT = "SELECT * FROM event WHERE eventID=?";
	private final String FIND_ALL_STMT = "SELECT * FROM event";
	public int count =0;
	private Connection conn = null;
	public void getConnection() throws SQLException{
		String url = "jdbc:sqlserver://localhost:1433;databaseName=RunningLife";
		String user = "sa2";
		String password = "sa1234";
		conn = DriverManager.getConnection(url,user,password);
	}
	@Override
	public int insert(EventVO event) {
		try {
			PreparedStatement pstmt=conn.prepareStatement(INSERT_STMT);
			pstmt.setString(1, event.getLocationID());
			pstmt.setString(2, event.getName());
			pstmt.setTimestamp(3, event.getTime());
			pstmt.setInt(4, event.getApplyFee());
			pstmt.setTimestamp(5, event.getApplyStart());
			pstmt.setTimestamp(6, event.getApplyEnd());
			pstmt.setString(7, event.getCommnet());
			pstmt.setString(8, event.getEventPhotoPath());
			count = pstmt.executeUpdate();
			System.out.println("賽事新增成功!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int update(EventVO event) {
		try {
			PreparedStatement pstmt=conn.prepareStatement(UPDATE_STMT);
			pstmt.setString(1, event.getLocationID());
			pstmt.setString(2, event.getName());
			pstmt.setTimestamp(3, event.getTime());
			pstmt.setInt(4, event.getApplyFee());
			pstmt.setTimestamp(5, event.getApplyStart());
			pstmt.setTimestamp(6, event.getApplyEnd());
			pstmt.setString(7, event.getCommnet());
			pstmt.setString(8, event.getEventPhotoPath());
			pstmt.setInt(9, event.getEventID());
			count = pstmt.executeUpdate();
			System.out.println("賽事更新成功!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public int delete(int eventID) {
		try {
			PreparedStatement pstmt=conn.prepareStatement(DELETE_STMT);
			pstmt.setInt(1, eventID);
			count = pstmt.executeUpdate();
			System.out.println("賽事刪除成功!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return count;
	}

	@Override
	public EventVO findByPrimaryKey(int eventID) {
		EventVO event = new EventVO();
		try {
			PreparedStatement pstmt=conn.prepareStatement(FIND_BY_PRIMARYKEY_STMT);
			pstmt.setInt(1, eventID);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				event.setLocationID(rs.getString("locationID"));
				event.setName(rs.getString("name"));
				event.setTime(rs.getTimestamp("time"));
				event.setApplyFee(rs.getInt("applyFee"));
				event.setApplyStart(rs.getTimestamp("applyStart"));
				event.setApplyEnd(rs.getTimestamp("applyEnd"));
				event.setCommnet(rs.getString("comment"));
				event.setEventPhotoPath(rs.getString("eventPhotoPath"));
			}
			System.out.println("賽事查詢成功!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return event;
	}

	@Override
	public List<EventVO> findAll() {
		List<EventVO> events = new ArrayList<EventVO>();
		EventVO event = null;
		try {
			PreparedStatement pstmt=conn.prepareStatement(FIND_ALL_STMT);
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()){
				event = new EventVO();
				event.setEventID(rs.getInt("eventID"));
				event.setLocationID(rs.getString("locationID"));
				event.setName(rs.getString("name"));
				event.setTime(rs.getTimestamp("time"));
				event.setApplyFee(rs.getInt("applyFee"));
				event.setApplyStart(rs.getTimestamp("applyStart"));
				event.setApplyEnd(rs.getTimestamp("applyEnd"));
				event.setCommnet(rs.getString("comment"));
				event.setEventPhotoPath(rs.getString("eventPhotoPath"));
				events.add(event);
			}
			System.out.println("賽事查詢成功!!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return events;
	}

}
