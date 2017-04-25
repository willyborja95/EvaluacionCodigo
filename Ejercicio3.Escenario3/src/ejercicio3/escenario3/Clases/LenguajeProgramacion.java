package Ejercicio3.Escenario3.Clases;

import Ejercicio3.Escenario3.Clases.*;

public class LenguajeProgramacion{
    
    private String strNombres;

    public LenguajeProgramacion(String strNombres) {
        this.strNombres = strNombres;
    }

    public String getStrNombres() {
        return strNombres;
    }

    public void setStrNombres(String strNombres) {
        this.strNombres = strNombres;
    }

    @Override
    public String toString() {
        return getStrNombres();
    }
    
}