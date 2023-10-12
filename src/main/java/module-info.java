module com.example.matrixfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.matrixfx to javafx.fxml;
    exports com.example.matrixfx;
}