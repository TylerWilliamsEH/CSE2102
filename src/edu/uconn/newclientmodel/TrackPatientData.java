package edu.uconn.newclientmodel;

import java.security.Timestamp;

import edu.uconn.common.MyTimeStamp;

public class TrackPatientData {

	private MyTimeStamp currentYearMonthDate;
	private Vitals myVitals;
	
	public MyTimeStamp getCurrentYearMonthDate() {
		return currentYearMonthDate;
	}
	public void setCurrentYearMonthDate(MyTimeStamp currentYearMonthDate) {
		this.currentYearMonthDate = currentYearMonthDate;
	}
	public Vitals getMyVitals() {
		return myVitals;
	}
	public void setMyVitals(Vitals myVitals) {
		this.myVitals = myVitals;
	}

}
