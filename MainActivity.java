package com.example.unit_convertor;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText no1;
    private Button button;
    private TextView n02;
    private TextView n03;
    private TextView n04;
    private TextView n05;




@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    EdgeToEdge.enable(this);
    setContentView(R.layout.activity_main);
    ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
        Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
        v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
        return insets;
    });

    // Initialize EditText and TextViews
    no1 = (EditText) findViewById(R.id.n01);
    n02 = (TextView) findViewById(R.id.n02);
    n03 = (TextView) findViewById(R.id.n03);
    n04 = (TextView) findViewById(R.id.n04);
    n05 = (TextView) findViewById(R.id.n05);

    button = findViewById(R.id.button);

    button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String s = no1.getText().toString();
            int cm = Integer.parseInt(s);
            float m = cm / 100.0f;
            float mm = cm * 10;
            double in = cm * 0.394;

            // Set the calculated values to TextViews
            n02.setText("Value in Meters: " + m + " m");
            n03.setText("Value in Mill-imeters: " + mm + " mm");
            n04.setText(" Value in Inches: " + in + " in");

        }
    });
}

}