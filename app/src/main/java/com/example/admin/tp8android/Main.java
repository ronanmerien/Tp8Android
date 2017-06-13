package com.example.admin.tp8android;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void send(View view) {
        String numero = ((TextView)findViewById(R.id.numero)).getText().toString();
        String text = ((TextView)findViewById(R.id.text)).getText().toString();
        String uri = "smsto:" + numero;
        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.parse(uri));
        intent.putExtra("sms_body", text);
        startActivity(intent);
    }
}