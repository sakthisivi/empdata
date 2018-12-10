package com.tcs.acc.employeedata.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection= "employees")
public class Employee {

	@Id
	String Id;
	String Name;
	String Bill_Start_date;
	String Designation;
	String Type;
	String Location;
	String City;
	String Grade;
	String Mob_Num;
	String WON;
	
	public Employee()
	{
		
	}
	
	

	public Employee(String id, String name, String bill_Start_date, String designation, String type, String location,
			String city, String grade, String mob_Num, String wON) {
		Id = id;
		Name = name;
		Bill_Start_date = bill_Start_date;
		Designation = designation;
		Type = type;
		Location = location;
		City = city;
		Grade = grade;
		Mob_Num = mob_Num;
		WON = wON;
	}



	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getBill_Start_date() {
		return Bill_Start_date;
	}

	public void setBill_Start_date(String bill_Start_date) {
		Bill_Start_date = bill_Start_date;
	}

	public String getDesignation() {
		return Designation;
	}

	public void setDesignation(String designation) {
		Designation = designation;
	}

	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getGrade() {
		return Grade;
	}

	public void setGrade(String grade) {
		Grade = grade;
	}

	public String getMob_Num() {
		return Mob_Num;
	}

	public void setMob_Num(String mob_Num) {
		Mob_Num = mob_Num;
	}

	public String getWON() {
		return WON;
	}

	public void setWON(String wON2) {
		WON = wON2;
	}
	
	
}
