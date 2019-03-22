package com.example.syntropro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DemoActivity extends AppCompatActivity {

    private Button Guitar;
    private Button Piano;
    private Button Back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_demo);

        Guitar = findViewById(R.id.Guitar);
        Guitar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDemoGuitar();
            }
        });
        Piano = findViewById((R.id.Piano));
        Piano.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDemoPiano();
            }
        });
        Back = findViewById(R.id.Back);
        Back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }

    public void openDemoGuitar() {
        Intent intent = new Intent(this, DemoGuitarActivity.class);
        startActivity(intent);
    }
    public void openDemoPiano() {
        Intent intent = new Intent(this, DemoPianoActivity.class);
        startActivity(intent);
    }
}
