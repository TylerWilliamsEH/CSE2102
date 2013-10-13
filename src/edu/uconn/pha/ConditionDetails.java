package edu.uconn.pha;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class ConditionDetails extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.condition_details_activity);
		getIntent().getStringExtra("conditionname");
	}

}
