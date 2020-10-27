package com.example.coffee;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {

    int quantity1 = 0, quantity2 = 0, quantity3 = 0, amount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment1(View view) {
        quantity1 = quantity1 + 1;
        displayQuantity1(quantity1);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement1(View view) {
        if (quantity1 > 0) {
            quantity1 = quantity1 - 1;
            displayQuantity1(quantity1);
        }
    }


    /**
     * This method is called when the plus button is clicked.
     */
    public void increment2(View view) {
        quantity2 = quantity2 + 1;
        displayQuantity2(quantity2);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement2(View view) {
        if (quantity2 > 0) {
            quantity2 = quantity2 - 1;
            displayQuantity2(quantity2);
        }
    }


    /**
     * This method is called when the plus button is clicked.
     */
    public void increment3(View view) {
        quantity3 = quantity3 + 1;
        displayQuantity3(quantity3);
    }

    /**
     * This method is called when the minus button is clicked.
     */
    public void decrement3(View view) {
        if (quantity3 > 0) {
            quantity3 = quantity3 - 1;
            displayQuantity3(quantity3);
        }
    }


    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayQuantity1(int num1) {
        TextView quantityTextView2 = (TextView) findViewById(R.id.quantity_text_view1);
        quantityTextView2.setText("" + num1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayQuantity2(int num2) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view2);
        quantityTextView.setText("" + num2);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    public void displayQuantity3(int num3) {
        TextView quantityTextView1 = (TextView) findViewById(R.id.quantity_text_view3);
        quantityTextView1.setText("" + num3);
    }

    public int submitOrder1(int quantity1, int quantity2, int quantity3) {
        int s = quantity1;
        s = s + quantity2;
        s = s + quantity3;
        return s;
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        int c1 = quantity1 * 5;
        int c2 = quantity2 * 7;
        int c3 = quantity3 * 9;
        amount = c1 + c2 + c3;
        String priceMessage = "TOTAL" + " $" + (amount) ;
        priceMessage = priceMessage + "\nTHANK YOU!";
        displayMessage(priceMessage);




    }


    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(NumberFormat.getCurrencyInstance().format(amount));

    }

}
