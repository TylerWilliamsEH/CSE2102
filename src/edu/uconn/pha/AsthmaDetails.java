package edu.uconn.pha;

import edu.uconn.newclientmodel.Asthma;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AsthmaDetails extends Activity {
	
	EditText peakFlowEditText;
	Button button;
	Asthma asthma;
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.asthma_details_activity);
		asthma = new Asthma();
		peakFlowEditText = (EditText) findViewById(R.id.SetAsthmaFlowEditText);
		button = (Button) findViewById(R.id.SetAsthmaPeakFlowButton);
		
		button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				asthma.setMyPeakFlowTest(Integer.parseInt(peakFlowEditText.getText().toString()));
			}
		});
	}

}
