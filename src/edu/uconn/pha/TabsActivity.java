package edu.uconn.pha;

import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;

public class TabsActivity extends TabActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabs_activity);
		setTitle(R.string.app_name);

		// resource object to get drawables
		Resources res = getResources();
		// the activity TabHost
		TabHost tabHost = getTabHost();
		// reusable TabSpec for each tab
		TabHost.TabSpec spec;
		// reusable intent for each tab
		Intent intent;

		// create an intent to launch an activity for the tab (to be reused)
		intent = new Intent().setClass(this, HomeActivity.class);
		
		// Home Tab
		spec = tabHost.newTabSpec("home").setIndicator(getString(R.string.home), res.getDrawable(R.drawable.ic_tab_home)).setContent(intent);
		tabHost.addTab(spec);

		// Conditions Tab
		intent = new Intent().setClass(this, ConditionsActivity.class);
		spec = tabHost.newTabSpec("conditions").setIndicator(getString(R.string.conditions), res.getDrawable(R.drawable.ic_tab_wellness)).setContent(intent);
		tabHost.addTab(spec);

		// Medications Tab
		intent = new Intent().setClass(this, MedicationsActivity.class);
		spec = tabHost.newTabSpec("medications").setIndicator(getString(R.string.medications), res.getDrawable(R.drawable.ic_tab_medications)).setContent(intent);
		tabHost.addTab(spec);		
		
		// Wellness/ODL Tab
		intent = new Intent().setClass(this, WellnessActivity.class);
		spec = tabHost.newTabSpec("wellness").setIndicator(getString(R.string.wellness_diary), res.getDrawable(R.drawable.ic_tab_wellness)).setContent(intent);
		tabHost.addTab(spec);

		// Excercise Tab
		intent = new Intent().setClass(this, ExcerciseActivity.class);
		spec = tabHost.newTabSpec("excercises").setIndicator(getString(R.string.excercises), res.getDrawable(R.drawable.ic_tab_wellness)).setContent(intent);
		tabHost.addTab(spec);		
		
		intent = new Intent().setClass(this, AllergiesActivity.class);
		spec = tabHost.newTabSpec("allergies").setIndicator(getString(R.string.allergies), res.getDrawable(R.drawable.ic_tab_allergies)).setContent(intent);
		tabHost.addTab(spec);

//		intent = new Intent().setClass(this, AlarmsActivity.class);
//		spec = tabHost.newTabSpec("alarms").setIndicator(getString(R.string.alarms), res.getDrawable(R.drawable.ic_tab_alarms)).setContent(intent);
//		tabHost.addTab(spec);		
		
		// set the current tab (default Home)
		tabHost.setCurrentTab(0);
	}
}
