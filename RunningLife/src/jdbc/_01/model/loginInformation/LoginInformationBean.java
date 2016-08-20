package jdbc._01.model.loginInformation;

import jdbc._01.model.member.MemberBean;

public class LoginInformationBean {
	private MemberBean memberID;
	private String loginMethod;
	private String memberAccount;
	private String password;
	
	
	public LoginInformationBean() {

	}

	public LoginInformationBean(MemberBean memberID, String loginMethod, String memberAccount, String password) {
		super();
		this.memberID = memberID;
		this.loginMethod = loginMethod;
		this.memberAccount = memberAccount;
		this.password = password;
	}
	
	public MemberBean getMemberID() {
		return memberID;
	}
	public void setMemberID(MemberBean memberID) {
		this.memberID = memberID;
	}
	public String getLoginMethod() {
		return loginMethod;
	}
	public void setLoginMethod(String loginMethod) {
		this.loginMethod = loginMethod;
	}
	public String getMemberAccount() {
		return memberAccount;
	}
	public void setMemberAccount(String memberAccount) {
		this.memberAccount = memberAccount;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
