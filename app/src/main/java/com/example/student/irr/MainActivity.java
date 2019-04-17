package com.example.student.irr;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button cal;
    EditText p,n,pv;
    TextView irr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cal=(Button)findViewById(R.id.cal);
        p=(EditText) findViewById(R.id.p);
        n=(EditText)findViewById(R.id.n);
        pv=(EditText)findViewById(R.id.pv);
        irr=(TextView) findViewById(R.id.irr);
    }
    public void cal(View v){
        double P=Double.parseDouble(p.getText().toString());
        double PV=Double.parseDouble(pv.getText().toString());
        double N=Double.parseDouble(n.getText().toString());
        int IRR=(int)(((Math.pow(PV/P,1/N))-1)*10000);
        irr.setText(IRR/100.+"%");
    }
}
//int irr=(int)((Math.pow(pv/p,1/n)-1)*10000);