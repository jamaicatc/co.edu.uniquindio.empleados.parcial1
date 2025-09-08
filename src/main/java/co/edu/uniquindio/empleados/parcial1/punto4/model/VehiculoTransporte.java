package co.edu.uniquindio.empleados.parcial1.punto4.model;

import java.util.ArrayList;

public class VehiculoTransporte extends Vehiculo{
    private int maximoPasajeros;
    private ArrayList<Usuario> listaUsuariosAsociados;

    public VehiculoTransporte() {
    }

    public VehiculoTransporte(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, int maximoPasajeros) {
        super(placa, modelo, marca, color, propietarioAsociado);
        this.maximoPasajeros = maximoPasajeros;
    }

    public int getMaximoPasajeros() {
        return maximoPasajeros;
    }

    public void setMaximoPasajeros(int maximoPasajeros) {
        this.maximoPasajeros = maximoPasajeros;
    }

    public ArrayList<Usuario> getListaUsuariosAsociados() {
        return listaUsuariosAsociados;
    }

    public void setListaUsuariosAsociados(ArrayList<Usuario> listaUsuariosAsociados) {
        this.listaUsuariosAsociados = listaUsuariosAsociados;
    }
}
