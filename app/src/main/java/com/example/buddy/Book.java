package com.example.buddy;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Book extends AppCompatActivity {


    ImageView book_image;
    TextView book_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);

        Intent intent=getIntent();

        book_image=findViewById(R.id.book_image);
        book_name=findViewById(R.id.book_name);
  book_name.setText(intent.getExtras().getString("bookName"));
  book_image.setImageResource(intent.getExtras().getInt("bookImage"));
    }
}
