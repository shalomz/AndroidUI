package com.example.dev.myapplication;

import android.support.annotation.IdRes;
import java.util.List;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.Spinner;
public class MainActivity extends AppCompatActivity {

    private  Spinner spinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addItemsOnSpinner();

    }

     public void addItemsOnSpinner()
     {
         Spinner spinner = (Spinner) findViewById(R.id.spinner);
         ArrayAdapter adapter = ArrayAdapter.createFromResource(this,
                 R.array.course_array, android.R.layout.simple_spinner_item);
         adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
         spinner.setAdapter(adapter);
     }

     public void onRadioClick(View view)
     {
         RadioButton button=(RadioButton) view;
         boolean rb_1;
         boolean rb_2=false;
         

     }
}
