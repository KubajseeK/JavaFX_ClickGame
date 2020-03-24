package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;

public class Controller {
    public Button btnUpperLeft;
    public Button btnUpperRight;
    public Button btnBottomLeft;
    public Button btnBottomRight;

    private Game game;

    public Controller(){
        game = new Game();
    }

    public void initialize(){
        setButtons();
    }

    public void setButtons(){
        btnUpperLeft.setText(game.getField().getTile(0,0));
        btnUpperRight.setText(game.getField().getTile(0,1));
        btnBottomLeft.setText(game.getField().getTile(1,0));
        btnBottomRight.setText(game.getField().getTile(1,1));
    }


    public void click1(ActionEvent actionEvent) {
        game.getField().decrementTile(0,0);
        game.getField().incrementTile(1,0);
        game.getField().incrementTile(0,1);
        setButtons();

    }

    public void click2(ActionEvent actionEvent) {
        game.getField().decrementTile(0,1);
        game.getField().incrementTile(0,0);
        game.getField().incrementTile(1,1);
        setButtons();
    }

    public void click3(ActionEvent actionEvent) {
        game.getField().decrementTile(1,0);
        game.getField().incrementTile(0,0);
        game.getField().incrementTile(1,1);
        setButtons();
    }

    public void click4(ActionEvent actionEvent) {
        game.getField().decrementTile(1,1);
        game.getField().incrementTile(1,0);
        game.getField().incrementTile(0,1);
        setButtons();
    }
}