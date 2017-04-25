package Ejercicio3.Escenario1.Clases;

import java.util.ArrayList;

public class Programador {

    private int intCodigo;
    private String strNombres;
    private double dblSalarioMensual;
    private ArrayList<LenguajeProgramacion> lstLenguajesProgramacion;

    public Programador(int intCodigo, String strNombres, double dblSalarioMensual, ArrayList<LenguajeProgramacion> lstLenguajeProgramacion) {
        this.intCodigo = intCodigo;
        this.strNombres = strNombres;
        this.dblSalarioMensual = dblSalarioMensual;
        this.lstLenguajesProgramacion = lstLenguajeProgramacion;
    }

    public int getIntCodigo() {
        return intCodigo;
    }

    public void setIntCodigo(int intCodigo) {
        this.intCodigo = intCodigo;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    public double getDblSalarioMensual() {
        return dblSalarioMensual;
    }

    public void setDblSalarioMensual(double dblSalarioMensual) {
        this.dblSalarioMensual = dblSalarioMensual;
    }

    public void agregarLenguaje(String strNombreLenguaje) {
        LenguajeProgramacion objLenguajeProgramacion = new LenguajeProgramacion(strNombreLenguaje);
        this.lstLenguajesProgramacion.add(objLenguajeProgramacion);
    }

    @Override
    public String toString() {
        String strCadenaLenguajes = "";
        for (int i = 0; i < lstLenguajesProgramacion.size(); i++) {
            strCadenaLenguajes = strCadenaLenguajes + " " + lstLenguajesProgramacion.get(i);
        }
        return String.format("Codigo: " + getIntCodigo() + " Nombres: " + getStrNombres() + " Salario: " + getDblSalarioMensual() + " Lenguajes: " + strCadenaLenguajes);
    }

}
