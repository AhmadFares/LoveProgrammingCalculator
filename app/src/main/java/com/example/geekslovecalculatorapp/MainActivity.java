package com.example.geekslovecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Name;
    TextView P;
    ImageView Java,Python,C,Csharp,Html,Php;
    Spinner spinner;
    @Override


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        P=(TextView) findViewById(R.id.textView);
        Name=(EditText) findViewById(R.id.Username);
      //
        Python=(ImageView) findViewById(R.id.ipython);
        C=(ImageView) findViewById(R.id.ic);
        Csharp=(ImageView) findViewById(R.id.icsharp);
        Html=(ImageView) findViewById(R.id.ihtml);
        Php=(ImageView) findViewById(R.id.iphp);
        Java=(ImageView) findViewById(R.id.ijava);
        Html.setTranslationY(1500);

        spinner= findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Lang, android.R.layout.browser_link_context_header);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);



    }
   ;


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
        String text = spinner.getSelectedItem().toString();

            if(s.matches("")) {
            P.setText("Error");
          }

            else if(text.equals("Java")){
                Java.setAlpha(1.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);

            P.setText(i + "%");
        }
        else if(text.equals("Python")){
                Java.setAlpha(0.0F);
                Python.setAlpha(1.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
            P.setText(i + "%");
        }
            else if(text.equals("C")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(1.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                P.setText(i + "%");
            }
            else if(text.equals("C#")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(1.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                P.setText(i + "%");
            }
            else if(text.equals("php")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(1.0F);
                P.setText(i + "%");
            }
            else if(text.equals("html")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(1.0F);
                Php.setAlpha(0.0F);
                P.setText(i + "%");
            }
    }
}