package edu.uconn.newclientmodel;

import edu.uconn.common.MyTimeStamp;

public class TrackedItems {

	protected MyTimeStamp from; // When did it start?
	protected MyTimeStamp to; // null if ongoing

	public void TrackPatientData() {
	};

	public void setfrom(MyTimeStamp from) {
		this.from = from;
	}

	public MyTimeStamp getfrom() {
		return from;
	}

	public void setTo(MyTimeStamp to) {
		this.to = to;
	}

	public MyTimeStamp getTo() {
		return to;
	}

}
