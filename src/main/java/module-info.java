module com.example.xmlreader {
    requires javafx.controls;
    requires javafx.fxml;

    exports com.example.xmlreader;
    opens com.example.xmlreader to javafx.fxml;

}