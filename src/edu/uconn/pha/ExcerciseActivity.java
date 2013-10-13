package edu.uconn.pha;

import java.util.ArrayList;
import edu.uconn.newclientmodel.Patient;
import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class ExcerciseActivity extends ListActivity {

	ArrayList<String> exerciselist;
	private Patient patient = Patient.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		exerciselist = new ArrayList<String>();
		exerciselist.add("Add Exercises");
		for (int i = 0; i < patient.getTrackExcerciseListMSHV().size(); i++)
		{
			exerciselist.add(patient.getTrackExcerciseListMSHV().get(i).getmyExerciseType().name());
		}
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, exerciselist));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		if (position == 0)
		{	
			Intent i = new Intent(this, AddExcercise.class);
			startActivity(i);
		}
		else
		{
		Intent i = new Intent(this, ConditionDetails.class);
		i.putExtra("exercisename", exerciselist.get(position));
		startActivity(i);
		}
	}
	@Override
	protected void onResume() {
	   super.onResume();
	   this.onCreate(null);
	}

}