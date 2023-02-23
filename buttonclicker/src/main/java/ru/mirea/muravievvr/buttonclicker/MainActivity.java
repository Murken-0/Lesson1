package ru.mirea.muravievvr.buttonclicker;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.*;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView myTxt = findViewById(R.id.textView);
        Button itsNotMe = findViewById(R.id.btnItIsNotMe);
        Button whoIAm = findViewById(R.id.tvOut);
        CheckBox state = findViewById(R.id.state);
        state.setVisibility(View.INVISIBLE);
        View.OnClickListener oclBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTxt.setText("Мой номер по списку No 21");
                if (state.getVisibility() == View.INVISIBLE)
                {
                    state.setVisibility(View.VISIBLE);
                }
                state.setChecked(true);
            }
        };
        whoIAm.setOnClickListener(oclBtnWhoAmI);
        View.OnClickListener oclItsNotMe = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myTxt.setText("Это не я сделал");
                if (state.getVisibility() == View.INVISIBLE)
                {
                    state.setVisibility(View.VISIBLE);
                }
                state.setChecked(false);
            }
        };
        itsNotMe.setOnClickListener(oclItsNotMe);
    }
}