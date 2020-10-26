package com.example.helloword;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.Toast;

public class MyService extends Service 
{

	@Override
	public IBinder onBind(Intent intent) 
	{
		// TODO Auto-generated method stub
		return null;
	}
	public int onStartCommand(Intent intent, int flags, int startId) 
		{
		// Let it continue running until it is stopped.
		Toast.makeText(this, "Service Started", Toast.LENGTH_LONG).show();
		return START_STICKY;
		}
		@Override
		public void onDestroy() 
		{
		super.onDestroy();
		Toast.makeText(this, "Service Destroyed",
		Toast.LENGTH_LONG).show();
		}
}
