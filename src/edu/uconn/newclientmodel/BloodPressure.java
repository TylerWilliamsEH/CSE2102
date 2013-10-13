package edu.uconn.newclientmodel;

public class BloodPressure {

	protected int Systolic;
	protected int Diastolic;

	public BloodPressure() {
	};

	public void setSystolic(int Systolic) {
		this.Systolic = Systolic;
	}

	public int getSystolic() {
		return Systolic;
	}

	public void setDiastolic(int Diastolic) {
		this.Diastolic = Diastolic;
	}

	public int getDiastolic() {
		return Diastolic;
	}

}