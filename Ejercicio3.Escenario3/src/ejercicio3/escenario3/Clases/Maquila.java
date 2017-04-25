package Ejercicio3.Escenario3.Clases;

import Ejercicio3.Escenario3.Clases.*;
import java.util.ArrayList;

public class Maquila {

    private String strNombre;
    private ArrayList<Lider> lstLideres;
    private ArrayList<Empleado> lstEmpleados;

    public Maquila(String strNombre, ArrayList<Lider> lstLideres) {
        this.strNombre = strNombre;
        this.lstLideres = lstLideres;
    }

    public Maquila(ArrayList<Empleado> lstEmpleados) {
        this.strNombre = "Maquila No.1";
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
        if (lstLideres != null) {
            for (int i = 0; i < lstLideres.size(); i++) {
                salida = salida + lstLideres.get(i) + "\n";
            }
            salida = getStrNombre() + "\n" + salida;
        }else{
            for (int i = 0; i < lstEmpleados.size(); i++) {
                salida = salida + lstEmpleados.get(i)+"\n";
                
            }
        }
        return salida;

    }
}
