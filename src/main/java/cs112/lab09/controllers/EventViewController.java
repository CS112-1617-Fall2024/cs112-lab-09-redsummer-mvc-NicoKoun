package cs112.lab09.controllers;

import cs112.lab09.models.RevisedHistoricalEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
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

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class EventViewController {

    private RevisedHistoricalEvent redSummerEvent;
    private String location;

    protected void initData(String location, String image, RevisedHistoricalEvent historicalEvent){
        this.location = location;
        this.redSummerEvent = historicalEvent;

        locationLabel.setText(this.location);
        dateLabel.setText(this.redSummerEvent.getEventDay().toString());
        descriptionLabel.setText("The following \"history\" was told for many years:\n" + this.redSummerEvent.getDescription());
        revisedDescriptionLabel.setText("By correcting history, not just rewriting it, we are revising it to embark on the process of righting a wrong.\nHere is a revised history:\n" + this.redSummerEvent.getRevisedDescription());
        eventImageView.setImage(new Image(getClass().getResourceAsStream(image)));
    }
    @FXML
    private ImageView eventImageView;

    @FXML
    private Button closeButton;

    @FXML
    private Label locationLabel;

    @FXML
    private Label dateLabel;

    @FXML
    private Label descriptionLabel;

    @FXML
    private Label revisedDescriptionLabel;


    @FXML
    protected void onCloseButtonClicked(javafx.event.ActionEvent actionEvent){
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    protected void onCitationHyperlinkClicked(){
        if(Desktop.isDesktopSupported()){
            try{
                Desktop.getDesktop().browse(new URI(redSummerEvent.getCitation()));
            } catch (IOException | URISyntaxException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Desktop is not supported");
        }
    }
}
