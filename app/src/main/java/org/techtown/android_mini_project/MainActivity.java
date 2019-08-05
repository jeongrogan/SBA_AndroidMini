package org.techtown.android_mini_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void onButton1Clicked(View v){
        Intent myIntent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://github.com/DasomKong/SBA_AndroidMini"));
        startActivity(myIntent);
    }
}
