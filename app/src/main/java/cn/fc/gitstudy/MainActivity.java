package cn.fc.gitstudy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feature1(v);
            }
        });

        findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feature2(v);
            }
        });
        findViewById(R.id.button4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fun4(v);
            }
        });
    }

    private void fun4(View v) {
        Toast.makeText(this, "我是功能4", Toast.LENGTH_SHORT).show();

        findViewById(R.id.button3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feature3(v);
            }
        });

        findViewById(R.id.button5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                feature5(v);
            }
        });
    }

    public void feature1(View view){
        Toast.makeText(this, "功能1", Toast.LENGTH_SHORT).show();
    }

    public void feature2(View view){
        Toast.makeText(this, "功能2", Toast.LENGTH_SHORT).show();
    }

    public void feature3(View view) {
        Toast.makeText(this, "功能3", Toast.LENGTH_SHORT).show();
    }
    public void feature5(View view){
        Toast.makeText(this, "功能5", Toast.LENGTH_SHORT).show();
    }

}
