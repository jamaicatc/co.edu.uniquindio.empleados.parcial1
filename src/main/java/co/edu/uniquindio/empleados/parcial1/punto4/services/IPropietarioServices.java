package co.edu.uniquindio.empleados.parcial1.punto4.services;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;

public interface IPropietarioServices {
    boolean agregarPropietario(String nombre, String cedula, String email, String celular);
    Propietario obtenerPropietario(String cedula);
    boolean eliminarPropietario(String cedula);
    boolean actualizarPropietario(String nombre, String cedula, String email, String celular);
}
