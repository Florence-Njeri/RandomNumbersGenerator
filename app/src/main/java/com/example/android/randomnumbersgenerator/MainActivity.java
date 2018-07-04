package com.example.android.randomnumbersgenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        randNum = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text

        TextView textView = findViewById(R.id.randomNumberB);
        textView.setText(randNum);*/
    }

    int randNum;

    /**
     * Math.random() simulates random numbers of type double between 0 to almost 1
     * @return
     */

    public int randomNumber() {
        double randomNumber;
        for (int i = 1; i <= 7; i++) {
            randomNumber = Math.random();//store generated number in randomNumer variable
           randomNumber *=7;//Expands range to 0 to almost num multiplied by
            randomNumber+=1; //Shifts range to start at (1-7)
            randNum = (int) randomNumber ;//cast random number of type double ta  to an integer
        }
        return randNum;//Returns the value of the generated random number integer

    }

    private void displayQuantity(int num) {
        TextView numberGenerated = (TextView) findViewById(R.id.randomNumber);
        //concatenates the number generated with the empty string setting it to the generated number
        numberGenerated.setText("" + num);

    }
    //This method is called when the user clicks the generate number button

    /**
     *
     * @param view this is the view object that was clicked
     */
    public void returnRandomNumber(View view) {
        randomNumber();
        displayQuantity(randNum);//Returns the value of the random number here for display
        Intent intent = new Intent(this, MainActivityB.class);
        TextView textView = (TextView) findViewById(R.id.randomNumber);
        intent.putExtra(Intent.EXTRA_TEXT,  randNum);
        startActivity(intent);
    }

    public class EXTRA_MESSAGE {
    }
}
