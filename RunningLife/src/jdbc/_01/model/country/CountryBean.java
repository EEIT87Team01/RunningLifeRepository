package jdbc._01.model.country;

import jdbc._01.model.city.CityBean;

public class CountryBean {
//sql
//	[countryID] char(3),
//	  [country] varchar(50),
	private CityBean countryID;
	private String country;
	
	public CountryBean() {
		
	}

	public CountryBean(CityBean countryID, String country) {
		super();
		this.countryID = countryID;
		this.country = country;
	}

	public CityBean getCountryID() {
		return countryID;
	}

	public void setCountryID(CityBean countryID) {
		this.countryID = countryID;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
