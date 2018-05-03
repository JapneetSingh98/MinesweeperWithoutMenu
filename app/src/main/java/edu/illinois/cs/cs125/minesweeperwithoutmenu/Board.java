package edu.illinois.cs.cs125.minesweeperwithoutmenu;

import android.os.Bundle;

import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.os.Vibrator;

public class Board extends AppCompatActivity {

    int percent = 15;
    int currentScore = 0;
    private Vibrator myVib;

    Button easy;
    Button medium;
    Button hard;
    Button extreme;
    TextView message;
    TextView s;
    TextView mR;
    TextView areYouSure;
    Button yes;
    Button no;
    Button flag;
    Button reset;
    Button r1c1;
    Button r1c2;
    Button r1c3;
    Button r1c4;
    Button r1c5;
    Button r1c6;
    Button r1c7;
    Button r1c8;
    Button r1c9;
    Button r1c10;
    Button r2c1;
    Button r2c2;
    Button r2c3;
    Button r2c4;
    Button r2c5;
    Button r2c6;
    Button r2c7;
    Button r2c8;
    Button r2c9;
    Button r2c10;
    Button r3c1;
    Button r3c2;
    Button r3c3;
    Button r3c4;
    Button r3c5;
    Button r3c6;
    Button r3c7;
    Button r3c8;
    Button r3c9;
    Button r3c10;
    Button r4c1;
    Button r4c2;
    Button r4c3;
    Button r4c4;
    Button r4c5;
    Button r4c6;
    Button r4c7;
    Button r4c8;
    Button r4c9;
    Button r4c10;
    Button r5c1;
    Button r5c2;
    Button r5c3;
    Button r5c4;
    Button r5c5;
    Button r5c6;
    Button r5c7;
    Button r5c8;
    Button r5c9;
    Button r5c10;
    Button r6c1;
    Button r6c2;
    Button r6c3;
    Button r6c4;
    Button r6c5;
    Button r6c6;
    Button r6c7;
    Button r6c8;
    Button r6c9;
    Button r6c10;
    Button r7c1;
    Button r7c2;
    Button r7c3;
    Button r7c4;
    Button r7c5;
    Button r7c6;
    Button r7c7;
    Button r7c8;
    Button r7c9;
    Button r7c10;
    Button r8c1;
    Button r8c2;
    Button r8c3;
    Button r8c4;
    Button r8c5;
    Button r8c6;
    Button r8c7;
    Button r8c8;
    Button r8c9;
    Button r8c10;
    Button r9c1;
    Button r9c2;
    Button r9c3;
    Button r9c4;
    Button r9c5;
    Button r9c6;
    Button r9c7;
    Button r9c8;
    Button r9c9;
    Button r9c10;
    Button r10c1;
    Button r10c2;
    Button r10c3;
    Button r10c4;
    Button r10c5;
    Button r10c6;
    Button r10c7;
    Button r10c8;
    Button r10c9;
    Button r10c10;
    final int[][] board = new int[10][10];
    int numMines = 0;
    int minesRemaining;
    boolean flagging;
    boolean gameOver = false;


    public void gO(boolean state) {
        if (state) {
            gameOver = true;
            flag.setEnabled(false);
            currentScore--;
            s.setText(String.valueOf(currentScore));
            message.setText("Game Over!");
            myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
            myVib.vibrate(300);
            disableGrid();
        }
    }
    public void checkIfOver() {
        if (currentScore == 100 - numMines) {
            gameOver = true;
            message.setText("You Won!");
            myVib = (Vibrator) this.getSystemService(VIBRATOR_SERVICE);
            myVib.vibrate(1000);
        }
    }


