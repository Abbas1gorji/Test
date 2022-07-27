package com.example.mytamrin;

/*as برنامه ای بنویسید ک اطلاعات را از صفحه اول به صفحه دوم و از دوم به صفحه سوم و از صفحه سوم به صفحه اول
انتقال دهد !
 */

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {
TextView name,family,compani;
EditText Ename,Efamily,Ecompani;
Button button;
CheckBox Check;
int i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.Tx);
        family = findViewById(R.id.Tx1);
        compani = findViewById(R.id.Tx2);
        Ename = findViewById(R.id.Etx1);
        Efamily = findViewById(R.id.Etx2);
        Ecompani = findViewById(R.id.Etx);
        button = findViewById(R.id.Bt);
        Check = findViewById(R.id.checkBox);
        name.setText("name ");
        name.setTextColor(getResources().getColor(R.color.teal_200));
        Ename.setHint("Name");
       // Ename.setHintTextColor(getResources().getColor(R.color.purple_500));
        Efamily.setHint("Family");
        Ecompani.setHint("My Compani");
        Ename.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View v, boolean hasFocus) {
                Toast.makeText(MainActivity.this, "focus change", Toast.LENGTH_SHORT).show();
            }
        });
        Ename.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }



            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
              String set1 = Ename.getText().toString().trim();
                name.setText(set1);
              /*if (Ename.length()<=20 && Ename == "Abbas"){
                  for(i=0;i<Ename.length();i++){
                      name.setText(i);
                  }
              }else {
                  Toast.makeText(MainActivity.this, "Is Full", Toast.LENGTH_SHORT).show();
              }*/

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });





     /*   Check.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (buttonView.getId()== Check.getId()){
                 Ecompani.setEnabled(isChecked);
                }
            }
        });*/
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Ename!=null && family!= null){
                    Intent ints = new Intent(getApplicationContext(),SecendActivity.class);
                    ints.putExtra("Name",Ename.getText().toString());
                    ints.putExtra("Family",Efamily.getText().toString());
                    //if(Ecompani.getId()){
                    ints.putExtra("Company",Ecompani.getText().toString());
                    startActivity(ints);
                  //  }
                 //   startActivity(ints);
                }else{
                    Toast.makeText(getApplicationContext(),"not start ",Toast.LENGTH_LONG
                    ).show();
                }
            }


        });


    }

    @Override
    protected void onRestart() {
       /* String NEW = getIntent().getExtras().getString("Edittex");
        name.setText(NEW);
        family.setText(NEW);
        compani.setText(NEW);
        name.setTextColor(getResources().getColor(R.color.Yellow));
        family.setTextColor(getResources().getColor(R.color.Pink));
        compani.setTextColor(getResources().getColor(R.color.Blue));
     Toast.makeText(this,"onRestart",Toast.LENGTH_LONG).show();*/
        super.onRestart();
    }

    @Override
    protected void onResume() {
        onRestart();
        super.onResume();
    }

        }

    /* @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        return super.onCreateOptionsMenu(menu);
    }*/
