package com.example.attendance;

import java.net.Inet4Address;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class AddcourseActivity extends Activity {
	
	Button save,customize;
	TextView  textcourse_name,textnumber_of_students,textenter_details;
	EditText course_name,number_of_students,enter_details;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_addcourse);
		
		textcourse_name= (TextView) findViewById(R.id.textcourse_name);
		textnumber_of_students= (TextView) findViewById(R.id.textnumber_of_students);
		textenter_details =(TextView) findViewById(R.id.textenter_details);
		
		save = (Button) findViewById(R.id.save);
		customize =(Button) findViewById(R.id.customize);
		
		course_name = (EditText) findViewById(R.id.course_name);
		number_of_students = (EditText) findViewById(R.id.number_of_students);
		enter_details = (EditText) findViewById(R.id.enter_details);
		
		
		save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				  int int_number_of_students= Integer.parseInt(number_of_students.getText().toString());
				
				  SharedPreferences sharedpref1= getSharedPreferences("courseinfo", Context.MODE_PRIVATE);
				  SharedPreferences.Editor editor = sharedpref1.edit();
	              editor.putString("course_name1",course_name.getText().toString());			
	              editor.putString("number_of_students1",number_of_students.getText().toString());
	              editor.putString("enter_details1",enter_details.getText().toString());
	              editor.putInt("int_number_of_students", int_number_of_students);
	              editor.apply();
	              
	              Toast.makeText( getApplicationContext(), enter_details.getText().toString(), Toast.LENGTH_SHORT).show();
					
				
			}
		});
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.addcourse, menu);
		return true;
	}

}
