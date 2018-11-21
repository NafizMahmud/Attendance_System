package com.example.attendance;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
	ImageView image;
    AnimationDrawable anime;
    TextView textView1,textView2;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		 setContentView(R.layout.activity_main);
	     textView1=(TextView)findViewById(R.id.textView1);
	     textView2=(TextView)findViewById(R.id.textView2);
		 image=(ImageView) findViewById(R.id.imageView1);
		 image.setImageResource(R.drawable.frameanimation);
		 anime=(AnimationDrawable)image.getDrawable();
		 anime.start();
	    Thread logoTimer = new Thread() {
            public void run(){
                try
                {sleep(2000);
                 Intent intent = new Intent(MainActivity.this, LogActivity.class );
                 startActivity(intent);} 
                catch (InterruptedException e) 
                { e.printStackTrace();}
                finally
                {finish();}}};
                logoTimer.start();}
	   
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
