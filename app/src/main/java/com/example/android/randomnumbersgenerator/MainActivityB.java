package com.example.android.randomnumbersgenerator;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivityB extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_b);
        // Get the Intent that started this activity and extract the string
       /* Intent intent = getIntent();
      numberCast = intent.getStringExtra(MainActivityB.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.randomNumberB);
        textView.setText(numberCast);
*/
    }



    private void displayQuantity(int number) {
        TextView numberGenerated = (TextView) findViewById(R.id.randomNumberB);
        //concatenates the number generated with the empty string setting it to the generated number
        numberGenerated.setText("" + number);

    }
    int numberCast;
    public int generatorActivityB(){
        double numberRandom;
        for (int i=1;1<=7;i++){
            numberRandom=Math.random();
            numberRandom*=7;
            numberRandom+=1;
            numberCast=(int) numberRandom;
            return numberCast;
        }

    }
    public void onClickB(View view){
        generatorActivityB();
        displayQuantity(numberCast);
        Intent intent = new Intent(this, MainActivity.class);
        TextView textView = (TextView) findViewById(R.id.randomNumberB);
        intent.putExtra(Intent.EXTRA_TEXT,  numberCast);
        startActivity(intent);
    }

    public class EXTRA_MESSAGE {
    }
}
