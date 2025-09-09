package co.edu.uniquindio.empleados.parcial1.punto4.model;

import co.edu.uniquindio.empleados.parcial1.punto4.builder.VehiculoCargaBuilder;
import co.edu.uniquindio.empleados.parcial1.punto4.builder.VehiculoTransporteBuilder;
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

    public int pasajerosTransportados(){
        int totalPasajeros = 0;
        for (VehiculoTransporte vt: listaVehiculosTransporte){
            totalPasajeros += vt.getNumeroPasajeros();
        }
        return totalPasajeros;
    }

    public int usuariosMovilizadosTransporte(String placa){
        obtenerVehiculo("transporte", placa);
        int totalUsuarios = 0;
        for (Usuario u: listaUsuarios){
            if(u.getVehiculoAsociado().getPlaca().equalsIgnoreCase(placa)){
                totalUsuarios++;
            }
        } return totalUsuarios;
    }

    public int usuariosMayoresEdad(){
        int totalMayores = 0;
        for (Usuario u: listaUsuarios){
            if(u.getEdad() >= 18){
                totalMayores++;
            }
        } return totalMayores;
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
        Usuario usuario = obtenerUsuario(edad);
        Vehiculo vehiculo = obtenerVehiculo("transporte",placaVehiculo);
        if (usuario == null && vehiculo != null){
            usuario = new Usuario();
            usuario.setEdad(edad);
            usuario.setVehiculoAsociado(((VehiculoTransporte) vehiculo));
            getListaUsuarios().add(usuario);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Usuario obtenerUsuario(int edad) {
        Usuario usuarioEncontrado = null;
        for(Usuario usuario: getListaUsuarios()){
            if (usuario.getEdad() == edad){
                usuarioEncontrado = usuario;
                break;
            }
        }
        return usuarioEncontrado;
    }

    @Override
    public boolean eliminarUsuario(int edad) {
        Usuario usuario = obtenerUsuario(edad);
        if(usuario != null){
            getListaUsuarios().remove(usuario);
            return true;
        }else{
            return false;
        }
    }

    @Override
    public boolean actualizarUsuario(int edad, String placaVehiculo) {
        Usuario usuario = obtenerUsuario(edad);
        Vehiculo vehiculo = obtenerVehiculo("transporte",placaVehiculo);
        if (usuario != null){
            usuario.setEdad(edad);
            usuario.setVehiculoAsociado(((VehiculoTransporte) vehiculo));
            return true;
        }else{
            return false;
        }
    }

    //CRUD Vehiculo

    @Override
    public boolean agregarVehiculo(String tipoVehiculo, String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        Vehiculo vehiculo = obtenerVehiculo(tipoVehiculo, placa);
        if (vehiculo == null){
            if ("carga".equalsIgnoreCase(tipoVehiculo)){
                VehiculoCargaBuilder builder = new VehiculoCargaBuilder();
                builder.setPlaca(placa);
                builder.setModelo(modelo);
                builder.setMarca(marca);
                builder.setColor(color);
                builder.setPropietario(propietarioAsociado);
                //atributos faltantes de vehiculo de carga
                VehiculoCarga vehiculoCarga = (VehiculoCarga)  builder.build();
                listaVehiculosCarga.add(vehiculoCarga);
            } else if ("transporte".equalsIgnoreCase(tipoVehiculo)){
                VehiculoTransporteBuilder builder = new VehiculoTransporteBuilder();
                builder.setPlaca(placa);
                builder.setModelo(modelo);
                builder.setMarca(marca);
                builder.setColor(color);
                builder.setPropietario(propietarioAsociado);
                //atributos faltantes de vehiculo de transporte
                VehiculoTransporte vehiculoTransporte = (VehiculoTransporte) builder.build();
                listaVehiculosTransporte.add(vehiculoTransporte);
            }else{
                return false;
            }
            return true;
        }
        return false;
    }

    @Override
    public Vehiculo obtenerVehiculo(String tipoVehiculo, String placa) {
        if("carga".equalsIgnoreCase(tipoVehiculo)){
            for (Vehiculo v: listaVehiculosCarga){
                if (v.getPlaca().equalsIgnoreCase(placa)){
                    return v;
                }
            }
        }else if("transporte".equalsIgnoreCase(tipoVehiculo)){
            for (Vehiculo v: listaVehiculosTransporte){
                if (v.getPlaca().equalsIgnoreCase(placa)){
                    return v;
                }
            }
        }
        return null;
    }

    @Override
    public boolean eliminarVehiculo(String tipoVehiculo, String placa) {
        if ("carga".equalsIgnoreCase(tipoVehiculo)){
            return listaVehiculosCarga.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
        }else if("transporte".equalsIgnoreCase(tipoVehiculo)){
            return listaVehiculosTransporte.removeIf(v -> v.getPlaca().equalsIgnoreCase(placa));
        }
        return false;
    }

    @Override
    public boolean actualizarVehiculo(String tipoVehiculo, String placa, String modelo, String marca, String color, Propietario propietarioAsociado) {
        if ("carga".equalsIgnoreCase(tipoVehiculo)) {
            for (VehiculoCarga v : listaVehiculosCarga) {
                if (v.getPlaca().equalsIgnoreCase(placa)) {
                    VehiculoCargaBuilder builder = new VehiculoCargaBuilder();
                    builder.setPlaca(placa);
                    builder.setModelo(modelo);
                    builder.setMarca(marca);
                    builder.setColor(color);
                    builder.setPropietario(propietarioAsociado);
                    // atributos propios de VehiculoCarga
                    VehiculoCarga nuevo = (VehiculoCarga) builder.build();

                    listaVehiculosCarga.remove(v);
                    listaVehiculosCarga.add(nuevo);
                    return true;
                }
            }
        } else if ("transporte".equalsIgnoreCase(tipoVehiculo)) {
            for (VehiculoTransporte v : listaVehiculosTransporte) {
                if (v.getPlaca().equalsIgnoreCase(placa)) {
                    VehiculoTransporteBuilder builder = new VehiculoTransporteBuilder();
                    builder.setPlaca(placa);
                    builder.setModelo(modelo);
                    builder.setMarca(marca);
                    builder.setColor(color);
                    builder.setPropietario(propietarioAsociado);
                    // atributos propios de VehiculoTransporte
                    VehiculoTransporte nuevo = (VehiculoTransporte) builder.build();

                    listaVehiculosTransporte.remove(v);
                    listaVehiculosTransporte.add(nuevo);
                    return true;
                }
            }
        }
        return false;
    }
}
