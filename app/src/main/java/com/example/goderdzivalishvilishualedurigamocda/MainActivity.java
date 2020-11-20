package com.example.goderdzivalishvilishualedurigamocda;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText saxeli = (EditText) findViewById(R.id.name);
    EditText gvari = (EditText) findViewById(R.id.surname);
    EditText asaki = (EditText) findViewById(R.id.age);
    Button registracia = (Button) findViewById(R.id.register);
    RadioButton adamiani = (RadioButton) findViewById(R.id.human);
    RadioButton roboti = (RadioButton) findViewById(R.id.robot);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickRegister (View view) {
        int restrictedage = Integer.parseInt(asaki.getText().toString());
        String message;

        if (saxeli.getText().toString().isEmpty()) {
            message = "Unable to register";
        }
        else if (gvari.getText().toString().isEmpty()) {
            message = "Unable to register";
        }
        else if (asaki.getText().toString().isEmpty()) {
            message = "Unable to register";
        }
        else if (restrictedage < 1) {
            message = "Entered age must be over 1";
        }
        else if (restrictedage > 18) {
            message = "You must be under 18";
        }
        else if (roboti.isChecked()) {
            message = "Unable to register";
        }
        else {
            message = "Registration is successfully completed";
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();
    }


}

