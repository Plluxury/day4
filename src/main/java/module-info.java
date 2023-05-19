module com.example.day4 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.day4 to javafx.fxml;
    exports com.example.day4;
}