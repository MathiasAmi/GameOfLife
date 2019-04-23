package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Controller {

    @FXML
    Button btn_start;

    @FXML
    Button btn_stop;

    @FXML
    GridPane gp_board;
    Game game = new Game();

    public void fillGrid(ActionEvent actionEvent) {

        game.update();

        for (int i = 0; i < Game.BOARDSIZEX; i++) {
            for (int j = 0; j < Game.BOARDSIZEY; j++) {
                if(game.getBoard()[i][j].isAlive()){
                    gp_board.add(new Rectangle(24,18, Color.valueOf("RED")), i,j);
                } else {
                    gp_board.add(new Rectangle(24,18, Color.valueOf("BLACK")), i,j);
                }
            }
        }
    }

    public void stop(ActionEvent actionEvent) {
        game.addLivingCell();

    }
}