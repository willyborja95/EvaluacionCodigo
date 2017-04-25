package Ejercicio3.Escenario2.Clases;

import java.util.ArrayList;

public class Maquila{
    private String strNombre;
    private ArrayList <Empleado> lstEmpleados;

    public Maquila(String strNombre, ArrayList <Empleado> lstEmpleados) {
        this.strNombre = strNombre;
        this.lstEmpleados = new ArrayList <Empleado>();
        IngresarEmpleados(lstEmpleados);
    }
    
    public void IngresarEmpleados(ArrayList <Empleado> lstEmpleados){
        this.lstEmpleados = lstEmpleados;
    }

    public String getStrNombre() {
        return strNombre;
    }

    public void setStrNombre(String strNombre) {
        this.strNombre = strNombre;
    }

    @Override
    public String toString() {
        String salida = "";
        for (int i = 0; i < lstEmpleados.size(); i++) {
            salida = salida+lstEmpleados.get(i)+"\n";
        }
        return salida;
    }
    
    
    
}