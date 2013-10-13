package edu.uconn.newclientmodel;

import edu.uconn.common.Enum.Conditions;

public class Condition extends TrackPatientData {

	protected Conditions myCondition; // //From enumerated type Conditions

	public Condition() {
	};

	public void setMyCondition(Conditions condition) {
		myCondition = condition;
	}

	public Conditions getMyCondition() {
		return myCondition;
	}

}
