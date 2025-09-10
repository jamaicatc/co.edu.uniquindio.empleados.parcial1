package co.edu.uniquindio.empleados.parcial1.punto4.services;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Vehiculo;

public interface IVehiculoBuilder <T extends Vehiculo> {
    IVehiculoBuilder<T> placa(String placa);
    IVehiculoBuilder<T> modelo(String modelo);
    IVehiculoBuilder<T> marca(String marca);
    IVehiculoBuilder<T> color(String color);
    IVehiculoBuilder<T> propietario(Propietario propietario);
    T build();
}
