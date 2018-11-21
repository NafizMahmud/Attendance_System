package com.example.attendance;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Coursectivity extends Activity {
	Intent in = getIntent();
	TextView course_profile,cours1,cours2,cours3,cours4,cours5;
	Button course1,course2,course3,course4,course5;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course);
		
		course_profile =(TextView) findViewById(R.id.course_profile);
		cours1 =(TextView) findViewById(R.id.TextView1);
		cours2 =(TextView) findViewById(R.id.TextView2);
		cours3 =(TextView) findViewById(R.id.TextView3);
		cours4 =(TextView) findViewById(R.id.TextView4);
		cours5 =(TextView) findViewById(R.id.TextView5);
		
		course1 =(Button) findViewById(R.id.Button1);
		course2 =(Button) findViewById(R.id.Button2);
		course3 =(Button) findViewById(R.id.Button3);
		course4 =(Button) findViewById(R.id.Button4);
		course5 =(Button) findViewById(R.id.Button5);
		
		SharedPreferences sharedpref = getSharedPreferences("courseinfo", Context.MODE_PRIVATE);      
      	
		String shared_cours1  = sharedpref.getString("course_name1", "not yet");	
         
        cours1.setText(sharedpref.getString("course_name1", "not yet"));
		
      course1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			Intent in1 = new Intent(Coursectivity.this,Course_Overview.class);
			startActivity(in1);	
	
		}
	});		
		
	
	  course2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in1 = new Intent(Coursectivity.this,Course_Overview.class);
				startActivity(in1);	
		
			}
		});		
			
		
       course3.setOnClickListener(new OnClickListener() {
	
		@Override
		public void onClick(View v) {
			Intent in1 = new Intent(Coursectivity.this,Course_Overview.class);
			startActivity(in1);	
	
		}
	});		
		
	
	  course4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent in1 = new Intent(Coursectivity.this,Course_Overview.class);
				startActivity(in1);	
		
			}
		});		
			
		
		course5.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					Intent in1 = new Intent(Coursectivity.this,Course_Overview.class);
					startActivity(in1);	
			
				}
			});		
				
			}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.coursectivity, menu);
		return true;
	}

}
