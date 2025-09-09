package co.edu.uniquindio.empleados.parcial1.punto4.model;

public class VehiculoCarga extends Vehiculo{
    private double CapacidadCarga;
    private int numeroEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(String placa, String modelo, String marca, String color, Propietario propietarioAsociado, double capacidadCarga, int numeroEjes) {
        super(placa, modelo, marca, color, propietarioAsociado);
        CapacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

}
