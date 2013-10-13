package edu.uconn.newclientmodel;

public class Asthma extends Condition {

	protected int myPeakFlowTest = 0;

	public Asthma() {
	};

	public void setMyPeakFlowTest(int myPeakFlowTest) {
		this.myPeakFlowTest = myPeakFlowTest;
	}

	public int getMyPeakFlowTest() {
		return myPeakFlowTest;
	}

}
