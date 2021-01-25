package com.example.helloworldandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        TextView txtHello = findViewById(R.id.txtMessage);
//
//        txtHello.setText("Hey you beautiful!!");



    }


    public void onBtnClick(View view){

        //defining edt txt
        EditText edtTxtName = findViewById(R.id.edtTxtName);
        EditText edtTxtLName = findViewById(R.id.edtTxtLName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);




        //defining txt views
        TextView txtFName = findViewById(R.id.txtFname);
        TextView txtLName = findViewById(R.id.txtLName);
        TextView txtEmail = findViewById(R.id.txtEmail);


        //setting txt to user input
        txtFName.setText(edtTxtName.getText().toString());
        txtLName.setText(edtTxtLName.getText().toString());
        txtEmail.setText(edtTxtEmail.getText().toString());




    }

}