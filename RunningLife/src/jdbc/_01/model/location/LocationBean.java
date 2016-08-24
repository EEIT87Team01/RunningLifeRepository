package jdbc._01.model.location;

import jdbc._01.model.member.MemberBean;

public class LocationBean {
//	SELECT TOP 1000 [locationID]
//		      ,[cityID]
//		      ,[countryID]
//		      ,[locationName]
	private MemberBean locationID;
	private String cityID;
	private String countryID;
	private String locationName;
			
	public LocationBean() {
		
	}
	public LocationBean(MemberBean locationID, String cityID, String countryID, String locationName) {
		super();
		this.locationID = locationID;
		this.cityID = cityID;
		this.countryID = countryID;
		this.locationName = locationName;
	}
	public MemberBean getLocationID() {
		return locationID;
	}
	public void setLocationID(MemberBean locationID) {
		this.locationID = locationID;
	}
	public String getCityID() {
		return cityID;
	}
	public void setCityID(String cityID) {
		this.cityID = cityID;
	}
	public String getCountryID() {
		return countryID;
	}
	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	
}
