package co.edu.uniquindio.empleados.parcial1.punto4.factory;

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
        VehiculoCarga vehiculoCarga = new VehiculoCarga();
        vehiculoCarga.setCapacidadCarga(200);
        vehiculoCarga.setNumeroEjes(3);
        VehiculoCarga vehiculoCarga2 = new VehiculoCarga();
        vehiculoCarga2.setCapacidadCarga(400);
        vehiculoCarga2.setNumeroEjes(7);
        VehiculoTransporte vehiculoTransporte = new VehiculoTransporte();
        vehiculoTransporte.setMaximoPasajeros(20);
        VehiculoTransporte vehiculoTransporte2 = new VehiculoTransporte();
        vehiculoTransporte2.setMaximoPasajeros(20);
        Propietario propietario = new Propietario();
        propietario.setNombre("Juan Pistola");
        propietario.setCedula("123");
        propietario.setEmail("juan@gmail.com");
        propietario.setCelular("12345");
        propietario.setVehiculoPrincipal(vehiculoCarga);
        propietario.getListaVehiculosAsociados().add(vehiculoTransporte);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga);
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Sofia Vergara");
        propietario2.setCedula("2233");
        propietario2.setEmail("sofia@gmail.com");
        propietario2.setCelular("314882");
        propietario2.setVehiculoPrincipal(vehiculoCarga);
        propietario2.getListaVehiculosAsociados().add(vehiculoTransporte2);
        propietario2.getListaVehiculosAsociados().add(vehiculoCarga2);
        empresa.getListaPropietarios().add(propietario);
        empresa.getListaPropietarios().add(propietario2);
        empresa.getListaVehiculosCarga().add(vehiculoCarga);
        empresa.getListaVehiculosTransporte().add(vehiculoTransporte);
        empresa.getListaVehiculosCarga().add(vehiculoCarga2);
        empresa.getListaVehiculosTransporte().add(vehiculoTransporte2);
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
    public boolean actualizarUsuario(int edad, String placaVehiculo) {
        return empresaTransporte.actualizarUsuario(edad, placaVehiculo);
    }

    //CRUD Vehiculo

    @Override
    public boolean agregarVehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        return empresaTransporte.agregarVehiculo(placa, modelo, marca, color, propietarioAsociado);
    }

    @Override
    public Vehiculo obtenerVehiculo(String placa) {
        return empresaTransporte.obtenerVehiculo(placa);
    }

    @Override
    public boolean eliminarVehiculo(String placa) {
        return empresaTransporte.eliminarVehiculo(placa);
    }

    @Override
    public boolean actualizarVehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        return empresaTransporte.actualizarVehiculo(placa, modelo, marca, color, propietarioAsociado);
    }
}
