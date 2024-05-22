module com.example.loginscherm {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.loginscherm to javafx.fxml;
    exports com.example.loginscherm;
}