package Ejercicio3.Escenario3.Ejecutor;

import Ejercicio3.Escenario3.Clases.Empleado;
import Ejercicio3.Escenario3.Clases.Programador;
import Ejercicio3.Escenario3.Clases.Java;
import Ejercicio3.Escenario3.Clases.LenguajeProgramacion;
import Ejercicio3.Escenario3.Clases.Lider;
import Ejercicio3.Escenario3.Clases.Maquila;
import Ejercicio3.Escenario3.GestionArchivo.GuardarArchivo;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        ArrayList<Empleado> lstEmpleados = new ArrayList<Empleado>();
        ArrayList<Lider> lstLideres = new ArrayList<Lider>();
        Lider objLider;
        Empleado objEmpleado;
        Java objJava;
        Maquila objMaquila = null;
        System.out.print("Si desea registrar empleados, escriba 0 ó programadores, escriba 1: ");
        int intDesicion = lector.nextInt();
        switch (intDesicion) {
            case 0:
                System.out.print("Ingrese el número de empleados que desea ingresar: ");
                int intNumeroEmpleados = lector.nextInt();
                lector.nextLine();
                int intCiclosEmpleados = 0;
                do {
                    System.out.print("Ingrese el codigo: ");
                    int intCodigo = lector.nextInt();
                    lector.nextLine();
                    System.out.print("Ingrese los nombres: ");
                    String strNombres = lector.nextLine();
                    System.out.print("Ingrese el salario mensual: ");
                    double dblSalarioMensual = lector.nextDouble();
                    objEmpleado = new Empleado(intCodigo, strNombres, dblSalarioMensual);
                    lstEmpleados.add(objEmpleado);
                    intCiclosEmpleados++;
                } while (intCiclosEmpleados < intNumeroEmpleados);
                objMaquila = new Maquila(lstEmpleados);
                break;
            case 1:
                ArrayList<LenguajeProgramacion> lstLenguajesLider = new ArrayList<LenguajeProgramacion>();
                ArrayList<Programador> lstProgramadores;
                LenguajeProgramacion objLenguajeProgramacion;
                Programador objProgramador;
                System.out.print("Ingrese el número de líderes que tendrá la maquila: ");
                int intNumeroLideres = lector.nextInt();
                for (int k = 0; k < intNumeroLideres; k++) {
                    lstProgramadores = new ArrayList<Programador>();
                    System.out.println("\nInformación del líder" + k + "\n");
                    System.out.print("Ingrese el codigo: ");
                    int intCodigoLider = lector.nextInt();
                    lector.nextLine();
                    System.out.print("Ingrese los nombres: ");
                    String strNombresLider = lector.nextLine();
                    System.out.print("Ingrese el salario mensual: ");
                    double dblSalarioMensualLider = lector.nextDouble();
                    System.out.print("Número de lenguajes dominados: ");
                    int intNumeroLenguajesLider = lector.nextInt();
                    lector.nextLine();
                    for (int j = 0; j < intNumeroLenguajesLider; j++) {
                        System.out.print("Nombre lenguaje No." + j + ": ");
                        String strLenguajeLider = lector.nextLine();
                        if (strLenguajeLider.equals("Java") || strLenguajeLider.equals("java") || strLenguajeLider.equals("JAVA")) {
                            objLenguajeProgramacion = new Java();
                        } else {
                            objLenguajeProgramacion = new LenguajeProgramacion(strLenguajeLider);
                        }
                        lstLenguajesLider.add(objLenguajeProgramacion);
                    }
                    System.out.print("Número de programadores a registrar: ");
                    int intNumeroProgramadores = lector.nextInt();
                    int intCiclosProgramadores = 0;
                    do {
                        ArrayList<LenguajeProgramacion> lstLenguajesProgramador = new ArrayList<LenguajeProgramacion>();
                        System.out.print("Ingrese el codigo: ");
                        int intCodigoProgramador = lector.nextInt();
                        lector.nextLine();
                        System.out.print("Ingrese los nombres: ");
                        String strNombresProgramador = lector.nextLine();
                        System.out.print("Ingrese el salario mensual: ");
                        double dblSalarioMensualProgramador = lector.nextDouble();
                        intCiclosProgramadores++;
                        System.out.print("Número de lenguajes dominados: ");
                        int intNumeroLenguajes = lector.nextInt();
                        lector.nextLine();
                        for (int i = 0; i < intNumeroLenguajes; i++) {
                            System.out.print("Nombre lenguaje No." + i + ": ");
                            String strLenguajeProgramador = lector.nextLine();
                            if (strLenguajeProgramador.equals("Java") || strLenguajeProgramador.equals("java") || strLenguajeProgramador.equals("JAVA")) {
                                objLenguajeProgramacion = new Java();
                            } else {
                                objLenguajeProgramacion = new LenguajeProgramacion(strLenguajeProgramador);
                            }
                            lstLenguajesProgramador.add(objLenguajeProgramacion);
                        }
                        objProgramador = new Programador(intCodigoProgramador, strNombresProgramador, dblSalarioMensualProgramador, lstLenguajesProgramador);
                        lstProgramadores.add(objProgramador);
                    } while (intCiclosProgramadores < intNumeroProgramadores);
                    objLider = new Lider(intCodigoLider, strNombresLider, dblSalarioMensualLider, lstLenguajesLider, lstProgramadores);
                    lstLideres.add(objLider);
                }
                objMaquila = new Maquila("Maquila No.1", lstLideres);
                break;

        }
        GuardarArchivo objGuardar = new GuardarArchivo();
        objGuardar.AbrirArchivo();
        objGuardar.AgregarInformacion(objMaquila.toString());
        objGuardar.CerrarArchivo();
    }
}
