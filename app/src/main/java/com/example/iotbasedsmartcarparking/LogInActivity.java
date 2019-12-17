package com.example.iotbasedsmartcarparking;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class LogInActivity extends AppCompatActivity {
    Button login;
    TextView signup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_log_in );
        signup= (TextView) findViewById(R.id.notreg);
        login= (Button) findViewById(R.id.btnlogin);



        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i= new Intent(LogInActivity.this, SignUpActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
