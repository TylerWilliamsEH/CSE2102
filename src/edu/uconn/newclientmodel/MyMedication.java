package edu.uconn.newclientmodel;

import edu.uconn.common.Enum.Medications;

public class MyMedication extends TrackedItems {

	protected Medications aMedication;

	public void myMedication() {
	};

	public void setAMedication(Medications aMedication) {
		this.aMedication = aMedication;
	}

	public Medications getAMedication() {
		return aMedication;
	}

}
