package com.example.admin.scriptureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "com.example.admin.scriptureapp.MESSAGE";
    public final static String EXTRA_MESSAGE2 = "com.example.admin.scriptureapp.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "com.example.admin.scriptureapp.MESSAGE3";
                // These above are the different items

    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.edit_message);
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);
        EditText editText3 = (EditText) findViewById(R.id.edit_message3);

        assert editText != null;
        String book = editText.getText().toString();
        String chapter = editText2.getText().toString();
        String verse = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, book);
        intent.putExtra(EXTRA_MESSAGE2, chapter);
        intent.putExtra(EXTRA_MESSAGE3, verse);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
