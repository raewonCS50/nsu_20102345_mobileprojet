package kr.co.company.nsu_20102345_project;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity7 extends Activity {
    TextView edit7_1, edit7_2;
    ImageView imageView7_1;
    Button btn7_1, btn7_2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        edit7_1 = (TextView) findViewById(R.id.textView7_1);
        edit7_2 = (TextView) findViewById(R.id.textView7_2);
        imageView7_1 = (ImageView) findViewById(R.id.imageView7_1);

        btn7_1 = (Button) findViewById(R.id.btn7_1);
        btn7_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(edit7_2.getText().toString()));
                startActivity(mIntent);
            }
        });

        btn7_2 = (Button) findViewById(R.id.btn7_2);
        btn7_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
