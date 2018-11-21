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

public class SignupActivity extends Activity {
	
    Intent in = getIntent();
    TextView t1,t2,t3;
    EditText email1,password1,nam3;
    Button create_account;
    
    
   
	@Override

	
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_signup);
		t1 = (TextView)findViewById(R.id.fullname);
		t2 = (TextView)findViewById(R.id.email1);
		t3 = (TextView)findViewById(R.id.password1);
		email1 =(EditText)findViewById(R.id.ema);
		password1 =(EditText)findViewById(R.id.pass);
		nam3 =(EditText)findViewById(R.id.name);
	    create_account = (Button) findViewById(R.id.create_account);
	
	
	    
	    create_account.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v1) {
			 
			  SharedPreferences sharedpref = getSharedPreferences("userinfo", Context.MODE_PRIVATE);      
		      
			  SharedPreferences.Editor editor = sharedpref.edit();
              editor.putString("username",email1.getText().toString());			
              editor.putString("password",password1.getText().toString());			
			  editor.apply();
			  
			  
              
              Toast.makeText( getApplicationContext(), email1.getText().toString(), Toast.LENGTH_SHORT).show();
				
			 Intent intent4=new Intent(SignupActivity.this,LogActivity.class);
			startActivity(intent4);
			
			
			
			
		}
	});
	}
   
	
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.signup, menu);
		return true;
	}

}
