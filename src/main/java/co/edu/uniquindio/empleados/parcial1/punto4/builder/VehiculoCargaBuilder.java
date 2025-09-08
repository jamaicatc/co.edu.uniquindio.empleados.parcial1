package co.edu.uniquindio.empleados.parcial1.punto4.builder;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Vehiculo;
import co.edu.uniquindio.empleados.parcial1.punto4.model.VehiculoCarga;
import co.edu.uniquindio.empleados.parcial1.punto4.services.IVehiculoBuilder;

public class VehiculoCargaBuilder implements IVehiculoBuilder {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private Propietario propietarioAsociado;
    private double CapacidadCarga;
    private int numeroEjes;

    @Override
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setPropietario(Propietario propietario) {
        this.propietarioAsociado = propietario;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }

    @Override
    public Vehiculo build() {
        return new VehiculoCarga(placa, modelo, marca, color, propietarioAsociado, CapacidadCarga, numeroEjes);
    }
}
