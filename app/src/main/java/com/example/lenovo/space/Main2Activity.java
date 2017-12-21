package com.example.lenovo.space;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void goToActivity3 (View view){
        Intent intent = new Intent (this, Main3Activity.class);
        startActivity(intent);
    }

    public void goToActivity4 (View view){
        Intent intent = new Intent (this, Main4Activity.class);
        startActivity(intent);
    }

    public void goToActivity5 (View view){
        Intent intent = new Intent (this, Main5Activity.class);
        startActivity(intent);
    }
}
