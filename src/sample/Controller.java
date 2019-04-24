package sample;

import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Duration;

public class Controller {

    Game game = new Game();
    Timeline timeline;

    
    @FXML
    GridPane gp_board;

    public void fillGrid(ActionEvent actionEvent) {

        timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> {
            for (int i = 0; i < Game.BOARDSIZEX; i++) {
                for (int j = 0; j < Game.BOARDSIZEY; j++) {
                    if (game.getBoard()[i][j].isAlive()) {
                        gp_board.add(new Rectangle(24, 18, Color.valueOf("YELLOW")), i, j);
                    } else {
                        gp_board.add(new Rectangle(24, 18, Color.valueOf("GREY")), i, j);
                    }
                }
            }
            game.update();
        }));
        timeline.setCycleCount(Timeline.INDEFINITE);
        timeline.play();
    }
        ///////// Stops the animation when pressed /////////
    public void stop(ActionEvent actionEvent) {
        timeline.stop();

    }
       ///////// adds random cells and starts the animation /////////
    public void inputRandom(ActionEvent actionEvent) {
        game.addLivingCell();
    }
}