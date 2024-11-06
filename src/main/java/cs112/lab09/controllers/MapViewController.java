package cs112.lab09.controllers;

import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;

public class MapViewController {
    @FXML
    private ImageView MapImage;

    @FXML
    private Button cityStateButton;

    @FXML
    private Button otherCityStateButton;
    @FXML
    public void initialize(){
        MapImage.setImage(new Image(getClass().getResourceAsStream("/images/Red-Summer.jpg")));
    }

    @FXML
    protected void onCityStateButtonClicked(

    ){}

    @FXML
    protected void onOtherCityStateButtonClicked(

    ){}
}
