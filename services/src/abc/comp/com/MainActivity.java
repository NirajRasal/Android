package abc.comp.com;


	import android.os.Bundle;
	import android.content.Intent;
	import android.view.View;
	import android.app.Activity;
	import android.view.Menu;
	
	public class MainActivity extends Activity 
	{
	
	public void onCreate(Bundle savedInstanceState) 
	{
	super.onCreate(savedInstanceState);
	setContentView(R.layout.main);
	}
	
	// Method to start the service
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

