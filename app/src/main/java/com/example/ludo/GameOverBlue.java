package com.example.ludo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class GameOverBlue extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over_blue);

    }
    public void over(View view){
        Intent in= new Intent(GameOverBlue.this, PlayerSelect.class);
        startActivity(in);
    }
}