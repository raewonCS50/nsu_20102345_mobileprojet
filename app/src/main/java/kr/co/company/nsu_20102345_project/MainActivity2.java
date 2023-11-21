package kr.co.company.nsu_20102345_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity2 extends Activity {

    TextView edit2_1, edit2_2, edit2_3;
    ImageView imageView2_1, imageView2_2;
    Button btn2_1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        edit2_1 = (TextView) findViewById(R.id.textView2_1);
        edit2_2 = (TextView) findViewById(R.id.textView2_2);
        edit2_3 = (TextView) findViewById(R.id.textView2_3);
        btn2_1 = (Button) findViewById(R.id.btn2_1);

        imageView2_1 = (ImageView) findViewById(R.id.imageView2_1);
        imageView2_2 = (ImageView) findViewById(R.id.imageView2_2);

        Button btn2_2 = (Button) findViewById(R.id.btn2_2);
        btn2_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        btn2_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit2_3.getText().toString()));
                startActivity(mIntent);
            }
        });

    }
}