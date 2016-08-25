package jdbc._01.model.member;

import java.io.File;

import jdbc._01.model.emergencyRelation.EmergencyRelationBean;
import jdbc._01.model.emergencyRelation.EmergencyRelationDAOJDBC;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.InputStream;

public class MainMeneber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MemberDAOJDBC dao = new MemberDAOJDBC();
//		MemberDAOJNDI dao = new MemberDAOJNDI();
		EmergencyRelationDAOJDBC erdoa = new EmergencyRelationDAOJDBC();
		
		String photoName = "chngstar.gif";
		File photo = new File("E:\\EEIT87-1P\\FinalProject\\images",photoName);
		
		MemberBean memberVO = new MemberBean();
		EmergencyRelationBean erVO = new EmergencyRelationBean();
		memberVO.setMemberID("665922CD-6039-4D69-B963-DC1B7B62EC99");
		memberVO.setFirstName("Wang");
		memberVO.setLastName("Jack");
		memberVO.setNickName("KO");
		memberVO.setEmail("jack123@gmail.com");
		memberVO.setGender("1");
		memberVO.setBirthday("2016-08-16");
		memberVO.setCountryID("300");
		memberVO.setCityID("222");
		memberVO.setLocationID("777");
		memberVO.setAddress("日本北海道札幌市");
		memberVO.setHeight(123.0);
		memberVO.setWeight(123.0);
		memberVO.setPhone("0933987987");
		memberVO.setPhoto(photo);
		memberVO.setCompetenceID(11);
		memberVO.setIdentityID("A123456789");
		memberVO.setEmergencyContact("God");
		memberVO.setEmergencyPhone("0987987987");
		erVO.setRelationID(10);
		memberVO.setEmergencyRelation(erVO);
		memberVO.setCreateDate("2016-08-16");
		memberVO.setLastOnlineDateTime("2016-08-09 12:20:00.000");
				
		dao.insert(memberVO);
		System.out.println("GG");
	}

}
