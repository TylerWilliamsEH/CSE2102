package edu.uconn.newclientmodel;

import java.util.Date;

import edu.uconn.common.MyTimeStamp;

public class Person {
	protected String firstName = "";
	protected String lastName = "";
	protected String birthDate = "";
	protected MyTimeStamp myCreationTime;

	public Person() {
	};

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public void setDate() {
		
	}

	public Date getDate() {
		return null;
	}

	public void setmyCreationTime(MyTimeStamp myCreation) {
		this.myCreationTime = myCreation;
	}

	public MyTimeStamp getmyCreationTime() {
		return myCreationTime;
	}

	public String toString() {
		return null;
	}
}