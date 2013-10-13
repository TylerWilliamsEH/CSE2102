package edu.uconn.newclientmodel;

import org.json.JSONException;
import org.json.JSONObject;

import edu.uconn.common.Enum.ODLs;

public class ODL extends TrackPatientData {

	protected ODLs myODL; // Tracks one type of ODLs, e.g., energy, happiness,
							// etc.
	protected int myODLvalue = 5; // Ranges from 0 to 10

	public ODL() {
	};

	public ODL(JSONObject jo) throws JSONException {
	}

	public JSONObject toJSONObject() throws JSONException {
		return null;
	}

	public void setMyODL(ODLs myODL) {
		this.myODL = myODL;
	} // From enumerated type ODLs

	public ODLs getMyODL() {
		return myODL;
	}

	public void setMyODLvalue(int myODLvalue) {
		this.myODLvalue = myODLvalue;
	}

	public int getMyODLvalue() {
		return myODLvalue;
	}

}
