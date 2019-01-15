package com.example.adimaryadi.pendaftaran_mahasiswa;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.*;
import android.content.*;
import android.view.*;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button   btnLogin;
    private static final String TAG = "Main pertama : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
        btnLogin = (Button) findViewById(R.id.btn_login);

        btnLogin.setOnClickListener(new View.OnClickListener(){
            @Override

            public void onClick(View v) {
                String usernameNama = username.getText().toString();
                String passwordPass = password.getText().toString();
                Log.d(TAG, usernameNama);
                if (usernameNama.equals("adi") && passwordPass.equals("1adimaryadi1")) {
                    Toast.makeText(getApplicationContext(),"Login Sukses",
                            Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(MainActivity.this, Menu_Utama.class);
                    MainActivity.this.startActivity(intent);
                    finish();
                } else {
                    AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                    builder.setMessage("Username password salah").setNegativeButton("Coba",null).create().show();
                }
            }
        });
    }
}
