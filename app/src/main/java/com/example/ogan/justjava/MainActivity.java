package com.example.ogan.justjava;

import java.text.NumberFormat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int quantity = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display(quantity);
        displayPrice(quantity);

    }

    public void submitOrder(View view){

        int price = (quantity * 5);
        String message = "Total: " + "$" + price + "\nThank you!";
        displayMessage(message);
        //Toast.makeText(getApplicationContext(), "You have ordered " + quantity + " coffee(s)", Toast.LENGTH_LONG).show();

    }

    public void increment(View view){

        quantity = quantity + 1;
        display(quantity);
        displayPrice(quantity * 5);

    }

    public void decrement(View view){

        if(quantity != 0) {

            quantity = quantity - 1;
            display(quantity);
            displayPrice(quantity * 5);

        }

    }

    public void display(int number){

        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);

    }

    public void displayPrice(int number){

        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(number));

    }

    public void displayMessage(String string){
        TextView textView = (TextView) findViewById(R.id.price_text_view);
        textView.setText(string);
    }
}
