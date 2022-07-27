package com.example.mytamrin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecendActivity extends AppCompatActivity {
TextView Tv,Tv1,Tv2;
Button Btnext,Btback;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secend);
        Tv = findViewById(R.id.textView2);
        Tv1 = findViewById(R.id.textView3);
        Tv2 = findViewById(R.id.textView4);
        Btback= findViewById(R.id.BtBack);
        Btnext = findViewById(R.id.BtNext);
        String st = getIntent().getExtras().getString("Company");
        String st1 = getIntent().getExtras().getString("Name");
        String st2 = getIntent().getExtras().getString("Family");
        //Intent nt = getIntent();
       // String st = nt.getStringExtra("name");
        Tv.setText(st);
        //Bundle bun = getIntent().getExtras();
       // String st1 = bun.getString("family");
        Tv1.setText(st1);
        //String st2 = getIntent().getExtras().getString("compani");
        Tv2.setText(st2);
      //  ------------------------------------------------------

        Btnext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Next = new Intent(getApplicationContext(),ChildActivity.class);
             Next.putExtra("Txt",Tv.getText().toString());
             Next.putExtra("Txt1",Tv1.getText().toString());
             Next.putExtra("Txt2",Tv2.getText().toString());
             startActivity(Next);
            }
        });
        Btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Back = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(Back);
            }
        });


    }

    @Override
    protected void onStart() {
        Btnext.setText("Next");
        Btback.setText("Back");
        super.onStart();
    }
}