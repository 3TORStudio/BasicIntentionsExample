package com.a3torstudio.intentionex;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickNCA(View view){
        Intent intent = new Intent(this,NCA.class);
        startActivity(intent);
    }
    public void onClickSendMsg(View view){
        EditText messegeView = (EditText) findViewById(R.id.editText);
        String textToSend = messegeView.getText().toString();

        Intent intent = new Intent(this,SendMessageActivity.class);

        intent.putExtra("message",textToSend);
        startActivity(intent);
    }
}
