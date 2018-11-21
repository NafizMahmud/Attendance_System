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
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LogActivity extends Activity {
	Intent in = getIntent();
	Button signin_button,signup_button;
    TextView text,email1,password1;
    EditText edittext_email,edittext_password;
  
    SharedPreferences pref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);
    SharedPreferences.Editor editor;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_log);
        signin_button = (Button) findViewById(R.id.signin_button);
        signup_button = (Button) findViewById(R.id.signup_button);
        email1 = (TextView) findViewById(R.id.email1);
        password1 = (TextView) findViewById(R.id.password1);
        text = (TextView) findViewById(R.id.text);
        
        edittext_email = (EditText) findViewById(R.id.email);
        edittext_password = (EditText) findViewById(R.id.password);
        
        
              
		pref=getSharedPreferences("Database", 0);
	    String status=pref.getString("load", "no");
	    if(status.equals("no"))
	    {createdatabase();
	    editor=pref.edit();
	    editor.putString("load", "yes");
	    editor.commit();}	
		
        
        
        
        signin_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
		
				
				String email = pref.getString("username", "Rafi");	
			    String pw = pref.getString("password", "asdw2341");
				
			 	
		   if(edittext_email.getText().toString().equalsIgnoreCase(email) && edittext_password.getText().toString().equalsIgnoreCase(pw))
			
		   
			{Intent in1 = new Intent(LogActivity.this , Coursectivity.class);
    		startActivity(in1);}
		   
		  else {
			Toast.makeText( getApplicationContext(), "Wrong", Toast.LENGTH_SHORT).show();
			
			
			
		}
				
			}
		});
	
    	signup_button.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
                 SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);      
		      	
				String email = sharedpref.getString("username", "rafi");	
			    String pw = sharedpref.getString("password", "2389");
			
				 text.setText(email + " " + pw);	
				
			}
		});

	}

	private void createdatabase() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.login, menu);
		return true;
	}

}
