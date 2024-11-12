package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.Node;
import java.io.IOException;

public class MainController {
    @FXML
    private ImageView logoImageView;

    @FXML
    private Button startButton;

    @FXML
    private Button quitButton;

    @FXML
    public void initialize(){
        logoImageView.setImage(new Image(getClass().getResourceAsStream("/images/Red-Summer.jpg")));
    }
    @FXML
    protected void onStartButtonClicked(javafx.event.ActionEvent actionEvent) throws IOException {

        Parent mapView = FXMLLoader.load(MainApplication.class.getResource("map-view.fxml"));
        Scene mapViewScene = new Scene(mapView);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mapViewScene);
        window.show();

    }

   @FXML
   protected void onQuitButtonClicked(){
        Platform.exit();
   }
}