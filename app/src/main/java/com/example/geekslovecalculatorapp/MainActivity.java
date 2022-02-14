package com.example.geekslovecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Name;
    TextView P;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        P=(TextView) findViewById(R.id.textView);
        Name=(EditText) findViewById(R.id.Username);

        Spinner spinner= findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Lang, android.R.layout.browser_link_context_header);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int pos, long l) {
    String text= parent.getItemAtPosition(pos).toString();

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
    public void Calculate(View V){
        Random rand = new Random();
        int i= rand.nextInt(101);
        String s= Name.getText().toString();
        if(s.matches("")) {
            P.setText("Error");
        }
else {
            P.setText(i + "%");
        }
    }
}