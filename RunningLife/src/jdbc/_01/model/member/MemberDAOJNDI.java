package jdbc._01.model.member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;


public class MemberDAOJNDI implements MemberInterface{
	
//	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
//	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=Sports";
//	String userid = "sa";
//	String passwd = "P@ssw0rd";
	private static DataSource ds = null;
	static {
		try {
			Context ctx = new InitialContext();
			ds = (DataSource) ctx.lookup("java:comp/env/jdbc/TestDB");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		
	}
	

	
	private static final String INSERT_STMT =
				"INSERT INTO members VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static final String UPDATE_STMT =
			"UPDATE members set firstName=?,lastName=?,nickname=?,"
					+ "email=?,gender=?,birthday=?,countryID=?,cityID=?,locationID=?,"
					+ "address=?,height=?,weight=?,phone=?,photo=?,competenceID=?,"
					+ "identityID=?,emergencyContact=?,emergencyPhone=?,"
					+ "emergencyRelation=?,createDate=?,lastOnlineDateTime=?"
					+ "where memberID = ?";

	private static final String DELETE_STMT = "DELETE FROM members where memberID = ?";
	
	private static final String GET_ONE_STMT = "SELECT firstName,lastName,nickname,"
											 + "email,gender,birthday,countryID,cityID,"
											 + "locationID,address,height,weight,phone,"
											 + "photo,competenceID,identityID,emergencyContact,"
											 + "emergencyPhone,emergencyRelation,createDate,lastOnlineDateTime"
											 + " FROM members where memberID = ?";
	
	private static final String GET_ALL_STMT = "SELECT firstName,lastName,nickname,"
											 + "email,gender,birthday,countryID,cityID,"
											 + "locationID,address,height,weight,phone,"
											 + "photo,competenceID,identityID,emergencyContact,"
											 + "emergencyPhone,emergencyRelation,createDate,lastOnlineDateTime"
											 + "FROM members";

	@Override
	public int insert(MemberBean menberVO) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
//			Class.forName(driver);
//			conn = DriverManager.getConnection(url, userid, passwd);
			conn = ds.getConnection();
			pstmt = conn.prepareStatement(INSERT_STMT);
			
			//File input test data
			String photoName = "chngstar.gif";
			File photo = new File("E:\\EEIT87-1P\\FinalProject\\images",photoName);
			InputStream fin = null;
			try {
				fin = new FileInputStream(photo);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			long flen = photo.length();
				
			
			pstmt.setString(1, menberVO.getMemberID());
			pstmt.setString(2, menberVO.getFirstName());
			pstmt.setString(3, menberVO.getLastName());
			pstmt.setString(4, menberVO.getNickname());
			pstmt.setString(5, menberVO.getEmail());
			pstmt.setString(6, menberVO.getGender());
			pstmt.setString(7, menberVO.getBirthday());
			pstmt.setString(8, menberVO.getCountryID());
			pstmt.setString(9, menberVO.getCityID());
			pstmt.setString(10, menberVO.getLocationID());
			pstmt.setString(11, menberVO.getAddress());
			pstmt.setDouble(12, menberVO.getHeight());
			pstmt.setDouble(13, menberVO.getWeight());
			pstmt.setString(14, menberVO.getPhone());
			pstmt.setBinaryStream(15,fin,(int)flen);
			pstmt.setInt(16, menberVO.getCompetenceID());
			pstmt.setString(17, menberVO.getIdentityID());
			pstmt.setString(18, menberVO.getEmergencyContact());
			pstmt.setString(19, menberVO.getEmergencyPhone());
			pstmt.setInt(20, menberVO.getEmergencyRelation());
			pstmt.setString(21, menberVO.getCreateDate());
			pstmt.setString(22, menberVO.getLastOnlineDateTime());

			pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return 0;
	}

	@Override
	public int update(MemberBean menberVO) {

		return 0;
	}

	@Override
	public int delete(MemberBean menberVO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MemberBean selectOne(String menberVO) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MemberBean> selectAll(MemberBean menberVO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String printData(){
		
		return "";
	}

}
