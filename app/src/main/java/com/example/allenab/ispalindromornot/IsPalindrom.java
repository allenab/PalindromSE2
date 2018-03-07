package com.example.allenab.ispalindromornot;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * This class provides a simple palindrome checker.
 */
public class IsPalindrom extends AppCompatActivity {

    private Button button; // the button which is used to trigger the palindrome method
    private EditText inputField; // the input field, where the user could insert his text
    private EditText outputField; // output field which shows the result


    /**
     * This method is triggered every time the application is started.
     *
     * @param savedInstanceState - the current instance
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_is_palindrom);


        //--------------------------
        // object initialization
        //--------------------------
        button = (Button) findViewById(R.id.checkButton);
        outputField = (EditText) findViewById(R.id.ausgabeFeld);
        inputField = (EditText) findViewById(R.id.inputField);


        //--------------------------
        // button functionality
        //--------------------------
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                boolean isPalindrome = false;


                //-----------------
                // error checking
                //-----------------
                if (inputField.getText().toString().isEmpty()){
                    inputField.setError("Geben Sie bitte ein Wort ein!");
                }
                else if (inputField.getText().toString().length() < 5){
                    inputField.setError("Länge des Wortes zu klein!");
                }
                else
                    isPalindrome = isPalindrome(inputField.getText().toString());

                outputField.setText(Boolean.toString(isPalindrome));
                //outputField.setText(""+isPalindrome); -> andere Möglichkeit einen String zu erstellen (""+{die Variable})
            }
        });
    }

    /**
     * This method is used to check whether the input string is a palindrome or not.
     * @param str - the input string which is fetched from the inputField
     * @return - true -> current input is a palindrome
     *           false -> current input isn't a palindrome
     */
    private boolean isPalindrome(String str){
        return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
    }


}
