package com.example.morsecode;

import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnconvert;
    EditText ettextt;
    ImageView share;
    TextView tvmorse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnconvert = findViewById(R.id.btnconvert);
        ettextt = findViewById(R.id.ettextt);
        tvmorse = findViewById(R.id.tvmorse);
        share = findViewById(R.id.share);


        btnconvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ettextt.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this,"all fields are required",Toast.LENGTH_SHORT).show();

                }
                else{

                    String textt = morse.abc(ettextt.getText().toString());
                    tvmorse.setText(textt);


                }
            }
        });

        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent sharingIntent = new Intent(android.content.Intent.ACTION_SEND);
                sharingIntent.setType("text/plain");
                String shareBody = tvmorse.getText().toString();


                sharingIntent.putExtra(android.content.Intent.EXTRA_TEXT, shareBody);
                startActivity(Intent.createChooser(sharingIntent, "Share Note Text using"));

            }
        });







    }
}
