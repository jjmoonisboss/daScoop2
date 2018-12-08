package com.teamdege.andriod.dascoop2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


/**
 * This app displays an order form to order ice cream.
 */
public class MainActivity extends Activity {
    int numberOfScoops = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
        display(numberOfScoops);
        displayPrice(numberOfScoops * 2);
    }

    public String buyItems(String item, int quantity) {
        //Sends a message from a Player to a Shopkeeper to purchase items

        String message = "Hello shopkeeper, I would like to buy" + quantity + " " + item + " please";
        return message;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(int number) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText("$" + number);
    }

        public void increase(View view) {

            numberOfScoops = numberOfScoops + 1;
            display(numberOfScoops);
    }

    public void decrease(View view) {
        numberOfScoops = numberOfScoops - 1;
        display(numberOfScoops);
    }

}
 public void checkBox () {

 }

