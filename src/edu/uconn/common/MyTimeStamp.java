package edu.uconn.common;

import java.util.Date;

import android.os.SystemClock;

public class MyTimeStamp {

	protected Date currentYearMonthDate;
	protected SystemClock currentTime;

	public MyTimeStamp() {
		currentYearMonthDate = new Date();
	};

	@SuppressWarnings("deprecation")
	public MyTimeStamp(int yr, int mo, int da) {
		currentYearMonthDate = new Date(yr, mo, da);
	};

	@SuppressWarnings("deprecation")
	public MyTimeStamp(int yr, int mo, int da, int hr, int min) {
		currentYearMonthDate = new Date(yr, mo, da, hr, min);
	};

	public void setCurrentYearMonthDate(Date currentYearMonthDate) {
		this.currentYearMonthDate = currentYearMonthDate;
	}

	public Date getCurrentYearMonth() {
		return currentYearMonthDate;
	}

	public void setCurrentTime(SystemClock currentTime) {
		this.currentTime = currentTime;
	}

	public SystemClock getCurrentTime() {
		return currentTime;
	}

}