    void setup() {

        r1c1 = findViewById(R.id.R1C1);
        r1c2 = findViewById(R.id.R1C2);
        r1c3 = findViewById(R.id.R1C3);
        r1c4 = findViewById(R.id.R1C4);
        r1c5 = findViewById(R.id.R1C5);
        r1c6 = findViewById(R.id.R1C6);
        r1c7 = findViewById(R.id.R1C7);
        r1c8 = findViewById(R.id.R1C8);
        r1c9 = findViewById(R.id.R1C9);
        r1c10 = findViewById(R.id.R1C10);
        r2c1 = findViewById(R.id.R2C1);
        r2c2 = findViewById(R.id.R2C2);
        r2c3 = findViewById(R.id.R2C3);
        r2c4 = findViewById(R.id.R2C4);
        r2c5 = findViewById(R.id.R2C5);
        r2c6 = findViewById(R.id.R2C6);
        r2c7 = findViewById(R.id.R2C7);
        r2c8 = findViewById(R.id.R2C8);
        r2c9 = findViewById(R.id.R2C9);
        r2c10 = findViewById(R.id.R2C10);
        r3c1 = findViewById(R.id.R3C1);
        r3c2 = findViewById(R.id.R3C2);
        r3c3 = findViewById(R.id.R3C3);
        r3c4 = findViewById(R.id.R3C4);
        r3c5 = findViewById(R.id.R3C5);
        r3c6 = findViewById(R.id.R3C6);
        r3c7 = findViewById(R.id.R3C7);
        r3c8 = findViewById(R.id.R3C8);
        r3c9 = findViewById(R.id.R3C9);
        r3c10 = findViewById(R.id.R3C10);
        r4c1 = findViewById(R.id.R4C1);
        r4c2 = findViewById(R.id.R4C2);
        r4c3 = findViewById(R.id.R4C3);
        r4c4 = findViewById(R.id.R4C4);
        r4c5 = findViewById(R.id.R4C5);
        r4c6 = findViewById(R.id.R4C6);
        r4c7 = findViewById(R.id.R4C7);
        r4c8 = findViewById(R.id.R4C8);
        r4c9 = findViewById(R.id.R4C9);
        r4c10 = findViewById(R.id.R4C10);
        r5c1 = findViewById(R.id.R5C1);
        r5c2 = findViewById(R.id.R5C2);
        r5c3 = findViewById(R.id.R5C3);
        r5c4 = findViewById(R.id.R5C4);
        r5c5 = findViewById(R.id.R5C5);
        r5c6 = findViewById(R.id.R5C6);
        r5c7 = findViewById(R.id.R5C7);
        r5c8 = findViewById(R.id.R5C8);
        r5c9 = findViewById(R.id.R5C9);
        r5c10 = findViewById(R.id.R5C10);
        r6c1 = findViewById(R.id.R6C1);
        r6c2 = findViewById(R.id.R6C2);
        r6c3 = findViewById(R.id.R6C3);
        r6c4 = findViewById(R.id.R6C4);
        r6c5 = findViewById(R.id.R6C5);
        r6c6 = findViewById(R.id.R6C6);
        r6c7 = findViewById(R.id.R6C7);
        r6c8 = findViewById(R.id.R6C8);
        r6c9 = findViewById(R.id.R6C9);
        r6c10 = findViewById(R.id.R6C10);
        r7c1 = findViewById(R.id.R7C1);
        r7c2 = findViewById(R.id.R7C2);
        r7c3 = findViewById(R.id.R7C3);
        r7c4 = findViewById(R.id.R7C4);
        r7c5 = findViewById(R.id.R7C5);
        r7c6 = findViewById(R.id.R7C6);
        r7c7 = findViewById(R.id.R7C7);
        r7c8 = findViewById(R.id.R7C8);
        r7c9 = findViewById(R.id.R7C9);
        r7c10 = findViewById(R.id.R7C10);
        r8c1 = findViewById(R.id.R8C1);
        r8c2 = findViewById(R.id.R8C2);
        r8c3 = findViewById(R.id.R8C3);
        r8c4 = findViewById(R.id.R8C4);
        r8c5 = findViewById(R.id.R8C5);
        r8c6 = findViewById(R.id.R8C6);
        r8c7 = findViewById(R.id.R8C7);
        r8c8 = findViewById(R.id.R8C8);
        r8c9 = findViewById(R.id.R8C9);
        r8c10 = findViewById(R.id.R8C10);
        r9c1 = findViewById(R.id.R9C1);
        r9c2 = findViewById(R.id.R9C2);
        r9c3 = findViewById(R.id.R9C3);
        r9c4 = findViewById(R.id.R9C4);
        r9c5 = findViewById(R.id.R9C5);
        r9c6 = findViewById(R.id.R9C6);
        r9c7 = findViewById(R.id.R9C7);
        r9c8 = findViewById(R.id.R9C8);
        r9c9 = findViewById(R.id.R9C9);
        r9c10 = findViewById(R.id.R9C10);
        r10c1 = findViewById(R.id.R10C1);
        r10c2 = findViewById(R.id.R10C2);
        r10c3 = findViewById(R.id.R10C3);
        r10c4 = findViewById(R.id.R10C4);
        r10c5 = findViewById(R.id.R10C5);
        r10c6 = findViewById(R.id.R10C6);
        r10c7 = findViewById(R.id.R10C7);
        r10c8 = findViewById(R.id.R10C8);
        r10c9 = findViewById(R.id.R10C9);
        r10c10 = findViewById(R.id.R10C10);
        flag = findViewById(R.id.flag);
        reset = findViewById(R.id.reset);
        areYouSure = findViewById(R.id.areYouSure);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        message = (TextView)findViewById(R.id.message);
        s = (TextView)findViewById(R.id.score);
        mR = (TextView)findViewById(R.id.mines);
        easy = findViewById(R.id.easy);
        medium = findViewById(R.id.medium);
        hard = findViewById(R.id.hard);
        extreme = findViewById(R.id.extreme);
        flagging = false;
    }
    void createBoard() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                board[i][j] = 0;
            }
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                if (Math.random() * 100 < percent) { //change 15 to variable name once we figure it out
                    board[i][j] = -1;  //negative number indicates mine
                    numMines++;

                    if (i > 0 && j > 0) {  //top left
                        if (board[i - 1][j - 1] >= 0) { //checks to see if spot is a mine
                            board[i - 1][j - 1]++;
                        }
                    }

                    if (j > 0) {           //top
                        if (board[i][j - 1] >= 0) { //checks to see if spot is a mine
                            board[i][j - 1]++;
                        }
                    }

                    if (i < 9 && j > 0) {  //top right
                        if (board[i + 1][j - 1] >= 0) { //checks to see if spot is a mine
                            board[i + 1][j - 1]++;
                        }
                    }

                    if (i > 0) {           //left
                        if (board[i - 1][j] >= 0) { //checks to see if spot is a mine
                            board[i - 1][j]++;
                        }
                    }

                    if (i < 9) {           //right
                        if (board[i + 1][j] >= 0) { //checks to see if spot is a mine
                            board[i + 1][j]++;
                        }
                    }

                    if (i > 0 && j < 9) {  //bottom left
                        if (board[i - 1][j + 1] >= 0) { //checks to see if spot is a mine
                            board[i - 1][j + 1]++;
                        }
                    }

                    if (j < 9) {           //bottom
                        if (board[i][j + 1] >= 0) { //checks to see if spot is a mine
                            board[i][j + 1]++;
                        }
                    }

                    if (i < 9 && j < 9) {  //bottom right
                        if (board[i + 1][j + 1] >= 0) { //checks to see if spot is a mine
                            board[i + 1][j + 1]++;
                        }
                    }

                }
                Log.e("MS:create board", "spot created");
            }
        }
        minesRemaining = numMines;
        mR.setText(String.valueOf(minesRemaining));
    }
    void disableGrid() {
        r1c1.setEnabled(false);
        r1c2.setEnabled(false);
        r1c3.setEnabled(false);
        r1c4.setEnabled(false);
        r1c5.setEnabled(false);
        r1c6.setEnabled(false);
        r1c7.setEnabled(false);
        r1c8.setEnabled(false);
        r1c9.setEnabled(false);
        r1c10.setEnabled(false);
        r2c1.setEnabled(false);
        r2c2.setEnabled(false);
        r2c3.setEnabled(false);
        r2c4.setEnabled(false);
        r2c5.setEnabled(false);
        r2c6.setEnabled(false);
        r2c7.setEnabled(false);
        r2c8.setEnabled(false);
        r2c9.setEnabled(false);
        r2c10.setEnabled(false);
        r3c1.setEnabled(false);
        r3c2.setEnabled(false);
        r3c3.setEnabled(false);
        r3c4.setEnabled(false);
        r3c5.setEnabled(false);
        r3c6.setEnabled(false);
        r3c7.setEnabled(false);
        r3c8.setEnabled(false);
        r3c9.setEnabled(false);
        r3c10.setEnabled(false);
        r4c1.setEnabled(false);
        r4c2.setEnabled(false);
        r4c3.setEnabled(false);
        r4c4.setEnabled(false);
        r4c5.setEnabled(false);
        r4c6.setEnabled(false);
        r4c7.setEnabled(false);
        r4c8.setEnabled(false);
        r4c9.setEnabled(false);
        r4c10.setEnabled(false);
        r5c1.setEnabled(false);
        r5c2.setEnabled(false);
        r5c3.setEnabled(false);
        r5c4.setEnabled(false);
        r5c5.setEnabled(false);
        r5c6.setEnabled(false);
        r5c7.setEnabled(false);
        r5c8.setEnabled(false);
        r5c9.setEnabled(false);
        r5c10.setEnabled(false);
        r6c1.setEnabled(false);
        r6c2.setEnabled(false);
        r6c3.setEnabled(false);
        r6c4.setEnabled(false);
        r6c5.setEnabled(false);
        r6c6.setEnabled(false);
        r6c7.setEnabled(false);
        r6c8.setEnabled(false);
        r6c9.setEnabled(false);
        r6c10.setEnabled(false);
        r7c1.setEnabled(false);
        r7c2.setEnabled(false);
        r7c3.setEnabled(false);
        r7c4.setEnabled(false);
        r7c5.setEnabled(false);
        r7c6.setEnabled(false);
        r7c7.setEnabled(false);
        r7c8.setEnabled(false);
        r7c9.setEnabled(false);
        r7c10.setEnabled(false);
        r8c1.setEnabled(false);
        r8c2.setEnabled(false);
        r8c3.setEnabled(false);
        r8c4.setEnabled(false);
        r8c5.setEnabled(false);
        r8c6.setEnabled(false);
        r8c7.setEnabled(false);
        r8c8.setEnabled(false);
        r8c9.setEnabled(false);
        r8c10.setEnabled(false);
        r9c1.setEnabled(false);
        r9c2.setEnabled(false);
        r9c3.setEnabled(false);
        r9c4.setEnabled(false);
        r9c5.setEnabled(false);
        r9c6.setEnabled(false);
        r9c7.setEnabled(false);
        r9c8.setEnabled(false);
        r9c9.setEnabled(false);
        r9c10.setEnabled(false);
        r10c1.setEnabled(false);
        r10c2.setEnabled(false);
        r10c3.setEnabled(false);
        r10c4.setEnabled(false);
        r10c5.setEnabled(false);
        r10c6.setEnabled(false);
        r10c7.setEnabled(false);
        r10c8.setEnabled(false);
        r10c9.setEnabled(false);
        r10c10.setEnabled(false);
        flag.setEnabled(false);
    }
    void enableGrid() {
        r1c1.setEnabled(true);
        r1c2.setEnabled(true);
        r1c3.setEnabled(true);
        r1c4.setEnabled(true);
        r1c5.setEnabled(true);
        r1c6.setEnabled(true);
        r1c7.setEnabled(true);
        r1c8.setEnabled(true);
        r1c9.setEnabled(true);
        r1c10.setEnabled(true);
        r2c1.setEnabled(true);
        r2c2.setEnabled(true);
        r2c3.setEnabled(true);
        r2c4.setEnabled(true);
        r2c5.setEnabled(true);
        r2c6.setEnabled(true);
        r2c7.setEnabled(true);
        r2c8.setEnabled(true);
        r2c9.setEnabled(true);
        r2c10.setEnabled(true);
        r3c1.setEnabled(true);
        r3c2.setEnabled(true);
        r3c3.setEnabled(true);
        r3c4.setEnabled(true);
        r3c5.setEnabled(true);
        r3c6.setEnabled(true);
        r3c7.setEnabled(true);
        r3c8.setEnabled(true);
        r3c9.setEnabled(true);
        r3c10.setEnabled(true);
        r4c1.setEnabled(true);
        r4c2.setEnabled(true);
        r4c3.setEnabled(true);
        r4c4.setEnabled(true);
        r4c5.setEnabled(true);
        r4c6.setEnabled(true);
        r4c7.setEnabled(true);
        r4c8.setEnabled(true);
        r4c9.setEnabled(true);
        r4c10.setEnabled(true);
        r5c1.setEnabled(true);
        r5c2.setEnabled(true);
        r5c3.setEnabled(true);
        r5c4.setEnabled(true);
        r5c5.setEnabled(true);
        r5c6.setEnabled(true);
        r5c7.setEnabled(true);
        r5c8.setEnabled(true);
        r5c9.setEnabled(true);
        r5c10.setEnabled(true);
        r6c1.setEnabled(true);
        r6c2.setEnabled(true);
        r6c3.setEnabled(true);
        r6c4.setEnabled(true);
        r6c5.setEnabled(true);
        r6c6.setEnabled(true);
        r6c7.setEnabled(true);
        r6c8.setEnabled(true);
        r6c9.setEnabled(true);
        r6c10.setEnabled(true);
        r7c1.setEnabled(true);
        r7c2.setEnabled(true);
        r7c3.setEnabled(true);
        r7c4.setEnabled(true);
        r7c5.setEnabled(true);
        r7c6.setEnabled(true);
        r7c7.setEnabled(true);
        r7c8.setEnabled(true);
        r7c9.setEnabled(true);
        r7c10.setEnabled(true);
        r8c1.setEnabled(true);
        r8c2.setEnabled(true);
        r8c3.setEnabled(true);
        r8c4.setEnabled(true);
        r8c5.setEnabled(true);
        r8c6.setEnabled(true);
        r8c7.setEnabled(true);
        r8c8.setEnabled(true);
        r8c9.setEnabled(true);
        r8c10.setEnabled(true);
        r9c1.setEnabled(true);
        r9c2.setEnabled(true);
        r9c3.setEnabled(true);
        r9c4.setEnabled(true);
        r9c5.setEnabled(true);
        r9c6.setEnabled(true);
        r9c7.setEnabled(true);
        r9c8.setEnabled(true);
        r9c9.setEnabled(true);
        r9c10.setEnabled(true);
        r10c1.setEnabled(true);
        r10c2.setEnabled(true);
        r10c3.setEnabled(true);
        r10c4.setEnabled(true);
        r10c5.setEnabled(true);
        r10c6.setEnabled(true);
        r10c7.setEnabled(true);
        r10c8.setEnabled(true);
        r10c9.setEnabled(true);
        r10c10.setEnabled(true);
        flag.setEnabled(true);
    }
    void enableMenu() {
        easy.setEnabled(true);
        medium.setEnabled(true);
        hard.setEnabled(true);
        extreme.setEnabled(true);
        easy.setVisibility (View.VISIBLE);
        medium.setVisibility (View.VISIBLE);
        hard.setVisibility (View.VISIBLE);
        extreme.setVisibility (View.VISIBLE);
    }
    void disableMenu() {
        easy.setEnabled(false);
        medium.setEnabled(false);
        hard.setEnabled(false);
        extreme.setEnabled(false);
        easy.setVisibility (View.INVISIBLE);
        medium.setVisibility (View.INVISIBLE);
        hard.setVisibility (View.INVISIBLE);
        extreme.setVisibility (View.INVISIBLE);
    }
    void hideAreYouSure() {
        areYouSure.setVisibility(View.INVISIBLE);
        yes.setVisibility(View.INVISIBLE);
        no.setVisibility(View.INVISIBLE);
    }
    void showAreYouSure() {
        disableGrid();
        areYouSure.setVisibility(View.VISIBLE);
        yes.setVisibility(View.VISIBLE);
        no.setVisibility(View.VISIBLE);

        yes.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                r1c1.setText("");
                r1c2.setText("");
                r1c3.setText("");
                r1c4.setText("");
                r1c5.setText("");
                r1c6.setText("");
                r1c7.setText("");
                r1c8.setText("");
                r1c9.setText("");
                r1c10.setText("");

                r2c1.setText("");
                r2c2.setText("");
                r2c3.setText("");
                r2c4.setText("");
                r2c5.setText("");
                r2c6.setText("");
                r2c7.setText("");
                r2c8.setText("");
                r2c9.setText("");
                r2c10.setText("");

                r3c1.setText("");
                r3c2.setText("");
                r3c3.setText("");
                r3c4.setText("");
                r3c5.setText("");
                r3c6.setText("");
                r3c7.setText("");
                r3c8.setText("");
                r3c9.setText("");
                r3c10.setText("");

                r4c1.setText("");
                r4c2.setText("");
                r4c3.setText("");
                r4c4.setText("");
                r4c5.setText("");
                r4c6.setText("");
                r4c7.setText("");
                r4c8.setText("");
                r4c9.setText("");
                r4c10.setText("");

                r5c1.setText("");
                r5c2.setText("");
                r5c3.setText("");
                r5c4.setText("");
                r5c5.setText("");
                r5c6.setText("");
                r5c7.setText("");
                r5c8.setText("");
                r5c9.setText("");
                r5c10.setText("");

                r6c1.setText("");
                r6c2.setText("");
                r6c3.setText("");
                r6c4.setText("");
                r6c5.setText("");
                r6c6.setText("");
                r6c7.setText("");
                r6c8.setText("");
                r6c9.setText("");
                r6c10.setText("");

                r7c1.setText("");
                r7c2.setText("");
                r7c3.setText("");
                r7c4.setText("");
                r7c5.setText("");
                r7c6.setText("");
                r7c7.setText("");
                r7c8.setText("");
                r7c9.setText("");
                r7c10.setText("");

                r8c1.setText("");
                r8c2.setText("");
                r8c3.setText("");
                r8c4.setText("");
                r8c5.setText("");
                r8c6.setText("");
                r8c7.setText("");
                r8c8.setText("");
                r8c9.setText("");
                r8c10.setText("");

                r9c1.setText("");
                r9c2.setText("");
                r9c3.setText("");
                r9c4.setText("");
                r9c5.setText("");
                r9c6.setText("");
                r9c7.setText("");
                r9c8.setText("");
                r9c9.setText("");
                r9c10.setText("");

                r10c1.setText("");
                r10c2.setText("");
                r10c3.setText("");
                r10c4.setText("");
                r10c5.setText("");
                r10c6.setText("");
                r10c7.setText("");
                r10c8.setText("");
                r10c9.setText("");
                r10c10.setText("");
                currentScore = 0;
                minesRemaining = 0;
                numMines = 0;
                message.setText("");
                mR.setText(String.valueOf(minesRemaining));
                s.setText(String.valueOf(currentScore));

                play();
            }
        });
        no.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                hideAreYouSure();
                enableGrid();
            }
        });
    }

    void play() {
        gameOver = false;
        setup();
        disableGrid();
        enableMenu();
        hideAreYouSure();

        easy.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                disableMenu();
                percent = 10;
                createBoard();
                enableGrid();
            }
        });

        medium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                disableMenu();
                percent = 15;
                createBoard();
                enableGrid();
            }
        });

        hard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                disableMenu();
                percent = 20;
                createBoard();
                enableGrid();
            }
        });

        extreme.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                disableMenu();
                percent = 30;
                createBoard();
                enableGrid();
            }
        });



        flag.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                flagging = !flagging;
                if (flagging) {
                    flag.setText("Flagging");
                } else {
                    flag.setText("Flag");
                }
            }
        });


        //Row 1
        //r1c1 = findViewById(R.id.R1C1);
        r1c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c1.getText().toString().equals("#")) {
                        r1c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][0] > 0) {
                        r1c1.setText(String.valueOf(board[0][0]));
                    } else if (board[0][0] < 0) {
                        Log.d("", "mine clicked");
                        r1c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c2 = findViewById(R.id.R1C2);
        r1c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c2.getText().toString().equals("#")) {
                        r1c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][0] > 0) {
                        r1c2.setText(String.valueOf(board[1][0]));
                    } else if (board[1][0] < 0) {
                        r1c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c3 = findViewById(R.id.R1C3);
        r1c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c3.getText().toString().equals("#")) {
                        r1c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][0] > 0) {
                        r1c3.setText(String.valueOf(board[2][0]));
                    } else if (board[2][0] < 0) {
                        r1c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c4 = findViewById(R.id.R1C4);
        r1c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c4.getText().toString().equals("#")) {
                        r1c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][0] > 0) {
                        r1c4.setText(String.valueOf(board[3][0]));
                    } else if (board[3][0] < 0) {
                        r1c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c5 = findViewById(R.id.R1C5);
        r1c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c5.getText().toString().equals("#")) {
                        r1c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][0] > 0) {
                        r1c5.setText(String.valueOf(board[4][0]));
                    } else if (board[4][0] < 0) {
                        r1c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c6 = findViewById(R.id.R1C6);
        r1c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c6.getText().toString().equals("#")) {
                        r1c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][0] > 0) {
                        r1c6.setText(String.valueOf(board[5][0]));
                    } else if (board[5][0] < 0) {
                        r1c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c7 = findViewById(R.id.R1C7);
        r1c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c7.getText().toString().equals("#")) {
                        r1c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][0] > 0) {
                        r1c7.setText(String.valueOf(board[6][0]));
                    } else if (board[6][0] < 0) {
                        r1c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c8 = findViewById(R.id.R1C8);
        r1c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c8.getText().toString().equals("#")) {
                        r1c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][0] > 0) {
                        r1c8.setText(String.valueOf(board[7][0]));
                    } else if (board[7][0] < 0) {
                        r1c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c9 = findViewById(R.id.R1C9);
        r1c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c9.getText().toString().equals("#")) {
                        r1c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][0] > 0) {
                        r1c9.setText(String.valueOf(board[8][0]));
                    } else if (board[8][0] < 0) {
                        r1c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r1c10 = findViewById(R.id.R1C10);
        r1c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r1c10.getText().toString().equals("#")) {
                        r1c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r1c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r1c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][0] > 0) {
                        r1c10.setText(String.valueOf(board[9][0]));
                    } else if (board[9][0] < 0) {
                        r1c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });



        //Row 2
        r2c1 = findViewById(R.id.R2C1);
        r2c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c1.getText().toString().equals("#")) {
                        r2c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][1] > 0) {
                        r2c1.setText(String.valueOf(board[0][1]));
                    } else if (board[0][1] < 0) {
                        r2c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c2 = findViewById(R.id.R2C2);
        r2c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c2.getText().toString().equals("#")) {
                        r2c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][1] > 0) {
                        r2c2.setText(String.valueOf(board[1][1]));
                    } else if (board[1][1] < 0) {
                        r2c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c3 = findViewById(R.id.R2C3);
        r2c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c3.getText().toString().equals("#")) {
                        r2c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][1] > 0) {
                        r2c3.setText(String.valueOf(board[2][1]));
                    } else if (board[2][1] < 0) {
                        r2c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c4 = findViewById(R.id.R2C4);
        r2c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c4.getText().toString().equals("#")) {
                        r2c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][1] > 0) {
                        r2c4.setText(String.valueOf(board[3][1]));
                    } else if (board[3][1] < 0) {
                        r2c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c5 = findViewById(R.id.R2C5);
        r2c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c5.getText().toString().equals("#")) {
                        r2c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][1] > 0) {
                        r2c5.setText(String.valueOf(board[4][1]));
                    } else if (board[4][1] < 0) {
                        r2c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c6 = findViewById(R.id.R2C6);
        r2c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c6.getText().toString().equals("#")) {
                        r2c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][1] > 0) {
                        r2c6.setText(String.valueOf(board[5][1]));
                    } else if (board[5][1] < 0) {
                        r2c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c7 = findViewById(R.id.R2C7);
        r2c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c7.getText().toString().equals("#")) {
                        r2c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][1] > 0) {
                        r2c7.setText(String.valueOf(board[6][1]));
                    } else if (board[6][1] < 0) {
                        r2c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c8 = findViewById(R.id.R2C8);
        r2c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c8.getText().toString().equals("#")) {
                        r2c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][1] > 0) {
                        r2c8.setText(String.valueOf(board[7][1]));
                    } else if (board[7][1] < 0) {
                        r2c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c9 = findViewById(R.id.R2C9);
        r2c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c9.getText().toString().equals("#")) {
                        r2c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][1] > 0) {
                        r2c9.setText(String.valueOf(board[8][1]));
                    } else if (board[8][1] < 0) {
                        r2c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r2c10 = findViewById(R.id.R2C10);
        r2c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r2c10.getText().toString().equals("#")) {
                        r2c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r2c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r2c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][1] > 0) {
                        r2c10.setText(String.valueOf(board[9][1]));
                    } else if (board[9][1] < 0) {
                        r2c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 3
        r3c1 = findViewById(R.id.R3C1);
        r3c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c1.getText().toString().equals("#")) {
                        r3c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][2] > 0) {
                        r3c1.setText(String.valueOf(board[0][2]));
                    } else if (board[0][2] < 0) {
                        r3c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c2 = findViewById(R.id.R3C2);
        r3c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c2.getText().toString().equals("#")) {
                        r3c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][2] > 0) {
                        r3c2.setText(String.valueOf(board[1][2]));
                    } else if (board[1][2] < 0) {
                        r3c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c3 = findViewById(R.id.R3C3);
        r3c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c3.getText().toString().equals("#")) {
                        r3c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][2] > 0) {
                        r3c3.setText(String.valueOf(board[2][2]));
                    } else if (board[2][2] < 0) {
                        r3c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c4 = findViewById(R.id.R3C4);
        r3c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c4.getText().toString().equals("#")) {
                        r3c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][2] > 0) {
                        r3c4.setText(String.valueOf(board[3][2]));
                    } else if (board[3][2] < 0) {
                        r3c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c5 = findViewById(R.id.R3C5);
        r3c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c5.getText().toString().equals("#")) {
                        r3c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][2] > 0) {
                        r3c5.setText(String.valueOf(board[4][2]));
                    } else if (board[4][2] < 0) {
                        r3c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c6 = findViewById(R.id.R3C6);
        r3c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c6.getText().toString().equals("#")) {
                        r3c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][2] > 0) {
                        r3c6.setText(String.valueOf(board[5][2]));
                    } else if (board[5][2] < 0) {
                        r3c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c7 = findViewById(R.id.R3C7);
        r3c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c7.getText().toString().equals("#")) {
                        r3c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][2] > 0) {
                        r3c7.setText(String.valueOf(board[6][2]));
                    } else if (board[6][2] < 0) {
                        r3c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c8 = findViewById(R.id.R3C8);
        r3c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c8.getText().toString().equals("#")) {
                        r3c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][2] > 0) {
                        r3c8.setText(String.valueOf(board[7][2]));
                    } else if (board[7][2] < 0) {
                        r3c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c9 = findViewById(R.id.R3C9);
        r3c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c9.getText().toString().equals("#")) {
                        r3c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][2] > 0) {
                        r3c9.setText(String.valueOf(board[8][2]));
                    } else if (board[8][2] < 0) {
                        r3c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r3c10 = findViewById(R.id.R3C10);
        r3c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r3c10.getText().toString().equals("#")) {
                        r3c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r3c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r3c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][2] > 0) {
                        r3c10.setText(String.valueOf(board[9][2]));
                    } else if (board[9][2] < 0) {
                        r3c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 4
        r4c1 = findViewById(R.id.R4C1);
        r4c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c1.getText().toString().equals("#")) {
                        r4c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][3] > 0) {
                        r4c1.setText(String.valueOf(board[0][3]));
                    } else if (board[0][3] < 0) {
                        r4c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c2 = findViewById(R.id.R4C2);
        r4c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c2.getText().toString().equals("#")) {
                        r4c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][3] > 0) {
                        r4c2.setText(String.valueOf(board[1][3]));
                    } else if (board[1][3] < 0) {
                        r4c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c3 = findViewById(R.id.R4C3);
        r4c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c3.getText().toString().equals("#")) {
                        r4c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][3] > 0) {
                        r4c3.setText(String.valueOf(board[2][3]));
                    } else if (board[2][3] < 0) {
                        r4c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c4 = findViewById(R.id.R4C4);
        r4c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c4.getText().toString().equals("#")) {
                        r4c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][3] > 0) {
                        r4c4.setText(String.valueOf(board[3][3]));
                    } else if (board[3][3] < 0) {
                        r4c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c5 = findViewById(R.id.R4C5);
        r4c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c5.getText().toString().equals("#")) {
                        r4c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][3] > 0) {
                        r4c5.setText(String.valueOf(board[4][3]));
                    } else if (board[4][3] < 0) {
                        r4c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c6 = findViewById(R.id.R4C6);
        r4c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c6.getText().toString().equals("#")) {
                        r4c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][3] > 0) {
                        r4c6.setText(String.valueOf(board[5][3]));
                    } else if (board[5][3] < 0) {
                        r4c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c7 = findViewById(R.id.R4C7);
        r4c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c7.getText().toString().equals("#")) {
                        r4c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][3] > 0) {
                        r4c7.setText(String.valueOf(board[6][3]));
                    } else if (board[6][3] < 0) {
                        r4c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c8 = findViewById(R.id.R4C8);
        r4c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c8.getText().toString().equals("#")) {
                        r4c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][3] > 0) {
                        r4c8.setText(String.valueOf(board[7][3]));
                    } else if (board[7][3] < 0) {
                        r4c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c9 = findViewById(R.id.R4C9);
        r4c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c9.getText().toString().equals("#")) {
                        r4c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][3] > 0) {
                        r4c9.setText(String.valueOf(board[8][3]));
                    } else if (board[8][3] < 0) {
                        r4c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r4c10 = findViewById(R.id.R4C10);
        r4c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r4c10.getText().toString().equals("#")) {
                        r4c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r4c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r4c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][3] > 0) {
                        r4c10.setText(String.valueOf(board[9][3]));
                    } else if (board[9][3] < 0) {
                        r4c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 5
        r5c1 = findViewById(R.id.R5C1);
        r5c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c1.getText().toString().equals("#")) {
                        r5c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][4] > 0) {
                        r5c1.setText(String.valueOf(board[0][4]));
                    } else if (board[0][4] < 0) {
                        r5c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c2 = findViewById(R.id.R5C2);
        r5c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c2.getText().toString().equals("#")) {
                        r5c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][4] > 0) {
                        r5c2.setText(String.valueOf(board[1][4]));
                    } else if (board[1][4] < 0) {
                        r5c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c3 = findViewById(R.id.R5C3);
        r5c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c3.getText().toString().equals("#")) {
                        r5c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][4] > 0) {
                        r5c3.setText(String.valueOf(board[2][4]));
                    } else if (board[2][4] < 0) {
                        r5c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c4 = findViewById(R.id.R5C4);
        r5c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c4.getText().toString().equals("#")) {
                        r5c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][4] > 0) {
                        r5c4.setText(String.valueOf(board[3][4]));
                    } else if (board[3][4] < 0) {
                        r5c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c5 = findViewById(R.id.R5C5);
        r5c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c5.getText().toString().equals("#")) {
                        r5c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][4] > 0) {
                        r5c5.setText(String.valueOf(board[4][4]));
                    } else if (board[4][4] < 0) {
                        r5c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c6 = findViewById(R.id.R5C6);
        r5c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c6.getText().toString().equals("#")) {
                        r5c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][4] > 0) {
                        r5c6.setText(String.valueOf(board[5][4]));
                    } else if (board[5][4] < 0) {
                        r5c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c7 = findViewById(R.id.R5C7);
        r5c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c7.getText().toString().equals("#")) {
                        r5c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][4] > 0) {
                        r5c7.setText(String.valueOf(board[6][4]));
                    } else if (board[6][4] < 0) {
                        r5c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c8 = findViewById(R.id.R5C8);
        r5c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c8.getText().toString().equals("#")) {
                        r5c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][4] > 0) {
                        r5c8.setText(String.valueOf(board[7][4]));
                    } else if (board[7][4] < 0) {
                        r5c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c9 = findViewById(R.id.R5C9);
        r5c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c9.getText().toString().equals("#")) {
                        r5c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][4] > 0) {
                        r5c9.setText(String.valueOf(board[8][4]));
                    } else if (board[8][4] < 0) {
                        r5c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r5c10 = findViewById(R.id.R5C10);
        r5c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r5c10.getText().toString().equals("#")) {
                        r5c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r5c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r5c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][4] > 0) {
                        r5c10.setText(String.valueOf(board[9][4]));
                    } else if (board[9][4] < 0) {
                        r5c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 6
        r6c1 = findViewById(R.id.R6C1);
        r6c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c1.getText().toString().equals("#")) {
                        r6c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][5] > 0) {
                        r6c1.setText(String.valueOf(board[0][5]));
                    } else if (board[0][5] < 0) {
                        r6c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c2 = findViewById(R.id.R6C2);
        r6c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c2.getText().toString().equals("#")) {
                        r6c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][5] > 0) {
                        r6c2.setText(String.valueOf(board[1][5]));
                    } else if (board[1][5] < 0) {
                        r6c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c3 = findViewById(R.id.R6C3);
        r6c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c3.getText().toString().equals("#")) {
                        r6c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][5] > 0) {
                        r6c3.setText(String.valueOf(board[2][5]));
                    } else if (board[2][5] < 0) {
                        r6c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c4 = findViewById(R.id.R6C4);
        r6c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c4.getText().toString().equals("#")) {
                        r6c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][5] > 0) {
                        r6c4.setText(String.valueOf(board[3][5]));
                    } else if (board[3][5] < 0) {
                        r6c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c5 = findViewById(R.id.R6C5);
        r6c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c5.getText().toString().equals("#")) {
                        r6c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][5] > 0) {
                        r6c5.setText(String.valueOf(board[4][5]));
                    } else if (board[4][5] < 0) {
                        r6c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c6 = findViewById(R.id.R6C6);
        r6c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c6.getText().toString().equals("#")) {
                        r6c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][5] > 0) {
                        r6c6.setText(String.valueOf(board[5][5]));
                    } else if (board[5][5] < 0) {
                        r6c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c7 = findViewById(R.id.R6C7);
        r6c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c7.getText().toString().equals("#")) {
                        r6c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][5] > 0) {
                        r6c7.setText(String.valueOf(board[6][5]));
                    } else if (board[6][5] < 0) {
                        r6c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c8 = findViewById(R.id.R6C8);
        r6c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c8.getText().toString().equals("#")) {
                        r6c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][5] > 0) {
                        r6c8.setText(String.valueOf(board[7][5]));
                    } else if (board[7][5] < 0) {
                        r6c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c9 = findViewById(R.id.R6C9);
        r6c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c9.getText().toString().equals("#")) {
                        r6c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][5] > 0) {
                        r6c9.setText(String.valueOf(board[8][5]));
                    } else if (board[8][5] < 0) {
                        r6c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r6c10 = findViewById(R.id.R6C10);
        r6c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r6c10.getText().toString().equals("#")) {
                        r6c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r6c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r6c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][5] > 0) {
                        r6c10.setText(String.valueOf(board[9][5]));
                    } else if (board[9][5] < 0) {
                        r6c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 7
        r7c1 = findViewById(R.id.R7C1);
        r7c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c1.getText().toString().equals("#")) {
                        r7c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][6] > 0) {
                        r7c1.setText(String.valueOf(board[0][6]));
                    } else if (board[0][6] < 0) {
                        r7c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c2 = findViewById(R.id.R7C2);
        r7c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c2.getText().toString().equals("#")) {
                        r7c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][6] > 0) {
                        r7c2.setText(String.valueOf(board[1][6]));
                    } else if (board[1][6] < 0) {
                        r7c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c3 = findViewById(R.id.R7C3);
        r7c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c3.getText().toString().equals("#")) {
                        r7c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][6] > 0) {
                        r7c3.setText(String.valueOf(board[2][6]));
                    } else if (board[2][6] < 0) {
                        r7c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c4 = findViewById(R.id.R7C4);
        r7c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c4.getText().toString().equals("#")) {
                        r7c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][6] > 0) {
                        r7c4.setText(String.valueOf(board[3][6]));
                    } else if (board[3][6] < 0) {
                        r7c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c5 = findViewById(R.id.R7C5);
        r7c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c5.getText().toString().equals("#")) {
                        r7c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][6] > 0) {
                        r7c5.setText(String.valueOf(board[4][6]));
                    } else if (board[4][6] < 0) {
                        r7c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c6 = findViewById(R.id.R7C6);
        r7c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c6.getText().toString().equals("#")) {
                        r7c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][6] > 0) {
                        r7c6.setText(String.valueOf(board[5][6]));
                    } else if (board[5][6] < 0) {
                        r7c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c7 = findViewById(R.id.R7C7);
        r7c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c7.getText().toString().equals("#")) {
                        r7c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][6] > 0) {
                        r7c7.setText(String.valueOf(board[6][6]));
                    } else if (board[6][6] < 0) {
                        r7c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c8 = findViewById(R.id.R7C8);
        r7c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c8.getText().toString().equals("#")) {
                        r7c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][6] > 0) {
                        r7c8.setText(String.valueOf(board[7][6]));
                    } else if (board[7][6] < 0) {
                        r7c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c9 = findViewById(R.id.R7C9);
        r7c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c9.getText().toString().equals("#")) {
                        r7c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][6] > 0) {
                        r7c9.setText(String.valueOf(board[8][6]));
                    } else if (board[8][6] < 0) {
                        r7c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r7c10 = findViewById(R.id.R7C10);
        r7c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r7c10.getText().toString().equals("#")) {
                        r7c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r7c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r7c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][6] > 0) {
                        r7c10.setText(String.valueOf(board[9][6]));
                    } else if (board[9][6] < 0) {
                        r7c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 8
        r8c1 = findViewById(R.id.R8C1);
        r8c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c1.getText().toString().equals("#")) {
                        r8c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][7] > 0) {
                        r8c1.setText(String.valueOf(board[0][7]));
                    } else if (board[0][7] < 0) {
                        r8c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c2 = findViewById(R.id.R8C2);
        r8c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c2.getText().toString().equals("#")) {
                        r8c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][7] > 0) {
                        r8c2.setText(String.valueOf(board[1][7]));
                    } else if (board[1][7] < 0) {
                        r8c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c3 = findViewById(R.id.R8C3);
        r8c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c3.getText().toString().equals("#")) {
                        r8c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][7] > 0) {
                        r8c3.setText(String.valueOf(board[2][7]));
                    } else if (board[2][7] < 0) {
                        r8c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c4 = findViewById(R.id.R8C4);
        r8c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c4.getText().toString().equals("#")) {
                        r8c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][7] > 0) {
                        r8c4.setText(String.valueOf(board[3][7]));
                    } else if (board[3][7] < 0) {
                        r8c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c5 = findViewById(R.id.R8C5);
        r8c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c5.getText().toString().equals("#")) {
                        r8c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][7] > 0) {
                        r8c5.setText(String.valueOf(board[4][7]));
                    } else if (board[4][7] < 0) {
                        r8c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c6 = findViewById(R.id.R8C6);
        r8c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c6.getText().toString().equals("#")) {
                        r8c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][7] > 0) {
                        r8c6.setText(String.valueOf(board[5][7]));
                    } else if (board[5][7] < 0) {
                        r8c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c7 = findViewById(R.id.R8C7);
        r8c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c7.getText().toString().equals("#")) {
                        r8c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][7] > 0) {
                        r8c7.setText(String.valueOf(board[6][7]));
                    } else if (board[6][7] < 0) {
                        r8c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c8 = findViewById(R.id.R8C8);
        r8c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c8.getText().toString().equals("#")) {
                        r8c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][7] > 0) {
                        r8c8.setText(String.valueOf(board[7][7]));
                    } else if (board[7][7] < 0) {
                        r8c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c9 = findViewById(R.id.R8C9);
        r8c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c9.getText().toString().equals("#")) {
                        r8c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][7] > 0) {
                        r8c9.setText(String.valueOf(board[8][7]));
                    } else if (board[8][7] < 0) {
                        r8c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r8c10 = findViewById(R.id.R8C10);
        r8c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r8c10.getText().toString().equals("#")) {
                        r8c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r8c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r8c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][7] > 0) {
                        r8c10.setText(String.valueOf(board[9][7]));
                    } else if (board[9][7] < 0) {
                        r8c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 9
        r9c1 = findViewById(R.id.R9C1);
        r9c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c1.getText().toString().equals("#")) {
                        r9c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][8] > 0) {
                        r9c1.setText(String.valueOf(board[0][8]));
                    } else if (board[0][8] < 0) {
                        r9c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c2 = findViewById(R.id.R9C2);
        r9c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c2.getText().toString().equals("#")) {
                        r9c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][8] > 0) {
                        r9c2.setText(String.valueOf(board[1][8]));
                    } else if (board[1][8] < 0) {
                        r9c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c3 = findViewById(R.id.R9C3);
        r9c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c3.getText().toString().equals("#")) {
                        r9c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][8] > 0) {
                        r9c3.setText(String.valueOf(board[2][8]));
                    } else if (board[2][8] < 0) {
                        r9c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c4 = findViewById(R.id.R9C4);
        r9c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c4.getText().toString().equals("#")) {
                        r9c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][8] > 0) {
                        r9c4.setText(String.valueOf(board[3][8]));
                    } else if (board[3][8] < 0) {
                        r9c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c5 = findViewById(R.id.R9C5);
        r9c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c5.getText().toString().equals("#")) {
                        r9c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][8] > 0) {
                        r9c5.setText(String.valueOf(board[4][8]));
                    } else if (board[4][8] < 0) {
                        r9c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c6 = findViewById(R.id.R9C6);
        r9c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c6.getText().toString().equals("#")) {
                        r9c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][8] > 0) {
                        r9c6.setText(String.valueOf(board[5][8]));
                    } else if (board[5][8] < 0) {
                        r9c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c7 = findViewById(R.id.R9C7);
        r9c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c7.getText().toString().equals("#")) {
                        r9c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][8] > 0) {
                        r9c7.setText(String.valueOf(board[6][8]));
                    } else if (board[6][8] < 0) {
                        r9c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c8 = findViewById(R.id.R9C8);
        r9c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c8.getText().toString().equals("#")) {
                        r9c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][8] > 0) {
                        r9c8.setText(String.valueOf(board[7][8]));
                    } else if (board[7][8] < 0) {
                        r9c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c9 = findViewById(R.id.R9C9);
        r9c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c9.getText().toString().equals("#")) {
                        r9c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][8] > 0) {
                        r9c9.setText(String.valueOf(board[8][8]));
                    } else if (board[8][8] < 0) {
                        r9c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r9c10 = findViewById(R.id.R9C10);
        r9c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r9c10.getText().toString().equals("#")) {
                        r9c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r9c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r9c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][8] > 0) {
                        r9c10.setText(String.valueOf(board[9][8]));
                    } else if (board[9][8] < 0) {
                        r9c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 10
        r10c1 = findViewById(R.id.R10C1);
        r10c1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c1.getText().toString().equals("#")) {
                        r10c1.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c1.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c1.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][9] > 0) {
                        r10c1.setText(String.valueOf(board[0][9]));
                    } else if (board[0][9] < 0) {
                        r10c1.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c2 = findViewById(R.id.R10C2);
        r10c2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c2.getText().toString().equals("#")) {
                        r10c2.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c2.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c2.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][9] > 0) {
                        r10c2.setText(String.valueOf(board[1][9]));
                    } else if (board[1][9] < 0) {
                        r10c2.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c3 = findViewById(R.id.R10C3);
        r10c3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c3.getText().toString().equals("#")) {
                        r10c3.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c3.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c3.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][9] > 0) {
                        r10c3.setText(String.valueOf(board[2][9]));
                    } else if (board[2][9] < 0) {
                        r10c3.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c4 = findViewById(R.id.R10C4);
        r10c4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c4.getText().toString().equals("#")) {
                        r10c4.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c4.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c4.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][9] > 0) {
                        r10c4.setText(String.valueOf(board[3][9]));
                    } else if (board[3][9] < 0) {
                        r10c4.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c5 = findViewById(R.id.R10C5);
        r10c5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c5.getText().toString().equals("#")) {
                        r10c5.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c5.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c5.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][9] > 0) {
                        r10c5.setText(String.valueOf(board[4][9]));
                    } else if (board[4][9] < 0) {
                        r10c5.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c6 = findViewById(R.id.R10C6);
        r10c6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c6.getText().toString().equals("#")) {
                        r10c6.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c6.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c6.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][9] > 0) {
                        r10c6.setText(String.valueOf(board[5][9]));
                    } else if (board[5][9] < 0) {
                        r10c6.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c7 = findViewById(R.id.R10C7);
        r10c7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c7.getText().toString().equals("#")) {
                        r10c7.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c7.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c7.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][9] > 0) {
                        r10c7.setText(String.valueOf(board[6][9]));
                    } else if (board[6][9] < 0) {
                        r10c7.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c8 = findViewById(R.id.R10C8);
        r10c8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c8.getText().toString().equals("#")) {
                        r10c8.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c8.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c8.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][9] > 0) {
                        r10c8.setText(String.valueOf(board[7][9]));
                    } else if (board[7][9] < 0) {
                        r10c8.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c9 = findViewById(R.id.R10C9);
        r10c9.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c9.getText().toString().equals("#")) {
                        r10c9.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c9.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c9.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][9] > 0) {
                        r10c9.setText(String.valueOf(board[8][9]));
                    } else if (board[8][9] < 0) {
                        r10c9.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        r10c10 = findViewById(R.id.R10C10);
        r10c10.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (r10c10.getText().toString().equals("#")) {
                        r10c10.setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        r10c10.setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    r10c10.setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][9] > 0) {
                        r10c10.setText(String.valueOf(board[9][9]));
                    } else if (board[9][9] < 0) {
                        r10c10.setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });
    }

    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_board);

        play();

        reset.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (gameOver == false) {
                    showAreYouSure();
                } else {
                    r1c1.setText("");
                    r1c2.setText("");
                    r1c3.setText("");
                    r1c4.setText("");
                    r1c5.setText("");
                    r1c6.setText("");
                    r1c7.setText("");
                    r1c8.setText("");
                    r1c9.setText("");
                    r1c10.setText("");

                    r2c1.setText("");
                    r2c2.setText("");
                    r2c3.setText("");
                    r2c4.setText("");
                    r2c5.setText("");
                    r2c6.setText("");
                    r2c7.setText("");
                    r2c8.setText("");
                    r2c9.setText("");
                    r2c10.setText("");

                    r3c1.setText("");
                    r3c2.setText("");
                    r3c3.setText("");
                    r3c4.setText("");
                    r3c5.setText("");
                    r3c6.setText("");
                    r3c7.setText("");
                    r3c8.setText("");
                    r3c9.setText("");
                    r3c10.setText("");

                    r4c1.setText("");
                    r4c2.setText("");
                    r4c3.setText("");
                    r4c4.setText("");
                    r4c5.setText("");
                    r4c6.setText("");
                    r4c7.setText("");
                    r4c8.setText("");
                    r4c9.setText("");
                    r4c10.setText("");

                    r5c1.setText("");
                    r5c2.setText("");
                    r5c3.setText("");
                    r5c4.setText("");
                    r5c5.setText("");
                    r5c6.setText("");
                    r5c7.setText("");
                    r5c8.setText("");
                    r5c9.setText("");
                    r5c10.setText("");

                    r6c1.setText("");
                    r6c2.setText("");
                    r6c3.setText("");
                    r6c4.setText("");
                    r6c5.setText("");
                    r6c6.setText("");
                    r6c7.setText("");
                    r6c8.setText("");
                    r6c9.setText("");
                    r6c10.setText("");

                    r7c1.setText("");
                    r7c2.setText("");
                    r7c3.setText("");
                    r7c4.setText("");
                    r7c5.setText("");
                    r7c6.setText("");
                    r7c7.setText("");
                    r7c8.setText("");
                    r7c9.setText("");
                    r7c10.setText("");

                    r8c1.setText("");
                    r8c2.setText("");
                    r8c3.setText("");
                    r8c4.setText("");
                    r8c5.setText("");
                    r8c6.setText("");
                    r8c7.setText("");
                    r8c8.setText("");
                    r8c9.setText("");
                    r8c10.setText("");

                    r9c1.setText("");
                    r9c2.setText("");
                    r9c3.setText("");
                    r9c4.setText("");
                    r9c5.setText("");
                    r9c6.setText("");
                    r9c7.setText("");
                    r9c8.setText("");
                    r9c9.setText("");
                    r9c10.setText("");

                    r10c1.setText("");
                    r10c2.setText("");
                    r10c3.setText("");
                    r10c4.setText("");
                    r10c5.setText("");
                    r10c6.setText("");
                    r10c7.setText("");
                    r10c8.setText("");
                    r10c9.setText("");
                    r10c10.setText("");
                    currentScore = 0;
                    minesRemaining = 0;
                    numMines = 0;
                    message.setText("");
                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));

                    play();
                }

            }
        });

    }

}
