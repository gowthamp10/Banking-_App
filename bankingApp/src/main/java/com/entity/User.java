package com.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_table")
public class User {
	
	@Id
	@GeneratedValue
	private int uid;
	private String firstName;
	private String LastName;
	private String email;
	private String phone;
	private String Address;
	private String password;
	private String accNo;
	private  String accType;
	
	public String getAccNo() {
		return accNo;
	}
	public void setAccNo(String accNo) {
		this.accNo = accNo;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
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
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public User(int uid, String firstName, String lastName, String email, String phone, String address, String password,
			String accNo, String accType) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		LastName = lastName;
		this.email = email;
		this.phone = phone;
		Address = address;
		this.password = password;
		this.accNo = accNo;
		this.accType = accType;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "User [uid=" + uid + ", firstName=" + firstName + ", LastName=" + LastName + ", email=" + email
				+ ", phone=" + phone + ", Address=" + Address + ", password=" + password + ", accNo=" + accNo
				+ ", accType=" + accType + "]";
	}
	
	
	
	
	

}
