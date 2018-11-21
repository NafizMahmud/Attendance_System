package com.example.attendance;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Course_Overview extends Activity {
	
	Intent in = getIntent();
	TextView course_overview;
	Button course_details,attendance_sheet,current_result,add_details,remove_course;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_course__overview);
		course_overview =(TextView) findViewById(R.id.course_overview);
		
		course_details =(Button) findViewById(R.id.course_details);
		attendance_sheet =(Button) findViewById(R.id.attendance_sheet);
		current_result =(Button) findViewById(R.id.current_result);
		add_details= (Button) findViewById(R.id.add_details);
		remove_course= (Button) findViewById(R.id.remove_course);
		
		
		
       course_details.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				
			}
		});
       attendance_sheet.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
});
       current_result.setOnClickListener(new OnClickListener() {
    		
    		@Override
    		public void onClick(View arg0) {
    			// TODO Auto-generated method stub
    			
    		}
    	});
        add_details.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		Intent intent = new Intent(Course_Overview.this, AddcourseActivity.class );
        startActivity(intent);


	}
});
     
        remove_course.setOnClickListener(new OnClickListener() {
	
	@Override
	public void onClick(View arg0) {
		// TODO Auto-generated method stub
		
	}
});

	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.course__overview, menu);
		return true;
	}

}
