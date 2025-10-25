module com.example.torpedo_firsttry {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.graphics;


    opens com.example.torpedo_firsttry to javafx.fxml;
    exports com.example.torpedo_firsttry;
}