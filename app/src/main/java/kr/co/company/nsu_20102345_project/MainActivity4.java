package kr.co.company.nsu_20102345_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity4 extends Activity {
    TextView edit4_1, edit4_2;
    ImageView imageView4_1;
    Button btn4_1, btn4_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        edit4_1 = (TextView) findViewById(R.id.textView4_1);
        edit4_2 = (TextView) findViewById(R.id.textView4_2);
        imageView4_1 = (ImageView) findViewById(R.id.imageView4_1);

        btn4_1 = (Button) findViewById(R.id.btn4_1);
        btn4_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit4_2.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn4_2 = (Button) findViewById(R.id.btn4_2);
        btn4_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}