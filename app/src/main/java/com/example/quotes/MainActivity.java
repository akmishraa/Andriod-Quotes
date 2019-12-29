package com.example.quotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button quoteButton;
    private TextView quoteTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        quoteTextView =findViewById(R.id.quoteText);
        quoteButton= findViewById(R.id.showQuoteButton);

        quoteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                QuoteServer quoteServer =new QuoteServer();

                quoteTextView.setText(quoteServer.getRandomQuote());
                System.out.println("Hello");

            }
        });
    }



}


