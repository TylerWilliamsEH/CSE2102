package edu.uconn.newclientmodel;

import org.json.JSONException;
import org.json.JSONObject;

import edu.uconn.common.Enum.Medications;
import edu.uconn.common.MyTimeStamp;

public class Medication extends TrackPatientData {

	protected Medications myMed; // Tracks OTC, Supplement, etc.
	protected String name = ""; // medication name
	protected String strength = ""; // what is the dosage
	protected String dose = ""; // amount of drug, e.g., 500mg
	protected String howTaken = ""; // oral, shot, inhaled, cream
	protected String frequency = ""; // times per day, etc.
	protected String prescribed = ""; // is prescription or not
	protected String note = ""; // reason for taking medication
	protected MyTimeStamp dateStarted;
	protected MyTimeStamp dateDiscontinued;

	public Medication() {
	};

	public Medication(JSONObject jo) throws JSONException {
	}

	public JSONObject toJSONObject() throws JSONException {
		return null;
	}

	public void setmyMed(Medications myMed) {
		this.myMed = myMed;
	} // From enumerated type Medications

	public Medications getmyMed() {
		return myMed;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setStrength(String strength) {
		this.strength = strength;
	}

	public String getStrength() {
		return strength;
	}

	public void setDose(String dose) {
		this.dose = dose;
	}

	public String getDose() {
		return dose;
	}

	public void setHowTaken(String howTaken) {
		this.howTaken = howTaken;
	}

	public String getHowTaken() {
		return howTaken;
	}

	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}

	public String getFrequency() {
		return frequency;
	}

	public void setPrescribed(String prescribed) {
		this.prescribed = prescribed;
	}

	public String getPrescribed() {
		return prescribed;
	}

	public void setDateStarted(MyTimeStamp dateStarted) {
		this.dateStarted = dateStarted;
	}

	public MyTimeStamp getDateStarted() {
		return dateStarted;
	}

	public void setDateDiscontinued(MyTimeStamp dateDiscontinued) {
		this.dateDiscontinued = dateDiscontinued;
	}

	public MyTimeStamp getDateDiscontinued() {
		return dateDiscontinued;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNote() {
		return note;
	}

	public String toString() {
		return null;
	}

	public boolean isPrescribed() {
		return true;
	}

}
