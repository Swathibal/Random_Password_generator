package com.example.randompasswordgenerator;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    static char[] SYMBOLS = "^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static char[] LOWERCASE = "abcdefghijklmnopqrstuvwxyz".toCharArray();
    static char[] UPPERCASE = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
    static char[] NUMBERS = "0123456789".toCharArray();
    static char[] ALL_CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789^$*.[]{}()?-\"!@#%&/\\,><':;|_~`".toCharArray();
    static Random rand = new SecureRandom();



    public void getPassword(View view) {

        EditText editText = (EditText) findViewById(R.id.getLength);
        int length = Integer.parseInt(editText.getText().toString());
        TextView txt = (TextView) findViewById(R.id.textpassword);

        if (length >= 4) {
            char[] password = new char[length];

            //get the requirements out of the way
            password[0] = LOWERCASE[rand.nextInt(LOWERCASE.length)];
            password[1] = UPPERCASE[rand.nextInt(UPPERCASE.length)];
            password[2] = NUMBERS[rand.nextInt(NUMBERS.length)];
            password[3] = SYMBOLS[rand.nextInt(SYMBOLS.length)];

            //populate rest of the password with random chars
            for (int i = 4; i < length; i++) {
                password[i] = ALL_CHARS[rand.nextInt(ALL_CHARS.length)];
            }

            List<String> letters = Arrays.asList(String.valueOf(password));
            Collections.shuffle(letters);
            String shuffled = "";
            for (String letter : letters) {
                shuffled += letter;
            }


            txt.setText(shuffled);
        }
        else
            txt.setText("Enter length greater than 4");

    }

}