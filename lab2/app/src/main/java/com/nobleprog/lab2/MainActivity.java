package com.nobleprog.lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button quit = findViewById(R.id.button);
        AnimatorSet set = (AnimatorSet) AnimatorInflater
                .loadAnimator(this.getBaseContext(),R.animator.property_animator);
        set.setTarget(quit);
        set.start();
    }

    public void onClickQuitButton(View view) {
        finish();
    }

    public void onClickSettingsButton(View view) {
        Toast.makeText(this, "Settings button", Toast.LENGTH_SHORT).show();
    }

    public void onClickHelpButton(View view) {
        Toast.makeText(this, "Help button", Toast.LENGTH_SHORT).show();
    }

    public void onClickAboutButton(View view) {
        Toast.makeText(this, "About button", Toast.LENGTH_SHORT).show();
    }
}