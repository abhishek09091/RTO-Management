package com.cdac.pojos;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name="my_cust")
public class Customer {	
Integer id;
@Email(message="not a valid format for email")
@NotEmpty(message="email can't be blank")
String email;

@NotEmpty(message="password can't be blank")
String pass;
String address;
public Customer() {
System.out.println("in default constructor of pojo");
}
public Customer(String email, String pass, String address) {
	super();
	this.email = email;
	this.pass = pass;
	this.address = address;
}


@Id
@GeneratedValue
public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}

public String getEmail() {
	System.out.println("in get email");
	return email;
}
public void setEmail(String email) {
	System.out.println("in set email");
	this.email = email;
}
public String getPass() {
	System.out.println("in get pass");
	return pass;
}
public void setPass(String pass) {
	System.out.println("in set pass");
	this.pass = pass;
}
public String getAddress() {
	System.out.println("in get address");
	return address;
}
public void setAddress(String address) {
	System.out.println("in set address");
	this.address = address;
}

@Override
public String toString() {
	return "Customer [email=" + email + ", pass=" + pass + ", address="
			+ address + "]";
}

}
