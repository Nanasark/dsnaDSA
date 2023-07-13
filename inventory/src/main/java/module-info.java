module com.example.inventory {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.inventory to javafx.fxml;
    exports com.example.inventory;
}