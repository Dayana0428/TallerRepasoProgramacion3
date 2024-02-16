module com.example.miniproyectoventaproductos {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.miniproyectoventaproductos to javafx.fxml;
    exports com.example.miniproyectoventaproductos;
}