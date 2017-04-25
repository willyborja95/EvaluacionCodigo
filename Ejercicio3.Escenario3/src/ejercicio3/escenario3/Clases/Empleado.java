package Ejercicio3.Escenario3.Clases;

import Ejercicio3.Escenario3.Clases.*;

public class Empleado{
    private int intCodigo;
    private String strNombres;
    private double dblSalarioMensual;

    public Empleado(int intCodigo, String strNombres, double dblSalarioMensual) {
        this.intCodigo = intCodigo;
        this.strNombres = strNombres;
        this.dblSalarioMensual = dblSalarioMensual;
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

    @Override
    public String toString() {
        return String.format("Codigo: "+getIntCodigo()+" Nombres: "+getStrNombres()+" Salario: "+getDblSalarioMensual()+"\n");
    }
    
    
}