package co.edu.uniquindio.empleados.parcial1.punto4.model;

import co.edu.uniquindio.empleados.parcial1.punto4.builder.VehiculoBuilder;

import java.util.ArrayList;

public abstract class Vehiculo {
    protected String placa;
    protected String modelo;
    protected String marca;
    protected String color;
    protected Propietario propietarioAsociado;
    protected ArrayList<Propietario> listaPropietariosAsociados;

    public Vehiculo() {
    }

    public Vehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
        this.propietarioAsociado = propietarioAsociado;
    }

    public static VehiculoBuilder builder(){
        return new VehiculoBuilder();
    }

    public String getPlaca() {
        return placa;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public Propietario getPropietarioAsociado() {
        return propietarioAsociado;
    }

    public ArrayList<Propietario> getListaPropietariosAsociados() {
        return listaPropietariosAsociados;
    }
}
