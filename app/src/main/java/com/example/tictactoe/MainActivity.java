package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean playerXTurn;
    private String emptyString;
    private TextView playerText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set up player turn variable
        playerXTurn = true;

        // set up variable for empty string
        emptyString = "";

        // set up buttons and text field

        playerText = findViewById(R.id.txtPlayerTurn);

        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);

        // set up onClickListener
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);


    }

    private void clearButton() {

        playerText.setText(R.string.xPLayer);
        button1.setText(emptyString);
        button2.setText(emptyString);
        button3.setText(emptyString);
        button4.setText(emptyString);
        button5.setText(emptyString);
        button6.setText(emptyString);
        button7.setText(emptyString);
        button8.setText(emptyString);
        button9.setText(emptyString);
        playerXTurn = true;
    }

    public void newGameOnClick(View view){
        clearButton();
    }

    public void playerX(){
        playerText.setText(R.string.xPLayer);
        playerXTurn = true;
    }
    public void playerO(){
        playerText.setText(R.string.oPLayer);
        playerXTurn = false;
    }

    @Override
    public void onClick(View view) {

        Button clickedButton = (Button) findViewById(view.getId());

        if(emptyString.contentEquals(clickedButton.getText()) && playerXTurn){
            clickedButton.setText(R.string.X);
            playerO();
        }
        if(emptyString.contentEquals(clickedButton.getText()) && !playerXTurn){
            clickedButton.setText(R.string.O);
            playerX();
        }
    }
}