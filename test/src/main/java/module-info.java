module com.teste {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.teste to javafx.fxml;
    exports com.teste;
}
