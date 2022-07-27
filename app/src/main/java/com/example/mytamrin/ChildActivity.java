package com.example.mytamrin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.nio.channels.InterruptedByTimeoutException;

public class ChildActivity extends AppCompatActivity {
TextView Tv,tv1,tv2;
EditText Edittex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child);
        Tv= findViewById(R.id.Stext);
        tv1=findViewById(R.id.Stext1);
        tv2 = findViewById(R.id.Stext2);
        Edittex =findViewById(R.id.Edittex1);
        Button ChBtn = findViewById(R.id.ChildBtn);
        Bundle bl = getIntent().getExtras();
       String Tvv = bl.getString("Txt");
        Intent in = getIntent();
        String tvv1 = in.getStringExtra("Txt1");
        String Tvv2 = getIntent().getExtras().getString("Txt2");
        Tv.setText(Tvv);
        tv1.setText(tvv1);
        tv2.setText(Tvv2);
        ChBtn.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                Intent next = new Intent(getApplicationContext(),MainActivity.class);
                next.putExtra("Edit",Edittex.getText().toString());
                startActivity(next);

                return false;
            }
        });
    }
}