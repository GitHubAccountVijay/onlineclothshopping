package com.farm.contactus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="contactus")
public class ContactUs {
@Id
@Column
private int id;
@Column
private String fullname;
@Column
private String email;
@Column
private String phone;
@Column
private String comment;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullname() {
	return fullname;
}
public void setFullname(String fullname) {
	this.fullname = fullname;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}

public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}

}
