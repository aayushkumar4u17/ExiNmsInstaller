package com.exinmsinstaller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

public class SecondaryController {

    @FXML
    private ToggleGroup radioGroup;

    @FXML
    private Button nextButton2;

    @FXML
    private void bckBtn2() throws IOException {
        App.setRoot("primary");
    }

    @FXML
    void cnlBtn(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void nxtBtn2(ActionEvent event) throws Exception {
        App.setRoot("third");
    }

    @FXML
    void notAccept(ActionEvent event) {
        nextButton2.setDisable(true);
    }

    @FXML
    void acceptBtn(ActionEvent event) {
        nextButton2.setDisable(false);
    }
}