package jdbc._02.model.member;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc._02.model.globalservice.*;

public class MemberJDBCDAO implements MemberDAO_interface{
	
	private final String INSERT_STMT = "INSERT INTO member VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
	private final String UPDATE_STMT = "UPDATE member SET firstName=?,lastName=?,"
			+ "nickname=?,email=?,gender=?,birthday=?,countryID=?,cityID=?,"
			+ "locationID=?,address=?,height=?,weight=?,phone=?,photo=?,"
			+ "competenceID=?,identityID=?,emergencyContact=?,emergencyPhone=?,"
			+ "emergencyRelation=?,createDate=?,lastOnlineDateTime=? WHERE memberID=?";
	private final String DELETE_STMT = "DELETE FROM member WHERE memberID=?";
	private final String FIND_BY_ID_STMT = "SELECT * FROM member WHERE memberID=?";
	private final String GET_ALL_STMT = "SELECT * FROM member";
	private final String FIND_BY_FIRSTNAME_STMT = "SELECT * FROM member WHERE firstName=?";
	private JDBCService jdbc = new JDBCService();
	private PreparedStatement pstmt;
	public int updateCount = 0;

	@Override
	public int insert(MemberVO memberVo) {
		try {
			pstmt = jdbc.getPStmt(INSERT_STMT);
			
			InputStream is = new FileInputStream(memberVo.getPhoto());
			long flen = memberVo.getPhoto().length();
			
			pstmt.setString(1, memberVo.getMemberID());
			pstmt.setString(2, memberVo.getFirstName());
			pstmt.setString(3, memberVo.getLastName());
			pstmt.setString(4, memberVo.getNickName());
			pstmt.setString(5, memberVo.getEmail());
			pstmt.setInt(6, memberVo.getGender());
			pstmt.setString(7, memberVo.getBirth());
			pstmt.setString(8, memberVo.getCountryID());
			pstmt.setString(9, memberVo.getCityID());
			pstmt.setString(10, memberVo.getLocationID());
			pstmt.setString(11, memberVo.getAddress());
			pstmt.setFloat(12, memberVo.getHeight());
			pstmt.setFloat(13, memberVo.getWeight());
			pstmt.setString(14, memberVo.getPhone());
			pstmt.setBinaryStream(15, is, flen);
			pstmt.setInt(16, memberVo.getCompetenceID());
			pstmt.setString(17, memberVo.getIdentityID());
			pstmt.setString(18, memberVo.getEmergencyContact());
			pstmt.setString(19, memberVo.getEmergencyPhone());
			pstmt.setInt(20, memberVo.getEmergencyRelation());
			pstmt.setString(21, memberVo.getCreateDate());
			pstmt.setString(22, memberVo.getLastOnlineDateTime());
			
			updateCount = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to find class while inserting...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException while inserting...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to find images while inserting...");
		} finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("SQLException while closing statement...");
				}
			if(jdbc.getCon() != null)
				try {
					jdbc.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("SQLException while closing connection...");
				}
		}
		
		return updateCount;
	}

	@Override
	public int update(MemberVO memberVo) {
		try {
			pstmt = jdbc.getPStmt(UPDATE_STMT);
			
			InputStream is = new FileInputStream(memberVo.getPhoto());
			long flen = memberVo.getPhoto().length();

			pstmt.setString(1, memberVo.getFirstName());
			pstmt.setString(2, memberVo.getLastName());
			pstmt.setString(3, memberVo.getNickName());
			pstmt.setString(4, memberVo.getEmail());
			pstmt.setInt(5, memberVo.getGender());
			pstmt.setString(6, memberVo.getBirth());
			pstmt.setString(7, memberVo.getCountryID());
			pstmt.setString(8, memberVo.getCityID());
			pstmt.setString(9, memberVo.getLocationID());
			pstmt.setString(10, memberVo.getAddress());
			pstmt.setFloat(11, memberVo.getHeight());
			pstmt.setFloat(12, memberVo.getWeight());
			pstmt.setString(13, memberVo.getPhone());
			pstmt.setBinaryStream(14, is, flen);
			pstmt.setInt(15, memberVo.getCompetenceID());
			pstmt.setString(16, memberVo.getIdentityID());
			pstmt.setString(17, memberVo.getEmergencyContact());
			pstmt.setString(18, memberVo.getEmergencyPhone());
			pstmt.setInt(19, memberVo.getEmergencyRelation());
			pstmt.setString(20, memberVo.getCreateDate());
			pstmt.setString(21, memberVo.getLastOnlineDateTime());
			pstmt.setString(22, memberVo.getMemberID());
			
			updateCount = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to find class while inserting...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException while inserting...");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to find images while inserting...");
		} finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("SQLException while closing statement...");
				}
			if(jdbc.getCon() != null)
				try {
					jdbc.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("SQLException while closing connection...");
				}
		}
		
		return updateCount;
	}

	@Override
	public int delete(String memberID) {
		
		try {
			pstmt = jdbc.getPStmt(DELETE_STMT);
			
			pstmt.setString(1, memberID);
			
			updateCount = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to find class while inserting...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException while inserting...");
		} finally {
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("SQLException while closing statement...");
				}
			if(jdbc.getCon() != null)
				try {
					jdbc.close();
				} catch (SQLException e) {
					e.printStackTrace();
					System.out.println("SQLException while closing connection...");
				}
		}
		return updateCount;
	}

	@Override
	public MemberVO findByID(String memberID) {
		MemberVO mvo = new MemberVO();
		
		try {
			pstmt = jdbc.getPStmt(FIND_BY_ID_STMT);
			
			pstmt.setString(1, memberID);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			
			while(rs.next()){
				mvo.setMemberID(rs.getString("memberID"));
				mvo.setFirstName(rs.getString("firstname"));
				mvo.setLastName(rs.getString("lastname"));
				mvo.setNickName(rs.getString("nickname"));
				mvo.setEmail(rs.getString("email"));
				mvo.setGender(rs.getInt("gender"));
				mvo.setBirth(rs.getString("birthday"));
				mvo.setCountryID(rs.getString("countryID"));
				mvo.setCityID(rs.getString("cityID"));
				mvo.setLocationID(rs.getString("locationID"));
				mvo.setAddress(rs.getString("address"));
				mvo.setHeight(rs.getFloat("height"));
				mvo.setWeight(rs.getFloat("weight"));
				mvo.setPhone(rs.getString("phone"));
				mvo.setPhoto(FileConverter.isToFile(rs.getBytes("photo"), rs.getString("memberID")));
				mvo.setCompetenceID(rs.getInt("competenceID"));
				mvo.setIdentityID(rs.getString("identityID"));
				mvo.setEmergencyContact(rs.getString("emergencyContact"));
				mvo.setEmergencyPhone(rs.getString("emergencyPhone"));
				mvo.setEmergencyRelation(rs.getInt("emergencyRelation"));
				mvo.setCreateDate(rs.getString("createDate"));
				mvo.setLastOnlineDateTime(rs.getString("lastOnlineDateTime"));
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQLException while inserting...");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to find class while inserting...");
		} finally {
			
			
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("SQLException while closing statement...");
				}
			if(jdbc.getCon() != null)
				try {
					jdbc.close();
				} catch (SQLException e) {
					System.out.println("SQLException while closing connection...");
				}
		}
		return mvo;
	}
	
	@Override
	public MemberVO findByFirstName(String firstName) {
		MemberVO mvo = new MemberVO();
		
		try {
			pstmt = jdbc.getPStmt(FIND_BY_FIRSTNAME_STMT);
			
			pstmt.setString(1, firstName);
			
			ResultSet rs = pstmt.executeQuery();
			
			
			
			while(rs.next()){
				mvo.setMemberID(rs.getString("memberID"));
				mvo.setFirstName(rs.getString("firstname"));
				mvo.setLastName(rs.getString("lastname"));
				mvo.setNickName(rs.getString("nickname"));
				mvo.setEmail(rs.getString("email"));
				mvo.setGender(rs.getInt("gender"));
				mvo.setBirth(rs.getString("birthday"));
				mvo.setCountryID(rs.getString("countryID"));
				mvo.setCityID(rs.getString("cityID"));
				mvo.setLocationID(rs.getString("locationID"));
				mvo.setAddress(rs.getString("address"));
				mvo.setHeight(rs.getFloat("height"));
				mvo.setWeight(rs.getFloat("weight"));
				mvo.setPhone(rs.getString("phone"));
				mvo.setPhoto(FileConverter.isToFile(rs.getBytes("photo"), rs.getString("memberID")));
				mvo.setCompetenceID(rs.getInt("competenceID"));
				mvo.setIdentityID(rs.getString("identityID"));
				mvo.setEmergencyContact(rs.getString("emergencyContact"));
				mvo.setEmergencyPhone(rs.getString("emergencyPhone"));
				mvo.setEmergencyRelation(rs.getInt("emergencyRelation"));
				mvo.setCreateDate(rs.getString("createDate"));
				mvo.setLastOnlineDateTime(rs.getString("lastOnlineDateTime"));
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQLException while inserting...");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to find class while inserting...");
		} finally {
			
			
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("SQLException while closing statement...");
				}
			if(jdbc.getCon() != null)
				try {
					jdbc.close();
				} catch (SQLException e) {
					System.out.println("SQLException while closing connection...");
				}
		}
		return mvo;
	}

	@Override
	public List<MemberVO> gelAll() {
		List<MemberVO> mvos = new ArrayList<MemberVO>();
		MemberVO mvo = null;
		
		try {
			pstmt = jdbc.getPStmt(GET_ALL_STMT);
			
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next()){
				mvo.setMemberID(rs.getString("memberID"));
				mvo.setFirstName(rs.getString("firstname"));
				mvo.setLastName(rs.getString("lastname"));
				mvo.setNickName(rs.getString("nickname"));
				mvo.setEmail(rs.getString("email"));
				mvo.setGender(rs.getInt("gender"));
				mvo.setBirth(rs.getString("birthday"));
				mvo.setCountryID(rs.getString("countryID"));
				mvo.setCityID(rs.getString("cityID"));
				mvo.setLocationID(rs.getString("locationID"));
				mvo.setAddress(rs.getString("address"));
				mvo.setHeight(rs.getFloat("height"));
				mvo.setWeight(rs.getFloat("weight"));
				mvo.setPhone(rs.getString("phone"));
				mvo.setPhoto(FileConverter.isToFile(rs.getBytes("photo"), rs.getString("memberID")));
				mvo.setCompetenceID(rs.getInt("competenceID"));
				mvo.setIdentityID(rs.getString("identityID"));
				mvo.setEmergencyContact(rs.getString("emergencyContact"));
				mvo.setEmergencyPhone(rs.getString("emergencyPhone"));
				mvo.setEmergencyRelation(rs.getInt("emergencyRelation"));
				mvo.setCreateDate(rs.getString("createDate"));
				mvo.setLastOnlineDateTime(rs.getString("lastOnlineDateTime"));
				
				mvos.add(mvo);
			}
			
			
		} catch (SQLException e) {
			System.out.println("SQLException while inserting...");
		} catch (ClassNotFoundException e) {
			System.out.println("Failed to find class while inserting...");
		} finally {
			
			
			if(pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
					System.out.println("SQLException while closing statement...");
				}
			if(jdbc.getCon() != null)
				try {
					jdbc.close();
				} catch (SQLException e) {
					System.out.println("SQLException while closing connection...");
				}
		}
		return mvos;
	}

}
