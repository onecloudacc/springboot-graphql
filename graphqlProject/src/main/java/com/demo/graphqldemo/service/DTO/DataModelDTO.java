package com.demo.graphqldemo.service.DTO;



// The field name defined here should exactly match with the names defined the dataModel.graphqls.
public class DataModelDTO {
	
	private String firstName;
	
	private String lastName;

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
	
	

}
