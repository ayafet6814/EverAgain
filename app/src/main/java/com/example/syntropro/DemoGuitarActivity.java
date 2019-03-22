package com.example.syntropro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemoGuitarActivity extends AppCompatActivity {

    private Button emChord;
    private Button gChord;
    private Button dChord;
    private Button aChord;
    private Button amChord;
    private Button eChord;
    private Button dmChord;
    private Button aBarChord;
    private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo_guitar);

        Back = findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
