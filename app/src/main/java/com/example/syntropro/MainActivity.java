package com.example.syntropro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button NewTrack;
    private Button Templates;
    private Button SavedTracks;
    private Button Settings;
    private Button Exit;

    private Button Demo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        NewTrack = (Button) findViewById(R.id.NewTrack);
        NewTrack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNewTrack();
            }
        });
        Templates = (Button) findViewById(R.id.Templates);
        Templates.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openTemplates();
            }
        });
        SavedTracks = (Button) findViewById(R.id.SavedTracks);
        SavedTracks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSavedTracks();
            }
        });
        Settings = (Button) findViewById((R.id.Settings));
        Settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettings();
            }
        });
        Exit = findViewById(R.id.Exit);
        Exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                System.exit(0);
            }
        });
        Demo = findViewById(R.id.Demo);
        Demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDemo();
            }
        });
    }

    public void openNewTrack() {
        Intent intent = new Intent(this, NewTrackActivity.class);
        startActivity(intent);
    }
    public void openTemplates() {
        Intent intent = new Intent(this, TemplatesActivity.class);
        startActivity(intent);
    }
    public void openSavedTracks() {
        Intent intent = new Intent(this, SavedTracksActivity.class);
        startActivity(intent);
    }
    public void openSettings() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void openDemo() {
        Intent intent = new Intent(this, DemoActivity.class);
        startActivity(intent);
    }


}
