package com.rto.pojos;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private String city;
	private String area;
	private String houseNo;
	private String state;
	private String landMark;
	private long pinCode;
	
	public Address() {
		super();
	}
	
	public Address(String city, String area, String houseNo, String state,
			String landMark, long pinCode) {
		super();
		this.city = city;
		this.area = area;
		this.houseNo = houseNo;
		this.state = state;
		this.landMark = landMark;
		this.pinCode = pinCode;
	}

	@Column(insertable = false, updatable = false)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Column(insertable = false, updatable = false)
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Column(insertable = false, updatable = false)
	public String getHouseNo() {
		return houseNo;
	}
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}
	
	@Column(insertable = false, updatable = false)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Column(insertable = false, updatable = false)
	public String getLandMark() {
		return landMark;
	}

	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}
	@Column(insertable = false, updatable = false)
	public long getPinCode() {
		return pinCode;
	}

	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", area=" + area + ", houseNo="
				+ houseNo + ", state=" + state + ", landMark=" + landMark
				+ ", pinCode=" + pinCode + "]";
	}
	
}
