package cs112.lab09.controllers;

import cs112.lab09.MainApplication;
import cs112.lab09.models.Date;
import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import java.io.IOException;

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
    protected void onCityStateButtonClicked() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();
        EventViewController eventController = loader.getController();
        eventController.initData( "San Francisco, CA", "/images/sanfrancisco.jpg", new RevisedHistoricalEvent("a minor riot between black and white soldiers in the Presidio in San Francisco", new Date(5, 15, 1919), "a minor riot between black and white soldiers in the presidio in San Francisco after a dispute about a Thai soldier who was moved from the \"colored quarters\" to the white military housing. Despite defending our country, housing for black soldiers was not only segregated but also inferior. Black soldiers also faced increased attacks and other forms of discrimination upon returning home.", "https://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en" ));
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setScene(new Scene(eventViewParent));
        popupStage.show();
    }

    @FXML
    protected void onOtherCityStateButtonClicked() throws IOException{
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(MainApplication.class.getResource("event-view.fxml"));
        Parent eventViewParent = loader.load();
        EventViewController eventController = loader.getController();
        eventController.initData( "Bisbee,, AZ", "/images/bisbee.png",new RevisedHistoricalEvent("Local police in Bisbee, Arizona attacked the 10th U.S. Cavalry, an African-American unit known as the \"Buffalo Soldiers,\" formed in 1866", new Date(7, 13, 1919), "Although sources are limited, the attack occured on the eve of celebrations meant to honor returning soldiers (like in Norfolk, Virginia).", "https://cdr.lib.unc.edu/downloads/1c18dm56n?locale=en" ));
        Stage popupStage = new Stage();
        popupStage.initModality(Modality.APPLICATION_MODAL);
        popupStage.setScene(new Scene(eventViewParent));
        popupStage.show();
    }
}
