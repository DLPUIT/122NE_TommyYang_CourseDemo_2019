package cn.tommyyang.androiddemo1;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by tommy on 2018/10/25.
 */

public class TestActivity extends AppCompatActivity {

    TextView tv;
    EditText et1,et2;
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv = (TextView)findViewById(R.id.tv);
        //bt1 = (Button)findViewById(R.id.bt1);
        bt2 = (Button)findViewById(R.id.bt2);
        bt3 = (Button)findViewById(R.id.bt3);
        bt4 = (Button)findViewById(R.id.bt4);
    }

    public void add(View v){
//        Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();
        Double v1 = Double.parseDouble(et1.getText().toString());
        Double v2 = Double.parseDouble(et2.getText().toString());
        Toast.makeText(this, v1.toString(), Toast.LENGTH_SHORT).show();
        tv.setText(v1+v2+"");
        //tv.setText(et1.getText().toString());
    }
}
