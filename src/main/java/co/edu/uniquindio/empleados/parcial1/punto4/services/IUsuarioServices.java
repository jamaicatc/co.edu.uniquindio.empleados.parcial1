package co.edu.uniquindio.empleados.parcial1.punto4.services;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Usuario;

public interface IUsuarioServices {
    boolean agregarUsuario(int edad, String placaVehiculo);
    Usuario obtenerUsuario(int edad);
    boolean eliminarUsuario(int edad);
    boolean actualizarUsuario(int edad);
}
