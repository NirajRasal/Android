package com.example.sendemail;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn=(Button)findViewById(R.id.button1);
        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                sendEmail();
            }
        });

    }
    public void sendEmail()
    {
        Log.i("Send email"," ");
        String[] TO={""};
        String[] CC={""};
        Intent i=new Intent(Intent.ACTION_SEND);
        i.setData(Uri.parse("mailTo:"));
        i.setType("Text/plain");
        //i.putExtra(Intent.EXTRA_EMAIL, TO);
        //i.putExtra(Intent.EXTRA_CC, CC);
        //i.putExtra(Intent.EXTRA_SUBJECT, "YOUR subject");
        //i.putExtra(Intent.EXTRA_TEXT,"Email goes here");
        try{

            startActivity(Intent.createChooser(i, "send mail..."));
            finish();
            Log.i("finished sending email.","");

        }
        catch(android.content.ActivityNotFoundException ex){
            Toast.makeText(MainActivity.this, "There is no email client installed", Toast.LENGTH_LONG).show();


        }
    }
}
