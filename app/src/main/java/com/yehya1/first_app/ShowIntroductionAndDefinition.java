package com.yehya1.first_app;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class ShowIntroductionAndDefinition extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_introduction_and_definition);


        Intent intent = getIntent();
        String titleContent = intent.getStringExtra("titleContent");
        String content = intent.getStringExtra("content");


        TextView editText = findViewById(R.id.showContent);
        editText.setMovementMethod(new ScrollingMovementMethod());

        editText.setText(content);
        Objects.requireNonNull(getSupportActionBar()).setTitle(titleContent);

    }
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id =item.getItemId();
        if (id == R.id.iconBack){
            Intent intent = new Intent(getApplicationContext() , ContentActivity.class);
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }
    */

}
