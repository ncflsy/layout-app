package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.DatePicker;
import android.widget.Button;
import android.view.View;
import android.text.InputType;
import java.util.Calendar;
import android.os.Bundle;

public class RelativeLayout extends AppCompatActivity {
    DatePickerDialog picker;
    EditText eText;
    Button btnGet;
    TextView tvw;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative_layout);
        tvw=(TextView)findViewById(R.id.textview);
        eText = (EditText)findViewById(R.id.editText);
        eText.setInputType(InputType.TYPE_NULL);
        eText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int  year = cldr.get(Calendar.YEAR);
                picker = new DatePickerDialog(RelativeLayout.this,
                        new DatePickerDialog.OnDateSetListener(){
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth){
                                eText.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
        btnGet=(Button)findViewById(R.id.button);
        btnGet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                tvw.setText("Selected Date: " + eText.getText());
            }
        });
    }
}