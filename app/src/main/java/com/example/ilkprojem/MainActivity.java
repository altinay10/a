package com.example.ilkprojem;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.button);
        final EditText et = findViewById(R.id.editText);
        final TextView tv[] = new TextView[5];
        for(int i = 0; i<5; i++) {
            String abc = "textView"+(i);
            int a = getResources().getIdentifier(abc,"id",getPackageName());
            tv[i] = findViewById(a);
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = et.getText().toString();
                tv[count].setText(text);
                if(count != 4) {
                    count++;
                } else {
                    count = 0;
                }
            }                              
        });
    }
}