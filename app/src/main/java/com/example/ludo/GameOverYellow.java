package com.example.ludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameOverYellow extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over_yellow);
    }
    public void over(View view){
        Intent in= new Intent(GameOverYellow.this, PlayerSelect.class);
        startActivity(in);
    }
}