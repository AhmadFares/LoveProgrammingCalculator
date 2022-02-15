package com.example.geekslovecalculatorapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    EditText Name;
    TextView P;
    TextView res;
    ImageView Java,Python,C,Csharp,Html,Php;
    Spinner spinner;
    int count=0;
    String finall = "Start:";
    String [] Data= new String[20];

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        P=(TextView) findViewById(R.id.textView);
        res=(TextView) findViewById(R.id.Results);
        Name=(EditText) findViewById(R.id.Username);
      //
        Python=(ImageView) findViewById(R.id.ipython);
        C=(ImageView) findViewById(R.id.ic);
        Csharp=(ImageView) findViewById(R.id.icsharp);
        Html=(ImageView) findViewById(R.id.ihtml);
        Php=(ImageView) findViewById(R.id.iphp);
        Java=(ImageView) findViewById(R.id.ijava);


        spinner= findViewById(R.id.spinner1);
        ArrayAdapter<CharSequence> adapter= ArrayAdapter.createFromResource(this,R.array.Lang, android.R.layout.browser_link_context_header);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);


        String[] items=new String[20];



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
        String[] arr= new String[20];

        Random rand = new Random();
        int i= rand.nextInt(101);
        String s= Name.getText().toString();
        String text = spinner.getSelectedItem().toString();



            if(s.matches("")) {
            P.setText("Error");
          }

            else if(text.equals("Java")){

                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                Java.setTranslationY(-2000);
                Java.animate().translationYBy(2000).rotation(3600).setDuration(600);
                Java.setAlpha(1.0F);

            P.setText(i + "%");

             Data[count]= "Java :  " + i;
                finall+= "\n"+ s + " : " + Data[count];
             res.setText(finall);
             count++;

        }
        else if(text.equals("Python")){
                Java.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                Python.setTranslationY(-2000);
                Python.animate().translationYBy(2000).rotation(3600).setDuration(600);
                Python.setAlpha(1.0F);
             P.setText(i + "%");
                Data[count]= "Python :  " + i;
                finall+= "\n"+ s + " : " + Data[count];
                res.setText(finall);
                count++;

        }
            else if(text.equals("C")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                C.setTranslationY(-2000);
                C.animate().translationYBy(2000).rotation(3600).setDuration(600);
                C.setAlpha(1.0F);
                P.setText(i + "%");
                Data[count]= "C :  " + i;
                finall+= "\n"+ s + " : " + Data[count];
                res.setText(finall);
                count++;

            }
            else if(text.equals("C#")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                Csharp.setTranslationY(-2000);
                Csharp.animate().translationYBy(2000).rotation(3600).setDuration(600);
                Csharp.setAlpha(1.0F);
                P.setText(i + "%");
                Data[count]= "C# : " + i;
                finall+= "\n"+ s + " : " + Data[count];
                res.setText(finall);
                count++;

            }
            else if(text.equals("php")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Html.setAlpha(0.0F);
                Php.setTranslationY(-2000);
                Php.animate().translationYBy(2000).rotation(3600).setDuration(600);
                Php.setAlpha(1.0F);
                P.setText(i + "%");
                Data[count]= "php : " + i;
                finall+= "\n"+ s + " : " + Data[count];
                res.setText(finall);
                count++;
            }
            else if(text.equals("html")){
                Java.setAlpha(0.0F);
                Python.setAlpha(0.0F);
                C.setAlpha(0.0F);
                Csharp.setAlpha(0.0F);
                Php.setAlpha(0.0F);
                Html.setTranslationY(-2000);
                Html.animate().translationYBy(2000).rotation(3600).setDuration(600);
                Html.setAlpha(1.0F);
                P.setText(i + "%");
                Data[count]= "Html : " + i;
                finall+= "\n"+ s + " : " + Data[count];
                res.setText(finall);
                count++;
            }

    }
}