package co.edu.uniquindio.empleados.parcial1.punto4.services;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Vehiculo;

public interface IVehiculoServices {
    boolean agregarVehiculo(String tipoVehiculo, String placa, String modelo, String marca, String color, Propietario propietarioAsociado);
    Vehiculo obtenerVehiculo(String tipoVehiculo, String placa);
    boolean eliminarVehiculo(String tipoVehiculo, String placa);
    boolean actualizarVehiculo(String tipoVehiculo, String placa, String modelo, String marca, String color, Propietario propietarioAsociado);
}
