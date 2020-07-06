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
    }

    public void feature1(View view){
        Toast.makeText(this, "功能1", Toast.LENGTH_SHORT).show();
    }

    public void feature2(View view){
        Toast.makeText(this, "功能2", Toast.LENGTH_SHORT).show();
    }

    public void feature5(View view){
        Toast.makeText(this, "功能5", Toast.LENGTH_SHORT).show();
    }

}
