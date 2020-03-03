package com.example.firstapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {

    int count = 0;
    private TextView nameTextView;
    private TextView ageTextView;
    private Button loginButton;
    private TextView textView;
    private Button logoutButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginButtonId);
        logoutButton = findViewById(R.id.logoutButtonId);
        textView = findViewById(R.id.textViewId);




    }


    public void showMessage(View v) {

        if (v.getId() == R.id.loginButtonId) {



            textView.setText("Login Button is Clicked");
            Toast toast = Toast.makeText(MainActivity.this,"Login Button is Clicked",Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.TOP,0,200);
            toast.show();

        }

        if (v.getId() == R.id.logoutButtonId) {

            textView.setText("Logout Button is Clicked");
            Toast.makeText(MainActivity.this,"Logout Button is Clicked",Toast.LENGTH_SHORT).show();

        }
    }



}
