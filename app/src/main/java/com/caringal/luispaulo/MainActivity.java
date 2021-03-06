package com.caringal.luispaulo;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Activity 1");
        Log.d("4IT-H","tumakbo si onCreate()");
        Intent i = new Intent(this,MyCustomService.class);
        startService(i);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("4IT-H","onStart() has executed...");
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d("4IT-H","onResume() has executed...");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d("4IT-H","onStop() has executed...");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d("4IT-H","onPause() has executed...");
    }

    @Override
    protected void onRestart(){
        super.onRestart();
        Log.d("4IT-H","onRestart() has executed...");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d("4IT-H","onDestroy() has executed...");
    }

    public void displayMsg(View v){
//        Toast.makeText(this,"Hello 4IT-H...",Toast.LENGTH_LONG).show();
        Snackbar.make(v,"Hello Again...",Snackbar.LENGTH_LONG).show();
    }

    public void process(View v){
        Intent i = null, chooser = null;
        if(v.getId() == R.id.btn_next_act){
            i = new Intent(this,MainActivity2.class);
            Log.d("4IT-H","Switched to Activity 2...");
            startActivity(i);
        }
        else if(v.getId() == R.id.btn_map){
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo:34.682230, 135.530562"));
            chooser = Intent.createChooser(i,"Select Map App: ");
            Log.d("4IT-H","Switched to Map...");
            startActivity(chooser);
        }
    }
}
