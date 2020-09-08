package com.moveit.admin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    // Declare variables
         private EditText  BusNo,DriverID;
         private Button Save,Update,New;
         private FirebaseDatabase database;
         private DatabaseReference mdatabase;
         private FirebaseAuth maluth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BusNo=findViewById(R.id.etxt_busno);
        DriverID=findViewById(R.id.etxt_driverId);
        Save=findViewById(R.id.btn_Save);
        Update=findViewById(R.id.btn_update);
        New=findViewById(R.id.btn_New);
    }
}