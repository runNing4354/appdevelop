package com.example.listencarefree;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class TrainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle saveInstanceState){
        super.onCreate(saveInstanceState);
        setContentView(R.layout.activity_train);
    }

    public void onTrainEnvironment(View v){
        Intent intent = new Intent(getApplicationContext(), TrainEnvironmentActivity.class);
        startActivity(intent);
    }



}
