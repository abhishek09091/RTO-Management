package com.rto.pojos;

import java.sql.Date;

import javax.persistence.*;

@Embeddable
public class Licence {
	
	private String licenceStatus;
	private String licenceNo;
	private Date dateOfExpiration;
	private String classOfVehicle;
	
	public Licence() {
		super();
	}

	public Licence(String licenceStatus, String licenceNo,
			Date dateOfExpiration, String classOfVehicle) {
		super();
		this.licenceStatus = licenceStatus;
		this.licenceNo = licenceNo;
		this.dateOfExpiration = dateOfExpiration;
		this.classOfVehicle = classOfVehicle;
	}
	

	public String getLicenceStatus() {
		return licenceStatus;
	}

	public void setLicenceStatus(String licenceStatus) {
		this.licenceStatus = licenceStatus;
	}

	public String getLicenceNo() {
		return licenceNo;
	}

	public void setLicenceNo(String licenceNo) {
		this.licenceNo = licenceNo;
	}

	public Date getDateOfExpiration() {
		return dateOfExpiration;
	}

	public void setDateOfExpiration(Date dateOfExpiration) {
		this.dateOfExpiration = dateOfExpiration;
	}

	public String getClassOfVehicle() {
		return classOfVehicle;
	}

	public void setClassOfVehicle(String classOfVehicle) {
		this.classOfVehicle = classOfVehicle;
	}

	@Override
	public String toString() {
		return "Licence [licenceStatus=" + licenceStatus
				+ ", licenceNo=" + licenceNo + ", dateOfExpiration="
				+ dateOfExpiration + ", classOfVehicle=" + classOfVehicle + "]";
	}
	
}
