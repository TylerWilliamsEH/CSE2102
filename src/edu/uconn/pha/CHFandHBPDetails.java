package edu.uconn.pha;

import edu.uconn.newclientmodel.CHFandHPB;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class CHFandHBPDetails extends Activity {
	
	EditText peakFlowEditText;
	Button button;
	CHFandHPB condition;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chfandhbp_details_activity);
		condition = new CHFandHPB();
		peakFlowEditText = (EditText) findViewById(R.id.SetCHFandHBPPeakFlowEditText);
		button = (Button) findViewById(R.id.SetCHFandHBPPeakFlowButton);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				condition.setMyPeakFlowTest(Integer.parseInt(peakFlowEditText.getText().toString()));
			}
		});
	}

}
