package Ejercicio3.Escenario3.Clases;

import java.util.ArrayList;

public class Lider extends Programador{
    
    private ArrayList <Programador> lstProgramadores;
    
    public Lider(int intCodigo, String strNombres, double dblSalarioMensual, ArrayList<LenguajeProgramacion> lstLenguajesProgramacion, ArrayList<Programador> lstProgramadores) {
        super(intCodigo, strNombres, dblSalarioMensual, lstLenguajesProgramacion);
        IngresarProgramadores(lstProgramadores);
    }
    
    public void IngresarProgramadores(ArrayList<Programador> lstProgramadores) {
        this.lstProgramadores = lstProgramadores;
    }

    @Override
    public String toString() {
        String strCadenaProgramadores = "";
        for (int i = 0; i < lstProgramadores.size(); i++) {
            strCadenaProgramadores = strCadenaProgramadores + lstProgramadores.get(i)+"\n";
        }
        return String.format("Lider:\n"+"Codigo: "+getIntCodigo()+" Nombres: "+getStrNombres()+" Salario: "+getDblSalarioMensual()+"\n"+"Programadores:\n"+strCadenaProgramadores);
            
    }
    
    
    
}