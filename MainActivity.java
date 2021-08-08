package com.tanu.simple_caculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText etn1;
    private EditText etn2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etn1 = (EditText) findViewById(R.id.etn1);
        etn2 = (EditText) findViewById(R.id.etn2);
        tvResult=(TextView)findViewById(R.id.tvResult);
    }

    public void btnsum(View view) {
//        if(etn1.getText().toString().trim().equals("") || etn2.getText().toString().trim().equals(""))
//        {
//            Toast toast=Toast.makeText(this,"Please enter both numbers",Toast.LENGTH_SHORT);
//            toast.show();
//            tvResult.setText("Result");
//        }
        if(etn1.getText().toString().trim().length()==0 || etn2.getText().toString().trim().length()==0)
        {
            Toast toast=Toast.makeText(this,"Please enter both numbers",Toast.LENGTH_SHORT);
            toast.show();
            tvResult.setText("Result");
        }
        else
        {
            int n1 = Integer.parseInt(etn1.getText().toString());
            int n2 = Integer.parseInt(etn2.getText().toString());
            int sum = n1+n2;
            tvResult.setText(String.valueOf(sum));
        }


    }

    public void btnsub(View view) {
        if(etn1.getText().toString().trim().length()==0 || etn2.getText().toString().trim().length()==0)
        {
            Toast toast=Toast.makeText(this,"Please enter both numbers",Toast.LENGTH_SHORT);
            toast.show();
            tvResult.setText("Result");
        }
        else
        {
            int n1 = Integer.parseInt(etn1.getText().toString());
            int n2 = Integer.parseInt(etn2.getText().toString());
            int sub = n1-n2;
            tvResult.setText(String.valueOf(sub));

        }

    }

    public void btnmulti(View view) {
        if(etn1.getText().toString().trim().length()==0 || etn2.getText().toString().trim().length()==0)
        {
            Toast toast=Toast.makeText(this,"Please enter both numbers",Toast.LENGTH_SHORT);
            toast.show();
            tvResult.setText("Result");
        }
        else
        {
            int n1 = Integer.parseInt(etn1.getText().toString());
            int n2 = Integer.parseInt(etn2.getText().toString());
            int mul = n1*n2;
            tvResult.setText(String.valueOf(mul));
        }

    }

    public void btndiv(View view) {
        if(etn1.getText().toString().trim().length()==0 || etn2.getText().toString().trim().length()==0)
        {
            Toast toast=Toast.makeText(this,"Please enter both numbers",Toast.LENGTH_SHORT);
            toast.show();
            tvResult.setText("Result");
        }
        else
        {
            int n1 = Integer.parseInt(etn1.getText().toString());
            int n2 = Integer.parseInt(etn2.getText().toString());
            if(n2==0)
            {
                Toast toast=Toast.makeText(this,"Cannot Divide by zero",Toast.LENGTH_SHORT);
                toast.show();
                tvResult.setText("Result");
            }
            else
            {
                int div = n1/n2;
                tvResult.setText(String.valueOf(div));
            }

        }


    }
}
