package com.example.helloword;

import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity
{
	public void startService(View view)
		{
		startService(new Intent(getBaseContext(),MyService.class));
		}
		// Method to stop the service
		public void stopService(View view) 
		{
		stopService(new Intent(getBaseContext(),MyService.class));
		}
}
