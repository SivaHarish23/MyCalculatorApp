package com.example.mycalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import javax.script.ScriptEngineManager;
import javax.script.ScriptEngine;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {

    Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btnPlus,btnMinus,btnDiv,btnMul,btnDot,btnDel,btnEqual,btnClear,btnPercent;
    TextView tvOutput, tvInput;
    String process;
    boolean checkBracket = false;
    double result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);

        btnPlus = findViewById(R.id.btnPlus);
        btnMinus = findViewById(R.id.btnMinus);
        btnDiv = findViewById(R.id.btnDiv);
        btnMul = findViewById(R.id.btnMul);

        btnEqual = findViewById(R.id.btnEqual);

        btnDot = findViewById(R.id.btnDOt);
        btnClear = findViewById(R.id.btnClear);
        btnPercent = findViewById(R.id.btnPercent);
        btnDel = findViewById(R.id.btnBracket);

        tvInput = findViewById(R.id.textInput);
        tvOutput = findViewById(R.id.textOutput);

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvInput.setText("");
                tvOutput.setText("");
                process="";
            }
        });

        btn0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"0");

            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"1");
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"2");
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"3");
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"4");
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"5");
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"6");
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"7");
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"8");
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"9");
            }
        });

        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"+");
            }
        });

        btnMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"-");
            }
        });

        btnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"x");
            }
        });

        btnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"÷");
            }
        });

        btnDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+".");
            }
        });

        btnPercent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((tvInput.getText()=="Input")&&(tvOutput.getText()=="Output"))
                {
                    tvOutput.setText("");
                    tvInput.setText("");
                }
                process = tvInput.getText().toString();
                tvInput.setText(process+"%");
            }
        });

        btnDel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                try
                {
                    String u= (String) tvInput.getText();
                    int i,n=u.length();
                    String re="";

                    for(i=0;i<n-1;i++)
                    {
                        re+= u.charAt(i);
                    }
                    u = re;
                    tvInput.setText(u);
                }
                catch (Exception e)
                {
                    tvInput.setText("");
                    tvOutput.setText("");
                }

            }
        });

        btnEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                process = tvInput.getText().toString();
                process = process.replaceAll("%","/100" );
                process = process.replaceAll("÷","/" );
                process = process.replaceAll("x","*" );

                try {

                    ScriptEngine engine = new ScriptEngineManager().getEngineByName("rhino");

                     result =(double) engine.eval(process);
                    String finalresult = new Double(result).toString();
                    int y= finalresult.indexOf(".");
                    int p= finalresult.length();
                    String ret= finalresult.substring(y+1,p);

                    if(ret.equals("0"))
                    {
                        tvOutput.setText(finalresult.substring(0, y ));
                    }
                    else
                    {
                        tvOutput.setText(finalresult);
                    }
                }
                catch(Exception e)
                {
                    String s = e.toString();
                    Toast.makeText(getApplicationContext(),s, Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
