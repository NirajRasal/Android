package comp.toast.com;

import android.app.Activity;
import android.os.Bundle;

import android.widget.Button;
import android.widget.TextView;


public class Next extends Activity {
	
	  Button bt;
	  String st,st1;
	  TextView txt;
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.next);
        txt=(TextView)findViewById(R.id.textView1);
        st=getIntent().getExtras().getString("NAME");
        st1=getIntent().getExtras().getString("EVENT");
        int a=Integer.parseInt(st);
        
				// TODO Auto-generated method stub
				//Toast.makeText(Next.this, st1, Toast.LENGTH_LONG).show();
				
				if(st1.equals("Before Bed"))
				{
					for(int i=100;i<=140;i++)
					{
						
						if(a==i)
						
							txt.setText("Normal sugarlevel");
					}
					for(int i=0;i<50;i++)
					{
						if(a==i)
						{
							txt.setText("Dangerously Low, seek medical attention.");
						}
					}
					for(int i=50;i<90;i++)
					{
						if(a==i)
						{
							txt.setText("Possibly too low, Get sugar if experiencing symptoms of low sugar level.Consult a doctor. Some of the ways to increase the sugar level naturally are: 1.Eat all your meal and snacks on time and try not to skip any. 2.Take right amount of insulin. 3.If you exercise Longer or harder than usual, have an extra snack. 4.Stick to your diabetes management plan.");
						}
					}
					for(int i=141;i<=240;i++)
					{
						if(a==i)
						{
							txt.setText("Too High, work to lower blood sugar level ways to lower blood sugar include : 1.Limiting Carbohydrate intake but not fasting 2.Increasing water intake to maintain Hydration and dilute excess blood sugar 3.Increasing physical activity to burn excess sugar level 4.Increasing Fiber intake");
						}
					}
					for(int i=241;i<=300;i++)
					{
						if(a==i)
						{
							txt.setText("Too High, a sign of out of control diabetes, see a doctor");
						}
					}
					for(int i=300;i<=500;i++)
					{
						if(a==i)
						{
							txt.setText("very high, seek medical attention immediately");
						}
					}
				}
				if(st1.equals("Before Meal"))
				{
					for(int i=0;i<50;i++)
					{
						if(a==i)
						{
							txt.setText("Dangerously Low, seek medical attention.");
						}
					}
					for(int i=50;i<70;i++)
					{
						if(a==i)
						{
							txt.setText("Possibly too low, Get sugar if experiencing symptoms of low sugar level.Consult a doctor. Some of the ways to increase the sugar level naturally are: 1.Eat all your meal and snacks on time and try not to skip any. 2.Take right amount of insulin. 3.If you exercise Longer or harder than usual, have an extra snack. 4.Stick to your diabetes management plan.");
						}
					}
					for(int i=70;i<=109;i++)
					{
						
						if(a==i)
						
							txt.setText("Excellent sugarlevel");
					}
					for(int i=110;i<=144;i++)
					{
						if(a==i)
						
							txt.setText("Good SugaLevel");
					}
					for(int i=145;i<=180;i++)
					{
						if(a==i)
							txt.setText("Acceptable SugarLevel");
					}
					for(int i=180;i<=240;i++)
					{
						
						if(a==i)
						
							txt.setText("Too High, work to lower blood sugar level ways to lower blood sugar include : 1.Limiting Carbohydrate intake but not fasting 2.Increasing water intake to maintain Hydration and dilute excess blood sugar 3.Increasing physical activity to burn excess sugar level 4.Increasing Fiber intake");

					}
					for(int i=241;i<=300;i++)
					{
						if(a==i)
						{
							txt.setText("Too High, a sign of out of control diabetes, see a doctor");
						}
					}
					for(int i=300;i<=500;i++)
					{
						if(a==i)
						{
							txt.setText("very high, seek medical attention immediately");
						}
					}
				}
				if(st1.equals("After Meal"))
				{
					for(int i=0;i<=50;i++)
					{
						if(a==i)
						{
							txt.setText("Dangerously Low, seek medical attention.");
						}
					}
					for(int i=51;i<70;i++)
					{
						if(a==i)
						{
							txt.setText("Possibly too low, Get sugar if experiencing symptoms of low sugar level.Consult a doctor. Some of the ways to increase the sugar level naturally are: 1.Eat all your meal and snacks on time and try not to skip any. 2.Take right amount of insulin. 3.If you exercise Longer or harder than usual, have an extra snack. 4.Stick to your diabetes management plan.");
						}
					}
					for(int i=70;i<=90;i++)
					{
						
						if(a==i)
						
							txt.setText("Possibly to low, get sugar if experiencing symptoms of low sugar level or Consult a doctor.");
					}
					for(int i=90;i<=126;i++)
					{
						
						if(a==i)
						
							txt.setText("Excellent sugarlevel");
					}
					for(int i=127;i<=180;i++)
					{
						
						if(a==i)
						
							txt.setText("Good sugarlevel");
					}
					for(int i=181;i<=234;i++)
					{
						
						if(a==i)
						
							txt.setText("Acceptable sugarlevel");
					}
					for(int i=235;i<=300;i++)
					{
						if(a==i)
						{
							txt.setText("Too High, a sign of out of control diabetes, see a doctor");
						}
					}
					for(int i=300;i<=500;i++)
					{
						if(a==i)
						{
							txt.setText("very high, seek medical attention immediately");
						}
					}
				}
				if(st1.equals("Fasting"))
				{
					for(int i=0;i<60;i++)
					{
						if(a==i)
						{
							txt.setText("Dangerously Low, seek medical attention");
						}
					}
					for(int i=60;i<=90;i++)
					{
						
						if(a==i)
						
							txt.setText("Normal sugarlevel");
					}
					for(int i=90;i<=140;i++)
					{
						
						if(a==i)
						
							txt.setText("Medium sugarlevel consult doctor.");
					}
					for(int i=141;i<=240;i++)
					{
						if(a==i)
						{
							txt.setText("Too High, work to lower blood sugar level ways to lower blood sugar include : 1.Limiting Carbohydrate intake but not fasting 2.Increasing water intake to maintain Hydration and dilute excess blood sugar 3.Increasing physical activity to burn excess sugar level 4.Increasing Fiber intake");
						}
					}
					for(int i=241;i<=300;i++)
					{
						if(a==i)
						{
							txt.setText("Too High, a sign of out of control diabetes, see a doctor");
						}
					}
					for(int i=300;i<=500;i++)
					{
						if(a==i)
						{
							txt.setText("very high, seek medical attention immediately");
						}
					}
					
				}
				
		}
}


