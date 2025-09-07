package co.edu.uniquindio.empleados.parcial1.punto4.model;

public class Usuario {
    private int edad;
    private VehiculoTransporte vehiculoAsociado;

    public Usuario() {
    }

    public Usuario(int edad, VehiculoTransporte vehiculoAsociado) {
        this.edad = edad;
        this.vehiculoAsociado = vehiculoAsociado;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public VehiculoTransporte getVehiculoAsociado() {
        return vehiculoAsociado;
    }

    public void setVehiculoAsociado(VehiculoTransporte vehiculoAsociado) {
        this.vehiculoAsociado = vehiculoAsociado;
    }
}
