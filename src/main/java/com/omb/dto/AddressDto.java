package com.omb.dto;

public class AddressDto {
	
	private String flatNo;
	private String street;
	private String villageOrTown;
	private String landmark;
	private String pincode;
	private String state;
	private String district;
	
	public AddressDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getFlatNo() {
		return flatNo;
	}

	public void setFlatNo(String flatNo) {
		this.flatNo = flatNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getVillageOrTown() {
		return villageOrTown;
	}

	public void setVillageOrTown(String villageOrTown) {
		this.villageOrTown = villageOrTown;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	@Override
	public String toString() {
		return "AddressDto [flatNo=" + flatNo + ", street=" + street + ", villageOrTown=" + villageOrTown
				+ ", landmark=" + landmark + ", pincode=" + pincode + ", state=" + state + ", district=" + district
				+ "]";
	}
	
	

}
