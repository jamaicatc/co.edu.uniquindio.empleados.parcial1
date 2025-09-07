package co.edu.uniquindio.empleados.parcial1.punto4.model;

import co.edu.uniquindio.empleados.parcial1.punto4.services.IEmpresaTransporteServices;

import java.util.ArrayList;

public class EmpresaTransporte implements IEmpresaTransporteServices {
    private String nombre;
    private ArrayList<Propietario> listaPropietarios = new ArrayList<>();
    private ArrayList<VehiculoCarga> listaVehiculosCarga = new ArrayList<>();
    private ArrayList<VehiculoTransporte> listaVehiculosTransporte = new ArrayList<>();
    private ArrayList<Usuario> listaUsuarios = new ArrayList<>();

    public EmpresaTransporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Propietario> getListaPropietarios() {
        return listaPropietarios;
    }

    public void setListaPropietarios(ArrayList<Propietario> listaPropietarios) {
        this.listaPropietarios = listaPropietarios;
    }

    public ArrayList<VehiculoCarga> getListaVehiculosCarga() {
        return listaVehiculosCarga;
    }

    public void setListaVehiculosCarga(ArrayList<VehiculoCarga> listaVehiculosCarga) {
        this.listaVehiculosCarga = listaVehiculosCarga;
    }

    public ArrayList<VehiculoTransporte> getListaVehiculosTransporte() {
        return listaVehiculosTransporte;
    }

    public void setListaVehiculosTransporte(ArrayList<VehiculoTransporte> listaVehiculosTransporte) {
        this.listaVehiculosTransporte = listaVehiculosTransporte;
    }

    public ArrayList<Usuario> getListaUsuarios() {
        return listaUsuarios;
    }

    public void setListaUsuarios(ArrayList<Usuario> listaUsuarios) {
        this.listaUsuarios = listaUsuarios;
    }

    //CRUD Propietario

    @Override
    public boolean agregarPropietario(String nombre, String cedula, String email, String celular) {
        Propietario propietario = obtenerPropietario(cedula);
        if (propietario == null){
            propietario = new Propietario();
            propietario.setNombre(nombre);
            propietario.setCedula(cedula);
            propietario.setEmail(email);
            propietario.setCelular(celular);
            getListaPropietarios().add(propietario);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Propietario obtenerPropietario(String cedula) {
        Propietario propietarioEncontrado = null;
        for(Propietario propietario: getListaPropietarios()){
            if (propietario.getCedula().equalsIgnoreCase(cedula)){
                propietarioEncontrado = propietario;
                break;
            }
        }
        return propietarioEncontrado;
    }

    @Override
    public boolean eliminarPropietario(String cedula) {
        Propietario propietario = obtenerPropietario(cedula);
        if(propietario != null){
            getListaPropietarios().remove(propietario);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean actualizarPropietario(String nombre, String cedula, String email, String celular) {
        Propietario propietario = obtenerPropietario(cedula);
        if(propietario != null){
            propietario.setNombre(nombre);
            propietario.setCedula(cedula);
            propietario.setEmail(email);
            propietario.setCelular(celular);

            return true;
        }else{
            return false;
        }
    }

    //CRUD Usuario

    @Override
    public boolean agregarUsuario(int edad, String placaVehiculo) {
        return false;
    }

    @Override
    public Usuario obtenerUsuario(int edad) {
        return null;
    }

    @Override
    public boolean eliminarUsuario(int edad) {
        return false;
    }

    @Override
    public boolean actualizarUsuario(int edad, String placaVehiculo) {
        return false;
    }

    //CRUD Vehiculo

    @Override
    public boolean agregarVehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        return false;
    }

    @Override
    public Vehiculo obtenerVehiculo(String placa) {
        return null;
    }

    @Override
    public boolean eliminarVehiculo(String placa) {
        return false;
    }

    @Override
    public boolean actualizarVehiculo(String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        return false;
    }
}
