module co.edu.uniquindio.empleados.parcial1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens co.edu.uniquindio.empleados.parcial1 to javafx.fxml;
    exports co.edu.uniquindio.empleados.parcial1;
}