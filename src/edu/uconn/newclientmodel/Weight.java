package edu.uconn.newclientmodel;

import edu.uconn.common.MyTimeStamp;

public class Weight {

	protected static final double CONVERSION_VALUE = 2.20462262185;
	protected String weightValue = "";
	protected MyTimeStamp weightDayandTime;

	public Weight() {
	};

	public String getWeightValue() {
		return weightValue;
	}

	public void setWeightValue(String weightValue) {
		this.weightValue = weightValue;
	}

	public String getLbsValue() {
		return null;
	}

	public void setweightDayandTime(MyTimeStamp weightDayandTime) {
		this.weightDayandTime = weightDayandTime;
	}

	public MyTimeStamp getweightDayandTime() {
		return weightDayandTime;
	}

	public String toString() {
		return weightValue;
	}

}
