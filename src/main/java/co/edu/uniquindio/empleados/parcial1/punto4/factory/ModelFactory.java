package co.edu.uniquindio.empleados.parcial1.punto4.factory;

import co.edu.uniquindio.empleados.parcial1.punto4.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.empleados.parcial1.punto4.builder.VehiculoTransporteBuilder;
import co.edu.uniquindio.empleados.parcial1.punto4.model.*;
import co.edu.uniquindio.empleados.parcial1.punto4.services.IModelFactoryServices;

public class ModelFactory implements IModelFactoryServices {
    private static ModelFactory instance;
    EmpresaTransporte empresaTransporte;

    private ModelFactory() {
    }

    public static ModelFactory getInstance() {
        if(instance == null) {
            instance = new ModelFactory();
        }
        return instance;
    }

    public EmpresaTransporte inicializarDatos(){
        EmpresaTransporte empresa = new EmpresaTransporte();
        empresa.setNombre("La Carreta");
        Propietario propietario = new Propietario();
        propietario.setNombre("Juan Pistola");
        propietario.setCedula("123");
        propietario.setEmail("juan@gmail.com");
        propietario.setCelular("12345");
        empresa.getListaPropietarios().add(propietario);
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Sofia Vergara");
        propietario2.setCedula("2233");
        propietario2.setEmail("sofia@gmail.com");
        propietario2.setCelular("314882");
        empresa.getListaPropietarios().add(propietario2);
        VehiculoCarga vehiculoCargaInicializado = new VehiculoCargaBuilder()
                .placa("ABC123")
                .modelo("2022")
                .marca("Volvo")
                .color("Rojo")
                .capacidadCarga(5000)
                .build();
        propietario.setVehiculoPrincipal(vehiculoCargaInicializado);
        propietario.getListaVehiculosAsociados().add(vehiculoCargaInicializado);
        empresa.getListaVehiculosCarga().add(vehiculoCargaInicializado);
        VehiculoTransporte vehiculoTransporteInicializado = new VehiculoTransporteBuilder()
                .placa("ABC123")
                .modelo("2022")
                .marca("Volvo")
                .color("Rojo")
                .maximoPasajeros(50)
                .numeroPasajeros(22)
                .build();
        propietario.setVehiculoPrincipal(vehiculoTransporteInicializado);
        propietario.getListaVehiculosAsociados().add(vehiculoTransporteInicializado);
        empresa.getListaVehiculosTransporte().add(vehiculoTransporteInicializado);
        this.empresaTransporte = empresa;
        return empresa;
    }

    public EmpresaTransporte getEmpresaTransporte() {
        return empresaTransporte;
    }

    //CRUD Propietario

    @Override
    public boolean agregarPropietario(String nombre, String cedula, String email, String celular) {
        return empresaTransporte.agregarPropietario(nombre, cedula, email, celular);
    }

    @Override
    public Propietario obtenerPropietario(String cedula) {
        return empresaTransporte.obtenerPropietario(cedula);
    }

    @Override
    public boolean eliminarPropietario(String cedula) {
        return empresaTransporte.eliminarPropietario(cedula);
    }

    @Override
    public boolean actualizarPropietario(String nombre, String cedula, String email, String celular) {
        return empresaTransporte.actualizarPropietario(nombre, cedula, email, celular);
    }

    //CRUD Usuario

    @Override
    public boolean agregarUsuario(int edad, String placaVehiculo) {
        return empresaTransporte.agregarUsuario(edad, placaVehiculo);
    }

    @Override
    public Usuario obtenerUsuario(int edad) {
        return empresaTransporte.obtenerUsuario(edad);
    }

    @Override
    public boolean eliminarUsuario(int edad) {
        return empresaTransporte.eliminarUsuario(edad);
    }

    @Override
    public boolean actualizarUsuario(int edad) {
        return empresaTransporte.actualizarUsuario(edad);
    }

    //CRUD Vehiculo

    @Override
    public boolean agregarVehiculo(String tipoVehiculo, String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        return empresaTransporte.agregarVehiculo(tipoVehiculo, placa, modelo, marca, color, propietarioAsociado);
    }

    @Override
    public Vehiculo obtenerVehiculo(String tipoVehiculo, String placa) {
        return empresaTransporte.obtenerVehiculo(tipoVehiculo, placa);
    }

    @Override
    public boolean eliminarVehiculo(String tipoVehiculo, String placa) {
        return empresaTransporte.eliminarVehiculo(tipoVehiculo, placa);
    }

    @Override
    public boolean actualizarVehiculo(String tipoVehiculo, String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        return empresaTransporte.actualizarVehiculo(tipoVehiculo, placa, modelo, marca, color, propietarioAsociado);
    }

    public int usuariosMovilizadosTransporte(String placa) {
        return empresaTransporte.usuariosMovilizadosTransporte(placa);
    }

    public int pasajerosTransportados() {
        return empresaTransporte.pasajerosTransportados();
    }

    public int usuariosMayoresEdad() {
        return empresaTransporte.usuariosMayoresEdad();
    }
}
