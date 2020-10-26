package com.example.login;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
	Button blogin,breg;
	String uname,upass;
	TextView t1;
	@Override
	 public void onCreate(Bundle savedInstanceState)
	{
	      super.onCreate(savedInstanceState);
	      setContentView(R.layout.main1);
	      blogin=(Button)findViewById(R.id.blogin);
	      breg=(Button)findViewById(R.id.breg);
	      blogin.setOnClickListener(new View.OnClickListener()
	      {
	    	  public void onClick(View v)
	    	  {
	    		  String uname=uname.getText();
	    		  String upass=upass.getText();
	    	  }
	      }
	      breg.setOnClickListener(new View.OnClickListener()
	      {
	    	  @Override
	    	  public void onClick(View v)
	    	  {
	    		  Intent myintent2 = new Intent(MainActivity.this,Register.class);
	    		  startActivity(myintent2);
	    	  }
	      }
	}

	
	

