package com.example.karen.test3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button myFirstButton = (Button) findViewById(R.id.send);
        myFirstButton.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
               String url="";
               EditText editText1 =(EditText)findViewById(R.id.url);
               url=editText1.getText().toString();
               Intent intent = new Intent(Intent.ACTION_VIEW);
               intent.setData(Uri.parse(url));
               startActivity(intent);
           }
        });
    }
}
