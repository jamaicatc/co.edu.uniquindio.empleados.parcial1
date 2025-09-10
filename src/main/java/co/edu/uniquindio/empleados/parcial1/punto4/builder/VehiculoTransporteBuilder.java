package co.edu.uniquindio.empleados.parcial1.punto4.builder;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.VehiculoTransporte;
import co.edu.uniquindio.empleados.parcial1.punto4.services.IVehiculoBuilder;

public class VehiculoTransporteBuilder implements IVehiculoBuilder<VehiculoTransporte> {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected Propietario propietarioAsociado;
    protected int maximoPasajeros;
    protected int numeroPasajeros;

    @Override
    public VehiculoTransporteBuilder placa(String placa) {
        this.placa = placa;
        return this;
    }

    @Override
    public VehiculoTransporteBuilder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public VehiculoTransporteBuilder marca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public VehiculoTransporteBuilder color(String color) {
        this.color = color;
        return this;
    }

    @Override
    public VehiculoTransporteBuilder propietario(Propietario propietario) {
        this.propietarioAsociado = propietario;
        return this;
    }

    public VehiculoTransporteBuilder maximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
        return this;
    }

    public VehiculoTransporteBuilder numeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
        return this;
    }

    @Override
    public VehiculoTransporte build() {
        return new VehiculoTransporte(placa, modelo, marca, color, propietarioAsociado, maximoPasajeros, numeroPasajeros);
    }
}
