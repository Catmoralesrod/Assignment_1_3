package edu.montclair.mobilecomputing.m_alrajab.assignment_1;

import android.app.DatePickerDialog;
import android.icu.util.Calendar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.Spinner;
import android.widget.TextView;


import static android.icu.util.Calendar.getInstance;

public class RegistrationPage extends AppCompatActivity implements AdapterView.OnItemSelectedListener{
Calendar calendar = getInstance();
    TextView display;
    Spinner spinnerDropdown;
    ArrayAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);

        // array is holding list of majors, spinner is going to display them
        adapter = ArrayAdapter.createFromResource(this, R.array.spinner_options, android.R.layout.simple_spinner_item);
        spinnerDropdown = (Spinner) findViewById(R.id.spinner_dropdown);
        spinnerDropdown.setAdapter(adapter);
        spinnerDropdown.setOnItemSelectedListener(RegistrationPage.this);


// displays calendar directs date button to btn_date button on the xml file

        display = (TextView)findViewById(R.id.textView_display);
        Button dateButton = (Button)findViewById(R.id.btn_date);
        dateButton.setOnClickListener(new View.OnClickListener(){
        @Override
        public void onClick(View v){

            new DatePickerDialog(RegistrationPage.this,listener,calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),calendar.get(Calendar.YEAR)).show();
        }
        });

        }
    // once date selected from the calendar view, display in "textview_display"
    DatePickerDialog.OnDateSetListener listener = new DatePickerDialog.OnDateSetListener(){
        @Override
        public void onDateSet(DatePicker view, int monthOfYear, int dayOfMonth, int year){

            display.setText("Date of Birth: " + monthOfYear  + "-" + dayOfMonth + "-" + year);
        }
    };

//what happens when an item is selected from the spinner
    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }
// what happens when nothing is selected from the spinner
    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}





