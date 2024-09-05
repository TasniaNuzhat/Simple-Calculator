package com.example.assignment;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;



public class CalculatorActivity extends AppCompatActivity implements View.OnClickListener {
 Button buttonAdd,buttonSub,buttonMul,buttonDiv;
 EditText editTextN1,editTextN2;
 TextView textView;

 int num1,num2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        buttonAdd=findViewById(R.id.addbtn);
        buttonSub=findViewById(R.id.subbtn);
        buttonMul=findViewById(R.id.multiplybtn);
        buttonDiv=findViewById(R.id.divbtn);
        editTextN1=findViewById(R.id.num1);
        editTextN2=findViewById(R.id.num2);
        textView=findViewById(R.id.result);

        buttonAdd.setOnClickListener(this);
        buttonSub.setOnClickListener(this);
        buttonMul.setOnClickListener(this);
        buttonDiv.setOnClickListener(this);

    }
public int getIntFromEditText(EditText editText){
    if(editText.getText().toString().equals(""))
    {
        Toast.makeText(this, "Enter number", Toast.LENGTH_SHORT).show();
        return 0;
    }
    else
   return Integer.parseInt(editText.getText().toString());
}


    @Override
    public void onClick(View view) {
        num1 = getIntFromEditText(editTextN1);
        num2 = getIntFromEditText(editTextN2);
        if (view.getId() == R.id.addbtn) {
            textView.setText("Answer = " + (num1 + num2));
        } else if (view.getId() == R.id.subbtn) {
            textView.setText("Answer = " + (num1 - num2));
        } else if (view.getId() == R.id.multiplybtn) {
            textView.setText("Answer = " + (num1 * num2));
        } else if (view.getId() == R.id.divbtn) {
            if (num2 != 0) {
                textView.setText("Answer = " + ((float)num1 /(float) num2));
            } else {
                Toast.makeText(this, "Cannot divide by zero", Toast.LENGTH_SHORT).show();
            }
        }
    }

    }