package edu.uconn.pha;

import java.util.ArrayList;
import edu.uconn.newclientmodel.Patient;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ConditionsActivity extends ListActivity {

	ArrayList<String> conditionlist;
	private Patient patient = Patient.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		conditionlist = new ArrayList<String>();
		conditionlist.add("Add Conditions");
		for (int i = 0; i < patient.getConditionsListMSHV().size(); i++)
		{
			conditionlist.add(patient.getConditionsListMSHV().get(i).name());
		}
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, conditionlist));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		if (position == 0)
		{	
			Intent i = new Intent(this, AddCondition.class);
			startActivity(i);
		}
		else if (conditionlist.get(position).toString() == "Diabetes")
		{
			Intent i = new Intent(this, DiabetesDetails.class);
			startActivity(i);
		}
		else if (conditionlist.get(position).toString() == "Asthma")
		{
			Intent i = new Intent(this, AsthmaDetails.class);
			startActivity(i);	
		}
		else if (conditionlist.get(position).toString() == "CHFandHBP")
		{
			Intent i = new Intent(this, CHFandHBPDetails.class);
			startActivity(i);
		}
		else if (conditionlist.get(position).toString() == "Obesity")
		{
			Intent i = new Intent(this, ObesityDetails.class);
			startActivity(i);
		}
		else
		{
			Intent i = new Intent(this, ConditionDetails.class);
			i.putExtra("conditionname", conditionlist.get(position));
			startActivity(i);
		}
	}
	@Override
	protected void onResume() {
	   super.onResume();
	   this.onCreate(null);
	}

}