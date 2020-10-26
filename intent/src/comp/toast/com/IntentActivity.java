package comp.toast.com;



import java.util.regex.Pattern;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.AdapterView.OnItemSelectedListener;


public class IntentActivity extends Activity  {
	Button submit;
	RadioButton rd1;
	RadioGroup rg;
	String select;
	Spinner spinner;
	EditText sugar_count;
	
    /** Called when the activity is first created. */
	Button btn;
	private static final String[] paths={"Before Bed","Before Meal","After Meal","Fasting"};
	
	@Override
    public void onCreate(Bundle savedInstanceState) 
	{
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
       btn=(Button)findViewById(R.id.bt_submit);
       
       spinner=(Spinner)findViewById(R.id.event);
       sugar_count=(EditText) findViewById(R.id.sugar_count);
       
       final Pattern SUGAR_COUNT = Pattern.compile("[0-9]{3}");
       
       final String s=sugar_count.getEditableText().toString().trim();
       if(s.isEmpty())
       {
    	   sugar_count.setError("Field can't be empty");
       }
       else if(!SUGAR_COUNT.matcher(s).matches())
       {
    	   sugar_count.setError("Enter valid data");
    	 
       }
       else
       {
    	   sugar_count.setError(null);
       }
       
       ArrayAdapter<String>adapter=new ArrayAdapter<String>(IntentActivity.this,android.R.layout.simple_spinner_item,paths);
       adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
       spinner.setAdapter(adapter);
       spinner.setOnItemSelectedListener(new OnItemSelectedListener()
       {

 		@Override
 		public void onItemSelected(AdapterView<?> arg0, View arg1, int position,
 				long arg3) 
 		{
 			
 			select=spinner.getSelectedItem().toString();
 		}

 		@Override
 		public void onNothingSelected(AdapterView<?> arg0) {
 			// TODO Auto-generated method stub
 			
 		}
     	  
       });
    btn.setOnClickListener(new View.OnClickListener() {
		
		@Override
		public void onClick(View v) {
			String namevalue=sugar_count.getText().toString();
			Intent intent=new Intent(IntentActivity.this,Next.class);
			intent.putExtra("NAME",namevalue);
			intent.putExtra("EVENT", select);
			startActivity(intent);
			// TODO Auto-generated method stub
			
		}
	});
	}
	
}
        
        