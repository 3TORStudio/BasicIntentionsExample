package com.a3torstudio.intentionex;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent = getIntent();
        String backMessage = intent.getStringExtra("BackMessage");

        TextView messageView = (TextView) findViewById(R.id.textBM);
        messageView.setText(backMessage);
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

    public void onClickReceiveMsg(View view){
        Intent intent = new Intent(this,SendBackActivity.class);
        startActivity(intent);
    }

    public void onClickOpenUrl(View view){
        Uri url = Uri.parse("http://3tor.pl");
        Intent intent = new Intent(Intent.ACTION_VIEW,url);
        startActivity(intent);
    }

    public void onClickSendSMS(View view){
        EditText viewTextOfSms = (EditText)findViewById(R.id.smsText);
        String textOfSms = viewTextOfSms.getText().toString();

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setType("text/plain");
        intent.putExtra(Intent.EXTRA_TEXT,textOfSms);

        String chooserTitle = getString(R.string.choser);
        Intent chosenIntent = Intent.createChooser(intent,chooserTitle);
        startActivity(chosenIntent);

        //startActivity(intent);

    }
}
