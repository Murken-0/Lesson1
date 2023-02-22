package ru.mirea.MuravievVR.lesson1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        EditText myText = (EditText) findViewById(R.id.editTextTextPersonName);
        myText.setText("New text in MIREA");
        Button button = findViewById(R.id.button13);
        button.setText("MireaButton");
        CheckBox check = findViewById(R.id.checkBox);
        check.setChecked(true);
    }
}