package co.edu.uniquindio.empleados.parcial1.punto4.model;

import java.util.ArrayList;

public class VehiculoTransporte extends Vehiculo{
    private int maximoPasajeros;
    private int numeroPasajeros;
    private ArrayList<Usuario> listaUsuariosAsociados;

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, int maximoPasajeros, int numeroPasajeros) {
        super(placa, modelo, marca, color, propietarioAsociado);
        this.maximoPasajeros = maximoPasajeros;
        this.numeroPasajeros = numeroPasajeros;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public int getNumeroPasajeros() {
        return numeroPasajeros;
    }

    public ArrayList<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

}
