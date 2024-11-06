package cs112.lab09;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApplication.class.getResource("map-view.fxml")); //change back to main-view
        Scene scene = new Scene(fxmlLoader.load(), 600, 400); //change back to 400, 600
        stage.setTitle("Revisionist History Map");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}