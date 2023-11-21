package kr.co.company.nsu_20102345_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity3 extends Activity {
    TextView edit3_1, edit3_2, edit3_3;
    ImageView imageView3_1, imageView3_2;
    Button btn3_1, btn3_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitiy_main3);
        edit3_1 = (TextView) findViewById(R.id.textView3_1);
        edit3_2 = (TextView) findViewById(R.id.textView3_2);
        edit3_3 = (TextView) findViewById(R.id.textView3_3);
        imageView3_1 = (ImageView) findViewById(R.id.imageView3_1);
        imageView3_2 = (ImageView) findViewById(R.id.imageView3_2);

        btn3_1 = (Button) findViewById(R.id.btn3_1);
        btn3_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit3_3.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn3_2 = (Button) findViewById(R.id.btn3_2);
        btn3_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}