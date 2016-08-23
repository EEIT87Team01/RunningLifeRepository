package jdbc._02.model.member;

import java.io.File;
import java.io.UnsupportedEncodingException;

public class Modeltest {

	public static void main(String[] args) {
		
		MemberJDBCDAO dao = new MemberJDBCDAO();
//		File photo = new File("C:\\Project\\Project_friend\\WebContent\\images","1434848781.png");
//		MemberVO mvo = new MemberVO("f349a8e2-de67-4f70-838b-c099c687d57f",
//				"Archer","Chang","AnjUpdate","archeranj@gmail.com",
//				1,"1991-03-02","TWN","TPE","CHH","新北市中和區連城路5號6樓",
//				163,52,"0978653412",photo,1,"F123445354","Schyler Chang",
//				"0913382463",1,"2016-08-08","2016-08-09 06:00:00");
//		
//		dao.insert(mvo);
//		System.out.println("insert success!");
		
//		dao.update(mvo);
//		System.out.println("update success!");
		
//		MemberVO mvo = dao.findByID("f349a8e2-de67-4f70-838b-c099c687d57f");
		MemberVO mvo = dao.findByFirstName("Archer");
		System.out.println("query success!");
		System.out.println(mvo.toString());
		System.out.println(mvo.getMemberID());
//		byte[] b = null; 
//		try {
//			b = mvo.getMemberID().getBytes("US-ASCII");
//		} catch (UnsupportedEncodingException e) {
//			e.printStackTrace();
//		}
//		for(int i =0;i<b.length;i++){
//			System.out.print(b[i]+",");
//		}
		
		
		
	}
	
	

}
