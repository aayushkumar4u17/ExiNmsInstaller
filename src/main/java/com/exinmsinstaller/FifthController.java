package com.exinmsinstaller;

import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class FifthController {

    @FXML
    private TextField copyFldArea;

    @FXML
    private ProgressBar progressBar;

    @FXML
    private TextField dstFldArea;

    @FXML
    void bckBtn5(ActionEvent event) throws Exception {
        App.setRoot("fourth");
    }

    @FXML
    void cnlBtn(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }

    @FXML
    void nxtBtn5(ActionEvent event) throws Exception {
        // App.setRoot("sixth");

        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("sixth.fxml"));
            Parent root = loader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            String batchFilePath = "E:/EXINMS REAL/exinmsinstaller/src/main/resources/EXINMS_Pratikshat/ExiNMSv3.bat";
            ProcessBuilder processBuilder = new ProcessBuilder("cmd", "/c", "start", batchFilePath);
            Process process = processBuilder.start();

            int exitCode = process.waitFor();
            if (exitCode == 0) {
                ((Stage) (((Button) event.getSource()).getScene().getWindow())).close();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    @FXML
    void cnlBtn6(ActionEvent event) throws IOException {
        Stage stage = (Stage) ((Button) event.getSource()).getScene().getWindow();
        stage.close();
    }

}
