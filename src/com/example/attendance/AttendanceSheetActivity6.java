package com.example.attendance;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class AttendanceSheetActivity6 extends Activity {

	TextView id1,id2,id3,id4,id5,id6,id7,id8,id9,id10;
	TextView sid1,sid2,sid3,sid4,sid5,sid6,sid7,sid8,sid9,sid10;
	TextView textdate,actula_date;
	ImageButton pid1,pid2,pid3,pid4,pid5,pid6,pid7,pid8,pid9,pid10;
	ImageButton aid1,aid2,aid3,aid4,aid5,aid6,aid7,aid8,aid9,aid10;
	
	
	String[] lecture = new String [30];
	String dates;
 

	


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_attendance_sheet);
	
		
		Button next_page = (Button) findViewById(R.id.next_page);
		
	
		TextView actual_date = (TextView)findViewById(R.id.ActualDate) ;
			 
		 id1= (TextView) findViewById(R.id.id1);		
		 id2= (TextView) findViewById(R.id.id2);	
		 id3= (TextView) findViewById(R.id.id3);	
		 id4= (TextView) findViewById(R.id.id4);	
		 id5= (TextView) findViewById(R.id.id5);	
		 id6= (TextView) findViewById(R.id.id6);	
		 id7= (TextView) findViewById(R.id.id7);	
		 id8= (TextView) findViewById(R.id.id8);	
		 id9= (TextView) findViewById(R.id.id9);	
		 id10= (TextView) findViewById(R.id.id10);	
		
		 sid1= (TextView) findViewById(R.id.sid1);	
		 sid2= (TextView) findViewById(R.id.sid2);
		 sid3= (TextView) findViewById(R.id.sid3);
		 sid4= (TextView) findViewById(R.id.sid4);
		 sid5= (TextView) findViewById(R.id.sid5);
		 sid6= (TextView) findViewById(R.id.sid6);
		 sid7= (TextView) findViewById(R.id.sid7);
		 sid8= (TextView) findViewById(R.id.sid8);
		 sid9= (TextView) findViewById(R.id.sid9);
		 sid10= (TextView) findViewById(R.id.sid10);
		
		 pid1= (ImageButton) findViewById(R.id.pid1);
		 pid2= (ImageButton) findViewById(R.id.pid2);
		 pid3= (ImageButton) findViewById(R.id.pid3);
		 pid4= (ImageButton) findViewById(R.id.pid4);
		 pid5= (ImageButton) findViewById(R.id.pid5);
		 pid6= (ImageButton) findViewById(R.id.pid6);
		 pid7= (ImageButton) findViewById(R.id.pid7);
		 pid8= (ImageButton) findViewById(R.id.pid8);
		 pid9= (ImageButton) findViewById(R.id.pid9);
		 pid10= (ImageButton) findViewById(R.id.pid10);
		
		 aid1= (ImageButton) findViewById(R.id.aid1);
		 aid2= (ImageButton) findViewById(R.id.aid2);
		 aid3= (ImageButton) findViewById(R.id.aid3);
		 aid4= (ImageButton) findViewById(R.id.aid4);
		 aid5= (ImageButton) findViewById(R.id.aid5);
		 aid6= (ImageButton) findViewById(R.id.aid6);
		 aid7= (ImageButton) findViewById(R.id.aid7);
		 aid8= (ImageButton) findViewById(R.id.aid8);
		 aid9= (ImageButton) findViewById(R.id.aid9);
	     aid10= (ImageButton) findViewById(R.id.aid10);
		
		SharedPreferences sharedpref = getSharedPreferences("courseinfo", Context.MODE_PRIVATE);      
      	
		String batch_name = sharedpref.getString("batch_name1", "");	
	    String dept_code = sharedpref.getString("dept_code1",  "");
       
	    
	    id1.setText(batch_name+""+dept_code+""+"001");
	    id2.setText(batch_name+""+dept_code+""+"002");
	    id3.setText(batch_name+""+dept_code+""+"003");
	    id4.setText(batch_name+""+dept_code+""+"004");
	    id5.setText(batch_name+""+dept_code+""+"005");
	    id6.setText(batch_name+""+dept_code+""+"006");
	    id7.setText(batch_name+""+dept_code+""+"007");
	    id8.setText(batch_name+""+dept_code+""+"008");
	    id9.setText(batch_name+""+dept_code+""+"009");
	   id10.setText(batch_name+""+dept_code+""+"010");
	   
	   
	  
	    SharedPreferences sharedpref3 = getSharedPreferences("userinfo", Context.MODE_PRIVATE);      
		String value = sharedpref3.getString("value", "1");
		int val= Integer.parseInt(value);
	   
	    SharedPreferences sharedpref1 = getSharedPreferences( "dates", Context.MODE_PRIVATE);
	    dates = sharedpref1.getString(lecture[val-1], "date not saved");
	  
	   actual_date.setText(dates);
	   
	   pid1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
			sid1.setText("Present");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("001", "Present");			
		    editor.apply();
		}
	});
	   pid2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid2.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("002", "Present");			
			    editor.apply();
			}
		});
	    
	   pid3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid3.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("003", "Present");			
			    editor.apply();
			}
		});
	    
	   pid4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid4.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("004", "Present");			
			    editor.apply();
			}
		});
	    
	   pid5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid5.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("005", "Present");			
			    editor.apply();
			}
		});
	    
	   pid6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid6.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("006", "Present");			
			    editor.apply();
			}
		});
	    
	   pid7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid7.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("007", "Present");			
			    editor.apply();
			}
		});
	    
	   pid8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid8.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("008", "Present");			
			    editor.apply();
			}
		});
	   pid9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid9.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("009", "Present");			
			    editor.apply();
			}
		});
	   pid10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				sid10.setText("Present");
				SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
			    SharedPreferences.Editor editor = sharedpref.edit();
			    editor.putString("010", "Present");			
			    editor.apply();
			}
		});
	    
	   
	   
	  aid1.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View arg0) {
		sid1.setText("Absent");
		SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
	    SharedPreferences.Editor editor = sharedpref.edit();
	    editor.putString("001", "Absent");			
	    editor.apply();
		
			
		}
	});
	   
	  aid2.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid2.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("002", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid3.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid3.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("003", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid4.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid4.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("004", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid5.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid5.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences("lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("005", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid6.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid6.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("006", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid7.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid7.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("007", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid8.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid8.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("008", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid9.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid9.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("009", "Absent");			
		    editor.apply();
			
				
			}
		});
	  aid10.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
			sid10.setText("Absent");
			SharedPreferences sharedpref = getSharedPreferences( "lecture6", Context.MODE_PRIVATE);
		    SharedPreferences.Editor editor = sharedpref.edit();
		    editor.putString("010", "Absent");			
		    editor.apply();
			
				
			}
		});

	
	
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.attendance_sheet, menu);
		return true;
	}

}
