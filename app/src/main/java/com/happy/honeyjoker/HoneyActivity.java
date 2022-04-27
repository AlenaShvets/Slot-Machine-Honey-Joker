package com.happy.honeyjoker;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class HoneyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_honey);

        ImageButton starthoney = (ImageButton) findViewById(R.id.starthoney);
        starthoney.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent go = new Intent(HoneyActivity.this,Zaglushka.class);
                startActivity(go);
            }
        });
    }
}