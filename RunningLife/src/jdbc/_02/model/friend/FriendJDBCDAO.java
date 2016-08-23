package jdbc._02.model.friend;

import java.io.UnsupportedEncodingException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import jdbc._02.model.globalservice.JDBCService;
import jdbc._02.model.member.MemberJDBCDAO;
import jdbc._02.model.member.MemberVO;

public class FriendJDBCDAO implements FriendDAO_interface {

	private final String INSERT_STMT = "INSERT INTO friend VALUES (?,?,?,?) ";
	private final String UPDATE_STMT = "UPDATE friend SET relationL=?,relationS=? "
			+ "WHERE (memberIDS=? AND memberIDL=?)";
	private final String DELETE_STMT = "DELETE FROM friend WHERE (memberIDL=? AND memberIDS=?)";
	private final String FIND_BY_TWO_ID_STMT = "SELECT * FROM friend WHERE (memberIDL=? AND memberIDS=?)";
	private final String FIND_BY_ONE_ID_STMT = "SELECT * FROM friend WHERE (memberIDL=? OR memberIDS=?)";
	private final String GET_ALL_STMT = "SELECT * FROM friend";
	private JDBCService jdbc = new JDBCService();
	private PreparedStatement pstmt;
	public int updateCount = 0;
	
	@Override
	public int insert(FriendVO friendVO) {
		try {
			pstmt = jdbc.getPStmt(INSERT_STMT);
			
			byte[] a;byte[] b;
			a = friendVO.getMemberIDL().getMemberID().getBytes("US-ASCII");
			b = friendVO.getMemberIDS().getMemberID().getBytes("US-ASCII");
			for (int i = 0; i < a.length; i++){
				if(a[i] < b[i]){
					MemberVO temp = friendVO.getMemberIDL();
					friendVO.setMemberIDL(friendVO.getMemberIDS());
					friendVO.setMemberIDS(temp);
					break;
				}
			}
			
			pstmt.setString(1, friendVO.getMemberIDL().getMemberID());
			pstmt.setString(2, friendVO.getMemberIDS().getMemberID());
			pstmt.setString(3, friendVO.getRelationL());
			pstmt.setString(4, friendVO.getRelationS());
			
			updateCount = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("Failed to find class while inserting...");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQLException while inserting...");
		} catch (UnsupportedEncodingException e) {
			System.out.println("UnsupportedEncodingException while inserting...");
			e.printStackTrace();
		}
		return 0;
	}

	@Override
	public int delete(String MemberIDL, String MemberIDS) {
		byte[] a;byte[] b;
		try {
			a = MemberIDL.getBytes("US-ASCII");
			b = MemberIDS.getBytes("US-ASCII");
			for (int i = 0; i < a.length; i++){
				if(a[i] < b[i]){
					String temp = MemberIDL;
					MemberIDL = MemberIDS;
					MemberIDS = temp;
					break;
				}
			}
			
			pstmt = jdbc.getPStmt(DELETE_STMT);
			
			pstmt.setString(1, MemberIDL);
			pstmt.setString(1, MemberIDS);
			
			updateCount = pstmt.executeUpdate();
			
		} catch (UnsupportedEncodingException | ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public int update(FriendVO friendVO) {
		try {
			pstmt = jdbc.getPStmt(UPDATE_STMT);
			
			byte[] a;byte[] b;
			a = friendVO.getMemberIDL().getMemberID().getBytes("US-ASCII");
			b = friendVO.getMemberIDS().getMemberID().getBytes("US-ASCII");
			for (int i = 0; i < a.length; i++){
				if(a[i] < b[i]){
					MemberVO temp = friendVO.getMemberIDL();
					friendVO.setMemberIDL(friendVO.getMemberIDS());
					friendVO.setMemberIDS(temp);
					break;
				}
			}
			
			pstmt.setString(1, friendVO.getMemberIDL().getMemberID());
			pstmt.setString(1, friendVO.getMemberIDS().getMemberID());
			pstmt.setString(1, friendVO.getRelationL());
			pstmt.setString(1, friendVO.getRelationS());
			
			updateCount = pstmt.executeUpdate();
			
		} catch (ClassNotFoundException | SQLException | UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		
		return 0;
	}

	@Override
	public List<FriendVO> findByMemberID(String MemberID) {
		List<FriendVO> fvos = new ArrayList<FriendVO>();
		FriendVO fVO = null;
		MemberJDBCDAO mDAO = new MemberJDBCDAO();
		
		try {
			pstmt = jdbc.getPStmt(FIND_BY_ONE_ID_STMT);
			pstmt.setString(1, MemberID);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				fVO.setMemberIDL(mDAO.findByID((rs.getString("memberIDL"))));
				fVO.setMemberIDS(mDAO.findByID((rs.getString("memberIDS"))));
				fVO.setRelationL(rs.getString("relationL"));
				fVO.setRelationS(rs.getString("relationS"));
				fvos.add(fVO);
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return fvos;
		
	}

	@Override
	public FriendVO findByTwoMemberID(String MemberIDL, String MemberIDS) {
		FriendVO fVO = null;
		MemberJDBCDAO mDAO = new MemberJDBCDAO();
		
		try {
			pstmt = jdbc.getPStmt(FIND_BY_TWO_ID_STMT);
			pstmt.setString(1, MemberIDL);
			pstmt.setString(1, MemberIDS);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				fVO.setMemberIDL(mDAO.findByID((rs.getString("memberIDL"))));
				fVO.setMemberIDS(mDAO.findByID((rs.getString("memberIDS"))));
				fVO.setRelationL(rs.getString("relationL"));
				fVO.setRelationS(rs.getString("relationS"));
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return fVO;
	}

	@Override
	public List<FriendVO> getAll() {
		List<FriendVO> fvos = new ArrayList<FriendVO>();
		FriendVO fVO = null;
		MemberJDBCDAO mDAO = new MemberJDBCDAO();
		
		try {
			pstmt = jdbc.getPStmt(GET_ALL_STMT);
			
			ResultSet rs = pstmt.executeQuery();
			
			while (rs.next()){
				fVO.setMemberIDL(mDAO.findByID((rs.getString("memberIDL"))));
				fVO.setMemberIDS(mDAO.findByID((rs.getString("memberIDS"))));
				fVO.setRelationL(rs.getString("relationL"));
				fVO.setRelationS(rs.getString("relationS"));
				fvos.add(fVO);
			}
			
			
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		
		return fvos;
	}

}
