package co.edu.uniquindio.empleados.parcial1.punto4.services;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Vehiculo;

public interface IVehiculoBuilder {
    void setPlaca(String placa);
    void setModelo(String modelo);
    void setMarca(String marca);
    void setColor(String color);
    void setPropietario(Propietario propietario);
    Vehiculo build();
}
