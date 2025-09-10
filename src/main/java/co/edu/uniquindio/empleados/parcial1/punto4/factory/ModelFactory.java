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
        Propietario propietario2 = new Propietario();
        propietario2.setNombre("Sofia Vergara");
        propietario2.setCedula("2233");
        propietario2.setEmail("sofia@gmail.com");
        propietario2.setCelular("314882");
        VehiculoCargaBuilder builderCarga = new VehiculoCargaBuilder();
        builderCarga.setPlaca("ABC123");
        builderCarga.setModelo("2020");
        builderCarga.setMarca("Chevrolet");
        builderCarga.setColor("Rojo");
        builderCarga.setPropietario(propietario);
        builderCarga.setCapacidadCarga(200);
        builderCarga.setNumeroEjes(3);
        VehiculoCarga vehiculoCarga = (VehiculoCarga) builderCarga.build();
        propietario.setVehiculoPrincipal(vehiculoCarga);
        propietario.getListaVehiculosAsociados().add(vehiculoCarga);
        empresa.getListaVehiculosCarga().add(vehiculoCarga);
        VehiculoTransporteBuilder builderTransporte = new VehiculoTransporteBuilder();
        builderTransporte.setPlaca("GHI789");
        builderTransporte.setModelo("2021");
        builderTransporte.setMarca("Toyota");
        builderTransporte.setColor("Blanco");
        builderTransporte.setPropietario(propietario2);
        builderTransporte.setMaximoPasajeros(30);
        builderTransporte.setNumeroPasajeros(52);
        VehiculoTransporte vehiculoTransporte = (VehiculoTransporte) builderTransporte.build();
        empresa.getListaVehiculosTransporte().add(vehiculoTransporte);
        propietario2.setVehiculoPrincipal(vehiculoTransporte);
        propietario2.getListaVehiculosAsociados().add(vehiculoTransporte);
        empresa.getListaPropietarios().add(propietario);
        empresa.getListaPropietarios().add(propietario2);
        empresa.getListaVehiculosTransporte().add(vehiculoTransporte);
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
}
