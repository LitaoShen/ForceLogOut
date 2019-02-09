package com.example.litaos.forcelogout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button forceLogOut = (Button) findViewById(R.id.force_log_out);
        forceLogOut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent("com.example.litaos.forcelogout.FORCE_LOG_OUT");
                sendBroadcast(intent);
            }
        });
    }
}
