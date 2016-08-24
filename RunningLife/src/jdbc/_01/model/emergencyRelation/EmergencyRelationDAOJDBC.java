package jdbc._01.model.emergencyRelation;

import java.util.List;

public class EmergencyRelationDAOJDBC implements EmergencyRelationInterface{

	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=RunningLife";
	String userid = "sa";
	String passwd = "P@ssw0rd";
	
	private static final String INSERT_STMT =
				"INSERT INTO emergencyRelation VALUES(?)";
	
	private static final String UPDATE_STMT =
			"UPDATE emergencyRelation set "
					+ "where relationID = ?";

	private static final String DELETE_STMT = "DELETE FROM emergencyRelation where relationID = ?";
	
	private static final String GET_ONE_STMT = "SELECT "
											 + " FROM emergencyRelation where relationID = ?";
	
	private static final String GET_ALL_STMT = "SELECT "
											 + "FROM emergencyRelation";
	@Override
	public int insert(EmergencyRelationBean emergencyRelationVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EmergencyRelationBean emergencyRelationVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(EmergencyRelationBean emergencyRelationVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public EmergencyRelationBean selectOne(String menbemergencyRelationVOerVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EmergencyRelationBean> selectAll(EmergencyRelationBean emergencyRelationVO) {
		// TODO Auto-generated method stub
		return null;
	}

}
