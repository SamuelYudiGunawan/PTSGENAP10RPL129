package com.example.ptsgenap10rpl129;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button buttonlogin = findViewById(R.id.btnLogin);

        buttonlogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                login();
            }
        });
    }


    void login(){
        EditText usernameLogin = (EditText)findViewById(R.id.username);
        EditText passwordLogin = (EditText)findViewById(R.id.password);

        String username = "Samuel Yudi";
        String password = "test";

        String emailLog = usernameLogin.getText().toString();
        String passwordLog = passwordLogin.getText().toString();

        //toast = alert

        if (emailLog.equals(username) && passwordLog.equals(password)) {
            Toast.makeText(this, "Anda Berhasil Masuk", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Username atau Password Salah", Toast.LENGTH_SHORT).show();
        }
        Intent intent = new Intent(MainActivity.this, UH10RPL.class);
        startActivity(intent);

    }
}