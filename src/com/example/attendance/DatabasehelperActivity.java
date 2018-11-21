package com.example.attendance;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class DatabasehelperActivity extends Activity {
	  String table="Student";
	    String userinfo= "userinfo";
	    String courseinfo= "courseinfo";
	    String dates= "dates";
	    String[] lectures= new String[50];
	    
	    String[] presence1 = new String [30];
		   String[] presence2 = new String [30];
		   String[] presence3 = new String [30];
		   String[] presence4 = new String [30];
		   String[] presence5 = new String [30];
		   String[] presence6 = new String [30];
		   String[] presence7 = new String [30];
		   String[] presence8 = new String [30];
		   String[] presence9 = new String [30];
		   String[] presence10 = new String [30];
	    
	    Button sign_in;
	    SharedPreferences pref;
		@Override
		protected void onCreate(Bundle savedInstanceState) {
			super.onCreate(savedInstanceState);
			setContentView(R.layout.activity_main);
		    
			pref=getSharedPreferences("Database", 0);
		    String status=pref.getString("load", "no");
		    if(status.equals("no"))
		    {createdatabase();
		    SharedPreferences.Editor editor=pref.edit();
		    editor.putString("load", "yes");
		    editor.commit();}	
		    
		    
		    sign_in = (Button)findViewById(R.id.button1);
		    Button save = (Button)findViewById(R.id.button2);
		    
		    save.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
					SQLiteDatabase db=openOrCreateDatabase("Student", MODE_PRIVATE, null);
					SQLiteDatabase db1=openOrCreateDatabase("userinfo", MODE_PRIVATE, null);
					SQLiteDatabase db2=openOrCreateDatabase("courseinfo", MODE_PRIVATE, null);
					SQLiteDatabase db3=openOrCreateDatabase("lectures", MODE_PRIVATE, null);
					
					db.execSQL(userinfo);
					db.close();
					Toast.makeText(getApplicationContext(), "Saved Please Go Back", Toast.LENGTH_SHORT).show();
				}});
		 
		    sign_in.setOnClickListener(new OnClickListener() {
				@Override
				public void onClick(View arg0) {
				SQLiteDatabase db=openOrCreateDatabase("MyDB", MODE_PRIVATE, null);
				String retrieve="SELECT * FROM "+dates+";";
				Cursor cursor=db.rawQuery(retrieve, null);
			
				if(cursor.getCount()<1) {Toast.makeText(getApplicationContext(), "NO Data", Toast.LENGTH_SHORT).show();}
				
				else{String alldata=""; 
					cursor.moveToFirst();
				    
				do{String name=cursor.getString(cursor.getColumnIndex("lectures"));
				    String present=cursor.getString(cursor.getColumnIndex("presence"));
				    alldata+=name+ " " + present + "\n";}  
				
				while(cursor.moveToNext());
				    
				Toast.makeText(getApplicationContext(), alldata, Toast.LENGTH_SHORT).show();}	
				}});
		    int count1=0;
			  int count2=0;
			  int count3=0;
			  int count4=0;
			  int count5=0;
			  int count6=0;
			  int count7=0;
			  int count8=0;
			  int count9=0;
			  int count10=0;
			  
			    for(int i=1;i<10;i++)
			    { if (presence1[i].equals("Present") || presence1[i].equals(""))
			         {
			    	  count1 = count1+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence2[i].equals("Present") || presence2[i].equals(""))
			         {
			    	  count2 = count2+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence3[i].equals("Present") || presence3[i].equals(""))
			         {
			    	  count3 = count3+ 1;  ;
			         } 
			   	
			    }
			  
			    for(int i=1;i<10;i++)
			    { if (presence4[i].equals("Present") || presence4[i].equals(""))
			         {
			    	  count4 = count4+ 1;  ;
			         } 
			   	
			    }
			    
			    for(int i=1;i<10;i++)
			    { if (presence5[i].equals("Present") || presence5[i].equals(""))
			         {
			    	  count5 = count5+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence6[i].equals("Present") || presence6[i].equals(""))
			         {
			    	  count6 = count6+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence7[i].equals("Present") || presence7[i].equals(""))
			         {
			    	  count7 = count7+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence8[i].equals("Present") || presence8[i].equals(""))
			         {
			    	  count8 = count8+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence9[i].equals("Present") || presence9[i].equals(""))
			         {
			    	  count9 = count9+ 1;  ;
			         } 
			   	
			    }
			    for(int i=1;i<10;i++)
			    { if (presence10[i].equals("Present") || presence10[i].equals(""))
			         {
			    	  count10 = count10 + 1;  ;
			         } 
			   	
			    }
			    

			    
			  
			
			   
			   float mark1,mark2,mark3,mark4,mark5,mark6,mark7=0,mark8,mark9,mark10;
			   
			   SharedPreferences sharedpref0 = getSharedPreferences("userinfo", Context.MODE_PRIVATE);      
			   String value = sharedpref0.getString("value", "1");
			   int v =Integer.parseInt(value);
			   int z=v-1;
			   float w=v-1;
			   
			   
			   
			   
			 
			     
			   
			   mark1 = (count1/w)*100;
			   
			   if(mark1>59 && mark1<65 )
			   {mark1=12;}
			   else if(mark1>64 && mark1<70)
			   {mark1=15;} 
			   else if(mark1>69 && mark1<75)
			   {mark1=18;} 
			   else if(mark1>74 && mark1<80)
			   {mark1=21;} 
			   else if(mark1>79 && mark1<85)
			   {mark1=25;} 
			   else if(mark1>84 && mark1<90)
			   {mark1=27;} 
			   else if(mark1>89 && mark1<101)
			   {mark1=30;} 
			   else 
			   {mark1=0;}
			   
	mark2 = (count2/w)*100;
			   
			   if(mark2>59 && mark2<65 )
			   {mark2=12;}
			   else if(mark2>64 && mark2<70)
			   {mark2=15;} 
			   else if(mark2>69 && mark2<75)
			   {mark2=18;} 
			   else if(mark2>74 && mark2<80)
			   {mark2=21;} 
			   else if(mark2>79 && mark2<85)
			   {mark2=25;} 
			   else if(mark2>84 && mark2<90)
			   {mark2=27;} 
			   else if(mark2>89 && mark2<101)
			   {mark2=30;} 
			   else 
			   {mark2=0;}
			   


			   

			   mark3 = (count3/w)*100;
					   
					   if(mark3>59 && mark3<65 )
					   {mark3=12;}
					   else if(mark3>64 && mark3<70)
					   {mark3=15;} 
					   else if(mark3>69 && mark3<75)
					   {mark3=18;} 
					   else if(mark3>74 && mark3<80)
					   {mark3=21;} 
					   else if(mark3>79 && mark3<85)
					   {mark3=25;} 
					   else if(mark3>84 && mark3<90)
					   {mark3=27;} 
					   else if(mark3>89 && mark3<101)
					   {mark3=30;} 
					   else 
					   {mark3=0;}
					   

			   mark4 = (count4/w)*100;
					   
					   if(mark4>59 && mark4<65 )
					   {mark4=12;}
					   else if(mark4>64 && mark4<70)
					   {mark4=15;} 
					   else if(mark4>69 && mark4<75)
					   {mark4=18;} 
					   else if(mark4>74 && mark4<80)
					   {mark4=21;} 
					   else if(mark4>79 && mark4<85)
					   {mark4=25;} 
					   else if(mark4>84 && mark4<90)
					   {mark4=27;} 
					   else if(mark4>89)
					   {mark4=30;} 
					   else 
					   {mark4=0;}
					   

			   mark5 = (count5/w)*100;
					   
					   if(mark5>59 && mark5<65 )
					   {mark5=12;}
					   else if(mark5>64 && mark5<70)
					   {mark5=15;} 
					   else if(mark5>69 && mark5<75)
					   {mark5=18;} 
					   else if(mark5>74 && mark5<80)
					   {mark5=21;} 
					   else if(mark5>79 && mark5<85)
					   {mark5=25;} 
					   else if(mark5>84 && mark5<90)
					   {mark5=27;} 
					   else if(mark5>89)
					   {mark5=30;} 
					   else 
					   {mark5=0;}
					 
	mark6 = (count6/w)*100;
					   
					   if(mark6>59 && mark6<65 )
					   {mark6=12;}
					   else if(mark6>64 && mark6<70)
					   {mark6=15;} 
					   else if(mark6>69 && mark6<75)
					   {mark6=18;} 
					   else if(mark6>74 && mark6<80)
					   {mark6=21;} 
					   else if(mark6>79 && mark6<85)
					   {mark6=25;} 
					   else if(mark6>84 && mark6<90)
					   {mark6=27;} 
					   else if(mark6>89)
					   {mark6=30;} 
					   else 
					   {mark6=0;}
					   
	   mark7 = (count7/w)*100;
					   
					   if(mark7>59 && mark7<65 )
					   {mark7=12;}
					   else if(mark7>64 && mark7<70)
					   {mark7=15;} 
					   else if(mark7>69 && mark7<75)
					   {mark7=18;} 
					   else if(mark7>74 && mark7<80)
					   {mark7=21;} 
					   else if(mark7>79 && mark7<85)
					   {mark7=25;} 
					   else if(mark7>84 && mark7<90)
					   {mark7=27;} 
					   else if(mark7>89)
					   {mark7=30;} 
					   else 
					   {mark7=0;}
					   
	   mark8 = (count8/w)*100;
	   Toast.makeText(getApplicationContext(), mark8+"", Toast.LENGTH_SHORT).show();
					   if(mark8>59 && mark8<65 )
					   {mark8=12;}
					   else if(mark8>64 && mark8<70)
					   {mark8=15;} 
					   else if(mark8>69 && mark8<75)
					   {mark8=18;} 
					   else if(mark8>74 && mark8<80)
					   {mark8=21;} 
					   else if(mark8>79 && mark8<85)
					   {mark8=25;} 
					   else if(mark8>84 && mark8<90)
					   {mark8=27;} 
					   else if(mark8>89)
					   {mark8=30;} 
					   else 
					   {mark8=0;}
					   
	                   mark9 = (count9/w)*100;
	                   
					   
	                   if(mark9>59 && mark9<65 )
					   {mark9=12;}
					   else if(mark9>64 && mark9<70)
					   {mark9=15;} 
					   else if(mark9>69 && mark9<75)
					   {mark9=18;} 
					   else if(mark9>74 && mark9<80)
					   {mark9=21;} 
					   else if(mark9>79 && mark9<85)
					   {mark9=25;} 
					   else if(mark9>84 && mark9<90)
					   {mark9=27;} 
					   else if(mark9>89 && mark9<101)
					   {mark9=30;} 
					   else 
					   {mark9=0;}
					   
	                   mark10 = (count10/w)*100;
					   
					   if(mark10>59 && mark10<65 )
					   {mark10=12;}
					   else if(mark10>64 && mark10<70)
					   {mark10=15;} 
					   else if(mark10>69 && mark10<75)
					   {mark10=18;} 
					   else if(mark10>74 && mark10<80)
					   {mark10=21;} 
					   else if(mark10>79 && mark10<85)
					   {mark10=25;} 
					   else if(mark10>84 && mark10<90)
					   {mark10=27;} 
					   else if(mark10>89 && mark10<101)
					   {mark10=30;} 
					   else 
					   {mark10=0;}
    
		
		
		
		
		}
	   
	    public void createdatabase()
	   {SQLiteDatabase db=openOrCreateDatabase("MyDB", MODE_PRIVATE, null);
	    String create="CREATE TABLE IF NOT EXISTS "+ courseinfo +" (id INTEGER,date VARCHAR,presence VARCHAR);";
	    db.execSQL(create);
	    db.close();
	    Toast.makeText(getApplicationContext(), "not yet", Toast.LENGTH_SHORT).show();}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.databasehelper, menu);
		return true;
	}

}
