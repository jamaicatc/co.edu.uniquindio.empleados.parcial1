package co.edu.uniquindio.empleados.parcial1.punto4.builder;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Vehiculo;
import co.edu.uniquindio.empleados.parcial1.punto4.model.VehiculoTransporte;
import co.edu.uniquindio.empleados.parcial1.punto4.services.IVehiculoBuilder;

public class VehiculoTransporteBuilder implements IVehiculoBuilder {
    private String placa;
    private String modelo;
    private String marca;
    private String color;
    private Propietario propietarioAsociado;
    private int maximoPasajeros;
    private int numeroPasajeros;

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

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public void setNumeroPasajeros(int numeroPasajeros) {
        this.numeroPasajeros = numeroPasajeros;
    }

    @Override
    public Vehiculo build() {
        return new VehiculoTransporte(placa, modelo, marca, color, propietarioAsociado, maximoPasajeros, numeroPasajeros);
    }
}
