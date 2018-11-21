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
import android.widget.Toast;

public class AddDateActivity extends Activity {

	EditText current_date;
	String[] lecture = new String [30];
	
	
	
	
	
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_adddate);
		
		
		Button save = (Button) findViewById(R.id.adddate_button);
		Button secA =(Button) findViewById(R.id.secA);
		Button secB =(Button) findViewById(R.id.secB);
		
		current_date = (EditText) findViewById(R.id.date);
		
		
		 
		
		
		save.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				SharedPreferences sharedpref3 = getSharedPreferences("userinfo", Context.MODE_PRIVATE);      
				String value = sharedpref3.getString("value", "1");
				int val= Integer.parseInt(value);
				
			   
				SharedPreferences sharedpref = getSharedPreferences( "dates", Context.MODE_PRIVATE);      
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString( lecture[val], current_date.getText().toString());			
			    editor.apply();	
			  
				
				
				Toast.makeText(getApplicationContext(), val+"  Saved   ", Toast.LENGTH_SHORT).show();	
				
				
				
				
			}
		});
		
		secA.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				
				SharedPreferences sharedpref3 = getSharedPreferences("userinfo", Context.MODE_PRIVATE);      
				String value = sharedpref3.getString("value", "1");
				int val= Integer.parseInt(value);
				
				
				if(val==1)
				
				{	Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity.class);
			  //    intent.putExtra("HI", today_date);
				    startActivity(intent);}
				
				else if(val==2)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity2.class);
				startActivity(intent);}
				 
               else if(val==3)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity3.class);
				startActivity(intent);}
               else if(val==4)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity4.class);
				startActivity(intent);}
               else if(val==5)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity5.class);
				startActivity(intent);}
               else if(val==6)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity6.class);
				startActivity(intent);}
               else if(val==7)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity7.class);
				startActivity(intent);}
               else if(val==8)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity8.class);
				startActivity(intent);}
               else if(val==9)
					
				{	
				Intent intent=new Intent(AddDateActivity.this,AttendanceSheetActivity9.class);
				startActivity(intent);}
				
				val=val+1;
				value = Integer.toString(val);
			    
				SharedPreferences.Editor editor1 = sharedpref3.edit();
				editor1.putString("value", value);
				editor1.apply();
				Toast.makeText(getApplicationContext(), val+"", Toast.LENGTH_SHORT).show();	
				
				
			}
		});
		
		secB.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			
				Intent intent=new Intent(AddDateActivity.this,BttendanceSheetActivity.class);
				startActivity(intent);	
		 		
				
				
			}
		});
		
		
	}
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_date, menu);
		return true;
	}

}
