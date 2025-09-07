package co.edu.uniquindio.empleados.parcial1.punto4.model;

public class VehiculoCarga extends Vehiculo{
    private double CapacidadCarga;
    private int numeroEjes;

    public VehiculoCarga() {
    }

    public VehiculoCarga(double capacidadCarga, int numeroEjes) {
        CapacidadCarga = capacidadCarga;
        this.numeroEjes = numeroEjes;
    }

    public double getCapacidadCarga() {
        return CapacidadCarga;
    }

    public void setCapacidadCarga(double capacidadCarga) {
        CapacidadCarga = capacidadCarga;
    }

    public int getNumeroEjes() {
        return numeroEjes;
    }

    public void setNumeroEjes(int numeroEjes) {
        this.numeroEjes = numeroEjes;
    }
}
