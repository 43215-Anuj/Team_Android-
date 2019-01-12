package com.example.anuj.waste_miners;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    Button login;
    EditText phone,pass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login2);
        phone=findViewById(R.id.phone);
        pass=findViewById(R.id.pass);
        login=findViewById(R.id.login);
    }
}
