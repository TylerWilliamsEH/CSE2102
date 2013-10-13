package edu.uconn.pha;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class ObesityDetails extends Activity {
	
	EditText caloriesEditText;
	Button button;
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.obesity_details_activity);
	}

}