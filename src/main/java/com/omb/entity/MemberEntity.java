package com.omb.entity;

import com.omb.dto.AddressDto;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class MemberEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer memberId;
	
	private String name;
	private Long salary;
	private String  type;
	
	@Column(unique = true)
	private String phone;
	private String password;
	
	@Embedded
	private AddressDto Address;
	
	public MemberEntity() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Integer getMemberId() {
		return memberId;
	}



	public void setMemberId(Integer memberId) {
		this.memberId = memberId;
	}



	public Long getSalary() {
		return salary;
	}



	public void setSalary(Long salary) {
		this.salary = salary;
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

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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
		return "MemberEntity [memberId=" + memberId + ", name=" + name + ", salary=" + salary + ", type=" + type
				+ ", phone=" + phone + ", password=" + password + ", Address=" + Address + "]";
	}
	
	

}
