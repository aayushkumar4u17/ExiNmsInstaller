package com.exinmsinstaller;

import java.io.File;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

public class ThirdController {
    @FXML
    private TextField filePathField;

    @FXML
    private Button nextBtn3;

    @FXML
    void bckBtn3(ActionEvent event) throws Exception {
        App.setRoot("secondary");
    }

    @FXML
    void brswBtn1(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        File selectedFile = fileChooser.showOpenDialog(null);
        if (selectedFile != null) {
            System.out.println("You chose to open the file: " + selectedFile.getName());
            filePathField.setText(selectedFile.getName());
            String extension = getFileExtension(selectedFile);
            nextBtn3.setDisable(!extension.equals(".lic"));
        } else {
            System.out.println("User chose to cancel opening a file.");
            filePathField.setText("");
            nextBtn3.setDisable(true);
        }
    }

    private String getFileExtension(File file) {
        String fileName = file.getName();
        int extensionIndex = fileName.lastIndexOf('.');
        if (extensionIndex > 0) {
            return fileName.substring(extensionIndex).toLowerCase();
        } else {
            return "";
        }
    }

    @FXML
    void cnlBtn(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close(); 
    }

    @FXML
    void nxtBtn3(ActionEvent event) throws Exception {
        App.setRoot("fourth");
    }
}
