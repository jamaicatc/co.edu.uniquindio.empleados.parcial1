package co.edu.uniquindio.empleados.parcial1.punto1y2.model;

public class Empleado {
    private String nombre;
    private String apellido;
    private String cedula;
    private int edad;
    private double salario;
    private int numeroHorasTrabajo;
    private TipoContrato tipoContrato; //la clase enum se puede usar en una variable

    public Empleado() {
    }

    public Empleado(String nombre, String apellido, String cedula, int edad, double salario, int numeroHorasTrabajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.edad = edad;
        this.salario = salario;
        this.numeroHorasTrabajo = numeroHorasTrabajo;
    }
}
