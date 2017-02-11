package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
// On Focus of forgot password button goes to forgotpass page
    public void forgotPassClick (View view) {

        Intent intent1 = new Intent(this, forgotPassActivity.class);
        startActivity(intent1);

    }
// On focus brings of register button goes to registration page
    public void registerClick(View view){

        Intent intent2 = new Intent(this, RegistrationPage.class);
        startActivity(intent2);
    }


}