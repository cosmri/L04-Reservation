package sg.edu.rp.c346.id21001096.l04_reservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    DatePicker dp;
    TimePicker tp;
    Button cfm;
    Button reset;
    EditText name;
    EditText number;
    EditText pax;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dp = findViewById(R.id.dp);
        tp = findViewById(R.id.tp);
        cfm = findViewById(R.id.cfm);
        reset = findViewById(R.id.reset);
        name = findViewById(R.id.name);

        cfm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (name.getText().toString().length() == 0 || number.getText().toString().length() == 0) {
                    pax.setText("Error");


                } else {
                    String text1 = "Name is ";
                    String text2 = "Number is";
                    String text3 = "Pax is ";
                    String text4 = "Date is ";
                    String text5 = "Time is ";
                    String data1 = name.getText().toString();
                    String data2 = number.getText().toString();
                    String data3 = pax.getText().toString();
                    int hour = tp.getCurrentHour();
                    int min = tp.getCurrentMinute();
                    int day = dp.getDayOfMonth();
                    int month = dp.getMonth() + 1;
                    int year = dp.getYear();
                     String text = text1 + data1 + text2 + data2 + text3 + data3 +
                             text4 + day + "/" + month + "/" + year + text5 + hour + " :" + min;

                    Toast.makeText(MainActivity.this,text, Toast.LENGTH_LONG).show();

                }
            }
        });
        reset.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (v==reset) {
                    tp.setCurrentMinute(30);
                    tp.setCurrentHour(7);
                    dp.updateDate(2020,05,01);
                }
            }
        });
    }}