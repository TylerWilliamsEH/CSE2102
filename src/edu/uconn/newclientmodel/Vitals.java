package edu.uconn.newclientmodel;

public class Vitals {

	protected int Pulse; // integer value
	protected int Resps; // integer value
	protected int PulseOx; // percentage
	protected BloodPressure myBloodPressure;

	public void setPulse(int Pulse) {
		this.Pulse = Pulse;
	}

	public int getPulse() {
		return Pulse;
	}

	public void setPulseOx(int PulseOx) {
		this.PulseOx = PulseOx;
	}

	public int getPulseOx() {
		return PulseOx;
	}

	public void setResps(int Resps) {
		this.Resps = Resps;
	}

	public int getResps() {
		return Resps;
	}

	public void setBloodPressure(int Systolic, int Diastolic) {
		myBloodPressure = new BloodPressure();
		myBloodPressure.setSystolic(Systolic);
		myBloodPressure.setDiastolic(Diastolic);
	}

	public BloodPressure getBloodPressure() {
		return myBloodPressure;
	}

}
