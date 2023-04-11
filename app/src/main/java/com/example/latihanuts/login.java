package com.example.latihanuts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private TextView registerHere, forgotPass;
    private EditText email, password;
    private Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        initialize();
    }

    public void initialize(){
        email = findViewById(R.id.emailLoginField);
        password = findViewById(R.id.passwordLoginField);

        login = findViewById(R.id.loginButton);
        setLogin();

        forgotPass = findViewById(R.id.forgotPass);
        setForgotPass();

        registerHere = findViewById(R.id.registerHereText);
        setRegisterHere();

    }

    public void setLogin(){
        login.setOnClickListener(e -> {
            String inputtedEmail = email.getText().toString();
            String inputtedPassword = password.getText().toString();

            if(inputtedEmail.isEmpty() || inputtedPassword.isEmpty()){
                Toast.makeText(this, "All fields must be filled!!!", Toast.LENGTH_SHORT).show();
            }else if(!inputtedEmail.equals("tes123@gmail.com")){
                Toast.makeText(this, "Invalid Email!!!", Toast.LENGTH_SHORT).show();
            }else if(!inputtedPassword.equals("tes")){
                Toast.makeText(this, "Wrong password!!!", Toast.LENGTH_SHORT).show();
            }else{
                Toast.makeText(this, "Login Success!!!", Toast.LENGTH_SHORT).show();
                openMainPage();

            }
        });
    }

    public void setForgotPass(){
        forgotPass.setOnClickListener(e -> {
            Toast.makeText(this, "Sorry, this service currently not available!", Toast.LENGTH_SHORT).show();
        });
    }

    public void setRegisterHere(){
        registerHere.setOnClickListener(e -> {
            openRegisterPage();
        });
    }

    public void openRegisterPage(){
        registerHere.setOnClickListener(e -> {
            Toast.makeText(this, "Sorry, this service currently not available!", Toast.LENGTH_SHORT).show();
        });
    }

    public void openMainPage(){
        Intent intent = new Intent(this, main.class);
        startActivity(intent);
    }

}