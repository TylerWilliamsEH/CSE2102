package edu.uconn.newclientmodel;

import edu.uconn.common.Enum.DiabetesTest;

public class Diabetes extends Condition {

	protected DiabetesTest myTypeofTest; // From enumerated type DiabetesTest
	protected int myGlucoseLevel = 0;
	protected int myInsulinTaken = 0;
	protected int myCarbsIngested = 0;

	public Diabetes() {
	};

	public void setmyDiabetes(DiabetesTest myTypeofTest) {
		this.myTypeofTest = myTypeofTest;
	}

	public DiabetesTest getMyDiabetes() {
		return myTypeofTest;
	}

	public void setMyGlucoseLevel(int myGlucoseLevel) {
		this.myGlucoseLevel = myGlucoseLevel;
	}

	public int getMyGlucoseLevel() {
		return myGlucoseLevel;
	}

	public void setMyInsulinTaken(int myInsulinTaken) {
		this.myInsulinTaken = myInsulinTaken;
	}

	public int getMyInsulinTaken() {
		return myInsulinTaken;
	}

	public void setMyCarbsIngested(int myCarbsIngested) {
		this.myCarbsIngested = myCarbsIngested;
	}

	public int getMyCarbsIngested() {
		return myCarbsIngested;
	}

}
