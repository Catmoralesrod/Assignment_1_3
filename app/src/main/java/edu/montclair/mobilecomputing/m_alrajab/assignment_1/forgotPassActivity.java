package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class forgotPassActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_pass);
    }

// return to main page on focus

    public void returnclick1 (View view){
        Intent intent3 = new Intent(this, MainActivity.class);
        startActivity(intent3);

    }



}
