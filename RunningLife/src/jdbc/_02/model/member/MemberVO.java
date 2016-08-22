package jdbc._02.model.member;

import java.io.File;

public class MemberVO implements java.io.Serializable {
	
	private String memberID;
	private String firstName;
	private String lastName;
	private String nickName;
	private String email;
	private int gender;
	private String birth;
	private String countryID;
	private String cityID;
	private String locationID;
	private String address;
	private float height;
	private float weight;
	private String phone;
	private File photo;
	private int competenceID;
	private String identityID;
	private String emergencyContact;
	private String emergencyPhone;
	private int emergencyRelation;
	private String createDate;
	private String lastOnlineDateTime;
	
	public MemberVO() {
	}
	
	public MemberVO(String memberID, String firstName, String lastName,
			String nickName, String email, int gender, String birth,
			String countryID, String cityID, String locationID, String address,
			float height, float weight, String phone, File photo,
			int competenceID, String identityID, String emergencyContact,
			String emergencyPhone, int emergencyRelation, String createDate,
			String lastOnlineDateTime) {
		super();
		this.memberID = memberID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.nickName = nickName;
		this.email = email;
		this.gender = gender;
		this.birth = birth;
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
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getGender() {
		return gender;
	}
	public void setGender(int gender) {
		this.gender = gender;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
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
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
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
	public int getEmergencyRelation() {
		return emergencyRelation;
	}
	public void setEmergencyRelation(int emergencyRelation) {
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

	@Override
	public String toString() {
		return "MemberVO [firstName=" + firstName
				+ ", lastName=" + lastName + ", nickName=" + nickName
				+ ", email=" + email + ", gender=" + gender + ", birth="
				+ birth + ", countryID=" + countryID + ", cityID=" + cityID
				+ ", locationID=" + locationID + ", address=" + address
				+ ", height=" + height + ", weight=" + weight + ", phone="
				+ phone + ", photo=" + photo + ", competenceID=" + competenceID
				+ ", identityID=" + identityID + ", emergencyContact="
				+ emergencyContact + ", emergencyPhone=" + emergencyPhone
				+ ", emergencyRelation=" + emergencyRelation + ", createDate="
				+ createDate + ", lastOnlineDateTime=" + lastOnlineDateTime
				+ "]";
	}
	
	

}
