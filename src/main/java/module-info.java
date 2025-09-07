module co.edu.uniquindio.empleados.parcial1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires co.edu.uniquindio.empleados.parcial1;

    opens co.edu.uniquindio.empleados.parcial1 to javafx.fxml;
    exports co.edu.uniquindio.empleados.parcial1;
}