package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class MainController {
    @FXML
    private ImageView logoImageView;

    @FXML
    private Button startButton;

    @FXML
    public void initialize(){
        logoImageView.setImage(new Image(getClass().getResourceAsStream("/images/Red-Summer.jpg")));
    }
    @FXML
    protected void onStartButtonClicked(

    ){}
}