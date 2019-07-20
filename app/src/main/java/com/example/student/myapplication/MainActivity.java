package com.example.student.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.desc_details);
        textView.setText(R.string.newString);


        Log.i("Lifecycle", "onCreate() invoked");
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("started", "onStart Method functioning");
    }

//    @Override
//    public void onRestart(){
//        super.onRestart();
//        Log.i("Restarted", "onRestart method is functioning");
//    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.i("restart", "in the onRestart method");
    }

    public void onPause(){
        super.onPause();
        Log.i("Pause", "in the onPause method");
    }

    public void onStop(){
        super.onStop();
        Log.i("stop", "in the onStop method");
    }

    public void onDestroy(){
        super.onDestroy();
        Log.i("destroyed", "in the onDestroyed method");
    }
}
