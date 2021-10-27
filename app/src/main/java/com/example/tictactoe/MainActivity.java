package com.example.tictactoe;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


// Ok this is messy and redundant and need of refactoring soooo bad! I remembered using switches in Joes class so tried it here.
// Im not happy with the switch and all the breaks but it took me so long to remember how the switch worked and to get it working here.
// need to change the text so that it is in the strings.xml file
// need to figure out putting buttons in an array and pulling variables dynamically instead of hardcoded the way they are now...
// look forward to this changing for the next version and for clean up as I go. This is the messy version!

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private boolean playerXTurn;
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

        playerText.setText("Player X's Turn");
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        playerXTurn = true;
    }

    public void newGameOnClick(View view){
        clearButton();
    }

    @Override
    public void onClick(View view) {

        String emptyString = "";

        switch (view.getId()){
            case R.id.button1:
                if(emptyString.equals(button1.getText()) && playerXTurn){
                    button1.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button1.getText()) && !playerXTurn){
                    button1.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button2:
                if(emptyString.equals(button2.getText()) && playerXTurn){
                    button2.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button2.getText()) && !playerXTurn){
                    button2.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button3:
                if(emptyString.equals(button3.getText()) && playerXTurn){
                    button3.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button3.getText()) && !playerXTurn){
                    button3.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button4:
                if(emptyString.equals(button4.getText()) && playerXTurn){
                    button4.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button4.getText()) && !playerXTurn){
                    button4.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button5:
                if(emptyString.equals(button5.getText()) && playerXTurn){
                    button5.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button5.getText()) && !playerXTurn){
                    button5.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button6:
                if(emptyString.equals(button6.getText()) && playerXTurn){
                    button6.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button6.getText()) && !playerXTurn){
                    button6.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button7:
                if(emptyString.equals(button7.getText()) && playerXTurn){
                    button7.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button7.getText()) && !playerXTurn){
                    button7.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button8:
                if(emptyString.equals(button8.getText()) && playerXTurn){
                    button8.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button8.getText()) && !playerXTurn){
                    button8.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
            case R.id.button9:
                if(emptyString.equals(button9.getText()) && playerXTurn){
                    button9.setText("X");
                    playerText.setText("Player O's Turn");
                    playerXTurn = false;
                }
                if(emptyString.equals(button9.getText()) && !playerXTurn){
                    button9.setText("O");
                    playerText.setText("Player X's Turn");
                    playerXTurn = true;
                }
                break;
        }
    }
}