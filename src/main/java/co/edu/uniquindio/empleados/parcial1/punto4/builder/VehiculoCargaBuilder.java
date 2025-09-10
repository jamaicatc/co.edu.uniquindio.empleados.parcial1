package co.edu.uniquindio.empleados.parcial1.punto4.builder;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.VehiculoCarga;
import co.edu.uniquindio.empleados.parcial1.punto4.services.IVehiculoBuilder;

public class VehiculoCargaBuilder implements IVehiculoBuilder<VehiculoCarga> {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected Propietario propietarioAsociado;
    protected double CapacidadCarga;
    protected int numeroEjes;

    @Override
    public VehiculoCargaBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }

    @Override
    public VehiculoCargaBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public VehiculoCargaBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public VehiculoCargaBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public VehiculoCargaBuilder propietario(Propietario propietario) {
        this.propietarioAsociado = propietario;
        return this;
    }

    public VehiculoCargaBuilder capacidadCarga(double capacidadCarga) {
        this.CapacidadCarga = capacidadCarga;
        return this;
    }

    public VehiculoCargaBuilder numeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
        return this;
    }

    @Override
    public VehiculoCarga build() {
        return new VehiculoCarga(placa, modelo, marca, color, propietarioAsociado, CapacidadCarga, numeroEjes);
    }
}
