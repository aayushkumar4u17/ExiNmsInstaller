package com.exinmsinstaller;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class App extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene primary;
    private static Scene secondary;
    private static Scene third;
    private static Scene fourth;
    private static Scene fifth;
    private static Scene sixth;

    @Override
    public void start(Stage primaryStage) throws IOException {
        stage = primaryStage;
        mainScene = new Scene(loadFXML("main"), 400, 110);
        primaryStage.setTitle("Install EXINMSV3");
        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    static void setRoot(String fxml) throws IOException {
        stage.setScene(getSceneForFXML(fxml));
    }

    private static Scene getSceneForFXML(String fxml) throws IOException {
        if (fxml.equals("main")) {
            return mainScene;
        } else if (fxml.equals("primary")) {
            if (primary == null) {
                primary = new Scene(loadFXML("primary"), 600, 400);
            }
            return primary;
        } else if (fxml.equals("secondary")) {
            if (secondary == null) {
                secondary = new Scene(loadFXML("secondary"), 600, 400);
            }
            return secondary;
        } else if (fxml.equals("third")) {
            if (third == null) {
                third = new Scene(loadFXML("third"), 600, 400);
            }
            return third;
        } else if (fxml.equals("fourth")) {
            if (fourth == null) {
                fourth = new Scene(loadFXML("fourth"), 600, 400);
            }
            return fourth;
        } else if (fxml.equals("fifth")) {
            if (fifth == null) {
                fifth = new Scene(loadFXML("fifth"), 600, 400);
            }
            return fifth;
        } else if (fxml.equals("sixth")) {
            if (sixth == null) {
                sixth = new Scene(loadFXML("sixth"), 600, 400);
            }
            return sixth;
        } else {
            throw new IllegalArgumentException("Unknown FXML: " + fxml);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args) {
        launch();
    }
}