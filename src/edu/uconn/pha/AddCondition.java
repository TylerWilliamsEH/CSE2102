package edu.uconn.pha;

import java.security.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import edu.uconn.newclientmodel.Condition;
import edu.uconn.newclientmodel.Patient;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import edu.uconn.common.Enum;
import edu.uconn.common.Enum.Conditions;
import edu.uconn.common.MyTimeStamp;

public class AddCondition extends ListActivity{

	Conditions[] conditionsArray =  Enum.Conditions.values();
	ArrayList<String> conditionList = new ArrayList<String>();
	private Patient patient = Patient.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		for (int i = 0; i < conditionsArray.length; i++)
		{
			conditionList.add(conditionsArray[i].toString());
		}
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, conditionList));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		List<Conditions> currentConditions = patient.getConditionsListMSHV();
		currentConditions.add(conditionsArray[position]);
		patient.setConditionsListMSHV(currentConditions);
	}

}