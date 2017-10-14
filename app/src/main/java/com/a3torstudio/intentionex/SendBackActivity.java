package com.a3torstudio.intentionex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SendBackActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_send_back);
    }

    public void onClickSendBack(View view){
        EditText textView = (EditText)findViewById(R.id.messageSB);
        String textToSend = textView.getText().toString();

        Intent intent = new Intent(this,MainActivity.class);
        intent.putExtra("BackMessage",textToSend);

        startActivity(intent);
    }
}
