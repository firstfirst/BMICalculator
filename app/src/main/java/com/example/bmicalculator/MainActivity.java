package com.example.bmicalculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.bmicalculator.Model.Human;

public class MainActivity extends AppCompatActivity {
       // Human h=new Human();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        String height="";
        String weight="";
        final EditText eh=(EditText) findViewById(R.id.editText_H);
        //String.valueOf(height);
        final EditText ew=(EditText) findViewById(R.id.editText_W);
        //weight=ew.toString();

        Button bt=(Button) findViewById(R.id.button_cal);
        //final String finalHeight = height;
        //final String finalWeight = weight;
        final String finalHeight = height;
        final String finalWeight = weight;
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





                Intent intent=new Intent(MainActivity.this,acc.class);
                if(String.valueOf(eh.getText()).length()==0||finalWeight.length()==0) {
                    AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);

                    dialog.setTitle("ผิดพลาด");
                    dialog.setMessage("ป้อนข้อมูลไม่ครบ");
                    dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            finish();
                        }
                    });
                }

                    // Intent intent2=new Intent(MainActivity.this,Human.class);
                    //intent.putExtra("CALCULATE",h.setH(height));
                    //intent.putExtra("CALCULATE",h.setW(finalWeight));
                    //intent.putExtra("CALCULATE",h.getBMI());
                    intent.putExtra("text", eh.getText());
                    intent.putExtra("text", ew.getText());
                    intent.putExtra("num", (Double.parseDouble(String.valueOf(eh.getText())) * Double.parseDouble(String.valueOf(ew.getText()))));

                    // intent.putExtra("CALCULATE",h.getstatus());
                    startActivity(intent);

                }
        });
    }
}
