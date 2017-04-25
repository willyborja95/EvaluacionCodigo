package Ejercicio3.Escenario1.Ejecutor;

import Ejercicio3.Escenario1.Clases.LenguajeProgramacion;
import Ejercicio3.Escenario1.Clases.Maquila;
import Ejercicio3.Escenario1.Clases.Programador;
import Ejercicio3.Escenario1.GestionArchivo.GuardarArchivo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        ArrayList <Programador> lstProgramadores = new ArrayList<Programador>();
        ArrayList <LenguajeProgramacion> lstlenguajesProgramacion;
        Programador objProgramador;
        LenguajeProgramacion objLenguajeProgramacion;
        Scanner lector = new Scanner(System.in);
        System.out.print("Ingrese el numero de programadores que desea registrar: ");
        int numeroProgramadores = lector.nextInt();
        lector.nextLine();
        for (int i = 0; i < numeroProgramadores; i++) {
            lstlenguajesProgramacion = new ArrayList<>();
            int codigo = i+1;
            System.out.println("PROGRAMADOR No."+i+"\n");
            System.out.print("Ingrese los nombres: ");
            String nombres = lector.nextLine();
            System.out.print("Ingrese el salario: ");
            double salarioMensual = lector.nextDouble();
            System.out.print("Cuantos lenguajes de programación domina: ");
            int numeroLenguajes = lector.nextInt();       
            lector.nextLine();
            for (int j = 0; j < numeroLenguajes; j++) {
                System.out.print("Nombre lenguaje No."+j+": ");
                String nombreLenguaje = lector.nextLine();
                objLenguajeProgramacion = new LenguajeProgramacion(nombreLenguaje);
                lstlenguajesProgramacion.add(objLenguajeProgramacion);
            }
            objProgramador = new Programador(codigo, nombres, salarioMensual, lstlenguajesProgramacion);
            lstProgramadores.add(objProgramador);
        }
        Maquila objMaquila = new Maquila("Maquila No.1", lstProgramadores);
        GuardarArchivo objGuardar = new GuardarArchivo();
        objGuardar.AbrirArchivo();
        objGuardar.AgregarInformacion(objMaquila.toString());
        objGuardar.CerrarArchivo();
    }
}