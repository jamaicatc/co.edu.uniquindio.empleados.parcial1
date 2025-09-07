package co.edu.uniquindio.empleados.parcial1.punto4;

import co.edu.uniquindio.empleados.parcial1.punto4.factory.ModelFactory;
import co.edu.uniquindio.empleados.parcial1.punto4.model.EmpresaTransporte;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        ModelFactory modelFactory = ModelFactory.getInstance();
        EmpresaTransporte empresaTransporte = modelFactory.inicializarDatos();
        crudPropietario(modelFactory);
    }

    private static void crudPropietario(ModelFactory modelFactory) {
        agregarPropietario(modelFactory);
//        obtenerPropietario(modelFactory);
//        eliminarPropietario(modelFactory);
//        actualizarPropietario(modelFactory);
    }

    private static void agregarPropietario(ModelFactory modelFactory) {
        Boolean resultado = modelFactory.agregarPropietario("Juan jose", "1234", "juan@gmail.com", "123456");

        if (resultado)
            JOptionPane.showMessageDialog(null, "Propietario agregado exitosamente");
        else
            JOptionPane.showMessageDialog(null, "El propietario ya existe");
    }
}
