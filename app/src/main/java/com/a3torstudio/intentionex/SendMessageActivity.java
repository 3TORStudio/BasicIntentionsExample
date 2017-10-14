package com.a3torstudio.intentionex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SendMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_message);

        Intent intent = getIntent();
        String messageText = intent.getStringExtra("message");
        TextView messageView = (TextView) findViewById(R.id.message);
        messageView.setText(messageText);
    }
}
