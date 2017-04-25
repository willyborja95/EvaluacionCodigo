package Ejercicio3.Escenario3.Clases;

import Ejercicio3.Escenario3.Clases.*;
import java.util.ArrayList;

public class Programador extends Empleado {

    ArrayList <LenguajeProgramacion> lstLenguajesProgramacion;

    public Programador(int intCodigo, String strNombres, double dblSalarioMensual, ArrayList<LenguajeProgramacion> lstLenguajesProgramacion) {
        super(intCodigo, strNombres, dblSalarioMensual);
        IngresarLenguajes(lstLenguajesProgramacion);
    }

    public void IngresarLenguajes(ArrayList<LenguajeProgramacion> lstLenguajesProgramacion) {
        this.lstLenguajesProgramacion = lstLenguajesProgramacion;
    }

    @Override
    public String toString() {
        String strSalida = "";
        String strSalidaLenguajes = "";
        for (int i = 0; i < lstLenguajesProgramacion.size(); i++) {
            strSalidaLenguajes = strSalidaLenguajes + " " + lstLenguajesProgramacion.get(i);
        }
        strSalida = "Codigo: " + getIntCodigo() + " Nombres: " + getStrNombres() + " Salario: " + getDblSalarioMensual() + " Lenguajes: " + strSalidaLenguajes;
        return strSalida;
    }

}
