package edu.uconn.pha;

import java.util.ArrayList;
import java.util.List;

import edu.uconn.newclientmodel.Patient;
import edu.uconn.newclientmodel.TrackExcerciseData;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import edu.uconn.common.Enum;
import edu.uconn.common.Enum.ExerciseType;

public class AddExcercise extends ListActivity{

	ExerciseType[] exerciseArray =  Enum.ExerciseType.values();
	ArrayList<String> exerciseList = new ArrayList<String>();
	private Patient patient = Patient.getInstance();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		for (int i = 0; i < exerciseArray.length; i++)
		{
			exerciseList.add(exerciseArray[i].toString());
		}
		setListAdapter(new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, exerciseList));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);
		TrackExcerciseData newExercise = new TrackExcerciseData();
		newExercise.setmyExerciseType(exerciseArray[position]);
		List<TrackExcerciseData> currentTrackedExercises = patient.getTrackExcerciseListMSHV();
		currentTrackedExercises.add(newExercise);
		patient.setTrackExcerciseListMSHV(currentTrackedExercises);
	}

}