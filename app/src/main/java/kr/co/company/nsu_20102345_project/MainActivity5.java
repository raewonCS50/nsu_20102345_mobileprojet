package kr.co.company.nsu_20102345_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity5 extends Activity {
    TextView edit5_1, edit5_2, edit5_3;
    ImageView imageView5_1;
    Button btn5_1, btn5_2, btn5_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        edit5_1 = (TextView) findViewById(R.id.textView5_1);
        edit5_2 = (TextView) findViewById(R.id.textView5_2);
        edit5_3 = (TextView) findViewById(R.id.textView5_3);
        imageView5_1 = (ImageView) findViewById(R.id.imageView5_1);

        btn5_1 = (Button) findViewById(R.id.btn5_1);
        btn5_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit5_2.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn5_2 = (Button) findViewById(R.id.btn5_2);
        btn5_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit5_3.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn5_3 = (Button) findViewById(R.id.btn5_3);
        btn5_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}