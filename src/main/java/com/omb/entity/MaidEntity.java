package com.omb.entity;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.omb.dto.AddressDto;



@Entity
public class MaidEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer maidId;
	
	private String name;
	private Integer age;
	private String  type;
	
	@Column(unique = true)
	private String phone;
	private String password;
	
	@Embedded
	private AddressDto Address;
	
	public MaidEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public Integer getMaidId() {
		return maidId;
	}

	public void setMaidId(Integer maidId) {
		this.maidId = maidId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public AddressDto getAddress() {
		return Address;
	}

	public void setAddress(AddressDto address) {
		Address = address;
	}

	@Override
	public String toString() {
		return "MaidEntity [maidId=" + maidId + ", name=" + name + ", age=" + age + ", type=" + type + ", phone="
				+ phone + ", password=" + password + ", Address=" + Address + "]";
	}
	
	
	
}
