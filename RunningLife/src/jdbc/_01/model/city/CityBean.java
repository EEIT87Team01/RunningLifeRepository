package jdbc._01.model.city;

import jdbc._01.model.location.LocationBean;

public class CityBean {
	//sql
//	  [cityID] char(3),
//	  [countryID] char(3),
//	  [cityName] varchar(50),
	private LocationBean cityID;
	private String countryID;
	private String cityName;
	public CityBean() {
		
	}
	
	public CityBean(LocationBean cityID, String countryID, String cityName) {
		super();
		this.cityID = cityID;
		this.countryID = countryID;
		this.cityName = cityName;
	}

	public LocationBean getCityID() {
		return cityID;
	}
	public void setCityID(LocationBean cityID) {
		this.cityID = cityID;
	}
	public String getCountryID() {
		return countryID;
	}
	public void setCountryID(String countryID) {
		this.countryID = countryID;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}
