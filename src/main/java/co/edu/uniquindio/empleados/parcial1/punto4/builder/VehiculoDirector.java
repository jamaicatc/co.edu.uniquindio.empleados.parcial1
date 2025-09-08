package co.edu.uniquindio.empleados.parcial1.punto4.builder;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Vehiculo;
import co.edu.uniquindio.empleados.parcial1.punto4.services.IVehiculoBuilder;

public class VehiculoDirector {
    public Vehiculo construirVehiculo(IVehiculoBuilder builder){
        return builder.build();
    }
}
