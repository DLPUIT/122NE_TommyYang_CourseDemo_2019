package cn.tommyyang.androiddemo1;

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

//实现了Button监听点击事件的4种方式
public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    //html
    TextView tv;
    EditText et1, et2;
    Button bt1, bt2, bt3, bt4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        et1 = (EditText) findViewById(R.id.et1);
        et2 = (EditText) findViewById(R.id.et2);
        tv = (TextView) findViewById(R.id.tv);
        bt1 = (Button) findViewById(R.id.bt1);
        bt2 = (Button) findViewById(R.id.bt2);
        bt3 = (Button) findViewById(R.id.bt3);
        bt4 = (Button) findViewById(R.id.bt4);


        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //值类型 引用类型
                double v1 = Double.parseDouble(et1.getText().toString());
                double v2 = Double.parseDouble(et2.getText().toString());
                tv.setText(v1 - v2 + "");
            }
        });

        bt3.setOnClickListener(new MyListener());

        bt4.setOnClickListener(this);
    }

    public void add(View v) {
//        Toast.makeText(this, "aaaa", Toast.LENGTH_SHORT).show();
        Double v1 = Double.parseDouble(et1.getText().toString());
        Double v2 = Double.parseDouble(et2.getText().toString());
        Toast.makeText(this, v1.toString(), Toast.LENGTH_SHORT).show();
        tv.setText(v1 + v2 + "");
        //tv.setText(et1.getText().toString());
    }

    public void log(View v){
        Double v1 = Double.parseDouble(et1.getText().toString());
        Double v2 = Double.parseDouble(et2.getText().toString());
        tv.setText(Math.log10(v1+v2) + "");
    }

    @Override
    public void onClick(View view) {
        double v1 = Double.parseDouble(et1.getText().toString());
        double v2 = Double.parseDouble(et2.getText().toString());
        tv.setText(v1 / v2 + "");
    }


    private class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View view) {
            double v1 = Double.parseDouble(et1.getText().toString());
            double v2 = Double.parseDouble(et2.getText().toString());
            tv.setText(v1 * v2 + "");
        }

    }
}
