package jdbc._01.model.location;

import java.util.List;

public class LocationDAOJDBC implements LocationInterface{

	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=RunningLife";
	String userid = "sa";
	String passwd = "P@ssw0rd";
	
	private static final String INSERT_STMT =
				"INSERT INTO location VALUES(?)";
	
	private static final String UPDATE_STMT =
			"UPDATE location set "
					+ "where locationID = ?";

	private static final String DELETE_STMT = "DELETE FROM location where locationID = ?";
	
	private static final String GET_ONE_STMT = "SELECT "
											 + " FROM location where locationID = ?";
	
	private static final String GET_ALL_STMT = "SELECT "
											 + "FROM location";
	
	@Override
	public int insert(LocationBean locationVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(LocationBean locationVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(LocationBean locationVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public LocationBean selectOne(String locationVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<LocationBean> selectAll(LocationBean locationVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
