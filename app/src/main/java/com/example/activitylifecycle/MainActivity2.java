package com.example.activitylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Gravity;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonCreate", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected void onStart(){
        super.onStart();
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonStart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0,0);
        toast.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonResume", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonPause", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonStop", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonRestart", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        setContentView(R.layout.activity_main2);
        Toast toast = Toast.makeText(this, "secondonDestroy", Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}