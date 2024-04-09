module com.exinmsinstaller {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.exinmsinstaller to javafx.fxml;
    exports com.exinmsinstaller;
}
