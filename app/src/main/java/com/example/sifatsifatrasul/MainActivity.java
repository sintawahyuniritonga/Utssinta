package com.example.sifatsifatrasul;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void liat_swajib(View view){
        Intent Anew = new Intent(this, sw_rasul.class);
        startActivity(Anew);
    }

    public void mustahil(View view) {
        Intent Anew = new Intent(this,sm_rasul.class);
        startActivity(Anew);
    }

    public void jaiz(View view) {
        Intent Anew = new Intent(this,sj_rasul.class);
        startActivity(Anew);
    }
}