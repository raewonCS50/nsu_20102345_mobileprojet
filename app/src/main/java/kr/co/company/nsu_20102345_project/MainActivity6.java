package kr.co.company.nsu_20102345_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity6 extends Activity {
    TextView edit6_1, edit6_2, edit6_3;
    ImageView imageView6_1;
    Button btn6_1, btn6_2, btn6_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        edit6_1 = (TextView) findViewById(R.id.textView6_1);
        edit6_2 = (TextView) findViewById(R.id.textView6_2);
        edit6_3 = (TextView) findViewById(R.id.textView6_3);
        imageView6_1 = (ImageView) findViewById(R.id.imageView6_1);

        btn6_1 = (Button) findViewById(R.id.btn6_1);
        btn6_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit6_2.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn6_2 = (Button) findViewById(R.id.btn6_2);
        btn6_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit6_3.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn6_3 = (Button) findViewById(R.id.btn6_3);
        btn6_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}