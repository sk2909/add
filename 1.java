package com.example.app1;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.EditText;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText e1,e2,e3,e4,e5,e6;
    TextView tv1;
    Button b1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        e1=(EditText)findViewById(R.id.e1);
        e2=(EditText)findViewById(R.id.editTextText2);
        e3=(EditText)findViewById(R.id.editTextText3);
        e4=(EditText)findViewById(R.id.editTextText);
        e5=(EditText)findViewById(R.id.editTextText4);
        e6=(EditText)findViewById(R.id.editTextText5);
        tv1=(TextView)findViewById(R.id.textView2);
        b1=(Button)findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s1,s2,s3,s4,s5,s6;
                s1=e1.getText().toString();
                s2=e2.getText().toString();
                s3=e3.getText().toString();
                s4=e4.getText().toString();
                s5=e5.getText().toString();
                s6=e6.getText().toString();
                Float cgpa=(Float.parseFloat(s1)+Float.parseFloat(s2)+Float.parseFloat(s3)+Float.parseFloat(s4)+Float.parseFloat(s5)+Float.parseFloat(s6))/6;
                tv1.setText(String.valueOf(cgpa));
            }
        });

    }
}
