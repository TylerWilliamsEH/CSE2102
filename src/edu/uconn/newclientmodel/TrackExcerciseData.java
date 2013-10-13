package edu.uconn.newclientmodel;

import edu.uconn.common.Enum.ExerciseType;
import edu.uconn.common.MyTimeStamp;


public class TrackExcerciseData {

	protected MyTimeStamp myTimeofDay; // When was data collected in one place
	protected Vitals myVitalsBefore;
	protected Vitals myVitalsAfter;
	protected ExerciseType myExerciseType;
	protected int myExerciseTime; 	
	
	public void TrackExerciseData() {};
	public void setmyTimeofDay(MyTimeStamp from) {
		this.myTimeofDay = from;
	}
	public MyTimeStamp getmyTimeofDay(){return myTimeofDay;}
	public void setVitalsBefore(Vitals myVitalsBefore){this.myVitalsBefore = myVitalsBefore;}
	public Vitals getVitalsBefore(){return myVitalsBefore;}
	public void setVitalsAfter(Vitals myVitalsAfter){this.myVitalsAfter = myVitalsAfter;}
	public Vitals getVitalsAfter(){return myVitalsAfter;}
	public void setmyExerciseType(ExerciseType myExerciseType){
		this.myExerciseType = myExerciseType;
	}
	public ExerciseType getmyExerciseType(){return myExerciseType;}	
	public void setmyExerciseTime (int myExerciseTime){this.myExerciseTime = myExerciseTime;}
	public int getmyExerciseTime(){return myExerciseTime;}	


}
