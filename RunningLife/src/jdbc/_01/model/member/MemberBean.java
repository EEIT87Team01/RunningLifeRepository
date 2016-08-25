package jdbc._01.model.member;

import java.io.File;

import jdbc._01.model.emergencyRelation.EmergencyRelationBean;

public class MemberBean {
	private String memberID;
	private String firstName;
	private String lastName;
	private String nickname;
	private String email;
	private String gender;
	private String birthday;
	private String countryID;
	private String cityID;
	private String locationID;
	private String address;
	private Double height;
	private Double weight;
	private String phone;
	private File photo;
	private int competenceID;
	private String identityID;
	private String emergencyContact;
	private String emergencyPhone;
	private EmergencyRelationBean emergencyRelation;
	private String createDate;
	private String lastOnlineDateTime;

	public MemberBean() {
		
	}
	
	public MemberBean(String memberID, String firstName, String lastName, String nickname, String email, String gender,
			String birthday, String countryID, String cityID, String locationID, String address, Double height,
			Double weight, String phone, File photo, int competenceID, String identityID, String emergencyContact,
			String emergencyPhone, EmergencyRelationBean emergencyRelation, String createDate, String lastOnlineDateTime) {
		super();
		this.memberID = memberID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickname = nickname;
		this.email = email;
		this.gender = gender;
		this.birthday = birthday;
		this.countryID = countryID;
		this.cityID = cityID;
		this.locationID = locationID;
		this.address = address;
		this.height = height;
		this.weight = weight;
		this.phone = phone;
		this.photo = photo;
		this.competenceID = competenceID;
		this.identityID = identityID;
		this.emergencyContact = emergencyContact;
		this.emergencyPhone = emergencyPhone;
		this.emergencyRelation = emergencyRelation;
		this.createDate = createDate;
		this.lastOnlineDateTime = lastOnlineDateTime;
	}

	public String getMemberID() {
		return memberID;
	}

	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getNickName() {
		return nickname;
	}

	public void setNickName(String nickname) {
		this.nickname = nickname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getCountryID() {
		return countryID;
	}

	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}

	public String getCityID() {
		return cityID;
	}

	public void setCityID(String cityID) {
		this.cityID = cityID;
	}

	public String getLocationID() {
		return locationID;
	}

	public void setLocationID(String locationID) {
		this.locationID = locationID;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public File getPhoto() {
		return photo;
	}

	public void setPhoto(File photo) {
		this.photo = photo;
	}

	public int getCompetenceID() {
		return competenceID;
	}

	public void setCompetenceID(int competenceID) {
		this.competenceID = competenceID;
	}

	public String getIdentityID() {
		return identityID;
	}

	public void setIdentityID(String identityID) {
		this.identityID = identityID;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyPhone() {
		return emergencyPhone;
	}

	public void setEmergencyPhone(String emergencyPhone) {
		this.emergencyPhone = emergencyPhone;
	}

	public EmergencyRelationBean getEmergencyRelation() {
		return emergencyRelation;
	}

	public void setEmergencyRelation(EmergencyRelationBean emergencyRelation) {
		this.emergencyRelation = emergencyRelation;
	}

	public String getCreateDate() {
		return createDate;
	}

	public void setCreateDate(String createDate) {
		this.createDate = createDate;
	}

	public String getLastOnlineDateTime() {
		return lastOnlineDateTime;
	}

	public void setLastOnlineDateTime(String lastOnlineDateTime) {
		this.lastOnlineDateTime = lastOnlineDateTime;
	}

}
