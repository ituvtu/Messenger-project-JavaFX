package org.example.jfx;

import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.*;

import java.io.IOException;
import java.util.Objects;

public class MessengerApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Messenger-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setScene(scene);
        stage.setTitle("Messenger created by Ivan Turenko");
        HBox hbox = (HBox) scene.lookup("#navBar");
        TextField searchField = (TextField) scene.lookup("#searchField");
        stage.initStyle(StageStyle.UNDECORATED);
        searchField.prefWidthProperty().bind(hbox.widthProperty().multiply(0.25));
        Image appIcon = new Image(Objects.requireNonNull(getClass().getResourceAsStream("Icons/Icon_of_app.png")));
        stage.getIcons().add(appIcon);
        searchField.prefHeightProperty().bind(hbox.heightProperty().multiply(0.5));
        scene.getStylesheets().add(Objects.requireNonNull(getClass().getResource("Color_palette.css")).toExternalForm());
        stage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}