package edu.uconn.newclientmodel;

import java.util.ArrayList;
import java.util.List;

import edu.uconn.common.Enum.Conditions;

public class Patient extends Person {
	
	private static Patient instance = null;

	protected List<TrackExcerciseData> TrackExerciseListMSHV = new ArrayList<TrackExcerciseData>();
	
	public void setTrackExcerciseListMSHV(List<TrackExcerciseData> TrackExcerciseListMSHV) {
		this.TrackExerciseListMSHV = TrackExcerciseListMSHV;
	}

	public List<TrackExcerciseData> getTrackExcerciseListMSHV() {
		return TrackExerciseListMSHV;
	}

	public void setTrackItemsListMSHV(List<TrackedItems> TrackItemsListMSHV) {
	}

	public List<Medication> getTrackItemsListMSHV() {
		return null;
	}

	protected String race = "";
	protected Height myheight = new Height();
	protected Weight myweight = new Weight();
	protected String gender = "Unknown";
	protected String bloodType = ""; // Values of A, B, AB, O: omit +/- for now
	protected List<TrackedItems> TrackedItemsListMSHV = new ArrayList<TrackedItems>();
	protected List<Medication> MedicationListMSHV = new ArrayList<Medication>();
	protected List<Medication> MedicationListOpenEMR = new ArrayList<Medication>();
	protected List<Conditions> ConditionsListMSHV = new ArrayList<Conditions>();
	protected List<ODL> ODLListMSHV = new ArrayList<ODL>();

	protected Patient() {
	}

	public void setBloodType(String bloodType) {
		this.bloodType = bloodType;
	}

	public String getBloodType() {
		return bloodType;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public String getRace() {
		return race;
	}

	public void setHeight(Height height) {
		this.myheight = height;
	}

	public Height getHeight() {
		return myheight;
	}

	public void setWeight(Weight weight) {
		this.myweight = weight;
	}

	public Weight getWeight() {
		return myweight;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGender() {
		return gender;
	}

	public List<TrackedItems> getTrackedItemsListMSHV() {
		return TrackedItemsListMSHV;
	}

	public void setTrackItemsedListMSHV(List<TrackedItems> TrackedItemsListMSHV) {
		this.TrackedItemsListMSHV = TrackedItemsListMSHV;
	}

	public List<Medication> getMedicationListMSHV() {
		return MedicationListMSHV;
	}

	public void setMedicationListMSHV(List<Medication> medicationListMSHV) {
		this.MedicationListMSHV = medicationListMSHV;
	}

	public List<Medication> getMedicationListOpenEMR() {
		return MedicationListOpenEMR;
	}

	public void setMedicationListOpenEMR(List<Medication> medicationListOpenEMR) {
		this.MedicationListOpenEMR = medicationListOpenEMR;
	}

	public List<Conditions> getConditionsListMSHV() {
		return ConditionsListMSHV;
	}

	public void setConditionsListMSHV(List<Conditions> conditionsListMSHV) {
		this.ConditionsListMSHV = conditionsListMSHV;
	}

	public List<ODL> getODLListMSHV() {
		return ODLListMSHV;
	}

	public void setODLListMSHV(List<ODL> odlListMSHV) {
		this.ODLListMSHV = odlListMSHV;
	}
	
	public static Patient getInstance(){
		if (instance == null)
		{
			instance = new Patient();
		}
		return instance;
	}

}