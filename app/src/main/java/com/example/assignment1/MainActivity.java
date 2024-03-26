package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etfirstname, etsecondname, etemailid, etpassword, etconfirmpass;
    RadioButton rbtnMale, rbtnFemale;
    Button btnSignin, btnExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        btnSignin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String gender;

                String fname = etfirstname.getText().toString().trim();
                String sname = etsecondname.getText().toString().trim();
                String email = etemailid.getText().toString().trim();
                String pass = etpassword.getText().toString().trim();
                String confirmpass = etconfirmpass.getText().toString().trim();

                if (fname.isEmpty() || sname.isEmpty() || email.isEmpty() || pass.isEmpty() || confirmpass.isEmpty()){
                    Toast.makeText(MainActivity.this, "Input can not be Empty", Toast.LENGTH_SHORT).show();
                    return;
                }
                else
                {
                    if(rbtnMale.isChecked()){
                        gender = "Male";
                    }
                    else if (rbtnFemale.isChecked()) {
                        gender = "Female";
                    }
                    else {
                        Toast.makeText(MainActivity.this, "Gender is not Selected", Toast.LENGTH_SHORT).show();
                        return;
                    }
                    if (pass.equals(confirmpass)){
                        Intent intent = new Intent(MainActivity.this, com.example.assignment1.SecondActivity.class);
                        startActivity(intent);
                        finish();
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Password does not match", Toast.LENGTH_SHORT).show();
                        return;
                    }

                }



            }
        });

        btnExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });


    }

    private void init(){
        etfirstname = findViewById(R.id.etfirstname);
        etsecondname = findViewById(R.id.etsecondname);
        etemailid = findViewById(R.id.etemailid);
        etpassword = findViewById(R.id.etpassword);
        etconfirmpass = findViewById(R.id.etconfirmpass);
        rbtnMale = findViewById(R.id.rbtnMale);
        rbtnFemale = findViewById(R.id.rbtnFemale);
        btnSignin = findViewById(R.id.btnSignim);
        btnExit = findViewById(R.id.btnExit);

    }
}