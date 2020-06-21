package com.example.closeactivityapp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button exit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        exit=(Button)findViewById(R.id.exit);
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDialog();
            }
        });
    }
    protected void getDialog(){
//        Dialog dialog=new Dialog();
//        dialog.show(getSupportFragmentManager(),"Dialog");
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setTitle("CloseApp");
        builder.setMessage("Are you want to exit app ?");
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                finish();
            }
        });
        builder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                Toast.makeText(MainActivity.this,"Canceled",Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog dialog=builder.create();
        dialog.show();
    }
}