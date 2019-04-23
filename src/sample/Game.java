package sample;

import javafx.animation.Timeline;

public class Game {

    //////////////////////////////////////// CONSTANTS ///////////////////////////////////////
    public static final int BOARDSIZEX = 25;
    public static final int BOARDSIZEY = 25;


    private Cell[][] board = new Cell[BOARDSIZEX][BOARDSIZEY];

    public Game(){

        for (int i = 0; i < BOARDSIZEX ; i++) {
            for (int j = 0; j < BOARDSIZEY ; j++) {
                board[i][j] = new Cell();

            }

        }
    }

    public void update(){

    }

    public void addLivingCell(){

        for (int i = 0; i < BOARDSIZEX ; i++) {
            for (int j = 0; j < BOARDSIZEY ; j++) {
                int temp = (int) (Math.random()*1.04);

                if (temp == 0){
                    board[i][j].setAlive(false);
                } else  board [i][j].setAlive(true);
            }

        }

    }

    public Cell[][] getBoard() {
        return board;
    }

    public void setBoard(Cell[][] board) {
        this.board = board;
    }
}
