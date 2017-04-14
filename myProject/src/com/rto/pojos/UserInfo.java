package com.rto.pojos;

import java.util.Date;
import java.util.Arrays;

import javax.persistence.*;

@Entity
@Table(name="user_info")
public class UserInfo {
	private String firstName;
	private String lastName;
	private Date dateOfBirth;
	private String email;
	private Address currentAddress;
	private Address permanentAddress;
	private long contectNo;
	private Long aadharCardNo;
	private String identificationMark;
	private String placeOfBirth;
	private String referencePersonName;
	private long referenceContectNo;
	private String gender;
	private String qualification;
	private String bloodGroup;
	private byte[] photo;
	private byte[] aadhar;
	private Licence licence;
	private User user;
	
	public UserInfo() {
		super();
		System.out.println("In UserInfo default Constructor...");
	}

	public UserInfo(String firstName, String lastName, Date dateOfBirth,
			String email, Address currentAddress, Address permanentAddress,
			long contectNo, long aadharCardNo, String identificationMark,
			String placeOfBirth, String referencePersonName,
			long referenceContectNo, String gender, String qualification,
			String bloodGroup, byte[] photo, byte[] aadhar, Licence licence,
			User user) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
		this.currentAddress = currentAddress;
		this.permanentAddress = permanentAddress;
		this.contectNo = contectNo;
		this.aadharCardNo = aadharCardNo;
		this.identificationMark = identificationMark;
		this.placeOfBirth = placeOfBirth;
		this.referencePersonName = referencePersonName;
		this.referenceContectNo = referenceContectNo;
		this.gender = gender;
		this.qualification = qualification;
		this.bloodGroup = bloodGroup;
		this.photo = photo;
		this.aadhar = aadhar;
		this.licence = licence;
		this.user = user;
	}
	
	

	public UserInfo(String firstName, String lastName, String email,
			String gender) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
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
	@Temporal(TemporalType.DATE)
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Id
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Address getCurrentAddress() {
		return currentAddress;
	}
	public void setCurrentAddress(Address currentAddress) {
		this.currentAddress = currentAddress;
	}
	public Address getPermanentAddress() {
		return permanentAddress;
	}
	public void setPermanentAddress(Address permanentAddress) {
		this.permanentAddress = permanentAddress;
	}
	public long getContectNo() {
		return contectNo;
	}
	public void setContectNo(long contectNo) {
		this.contectNo = contectNo;
	}
	
	public Long getAadharCardNo() {
		return aadharCardNo;
	}

	public void setAadharCardNo(Long aadharCardNo) {
		this.aadharCardNo = aadharCardNo;
	}
	public String getIdentificationMark() {
		return identificationMark;
	}
	public void setIdentificationMark(String identificationMark) {
		this.identificationMark = identificationMark;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getReferencePersonName() {
		return referencePersonName;
	}
	public void setReferencePersonName(String referencePersonName) {
		this.referencePersonName = referencePersonName;
	}
	public long getReferenceContectNo() {
		return referenceContectNo;
	}
	public void setReferenceContectNo(long referenceContectNo) {
		this.referenceContectNo = referenceContectNo;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getQualification() {
		return qualification;
	}
	public void setQualification(String qualification) {
		this.qualification = qualification;
	}
	public String getBloodGroup() {
		return bloodGroup;
	}
	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}
	@Lob
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	@Lob
	public byte[] getAadhar() {
		return aadhar;
	}
	public void setAadhar(byte[] aadhar) {
		this.aadhar = aadhar;
	}
	public Licence getLicence() {
		return licence;
	}
	public void setLicence(Licence licence) {
		this.licence = licence;
	}
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uid")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "UserInfo [firstName=" + firstName + ", lastName=" + lastName
				+ ", dateOfBirth=" + dateOfBirth + ", email=" + email
				+ ", currentAddress=" + currentAddress + ", permanentAddress="
				+ permanentAddress + ", contectNo=" + contectNo
				+ ", aadharCardNo=" + aadharCardNo + ", identificationMark="
				+ identificationMark + ", placeOfBirth=" + placeOfBirth
				+ ", referencePersonName=" + referencePersonName
				+ ", referenceContectNo=" + referenceContectNo + ", gender="
				+ gender + ", qualification=" + qualification + ", bloodGroup="
				+ bloodGroup  + "]";
	}

	
	
}
