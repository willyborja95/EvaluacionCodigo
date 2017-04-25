package Ejercicio3.Escenario2.Ejecutor;

import Ejercicio3.Escenario2.Clases.Empleado;
import Ejercicio3.Escenario2.Clases.Programador;
import Ejercicio3.Escenario2.Clases.Java;
import Ejercicio3.Escenario2.Clases.LenguajeProgramacion;
import Ejercicio3.Escenario2.Clases.Maquila;
import Ejercicio3.Escenario2.GestionArchivo.GuardarArchivo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<LenguajeProgramacion> lstLenguajesProgramacion;
        ArrayList<Empleado> lstEmpleados = new ArrayList <Empleado>();
        LenguajeProgramacion objLenguajeProgramacion;
        Empleado objEmpleado;
        Java objJava;
        Maquila objMaquila;
        System.out.print("Ingrese el número de empleados de la maquila: ");
        int intNumeroEmpleados = lector.nextInt();
        lector.nextLine();

        for (int i = 0; i < intNumeroEmpleados; i++) {
            System.out.println("\n" + "Datos del empleado No." + i);
            System.out.print("Ingrese los nombres: ");
            String strNombres = lector.nextLine();
            System.out.print("Ingrese el salario: ");
            double dblSalario = lector.nextDouble();
            System.out.print("¿Es programador? (true/false)");
            boolean blnEsProgramador = lector.nextBoolean();
            lector.nextLine();
            if (blnEsProgramador == true) {
                lstLenguajesProgramacion = new ArrayList<LenguajeProgramacion>();
                System.out.print("¿Cuántos lenguajes domina? ");
                int intNumeroLenguajes = lector.nextInt();
                lector.nextLine();
                int intContador = 0;
                do {
                    intContador++;
                    System.out.print("Nombre del lenguaje No."+i+": ");
                    String strNombreLenguaje = lector.nextLine();

                    if (strNombreLenguaje.equals("Java") || strNombreLenguaje.equals("java") || strNombreLenguaje.equals("JAVA")) {
                        objLenguajeProgramacion = new Java();
                    } else {
                        objLenguajeProgramacion = new LenguajeProgramacion(strNombreLenguaje);
                    }
                    lstLenguajesProgramacion.add(objLenguajeProgramacion);
                } while (intContador < intNumeroLenguajes);
                objEmpleado = new Programador(i, strNombres, dblSalario, lstLenguajesProgramacion);
                lstEmpleados.add(objEmpleado);
            } else {
                objEmpleado = new Empleado(i, strNombres, dblSalario);
                lstEmpleados.add(objEmpleado);
            }

        }
        
        objMaquila = new Maquila("Maquila No.1", lstEmpleados);
        GuardarArchivo objGuardar = new GuardarArchivo();
        objGuardar.AbrirArchivo();
        objGuardar.AgregarInformacion(objMaquila.toString());
        objGuardar.CerrarArchivo();
    }
}
