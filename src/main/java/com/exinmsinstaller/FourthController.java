package com.exinmsinstaller;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.TextField;
import javafx.stage.DirectoryChooser;
import javafx.stage.Stage;

public class FourthController {

    @FXML
    private TextField dstFldArea;

    @FXML
    void BrswBtn2(ActionEvent event) {
        // DirectoryChooser directoryChooser = new DirectoryChooser();
        // directoryChooser.setTitle("Selected Destination Folder");

        // File selectedDirectory = directoryChooser.showDialog(null);

        // if (selectedDirectory != null) {
        // dstFldArea.setText(selectedDirectory.getAbsolutePath());
        // }
        DirectoryChooser directoryChooser = new DirectoryChooser();
        directoryChooser.setTitle("Select Destination Folder");

        File initialDirectory = new File("C:");
        if (initialDirectory.exists() && initialDirectory.isDirectory()) {
            directoryChooser.setInitialDirectory(initialDirectory);
        }
        File selectedDirectory = directoryChooser.showDialog(null);

        if (selectedDirectory != null) {
            dstFldArea.setText(selectedDirectory.getAbsolutePath());
        } else {
            dstFldArea.setText("C:");
        }
    }

    @FXML
    void bckBtn4(ActionEvent event) throws Exception {
        App.setRoot("third");
    }

    @FXML
    void cnlBtn(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void nxtBtn4(ActionEvent event) throws Exception {
        App.setRoot("fifth");
    }
}
