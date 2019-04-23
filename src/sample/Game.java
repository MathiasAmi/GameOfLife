package sample;

public class Game {

    private static final int BOARDSIZEX = 25;
    private static final int BOARDSIZEY = 25;


    Cell[][] board = new Cell[BOARDSIZEX][BOARDSIZEY];

    public Game(){

        for (int i = 0; i < BOARDSIZEX ; i++) {
            for (int j = 0; j < BOARDSIZEY ; j++) {

                board[i][j] = new Cell();

            }

        }
    }

    public void addLivingCell(int living){

        int[] amountOfLiving = new int[living];

        for (Integer i : amountOfLiving){
            
        }

    }
}
