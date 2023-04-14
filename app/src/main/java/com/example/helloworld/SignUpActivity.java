package com.example.helloworld;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class SignUpActivity extends AppCompatActivity {
    private Button submit;
    private EditText Email;
    private EditText Password;
    private EditText Name;

    private TextView signin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        signin = findViewById(R.id.welcome);
        Email = findViewById(R.id.Email);
        Password = findViewById(R.id.Password);
        Name = findViewById(R.id.Name);
        submit = findViewById(R.id.submit);
        submit.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                if (Email.getText().toString().contains("@") && Email.getText().toString().contains(".com") && Password.getText().toString().length() >= 6){
                    create_user(Email.getText().toString(), Password.getText().toString(), Name.getText().toString());
                }
                else{
                    Toast toast = Toast.makeText(getApplicationContext(), "Invalid Email or Password", Toast.LENGTH_SHORT);
                    toast.show();
                };
            }
        });
    }
    public void create_user(String email, String password, String name){
        String src = "";


                };
    }
