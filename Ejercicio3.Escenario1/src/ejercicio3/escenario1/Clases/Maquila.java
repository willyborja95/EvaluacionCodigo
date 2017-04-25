package Ejercicio3.Escenario1.Clases;

import java.util.ArrayList;

public class Maquila {

    private String strNombre;
    private ArrayList<Programador> lstProgramadores;

    public Maquila(String strNombre, ArrayList<Programador> lstProgramadores) {
        this.strNombre = strNombre;
        this.lstProgramadores = lstProgramadores;
    }

    @Override
    public String toString() {
        String cadena = "";
        for (int i = 0; i < lstProgramadores.size(); i++) {
            cadena = cadena + lstProgramadores.get(i) + "\n";
        }
        return cadena;
    }

}
