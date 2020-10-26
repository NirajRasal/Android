package com.example.helloworld;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;

public class MainActivity extends Activity 
{
	@Override
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	}
	public void broadcastIntent(View view)
	{
	Intent intent = new Intent();
	intent.setAction("com.tutorialspoint.CUSTOM_INTENT");
	sendBroadcast(intent);
	}
}
