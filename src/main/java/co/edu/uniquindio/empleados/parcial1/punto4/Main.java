package co.edu.uniquindio.empleados.parcial1.punto4;

import co.edu.uniquindio.empleados.parcial1.punto4.factory.ModelFactory;
import co.edu.uniquindio.empleados.parcial1.punto4.model.EmpresaTransporte;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Propietario;
import co.edu.uniquindio.empleados.parcial1.punto4.model.Usuario;

import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        EmpresaTransporte empresaTransporte = modelFactory.inicializarDatos();
//        crudPropietario(modelFactory);
//        crudUsuario(modelFactory);
    }

    private static void crudPropietario(ModelFactory modelFactory) {
        agregarPropietario(modelFactory);
        obtenerPropietario(modelFactory);
        eliminarPropietario(modelFactory);
        actualizarPropietario(modelFactory);
    }

    private static void crudUsuario(ModelFactory modelFactory) {
        agregarUsuario(modelFactory);
        obtenerUsuario(modelFactory);
        eliminarUsuario(modelFactory);
        actualizarUsuario(modelFactory);
    }

    //CRUD Propietario
    private static void agregarPropietario(ModelFactory modelFactory) {
        boolean agregado = modelFactory.agregarPropietario("Arturo", "123456789", "arturo@gmail.com", "3001234567");
        System.out.println(agregado ? "Propietario agregado exitosamente" : "No se pudo agregar el propietario");
    }

    private static void obtenerPropietario(ModelFactory modelFactory){
        Propietario propietario = modelFactory.obtenerPropietario("123");
        if(propietario != null){
            System.out.println("Propietario encontrado: " + propietario.toString());
        } else {
            System.out.println("No se encontró el propietario");
        }
    }

    private static void eliminarPropietario(ModelFactory modelFactory){
        boolean eliminado = modelFactory.eliminarPropietario("123");
        System.out.println(eliminado ? "Propietario eliminado exitosamente" : "No se pudo eliminar el propietario");
    }

    private static void actualizarPropietario(ModelFactory modelFactory){
        boolean actualizado = modelFactory.actualizarPropietario("Sofia Vergara", "2233", "sofia@gmail.com", "314850");
        System.out.println(actualizado ? "Propietario actualizado exitosamente" : "No se pudo actualizar el propietario");
    }

    //CRUD Usuario
    private static void agregarUsuario(ModelFactory modelFactory) {
        boolean agregado = modelFactory.agregarUsuario(22, "ABC123");
        System.out.println(agregado ? "Usuario agregado exitosamente" : "No se pudo agregar el propietario");
    }

    private static void obtenerUsuario(ModelFactory modelFactory){
        Usuario usuario = modelFactory.obtenerUsuario(22);
        if(usuario != null){
            System.out.println("Usuario encontrado: " + usuario.toString());
        } else {
            System.out.println("No se encontró el usuario");
        }
    }

    private static void eliminarUsuario(ModelFactory modelFactory){
        boolean eliminado = modelFactory.eliminarUsuario(23);
        System.out.println(eliminado ? "Usuario eliminado exitosamente" : "No se pudo eliminar el usuario");
    }

    private static void actualizarUsuario(ModelFactory modelFactory){
        boolean actualizado = modelFactory.actualizarUsuario(23);
        System.out.println(actualizado ? "Usuario actualizado exitosamente" : "No se pudo actualizar el usuario");
    }


}
