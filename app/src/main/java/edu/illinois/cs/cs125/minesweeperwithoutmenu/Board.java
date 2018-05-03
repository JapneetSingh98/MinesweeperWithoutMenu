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
    Button[][] grid = new Button[10][10];
    final int[][] board = new int[10][10];
    int numMines = 0;
    int minesRemaining;
    boolean flagging;
    boolean gameOver = false;


    public void gO(boolean state) {
        if (state) {
            for (int i = 0; i < 10; i++) {
                for (int j = 0; j < 10; j++) {
                    if (board[i][j] < 0) {
                        grid[i][j].setText("X");
                    }
                }
            }
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

        grid[0][0] = findViewById(R.id.R1C1);
        grid[1][0] = findViewById(R.id.R1C2);
        grid[2][0] = findViewById(R.id.R1C3);
        grid[3][0] = findViewById(R.id.R1C4);
        grid[4][0] = findViewById(R.id.R1C5);
        grid[5][0] = findViewById(R.id.R1C6);
        grid[6][0] = findViewById(R.id.R1C7);
        grid[7][0] = findViewById(R.id.R1C8);
        grid[8][0] = findViewById(R.id.R1C9);
        grid[9][0] = findViewById(R.id.R1C10);
        grid[0][1] = findViewById(R.id.R2C1);
        grid[1][1] = findViewById(R.id.R2C2);
        grid[2][1] = findViewById(R.id.R2C3);
        grid[3][1] = findViewById(R.id.R2C4);
        grid[4][1] = findViewById(R.id.R2C5);
        grid[5][1] = findViewById(R.id.R2C6);
        grid[6][1] = findViewById(R.id.R2C7);
        grid[7][1] = findViewById(R.id.R2C8);
        grid[8][1] = findViewById(R.id.R2C9);
        grid[9][1] = findViewById(R.id.R2C10);
        grid[0][2] = findViewById(R.id.R3C1);
        grid[1][2] = findViewById(R.id.R3C2);
        grid[2][2] = findViewById(R.id.R3C3);
        grid[3][2] = findViewById(R.id.R3C4);
        grid[4][2] = findViewById(R.id.R3C5);
        grid[5][2] = findViewById(R.id.R3C6);
        grid[6][2] = findViewById(R.id.R3C7);
        grid[7][2] = findViewById(R.id.R3C8);
        grid[8][2] = findViewById(R.id.R3C9);
        grid[9][2] = findViewById(R.id.R3C10);
        grid[0][3] = findViewById(R.id.R4C1);
        grid[1][3] = findViewById(R.id.R4C2);
        grid[2][3] = findViewById(R.id.R4C3);
        grid[3][3] = findViewById(R.id.R4C4);
        grid[4][3] = findViewById(R.id.R4C5);
        grid[5][3] = findViewById(R.id.R4C6);
        grid[6][3] = findViewById(R.id.R4C7);
        grid[7][3] = findViewById(R.id.R4C8);
        grid[8][3] = findViewById(R.id.R4C9);
        grid[9][3] = findViewById(R.id.R4C10);
        grid[0][4] = findViewById(R.id.R5C1);
        grid[1][4] = findViewById(R.id.R5C2);
        grid[2][4] = findViewById(R.id.R5C3);
        grid[3][4] = findViewById(R.id.R5C4);
        grid[4][4] = findViewById(R.id.R5C5);
        grid[5][4] = findViewById(R.id.R5C6);
        grid[6][4] = findViewById(R.id.R5C7);
        grid[7][4] = findViewById(R.id.R5C8);
        grid[8][4] = findViewById(R.id.R5C9);
        grid[9][4] = findViewById(R.id.R5C10);
        grid[0][5] = findViewById(R.id.R6C1);
        grid[1][5] = findViewById(R.id.R6C2);
        grid[2][5] = findViewById(R.id.R6C3);
        grid[3][5] = findViewById(R.id.R6C4);
        grid[4][5] = findViewById(R.id.R6C5);
        grid[5][5] = findViewById(R.id.R6C6);
        grid[6][5] = findViewById(R.id.R6C7);
        grid[7][5] = findViewById(R.id.R6C8);
        grid[8][5] = findViewById(R.id.R6C9);
        grid[9][5] = findViewById(R.id.R6C10);
        grid[0][6] = findViewById(R.id.R7C1);
        grid[1][6] = findViewById(R.id.R7C2);
        grid[2][6] = findViewById(R.id.R7C3);
        grid[3][6] = findViewById(R.id.R7C4);
        grid[4][6] = findViewById(R.id.R7C5);
        grid[5][6] = findViewById(R.id.R7C6);
        grid[6][6] = findViewById(R.id.R7C7);
        grid[7][6] = findViewById(R.id.R7C8);
        grid[8][6] = findViewById(R.id.R7C9);
        grid[9][6] = findViewById(R.id.R7C10);
        grid[0][7] = findViewById(R.id.R8C1);
        grid[1][7] = findViewById(R.id.R8C2);
        grid[2][7] = findViewById(R.id.R8C3);
        grid[3][7] = findViewById(R.id.R8C4);
        grid[4][7] = findViewById(R.id.R8C5);
        grid[5][7] = findViewById(R.id.R8C6);
        grid[6][7] = findViewById(R.id.R8C7);
        grid[7][7] = findViewById(R.id.R8C8);
        grid[8][7] = findViewById(R.id.R8C9);
        grid[9][7] = findViewById(R.id.R8C10);
        grid[0][8] = findViewById(R.id.R9C1);
        grid[1][8] = findViewById(R.id.R9C2);
        grid[2][8] = findViewById(R.id.R9C3);
        grid[3][8] = findViewById(R.id.R9C4);
        grid[4][8] = findViewById(R.id.R9C5);
        grid[5][8] = findViewById(R.id.R9C6);
        grid[6][8] = findViewById(R.id.R9C7);
        grid[7][8] = findViewById(R.id.R9C8);
        grid[8][8] = findViewById(R.id.R9C9);
        grid[9][8] = findViewById(R.id.R9C10);
        grid[0][9] = findViewById(R.id.R10C1);
        grid[1][9] = findViewById(R.id.R10C2);
        grid[2][9] = findViewById(R.id.R10C3);
        grid[3][9] = findViewById(R.id.R10C4);
        grid[4][9] = findViewById(R.id.R10C5);
        grid[5][9] = findViewById(R.id.R10C6);
        grid[6][9] = findViewById(R.id.R10C7);
        grid[7][9] = findViewById(R.id.R10C8);
        grid[8][9] = findViewById(R.id.R10C9);
        grid[9][9] = findViewById(R.id.R10C10);
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
        grid[0][0].setEnabled(false);
        grid[1][0].setEnabled(false);
        grid[2][0].setEnabled(false);
        grid[3][0].setEnabled(false);
        grid[4][0].setEnabled(false);
        grid[5][0].setEnabled(false);
        grid[6][0].setEnabled(false);
        grid[7][0].setEnabled(false);
        grid[8][0].setEnabled(false);
        grid[9][0].setEnabled(false);
        grid[0][1].setEnabled(false);
        grid[1][1].setEnabled(false);
        grid[2][1].setEnabled(false);
        grid[3][1].setEnabled(false);
        grid[4][1].setEnabled(false);
        grid[5][1].setEnabled(false);
        grid[6][1].setEnabled(false);
        grid[7][1].setEnabled(false);
        grid[8][1].setEnabled(false);
        grid[9][1].setEnabled(false);
        grid[0][2].setEnabled(false);
        grid[1][2].setEnabled(false);
        grid[2][2].setEnabled(false);
        grid[3][2].setEnabled(false);
        grid[4][2].setEnabled(false);
        grid[5][2].setEnabled(false);
        grid[6][2].setEnabled(false);
        grid[7][2].setEnabled(false);
        grid[8][2].setEnabled(false);
        grid[9][2].setEnabled(false);
        grid[0][3].setEnabled(false);
        grid[1][3].setEnabled(false);
        grid[2][3].setEnabled(false);
        grid[3][3].setEnabled(false);
        grid[4][3].setEnabled(false);
        grid[5][3].setEnabled(false);
        grid[6][3].setEnabled(false);
        grid[7][3].setEnabled(false);
        grid[8][3].setEnabled(false);
        grid[9][3].setEnabled(false);
        grid[0][4].setEnabled(false);
        grid[1][4].setEnabled(false);
        grid[2][4].setEnabled(false);
        grid[3][4].setEnabled(false);
        grid[4][4].setEnabled(false);
        grid[5][4].setEnabled(false);
        grid[6][4].setEnabled(false);
        grid[7][4].setEnabled(false);
        grid[8][4].setEnabled(false);
        grid[9][4].setEnabled(false);
        grid[0][5].setEnabled(false);
        grid[1][5].setEnabled(false);
        grid[2][5].setEnabled(false);
        grid[3][5].setEnabled(false);
        grid[4][5].setEnabled(false);
        grid[5][5].setEnabled(false);
        grid[6][5].setEnabled(false);
        grid[7][5].setEnabled(false);
        grid[8][5].setEnabled(false);
        grid[9][5].setEnabled(false);
        grid[0][6].setEnabled(false);
        grid[1][6].setEnabled(false);
        grid[2][6].setEnabled(false);
        grid[3][6].setEnabled(false);
        grid[4][6].setEnabled(false);
        grid[5][6].setEnabled(false);
        grid[6][6].setEnabled(false);
        grid[7][6].setEnabled(false);
        grid[8][6].setEnabled(false);
        grid[9][6].setEnabled(false);
        grid[0][7].setEnabled(false);
        grid[1][7].setEnabled(false);
        grid[2][7].setEnabled(false);
        grid[3][7].setEnabled(false);
        grid[4][7].setEnabled(false);
        grid[5][7].setEnabled(false);
        grid[6][7].setEnabled(false);
        grid[7][7].setEnabled(false);
        grid[8][7].setEnabled(false);
        grid[9][7].setEnabled(false);
        grid[0][8].setEnabled(false);
        grid[1][8].setEnabled(false);
        grid[2][8].setEnabled(false);
        grid[3][8].setEnabled(false);
        grid[4][8].setEnabled(false);
        grid[5][8].setEnabled(false);
        grid[6][8].setEnabled(false);
        grid[7][8].setEnabled(false);
        grid[8][8].setEnabled(false);
        grid[9][8].setEnabled(false);
        grid[0][9].setEnabled(false);
        grid[1][9].setEnabled(false);
        grid[2][9].setEnabled(false);
        grid[3][9].setEnabled(false);
        grid[4][9].setEnabled(false);
        grid[5][9].setEnabled(false);
        grid[6][9].setEnabled(false);
        grid[7][9].setEnabled(false);
        grid[8][9].setEnabled(false);
        grid[9][9].setEnabled(false);
        flag.setEnabled(false);
    }
    void enableGrid() {
        grid[0][0].setEnabled(true);
        grid[1][0].setEnabled(true);
        grid[2][0].setEnabled(true);
        grid[3][0].setEnabled(true);
        grid[4][0].setEnabled(true);
        grid[5][0].setEnabled(true);
        grid[6][0].setEnabled(true);
        grid[7][0].setEnabled(true);
        grid[8][0].setEnabled(true);
        grid[9][0].setEnabled(true);
        grid[0][1].setEnabled(true);
        grid[1][1].setEnabled(true);
        grid[2][1].setEnabled(true);
        grid[3][1].setEnabled(true);
        grid[4][1].setEnabled(true);
        grid[5][1].setEnabled(true);
        grid[6][1].setEnabled(true);
        grid[7][1].setEnabled(true);
        grid[8][1].setEnabled(true);
        grid[9][1].setEnabled(true);
        grid[0][2].setEnabled(true);
        grid[1][2].setEnabled(true);
        grid[2][2].setEnabled(true);
        grid[3][2].setEnabled(true);
        grid[4][2].setEnabled(true);
        grid[5][2].setEnabled(true);
        grid[6][2].setEnabled(true);
        grid[7][2].setEnabled(true);
        grid[8][2].setEnabled(true);
        grid[9][2].setEnabled(true);
        grid[0][3].setEnabled(true);
        grid[1][3].setEnabled(true);
        grid[2][3].setEnabled(true);
        grid[3][3].setEnabled(true);
        grid[4][3].setEnabled(true);
        grid[5][3].setEnabled(true);
        grid[6][3].setEnabled(true);
        grid[7][3].setEnabled(true);
        grid[8][3].setEnabled(true);
        grid[9][3].setEnabled(true);
        grid[0][4].setEnabled(true);
        grid[1][4].setEnabled(true);
        grid[2][4].setEnabled(true);
        grid[3][4].setEnabled(true);
        grid[4][4].setEnabled(true);
        grid[5][4].setEnabled(true);
        grid[6][4].setEnabled(true);
        grid[7][4].setEnabled(true);
        grid[8][4].setEnabled(true);
        grid[9][4].setEnabled(true);
        grid[0][5].setEnabled(true);
        grid[1][5].setEnabled(true);
        grid[2][5].setEnabled(true);
        grid[3][5].setEnabled(true);
        grid[4][5].setEnabled(true);
        grid[5][5].setEnabled(true);
        grid[6][5].setEnabled(true);
        grid[7][5].setEnabled(true);
        grid[8][5].setEnabled(true);
        grid[9][5].setEnabled(true);
        grid[0][6].setEnabled(true);
        grid[1][6].setEnabled(true);
        grid[2][6].setEnabled(true);
        grid[3][6].setEnabled(true);
        grid[4][6].setEnabled(true);
        grid[5][6].setEnabled(true);
        grid[6][6].setEnabled(true);
        grid[7][6].setEnabled(true);
        grid[8][6].setEnabled(true);
        grid[9][6].setEnabled(true);
        grid[0][7].setEnabled(true);
        grid[1][7].setEnabled(true);
        grid[2][7].setEnabled(true);
        grid[3][7].setEnabled(true);
        grid[4][7].setEnabled(true);
        grid[5][7].setEnabled(true);
        grid[6][7].setEnabled(true);
        grid[7][7].setEnabled(true);
        grid[8][7].setEnabled(true);
        grid[9][7].setEnabled(true);
        grid[0][8].setEnabled(true);
        grid[1][8].setEnabled(true);
        grid[2][8].setEnabled(true);
        grid[3][8].setEnabled(true);
        grid[4][8].setEnabled(true);
        grid[5][8].setEnabled(true);
        grid[6][8].setEnabled(true);
        grid[7][8].setEnabled(true);
        grid[8][8].setEnabled(true);
        grid[9][8].setEnabled(true);
        grid[0][9].setEnabled(true);
        grid[1][9].setEnabled(true);
        grid[2][9].setEnabled(true);
        grid[3][9].setEnabled(true);
        grid[4][9].setEnabled(true);
        grid[5][9].setEnabled(true);
        grid[6][9].setEnabled(true);
        grid[7][9].setEnabled(true);
        grid[8][9].setEnabled(true);
        grid[9][9].setEnabled(true);
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
                grid[0][0].setText("");
                grid[1][0].setText("");
                grid[2][0].setText("");
                grid[3][0].setText("");
                grid[4][0].setText("");
                grid[5][0].setText("");
                grid[6][0].setText("");
                grid[7][0].setText("");
                grid[8][0].setText("");
                grid[9][0].setText("");

                grid[0][1].setText("");
                grid[1][1].setText("");
                grid[2][1].setText("");
                grid[3][1].setText("");
                grid[4][1].setText("");
                grid[5][1].setText("");
                grid[6][1].setText("");
                grid[7][1].setText("");
                grid[8][1].setText("");
                grid[9][1].setText("");

                grid[0][2].setText("");
                grid[1][2].setText("");
                grid[2][2].setText("");
                grid[3][2].setText("");
                grid[4][2].setText("");
                grid[5][2].setText("");
                grid[6][2].setText("");
                grid[7][2].setText("");
                grid[8][2].setText("");
                grid[9][2].setText("");

                grid[0][3].setText("");
                grid[1][3].setText("");
                grid[2][3].setText("");
                grid[3][3].setText("");
                grid[4][3].setText("");
                grid[5][3].setText("");
                grid[6][3].setText("");
                grid[7][3].setText("");
                grid[8][3].setText("");
                grid[9][3].setText("");

                grid[0][4].setText("");
                grid[1][4].setText("");
                grid[2][4].setText("");
                grid[3][4].setText("");
                grid[4][4].setText("");
                grid[5][4].setText("");
                grid[6][4].setText("");
                grid[7][4].setText("");
                grid[8][4].setText("");
                grid[9][4].setText("");

                grid[0][5].setText("");
                grid[1][5].setText("");
                grid[2][5].setText("");
                grid[3][5].setText("");
                grid[4][5].setText("");
                grid[5][5].setText("");
                grid[6][5].setText("");
                grid[7][5].setText("");
                grid[8][5].setText("");
                grid[9][5].setText("");

                grid[0][6].setText("");
                grid[1][6].setText("");
                grid[2][6].setText("");
                grid[3][6].setText("");
                grid[4][6].setText("");
                grid[5][6].setText("");
                grid[6][6].setText("");
                grid[7][6].setText("");
                grid[8][6].setText("");
                grid[9][6].setText("");

                grid[0][7].setText("");
                grid[1][7].setText("");
                grid[2][7].setText("");
                grid[3][7].setText("");
                grid[4][7].setText("");
                grid[5][7].setText("");
                grid[6][7].setText("");
                grid[7][7].setText("");
                grid[8][7].setText("");
                grid[9][7].setText("");

                grid[0][8].setText("");
                grid[1][8].setText("");
                grid[2][8].setText("");
                grid[3][8].setText("");
                grid[4][8].setText("");
                grid[5][8].setText("");
                grid[6][8].setText("");
                grid[7][8].setText("");
                grid[8][8].setText("");
                grid[9][8].setText("");

                grid[0][9].setText("");
                grid[1][9].setText("");
                grid[2][9].setText("");
                grid[3][9].setText("");
                grid[4][9].setText("");
                grid[5][9].setText("");
                grid[6][9].setText("");
                grid[7][9].setText("");
                grid[8][9].setText("");
                grid[9][9].setText("");
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
        //grid[0][0] = findViewById(R.id.R1C1);
        grid[0][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][0].getText().toString().equals("#")) {
                        grid[0][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][0] > 0) {
                        grid[0][0].setText(String.valueOf(board[0][0]));
                    } else if (board[0][0] < 0) {
                        Log.d("", "mine clicked");
                        grid[0][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][0] = findViewById(R.id.R1C2);
        grid[1][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][0].getText().toString().equals("#")) {
                        grid[1][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][0] > 0) {
                        grid[1][0].setText(String.valueOf(board[1][0]));
                    } else if (board[1][0] < 0) {
                        grid[1][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][0] = findViewById(R.id.R1C3);
        grid[2][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][0].getText().toString().equals("#")) {
                        grid[2][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][0] > 0) {
                        grid[2][0].setText(String.valueOf(board[2][0]));
                    } else if (board[2][0] < 0) {
                        grid[2][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][0] = findViewById(R.id.R1C4);
        grid[3][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][0].getText().toString().equals("#")) {
                        grid[3][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][0] > 0) {
                        grid[3][0].setText(String.valueOf(board[3][0]));
                    } else if (board[3][0] < 0) {
                        grid[3][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][0] = findViewById(R.id.R1C5);
        grid[4][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][0].getText().toString().equals("#")) {
                        grid[4][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][0] > 0) {
                        grid[4][0].setText(String.valueOf(board[4][0]));
                    } else if (board[4][0] < 0) {
                        grid[4][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][0] = findViewById(R.id.R1C6);
        grid[5][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][0].getText().toString().equals("#")) {
                        grid[5][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][0] > 0) {
                        grid[5][0].setText(String.valueOf(board[5][0]));
                    } else if (board[5][0] < 0) {
                        grid[5][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][0] = findViewById(R.id.R1C7);
        grid[6][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][0].getText().toString().equals("#")) {
                        grid[6][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][0] > 0) {
                        grid[6][0].setText(String.valueOf(board[6][0]));
                    } else if (board[6][0] < 0) {
                        grid[6][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][0] = findViewById(R.id.R1C8);
        grid[7][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][0].getText().toString().equals("#")) {
                        grid[7][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][0] > 0) {
                        grid[7][0].setText(String.valueOf(board[7][0]));
                    } else if (board[7][0] < 0) {
                        grid[7][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][0] = findViewById(R.id.R1C9);
        grid[8][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][0].getText().toString().equals("#")) {
                        grid[8][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][0] > 0) {
                        grid[8][0].setText(String.valueOf(board[8][0]));
                    } else if (board[8][0] < 0) {
                        grid[8][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][0] = findViewById(R.id.R1C10);
        grid[9][0].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][0].getText().toString().equals("#")) {
                        grid[9][0].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][0].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][0].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][0] > 0) {
                        grid[9][0].setText(String.valueOf(board[9][0]));
                    } else if (board[9][0] < 0) {
                        grid[9][0].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });



        //Row 2
        grid[0][1] = findViewById(R.id.R2C1);
        grid[0][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][1].getText().toString().equals("#")) {
                        grid[0][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][1] > 0) {
                        grid[0][1].setText(String.valueOf(board[0][1]));
                    } else if (board[0][1] < 0) {
                        grid[0][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][1] = findViewById(R.id.R2C2);
        grid[1][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][1].getText().toString().equals("#")) {
                        grid[1][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][1] > 0) {
                        grid[1][1].setText(String.valueOf(board[1][1]));
                    } else if (board[1][1] < 0) {
                        grid[1][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][1] = findViewById(R.id.R2C3);
        grid[2][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][1].getText().toString().equals("#")) {
                        grid[2][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][1] > 0) {
                        grid[2][1].setText(String.valueOf(board[2][1]));
                    } else if (board[2][1] < 0) {
                        grid[2][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][1] = findViewById(R.id.R2C4);
        grid[3][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][1].getText().toString().equals("#")) {
                        grid[3][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][1] > 0) {
                        grid[3][1].setText(String.valueOf(board[3][1]));
                    } else if (board[3][1] < 0) {
                        grid[3][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][1] = findViewById(R.id.R2C5);
        grid[4][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][1].getText().toString().equals("#")) {
                        grid[4][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][1] > 0) {
                        grid[4][1].setText(String.valueOf(board[4][1]));
                    } else if (board[4][1] < 0) {
                        grid[4][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][1] = findViewById(R.id.R2C6);
        grid[5][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][1].getText().toString().equals("#")) {
                        grid[5][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][1] > 0) {
                        grid[5][1].setText(String.valueOf(board[5][1]));
                    } else if (board[5][1] < 0) {
                        grid[5][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][1] = findViewById(R.id.R2C7);
        grid[6][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][1].getText().toString().equals("#")) {
                        grid[6][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][1] > 0) {
                        grid[6][1].setText(String.valueOf(board[6][1]));
                    } else if (board[6][1] < 0) {
                        grid[6][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][1] = findViewById(R.id.R2C8);
        grid[7][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][1].getText().toString().equals("#")) {
                        grid[7][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][1] > 0) {
                        grid[7][1].setText(String.valueOf(board[7][1]));
                    } else if (board[7][1] < 0) {
                        grid[7][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][1] = findViewById(R.id.R2C9);
        grid[8][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][1].getText().toString().equals("#")) {
                        grid[8][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][1] > 0) {
                        grid[8][1].setText(String.valueOf(board[8][1]));
                    } else if (board[8][1] < 0) {
                        grid[8][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][1] = findViewById(R.id.R2C10);
        grid[9][1].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][1].getText().toString().equals("#")) {
                        grid[9][1].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][1].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][1].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][1] > 0) {
                        grid[9][1].setText(String.valueOf(board[9][1]));
                    } else if (board[9][1] < 0) {
                        grid[9][1].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 3
        grid[0][2] = findViewById(R.id.R3C1);
        grid[0][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][2].getText().toString().equals("#")) {
                        grid[0][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][2] > 0) {
                        grid[0][2].setText(String.valueOf(board[0][2]));
                    } else if (board[0][2] < 0) {
                        grid[0][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][2] = findViewById(R.id.R3C2);
        grid[1][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][2].getText().toString().equals("#")) {
                        grid[1][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][2] > 0) {
                        grid[1][2].setText(String.valueOf(board[1][2]));
                    } else if (board[1][2] < 0) {
                        grid[1][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][2] = findViewById(R.id.R3C3);
        grid[2][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][2].getText().toString().equals("#")) {
                        grid[2][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][2] > 0) {
                        grid[2][2].setText(String.valueOf(board[2][2]));
                    } else if (board[2][2] < 0) {
                        grid[2][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][2] = findViewById(R.id.R3C4);
        grid[3][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][2].getText().toString().equals("#")) {
                        grid[3][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][2] > 0) {
                        grid[3][2].setText(String.valueOf(board[3][2]));
                    } else if (board[3][2] < 0) {
                        grid[3][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][2] = findViewById(R.id.R3C5);
        grid[4][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][2].getText().toString().equals("#")) {
                        grid[4][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][2] > 0) {
                        grid[4][2].setText(String.valueOf(board[4][2]));
                    } else if (board[4][2] < 0) {
                        grid[4][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][2] = findViewById(R.id.R3C6);
        grid[5][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][2].getText().toString().equals("#")) {
                        grid[5][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][2] > 0) {
                        grid[5][2].setText(String.valueOf(board[5][2]));
                    } else if (board[5][2] < 0) {
                        grid[5][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][2] = findViewById(R.id.R3C7);
        grid[6][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][2].getText().toString().equals("#")) {
                        grid[6][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][2] > 0) {
                        grid[6][2].setText(String.valueOf(board[6][2]));
                    } else if (board[6][2] < 0) {
                        grid[6][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][2] = findViewById(R.id.R3C8);
        grid[7][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][2].getText().toString().equals("#")) {
                        grid[7][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][2] > 0) {
                        grid[7][2].setText(String.valueOf(board[7][2]));
                    } else if (board[7][2] < 0) {
                        grid[7][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][2] = findViewById(R.id.R3C9);
        grid[8][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][2].getText().toString().equals("#")) {
                        grid[8][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][2] > 0) {
                        grid[8][2].setText(String.valueOf(board[8][2]));
                    } else if (board[8][2] < 0) {
                        grid[8][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][2] = findViewById(R.id.R3C10);
        grid[9][2].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][2].getText().toString().equals("#")) {
                        grid[9][2].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][2].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][2].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][2] > 0) {
                        grid[9][2].setText(String.valueOf(board[9][2]));
                    } else if (board[9][2] < 0) {
                        grid[9][2].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 4
        grid[0][3] = findViewById(R.id.R4C1);
        grid[0][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][3].getText().toString().equals("#")) {
                        grid[0][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][3] > 0) {
                        grid[0][3].setText(String.valueOf(board[0][3]));
                    } else if (board[0][3] < 0) {
                        grid[0][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][3] = findViewById(R.id.R4C2);
        grid[1][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][3].getText().toString().equals("#")) {
                        grid[1][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][3] > 0) {
                        grid[1][3].setText(String.valueOf(board[1][3]));
                    } else if (board[1][3] < 0) {
                        grid[1][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][3] = findViewById(R.id.R4C3);
        grid[2][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][3].getText().toString().equals("#")) {
                        grid[2][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][3] > 0) {
                        grid[2][3].setText(String.valueOf(board[2][3]));
                    } else if (board[2][3] < 0) {
                        grid[2][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][3] = findViewById(R.id.R4C4);
        grid[3][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][3].getText().toString().equals("#")) {
                        grid[3][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][3] > 0) {
                        grid[3][3].setText(String.valueOf(board[3][3]));
                    } else if (board[3][3] < 0) {
                        grid[3][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][3] = findViewById(R.id.R4C5);
        grid[4][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][3].getText().toString().equals("#")) {
                        grid[4][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][3] > 0) {
                        grid[4][3].setText(String.valueOf(board[4][3]));
                    } else if (board[4][3] < 0) {
                        grid[4][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][3] = findViewById(R.id.R4C6);
        grid[5][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][3].getText().toString().equals("#")) {
                        grid[5][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][3] > 0) {
                        grid[5][3].setText(String.valueOf(board[5][3]));
                    } else if (board[5][3] < 0) {
                        grid[5][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][3] = findViewById(R.id.R4C7);
        grid[6][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][3].getText().toString().equals("#")) {
                        grid[6][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][3] > 0) {
                        grid[6][3].setText(String.valueOf(board[6][3]));
                    } else if (board[6][3] < 0) {
                        grid[6][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][3] = findViewById(R.id.R4C8);
        grid[7][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][3].getText().toString().equals("#")) {
                        grid[7][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][3] > 0) {
                        grid[7][3].setText(String.valueOf(board[7][3]));
                    } else if (board[7][3] < 0) {
                        grid[7][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][3] = findViewById(R.id.R4C9);
        grid[8][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][3].getText().toString().equals("#")) {
                        grid[8][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][3] > 0) {
                        grid[8][3].setText(String.valueOf(board[8][3]));
                    } else if (board[8][3] < 0) {
                        grid[8][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][3] = findViewById(R.id.R4C10);
        grid[9][3].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][3].getText().toString().equals("#")) {
                        grid[9][3].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][3].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][3].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][3] > 0) {
                        grid[9][3].setText(String.valueOf(board[9][3]));
                    } else if (board[9][3] < 0) {
                        grid[9][3].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 5
        grid[0][4] = findViewById(R.id.R5C1);
        grid[0][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][4].getText().toString().equals("#")) {
                        grid[0][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][4] > 0) {
                        grid[0][4].setText(String.valueOf(board[0][4]));
                    } else if (board[0][4] < 0) {
                        grid[0][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][4] = findViewById(R.id.R5C2);
        grid[1][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][4].getText().toString().equals("#")) {
                        grid[1][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][4] > 0) {
                        grid[1][4].setText(String.valueOf(board[1][4]));
                    } else if (board[1][4] < 0) {
                        grid[1][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][4] = findViewById(R.id.R5C3);
        grid[2][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][4].getText().toString().equals("#")) {
                        grid[2][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][4] > 0) {
                        grid[2][4].setText(String.valueOf(board[2][4]));
                    } else if (board[2][4] < 0) {
                        grid[2][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][4] = findViewById(R.id.R5C4);
        grid[3][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][4].getText().toString().equals("#")) {
                        grid[3][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][4] > 0) {
                        grid[3][4].setText(String.valueOf(board[3][4]));
                    } else if (board[3][4] < 0) {
                        grid[3][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][4] = findViewById(R.id.R5C5);
        grid[4][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][4].getText().toString().equals("#")) {
                        grid[4][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][4] > 0) {
                        grid[4][4].setText(String.valueOf(board[4][4]));
                    } else if (board[4][4] < 0) {
                        grid[4][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][4] = findViewById(R.id.R5C6);
        grid[5][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][4].getText().toString().equals("#")) {
                        grid[5][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][4] > 0) {
                        grid[5][4].setText(String.valueOf(board[5][4]));
                    } else if (board[5][4] < 0) {
                        grid[5][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][4] = findViewById(R.id.R5C7);
        grid[6][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][4].getText().toString().equals("#")) {
                        grid[6][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][4] > 0) {
                        grid[6][4].setText(String.valueOf(board[6][4]));
                    } else if (board[6][4] < 0) {
                        grid[6][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][4] = findViewById(R.id.R5C8);
        grid[7][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][4].getText().toString().equals("#")) {
                        grid[7][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][4] > 0) {
                        grid[7][4].setText(String.valueOf(board[7][4]));
                    } else if (board[7][4] < 0) {
                        grid[7][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][4] = findViewById(R.id.R5C9);
        grid[8][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][4].getText().toString().equals("#")) {
                        grid[8][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][4] > 0) {
                        grid[8][4].setText(String.valueOf(board[8][4]));
                    } else if (board[8][4] < 0) {
                        grid[8][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][4] = findViewById(R.id.R5C10);
        grid[9][4].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][4].getText().toString().equals("#")) {
                        grid[9][4].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][4].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][4].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][4] > 0) {
                        grid[9][4].setText(String.valueOf(board[9][4]));
                    } else if (board[9][4] < 0) {
                        grid[9][4].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 6
        grid[0][5] = findViewById(R.id.R6C1);
        grid[0][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][5].getText().toString().equals("#")) {
                        grid[0][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][5] > 0) {
                        grid[0][5].setText(String.valueOf(board[0][5]));
                    } else if (board[0][5] < 0) {
                        grid[0][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][5] = findViewById(R.id.R6C2);
        grid[1][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][5].getText().toString().equals("#")) {
                        grid[1][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][5] > 0) {
                        grid[1][5].setText(String.valueOf(board[1][5]));
                    } else if (board[1][5] < 0) {
                        grid[1][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][5] = findViewById(R.id.R6C3);
        grid[2][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][5].getText().toString().equals("#")) {
                        grid[2][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][5] > 0) {
                        grid[2][5].setText(String.valueOf(board[2][5]));
                    } else if (board[2][5] < 0) {
                        grid[2][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][5] = findViewById(R.id.R6C4);
        grid[3][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][5].getText().toString().equals("#")) {
                        grid[3][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][5] > 0) {
                        grid[3][5].setText(String.valueOf(board[3][5]));
                    } else if (board[3][5] < 0) {
                        grid[3][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][5] = findViewById(R.id.R6C5);
        grid[4][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][5].getText().toString().equals("#")) {
                        grid[4][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][5] > 0) {
                        grid[4][5].setText(String.valueOf(board[4][5]));
                    } else if (board[4][5] < 0) {
                        grid[4][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][5] = findViewById(R.id.R6C6);
        grid[5][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][5].getText().toString().equals("#")) {
                        grid[5][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][5] > 0) {
                        grid[5][5].setText(String.valueOf(board[5][5]));
                    } else if (board[5][5] < 0) {
                        grid[5][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][5] = findViewById(R.id.R6C7);
        grid[6][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][5].getText().toString().equals("#")) {
                        grid[6][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][5] > 0) {
                        grid[6][5].setText(String.valueOf(board[6][5]));
                    } else if (board[6][5] < 0) {
                        grid[6][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][5] = findViewById(R.id.R6C8);
        grid[7][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][5].getText().toString().equals("#")) {
                        grid[7][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][5] > 0) {
                        grid[7][5].setText(String.valueOf(board[7][5]));
                    } else if (board[7][5] < 0) {
                        grid[7][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][5] = findViewById(R.id.R6C9);
        grid[8][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][5].getText().toString().equals("#")) {
                        grid[8][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][5] > 0) {
                        grid[8][5].setText(String.valueOf(board[8][5]));
                    } else if (board[8][5] < 0) {
                        grid[8][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][5] = findViewById(R.id.R6C10);
        grid[9][5].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][5].getText().toString().equals("#")) {
                        grid[9][5].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][5].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][5].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][5] > 0) {
                        grid[9][5].setText(String.valueOf(board[9][5]));
                    } else if (board[9][5] < 0) {
                        grid[9][5].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 7
        grid[0][6] = findViewById(R.id.R7C1);
        grid[0][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][6].getText().toString().equals("#")) {
                        grid[0][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][6] > 0) {
                        grid[0][6].setText(String.valueOf(board[0][6]));
                    } else if (board[0][6] < 0) {
                        grid[0][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][6] = findViewById(R.id.R7C2);
        grid[1][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][6].getText().toString().equals("#")) {
                        grid[1][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][6] > 0) {
                        grid[1][6].setText(String.valueOf(board[1][6]));
                    } else if (board[1][6] < 0) {
                        grid[1][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][6] = findViewById(R.id.R7C3);
        grid[2][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][6].getText().toString().equals("#")) {
                        grid[2][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][6] > 0) {
                        grid[2][6].setText(String.valueOf(board[2][6]));
                    } else if (board[2][6] < 0) {
                        grid[2][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][6] = findViewById(R.id.R7C4);
        grid[3][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][6].getText().toString().equals("#")) {
                        grid[3][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][6] > 0) {
                        grid[3][6].setText(String.valueOf(board[3][6]));
                    } else if (board[3][6] < 0) {
                        grid[3][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][6] = findViewById(R.id.R7C5);
        grid[4][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][6].getText().toString().equals("#")) {
                        grid[4][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][6] > 0) {
                        grid[4][6].setText(String.valueOf(board[4][6]));
                    } else if (board[4][6] < 0) {
                        grid[4][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][6] = findViewById(R.id.R7C6);
        grid[5][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][6].getText().toString().equals("#")) {
                        grid[5][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][6] > 0) {
                        grid[5][6].setText(String.valueOf(board[5][6]));
                    } else if (board[5][6] < 0) {
                        grid[5][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][6] = findViewById(R.id.R7C7);
        grid[6][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][6].getText().toString().equals("#")) {
                        grid[6][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][6] > 0) {
                        grid[6][6].setText(String.valueOf(board[6][6]));
                    } else if (board[6][6] < 0) {
                        grid[6][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][6] = findViewById(R.id.R7C8);
        grid[7][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][6].getText().toString().equals("#")) {
                        grid[7][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][6] > 0) {
                        grid[7][6].setText(String.valueOf(board[7][6]));
                    } else if (board[7][6] < 0) {
                        grid[7][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][6] = findViewById(R.id.R7C9);
        grid[8][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][6].getText().toString().equals("#")) {
                        grid[8][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][6] > 0) {
                        grid[8][6].setText(String.valueOf(board[8][6]));
                    } else if (board[8][6] < 0) {
                        grid[8][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][6] = findViewById(R.id.R7C10);
        grid[9][6].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][6].getText().toString().equals("#")) {
                        grid[9][6].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][6].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][6].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][6] > 0) {
                        grid[9][6].setText(String.valueOf(board[9][6]));
                    } else if (board[9][6] < 0) {
                        grid[9][6].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 8
        grid[0][7] = findViewById(R.id.R8C1);
        grid[0][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][7].getText().toString().equals("#")) {
                        grid[0][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][7] > 0) {
                        grid[0][7].setText(String.valueOf(board[0][7]));
                    } else if (board[0][7] < 0) {
                        grid[0][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][7] = findViewById(R.id.R8C2);
        grid[1][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][7].getText().toString().equals("#")) {
                        grid[1][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][7] > 0) {
                        grid[1][7].setText(String.valueOf(board[1][7]));
                    } else if (board[1][7] < 0) {
                        grid[1][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][7] = findViewById(R.id.R8C3);
        grid[2][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][7].getText().toString().equals("#")) {
                        grid[2][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][7] > 0) {
                        grid[2][7].setText(String.valueOf(board[2][7]));
                    } else if (board[2][7] < 0) {
                        grid[2][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][7] = findViewById(R.id.R8C4);
        grid[3][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][7].getText().toString().equals("#")) {
                        grid[3][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][7] > 0) {
                        grid[3][7].setText(String.valueOf(board[3][7]));
                    } else if (board[3][7] < 0) {
                        grid[3][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][7] = findViewById(R.id.R8C5);
        grid[4][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][7].getText().toString().equals("#")) {
                        grid[4][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][7] > 0) {
                        grid[4][7].setText(String.valueOf(board[4][7]));
                    } else if (board[4][7] < 0) {
                        grid[4][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][7] = findViewById(R.id.R8C6);
        grid[5][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][7].getText().toString().equals("#")) {
                        grid[5][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][7] > 0) {
                        grid[5][7].setText(String.valueOf(board[5][7]));
                    } else if (board[5][7] < 0) {
                        grid[5][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][7] = findViewById(R.id.R8C7);
        grid[6][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][7].getText().toString().equals("#")) {
                        grid[6][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][7] > 0) {
                        grid[6][7].setText(String.valueOf(board[6][7]));
                    } else if (board[6][7] < 0) {
                        grid[6][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][7] = findViewById(R.id.R8C8);
        grid[7][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][7].getText().toString().equals("#")) {
                        grid[7][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][7] > 0) {
                        grid[7][7].setText(String.valueOf(board[7][7]));
                    } else if (board[7][7] < 0) {
                        grid[7][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][7] = findViewById(R.id.R8C9);
        grid[8][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][7].getText().toString().equals("#")) {
                        grid[8][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][7] > 0) {
                        grid[8][7].setText(String.valueOf(board[8][7]));
                    } else if (board[8][7] < 0) {
                        grid[8][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][7] = findViewById(R.id.R8C10);
        grid[9][7].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][7].getText().toString().equals("#")) {
                        grid[9][7].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][7].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][7].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][7] > 0) {
                        grid[9][7].setText(String.valueOf(board[9][7]));
                    } else if (board[9][7] < 0) {
                        grid[9][7].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 9
        grid[0][8] = findViewById(R.id.R9C1);
        grid[0][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][8].getText().toString().equals("#")) {
                        grid[0][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][8] > 0) {
                        grid[0][8].setText(String.valueOf(board[0][8]));
                    } else if (board[0][8] < 0) {
                        grid[0][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][8] = findViewById(R.id.R9C2);
        grid[1][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][8].getText().toString().equals("#")) {
                        grid[1][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][8] > 0) {
                        grid[1][8].setText(String.valueOf(board[1][8]));
                    } else if (board[1][8] < 0) {
                        grid[1][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][8] = findViewById(R.id.R9C3);
        grid[2][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][8].getText().toString().equals("#")) {
                        grid[2][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][8] > 0) {
                        grid[2][8].setText(String.valueOf(board[2][8]));
                    } else if (board[2][8] < 0) {
                        grid[2][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][8] = findViewById(R.id.R9C4);
        grid[3][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][8].getText().toString().equals("#")) {
                        grid[3][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][8] > 0) {
                        grid[3][8].setText(String.valueOf(board[3][8]));
                    } else if (board[3][8] < 0) {
                        grid[3][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][8] = findViewById(R.id.R9C5);
        grid[4][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][8].getText().toString().equals("#")) {
                        grid[4][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][8] > 0) {
                        grid[4][8].setText(String.valueOf(board[4][8]));
                    } else if (board[4][8] < 0) {
                        grid[4][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][8] = findViewById(R.id.R9C6);
        grid[5][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][8].getText().toString().equals("#")) {
                        grid[5][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][8] > 0) {
                        grid[5][8].setText(String.valueOf(board[5][8]));
                    } else if (board[5][8] < 0) {
                        grid[5][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][8] = findViewById(R.id.R9C7);
        grid[6][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][8].getText().toString().equals("#")) {
                        grid[6][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][8] > 0) {
                        grid[6][8].setText(String.valueOf(board[6][8]));
                    } else if (board[6][8] < 0) {
                        grid[6][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][8] = findViewById(R.id.R9C8);
        grid[7][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][8].getText().toString().equals("#")) {
                        grid[7][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][8] > 0) {
                        grid[7][8].setText(String.valueOf(board[7][8]));
                    } else if (board[7][8] < 0) {
                        grid[7][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][8] = findViewById(R.id.R9C9);
        grid[8][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][8].getText().toString().equals("#")) {
                        grid[8][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][8] > 0) {
                        grid[8][8].setText(String.valueOf(board[8][8]));
                    } else if (board[8][8] < 0) {
                        grid[8][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][8] = findViewById(R.id.R9C10);
        grid[9][8].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][8].getText().toString().equals("#")) {
                        grid[9][8].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][8].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][8].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][8] > 0) {
                        grid[9][8].setText(String.valueOf(board[9][8]));
                    } else if (board[9][8] < 0) {
                        grid[9][8].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });


        //Row 10
        grid[0][9] = findViewById(R.id.R10C1);
        grid[0][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[0][9].getText().toString().equals("#")) {
                        grid[0][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[0][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[0][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[0][9] > 0) {
                        grid[0][9].setText(String.valueOf(board[0][9]));
                    } else if (board[0][9] < 0) {
                        grid[0][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[1][9] = findViewById(R.id.R10C2);
        grid[1][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[1][9].getText().toString().equals("#")) {
                        grid[1][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[1][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[1][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[1][9] > 0) {
                        grid[1][9].setText(String.valueOf(board[1][9]));
                    } else if (board[1][9] < 0) {
                        grid[1][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[2][9] = findViewById(R.id.R10C3);
        grid[2][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[2][9].getText().toString().equals("#")) {
                        grid[2][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[2][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[2][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[2][9] > 0) {
                        grid[2][9].setText(String.valueOf(board[2][9]));
                    } else if (board[2][9] < 0) {
                        grid[2][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[3][9] = findViewById(R.id.R10C4);
        grid[3][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[3][9].getText().toString().equals("#")) {
                        grid[3][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[3][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[3][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[3][9] > 0) {
                        grid[3][9].setText(String.valueOf(board[3][9]));
                    } else if (board[3][9] < 0) {
                        grid[3][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[4][9] = findViewById(R.id.R10C5);
        grid[4][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[4][9].getText().toString().equals("#")) {
                        grid[4][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[4][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[4][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[4][9] > 0) {
                        grid[4][9].setText(String.valueOf(board[4][9]));
                    } else if (board[4][9] < 0) {
                        grid[4][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[5][9] = findViewById(R.id.R10C6);
        grid[5][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[5][9].getText().toString().equals("#")) {
                        grid[5][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[5][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[5][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[5][9] > 0) {
                        grid[5][9].setText(String.valueOf(board[5][9]));
                    } else if (board[5][9] < 0) {
                        grid[5][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[6][9] = findViewById(R.id.R10C7);
        grid[6][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[6][9].getText().toString().equals("#")) {
                        grid[6][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[6][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[6][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[6][9] > 0) {
                        grid[6][9].setText(String.valueOf(board[6][9]));
                    } else if (board[6][9] < 0) {
                        grid[6][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[7][9] = findViewById(R.id.R10C8);
        grid[7][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[7][9].getText().toString().equals("#")) {
                        grid[7][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[7][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[7][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[7][9] > 0) {
                        grid[7][9].setText(String.valueOf(board[7][9]));
                    } else if (board[7][9] < 0) {
                        grid[7][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[8][9] = findViewById(R.id.R10C9);
        grid[8][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[8][9].getText().toString().equals("#")) {
                        grid[8][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[8][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[8][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[8][9] > 0) {
                        grid[8][9].setText(String.valueOf(board[8][9]));
                    } else if (board[8][9] < 0) {
                        grid[8][9].setText("X");
                        gO(true);
                    }
                    checkIfOver();
                }
            }
        });

        grid[9][9] = findViewById(R.id.R10C10);
        grid[9][9].setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (flagging) {
                    if (grid[9][9].getText().toString().equals("#")) {
                        grid[9][9].setText("");
                        minesRemaining++;
                        mR.setText(String.valueOf(minesRemaining));
                    } else {
                        grid[9][9].setText("#");
                        minesRemaining--;
                        mR.setText(String.valueOf(minesRemaining));
                    }
                } else {
                    grid[9][9].setEnabled(false);
                    currentScore++;

                    mR.setText(String.valueOf(minesRemaining));
                    s.setText(String.valueOf(currentScore));
                    if (board[9][9] > 0) {
                        grid[9][9].setText(String.valueOf(board[9][9]));
                    } else if (board[9][9] < 0) {
                        grid[9][9].setText("X");
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
                    grid[0][0].setText("");
                    grid[1][0].setText("");
                    grid[2][0].setText("");
                    grid[3][0].setText("");
                    grid[4][0].setText("");
                    grid[5][0].setText("");
                    grid[6][0].setText("");
                    grid[7][0].setText("");
                    grid[8][0].setText("");
                    grid[9][0].setText("");

                    grid[0][1].setText("");
                    grid[1][1].setText("");
                    grid[2][1].setText("");
                    grid[3][1].setText("");
                    grid[4][1].setText("");
                    grid[5][1].setText("");
                    grid[6][1].setText("");
                    grid[7][1].setText("");
                    grid[8][1].setText("");
                    grid[9][1].setText("");

                    grid[0][2].setText("");
                    grid[1][2].setText("");
                    grid[2][2].setText("");
                    grid[3][2].setText("");
                    grid[4][2].setText("");
                    grid[5][2].setText("");
                    grid[6][2].setText("");
                    grid[7][2].setText("");
                    grid[8][2].setText("");
                    grid[9][2].setText("");

                    grid[0][3].setText("");
                    grid[1][3].setText("");
                    grid[2][3].setText("");
                    grid[3][3].setText("");
                    grid[4][3].setText("");
                    grid[5][3].setText("");
                    grid[6][3].setText("");
                    grid[7][3].setText("");
                    grid[8][3].setText("");
                    grid[9][3].setText("");

                    grid[0][4].setText("");
                    grid[1][4].setText("");
                    grid[2][4].setText("");
                    grid[3][4].setText("");
                    grid[4][4].setText("");
                    grid[5][4].setText("");
                    grid[6][4].setText("");
                    grid[7][4].setText("");
                    grid[8][4].setText("");
                    grid[9][4].setText("");

                    grid[0][5].setText("");
                    grid[1][5].setText("");
                    grid[2][5].setText("");
                    grid[3][5].setText("");
                    grid[4][5].setText("");
                    grid[5][5].setText("");
                    grid[6][5].setText("");
                    grid[7][5].setText("");
                    grid[8][5].setText("");
                    grid[9][5].setText("");

                    grid[0][6].setText("");
                    grid[1][6].setText("");
                    grid[2][6].setText("");
                    grid[3][6].setText("");
                    grid[4][6].setText("");
                    grid[5][6].setText("");
                    grid[6][6].setText("");
                    grid[7][6].setText("");
                    grid[8][6].setText("");
                    grid[9][6].setText("");

                    grid[0][7].setText("");
                    grid[1][7].setText("");
                    grid[2][7].setText("");
                    grid[3][7].setText("");
                    grid[4][7].setText("");
                    grid[5][7].setText("");
                    grid[6][7].setText("");
                    grid[7][7].setText("");
                    grid[8][7].setText("");
                    grid[9][7].setText("");

                    grid[0][8].setText("");
                    grid[1][8].setText("");
                    grid[2][8].setText("");
                    grid[3][8].setText("");
                    grid[4][8].setText("");
                    grid[5][8].setText("");
                    grid[6][8].setText("");
                    grid[7][8].setText("");
                    grid[8][8].setText("");
                    grid[9][8].setText("");

                    grid[0][9].setText("");
                    grid[1][9].setText("");
                    grid[2][9].setText("");
                    grid[3][9].setText("");
                    grid[4][9].setText("");
                    grid[5][9].setText("");
                    grid[6][9].setText("");
                    grid[7][9].setText("");
                    grid[8][9].setText("");
                    grid[9][9].setText("");
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
