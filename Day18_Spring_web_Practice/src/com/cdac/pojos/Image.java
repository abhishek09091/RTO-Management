package com.cdac.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Type;

@Entity
@Table(name="imageSave")
public class Image {
Integer imgid;	
String imgname;
byte[] image;

@Id
@GeneratedValue
public Integer getImgid() {
	return imgid;
}
public void setImgid(Integer imgid) {
	this.imgid = imgid;
}
public String getImgname() {
	return imgname;
}
public void setImgname(String imgname) {
	this.imgname = imgname;
}
@Lob
public byte[] getImage() {
	return image;
}
public void setImage(byte[] image) {
	this.image = image;
}

}
