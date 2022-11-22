package com.example.listencarefree;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.os.Bundle;

public class TrainEnvironmentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_train_environment);
    }

    public void onQuestActivicy(View v){
        Intent intent = new Intent(getApplicationContext(),QuestActivity.class);
        startActivity(intent);
    }


}