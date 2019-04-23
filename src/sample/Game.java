package sample;

import javafx.animation.Timeline;

public class Game {

    //////////// CONSTANTS ////////////
    public static final int BOARDSIZEX = 25;
    public static final int BOARDSIZEY = 25;

    //////////// VARIABLES ////////////

    private Cell[][] board = new Cell[BOARDSIZEX][BOARDSIZEY];

    //////////// CONSTRUCTORS ////////////

    public Game(){

        for (int i = 0; i < BOARDSIZEX ; i++) {
            for (int j = 0; j < BOARDSIZEY ; j++) {
                board[i][j] = new Cell();
            }

        }
    }


    public void addLivingCell(){

        for (int i = 0; i < BOARDSIZEX ; i++) {
            for (int j = 0; j < BOARDSIZEY ; j++) {
                int temp = (int) (Math.random()*1.5);

                if (temp == 0){
                    board[i][j].setAlive(false);
                } else  board [i][j].setAlive(true);
            }

        }

    }

    public void update(){
        neighboursCounters(board);

        for (int i = 0; i < BOARDSIZEX; i++) {
            for (int j = 0; j < BOARDSIZEY; j++) {
                board[i][j].update();
            }
        }
    }

    public void neighboursCounters(Cell[][] board) {
        //variables to get neighbour location.
        int neighbourCounter;
        boolean nw, n, ne, w, e, sw, s, se = false;


        for (int i = 0; i < BOARDSIZEX; i++) {
            for (int j = 0; j < BOARDSIZEY; j++) {

                //resets after each run.
                neighbourCounter = 0;

                nw = cellWithingGrid(i-1,j-1);
                n  = cellWithingGrid(i-1,j);
                ne = cellWithingGrid(i-1,j+1);
                w = cellWithingGrid(i,j-1);
                e = cellWithingGrid(i,j+1);
                sw = cellWithingGrid(i+1,j-1);
                s = cellWithingGrid(i+1,j);
                se = cellWithingGrid(i+1,j+1);

                if(nw){
                    if (board[i-1][j-1].isAlive()){
                        neighbourCounter++;
                    }
                } if(n){
                    if (board[i-1][j].isAlive()){
                        neighbourCounter++;
                    }
                } if(ne){
                    if (board[i-1][j+1].isAlive()){
                        neighbourCounter++;
                    }
                } if(w){
                    if (board[i][j-1].isAlive()){
                        neighbourCounter++;
                    }
                } if(e){
                    if (board[i][j+1].isAlive()){
                        neighbourCounter++;
                    }
                } if(sw){
                    if (board[i+1][j-1].isAlive()){
                        neighbourCounter++;
                    }
                } if(s){
                    if (board[i+1][j].isAlive()){
                        neighbourCounter++;
                    }
                } if(se){
                    if (board[i+1][j+1].isAlive()){
                        neighbourCounter++;
                    }
                }

                //Assign neighborCounter value to the Cells livingNeighbors variable
                board[i][j].setLivingNeighbours(neighbourCounter);

            }
        }


    }


    private boolean cellWithingGrid(int gridX, int gridY){

        if ((gridX < 0) || (gridY < 0)){
            return false;
        }
        if ((gridX >= BOARDSIZEX) || (gridY >= BOARDSIZEY)){
            return false;
        }
        return true;
    }

            public Cell[][] getBoard() {
                return board;
            }

            public void setBoard(Cell[][]board){
                this.board = board;
            }
        }
