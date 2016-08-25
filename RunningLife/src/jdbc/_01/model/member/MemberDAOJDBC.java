package jdbc._01.model.member;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import jdbc._02.model.member.MemberVO;

public class MemberDAOJDBC implements MemberInterface{
	
	String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
	String url = "jdbc:sqlserver://localhost:1433;DatabaseName=RunningLife";
	String userid = "sa";
	String passwd = "P@ssw0rd";
	Connection conn = null;
	PreparedStatement pStmt = null;
	
	
	private static final String INSERT_STMT =
				"INSERT INTO members VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	
	private static final String UPDATE_STMT =
			"UPDATE members set firstName=?,lastName=?,NickName=?,"
					+ "email=?,gender=?,birthday=?,countryID=?,cityID=?,locationID=?,"
					+ "address=?,height=?,weight=?,phone=?,photo=?,competenceID=?,"
					+ "identityID=?,emergencyContact=?,emergencyPhone=?,"
					+ "emergencyRelation=?,createDate=?,lastOnlineDateTime=?"
					+ "where memberID = ?";

	private static final String DELETE_STMT = "DELETE FROM members where memberID = ?";
	
	private static final String GET_ONE_STMT = "SELECT firstName,lastName,NickName,"
											 + "email,gender,birthday,countryID,cityID,"
											 + "locationID,address,height,weight,phone,"
											 + "photo,competenceID,identityID,emergencyContact,"
											 + "emergencyPhone,emergencyRelation,createDate,lastOnlineDateTime"
											 + " FROM members where memberID = ?";
	
	private static final String GET_ALL_STMT = "SELECT firstName,lastName,NickName,"
											 + "email,gender,birthday,countryID,cityID,"
											 + "locationID,address,height,weight,phone,"
											 + "photo,competenceID,identityID,emergencyContact,"
											 + "emergencyPhone,emergencyRelation,createDate,lastOnlineDateTime"
											 + "FROM members";

	@Override
	public int insert(MemberBean memberVO) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(url, userid, passwd);
			pStmt = conn.prepareStatement(INSERT_STMT);
			
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
				
			
			pStmt.setString(1, memberVO.getMemberID());
			pStmt.setString(2, memberVO.getFirstName());
			pStmt.setString(3, memberVO.getLastName());
			pStmt.setString(4, memberVO.getNickName());
			pStmt.setString(5, memberVO.getEmail());
			pStmt.setString(6, memberVO.getGender());
			pStmt.setString(7, memberVO.getBirthday());
			pStmt.setString(8, memberVO.getCountryID());
			pStmt.setString(9, memberVO.getCityID());
			pStmt.setString(10, memberVO.getLocationID());
			pStmt.setString(11, memberVO.getAddress());
			pStmt.setDouble(12, memberVO.getHeight());
			pStmt.setDouble(13, memberVO.getWeight());
			pStmt.setString(14, memberVO.getPhone());
			pStmt.setBinaryStream(15,fin,(int)flen);
			pStmt.setInt(16, memberVO.getCompetenceID());
			pStmt.setString(17, memberVO.getIdentityID());
			pStmt.setString(18, memberVO.getEmergencyContact());
			pStmt.setString(19, memberVO.getEmergencyPhone());
			pStmt.setInt(20, memberVO.getEmergencyRelation().getRelationID());
			pStmt.setString(21, memberVO.getCreateDate());
			pStmt.setString(22, memberVO.getLastOnlineDateTime());

			result = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public int update(MemberBean memberVO) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(url,userid,passwd);
			pStmt = conn.prepareStatement(UPDATE_STMT);
			
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
			
			pStmt.setString(1, memberVO.getFirstName());
			pStmt.setString(2, memberVO.getLastName());
			pStmt.setString(3, memberVO.getNickName());
			pStmt.setString(4, memberVO.getEmail());
			pStmt.setString(5, memberVO.getGender());
			pStmt.setString(6, memberVO.getBirthday());
			pStmt.setString(7, memberVO.getCountryID());
			pStmt.setString(8, memberVO.getCityID());
			pStmt.setString(9, memberVO.getLocationID());
			pStmt.setString(10, memberVO.getAddress());
			pStmt.setDouble(11, memberVO.getHeight());
			pStmt.setDouble(12, memberVO.getWeight());
			pStmt.setString(13, memberVO.getPhone());
			pStmt.setBinaryStream(14,fin,(int)flen);
			pStmt.setInt(15, memberVO.getCompetenceID());
			pStmt.setString(16, memberVO.getIdentityID());
			pStmt.setString(17, memberVO.getEmergencyContact());
			pStmt.setString(18, memberVO.getEmergencyPhone());
			pStmt.setInt(19, memberVO.getEmergencyRelation().getRelationID());
			pStmt.setString(20, memberVO.getCreateDate());
			pStmt.setString(21, memberVO.getLastOnlineDateTime());
			pStmt.setInt(22, Integer.parseInt(memberVO.getMemberID()));
			
			result = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public int delete(MemberBean memberVO) {
		int result = 0;
		
		try {
			conn = DriverManager.getConnection(url,userid,passwd);
			pStmt = conn.prepareStatement(DELETE_STMT);
			
			pStmt.setInt(1, Integer.parseInt(memberVO.getMemberID()));
			result = pStmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				pStmt.close();
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return result;
	}

	@Override
	public MemberBean selectOne(String memberID) {
		MemberBean memberVO = null;
		try {
			conn = DriverManager.getConnection(url,userid,passwd);
			pStmt = conn.prepareStatement(GET_ONE_STMT);
			ResultSet rs = null;
			rs = pStmt.executeQuery();
			if(rs.next()){
				memberVO = new MemberBean();
				memberVO.setMemberID(rs.getString("memberID"));
				memberVO.setFirstName(rs.getString("firstName"));
				memberVO.setLastName(rs.getString("lastName"));
				memberVO.setNickName(rs.getString("NickName"));
				memberVO.setEmail(rs.getString("email"));
				memberVO.setGender(rs.getString("gender"));
				memberVO.setBirthday(rs.getString("birthday"));
				memberVO.setCountryID(rs.getString("countryID"));
				memberVO.setCityID(rs.getString("cityID"));
				memberVO.setLocationID(rs.getString("locationID"));
				memberVO.setAddress(rs.getString("address"));
				memberVO.setHeight(rs.getDouble("height"));
				memberVO.setWeight(rs.getDouble("weight"));
				memberVO.setPhone(rs.getString("phone"));
				
				memberVO.setCompetenceID(rs.getInt("competenceID"));
				memberVO.setIdentityID(rs.getString("identityID"));
				memberVO.setEmergencyContact(rs.getString("emergencyContact"));
				memberVO.setEmergencyPhone(rs.getString("emergencyPhone"));
				
				memberVO.setCreateDate(rs.getString("createDate"));
				memberVO.setLastOnlineDateTime(rs.getString("lastOnlineDateTime"));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<MemberBean> selectAll(MemberBean memberVO) {
		// TODO Auto-generated method stub
		return null;
	}
	
	public String printData(){
		
		return "";
	}

}
