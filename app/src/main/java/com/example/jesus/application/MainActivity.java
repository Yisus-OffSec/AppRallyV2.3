package com.example.jesus.application;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void Entrar(View v)
    {
        startActivity(new Intent(MainActivity.this,Main2Activity.class));
    }
    public void Salir(View view)
    {
        finish();
        System.out.println("HOla Mubdo");
    }
}
