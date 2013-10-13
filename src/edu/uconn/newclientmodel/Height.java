package edu.uconn.newclientmodel;

import edu.uconn.common.MyTimeStamp;

public class Height {

	protected String heightValue = "";
	protected String when = "";
	protected MyTimeStamp heightDayandTime;

	public Height() {
	};

	public String getHeightValue() {
		return heightValue;
	}

	public void setHeightValue(String heightValue) {
		this.heightValue = heightValue;
	}

	public String getWhen() {
		return when;
	}

	public void setWhen(String when) {
		this.when = when;
	}

	public void setheightDayandTime(MyTimeStamp heightDayandTime) {
		this.heightDayandTime = heightDayandTime;
	}

	public MyTimeStamp getheightDayandTime() {
		return heightDayandTime;
	}

	public String toString() {
		return heightValue;
	}

}
