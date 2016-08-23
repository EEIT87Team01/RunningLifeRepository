package jdbc._02.model.friend;

public class Modeltest {

	public static void main(String[] args) {
		FriendJDBCDAO fdao = new FriendJDBCDAO();
		FriendVO friendVO = new FriendVO("f349a8e2-de67-4f70-838b-c099c687d57f","1ddac2e1-075f-43d7-b390-ffbf1cf66f35","1","0");
		
		fdao.insert(friendVO);
		System.out.println("Insert successfully!");
	}

}
