package com.exinmsinstaller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.stage.Stage;

public class PrimaryController {

    @FXML
    void cnlBtn(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void yesBtn(ActionEvent event) throws Exception {
        App.setRoot("primary");
    }

    @FXML
    void nxtBtn1(ActionEvent event) throws Exception {
        App.setRoot("secondary");
    }
}
