package edu.uconn.pha;

import java.util.List;

import edu.uconn.common.Enum.Conditions;
import edu.uconn.common.Enum.DiabetesTest;
import edu.uconn.newclientmodel.Condition;
import edu.uconn.newclientmodel.Diabetes;
import edu.uconn.newclientmodel.Patient;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;

public class DiabetesDetails extends Activity {
	
	Patient patient = Patient.getInstance();
	List<Conditions> conditions = patient.getConditionsListMSHV();
	Diabetes diabetes = new Diabetes();
	DiabetesTest test;

	EditText glucoseBox;
	EditText insulinBox;
	EditText carbBox;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.diabetes_details_activity);
		RadioGroup rg = (RadioGroup) findViewById(R.id.radioGroup1);
		Button button = (Button) findViewById(R.id.Button02);
		glucoseBox = (EditText) findViewById(R.id.SetCaloriesEditText);
		insulinBox = (EditText) findViewById(R.id.InsulinSubmissionTextBox);
		carbBox = (EditText) findViewById(R.id.CarbsSubmissionTextBox);
		rg.setOnCheckedChangeListener(new OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId)
            {
                switch(checkedId)
                {
                case R.id.radio0:
                	test = DiabetesTest.Fasting;
                    diabetes.setmyDiabetes(test);
                    break;
                case R.id.radio1:
                    test = DiabetesTest.TwoHrsAfter;
                    diabetes.setmyDiabetes(test);
                    break;
                case R.id.radio2:
                    test = DiabetesTest.Anytime;
                    diabetes.setmyDiabetes(test);
                    break;
                }
            }
        });
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				diabetes.setMyGlucoseLevel(Integer.parseInt(glucoseBox.getText().toString()));
				diabetes.setMyInsulinTaken(Integer.parseInt(insulinBox.getText().toString()));
				diabetes.setMyCarbsIngested(Integer.parseInt(carbBox.getText().toString()));
			}
		});
		
	}

}
