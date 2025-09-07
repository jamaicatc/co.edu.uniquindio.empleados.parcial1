package co.edu.uniquindio.empleados.parcial1.punto4.builder;

import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;

import java.util.ArrayList;

public class VehiculoBuilder {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected Propietario propietarioAsociado;
    protected ArrayList<Propietario> listaPropietariosAsociados;

    public VehiculoBuilder placa(String placa){
        this.placa = placa;
        return this;
    }

    public VehiculoBuilder modelo(String modelo){
        this.modelo = modelo;
        return this;
    }

    public VehiculoBuilder marca(String marca){
        this.marca = marca;
        return this;
    }

    public VehiculoBuilder color(String color){
        this.color = color;
        return this;
    }

    public VehiculoBuilder propietarioAsociado(Propietario propietarioAsociado){
        this.placa = placa;
        return this;
    }

    public VehiculoBuilder listaPropietariosAsociados(ArrayList<Propietario> listaPropietariosAsociados){
        this.placa = placa;
        return this;
    }
}
