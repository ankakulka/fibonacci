package com.annakulczycka.fibonacci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int addNumber = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        // initialize and cast
    final TextView counter = (TextView) findViewById(R.id.myNum);

        Button plusOne = (Button) findViewById(R.id.addNumbButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //HERE ADD CODE TO MAKE YOUR BUTTON DO SOMETHING
                addNumber += addNumber;
                counter.setText(""+ addNumber);
                //counter.setText("" + addNumber);

            }
        };

        plusOne.setOnClickListener(listener);





    }
}
