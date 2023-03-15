package com.nobleprog.lab3;

import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        launcher = registerForActivityResult(new
                ActivityResultContracts.StartActivityForResult(), result -> {
            int points = result.getData().getIntExtra("points", 0);
            Log.i("MAIN", "points " + points);
        });
    }

    public void onClikStartGameButton(View w){
        Intent intent = new Intent(this, GameActivity.class);
        launcher.launch(intent);
    }

    public void clickButton(View v){
        ImageButton clikedButton = (ImageButton) v;
        clikedButton.setImageDrawable(getResources().getDrawable(R.drawable.fig2));

        Intent intent = new Intent();
        intent.putExtra("points", 111);
        setResult(Activity.RESULT_OK, intent);
        finish();
    }

    public void onStartGameButton(View view) {
        Intent intent = new Intent(this, GameActivity.class);
        startActivity(intent);
    }

    ActivityResultLauncher<Intent> launcher;
}