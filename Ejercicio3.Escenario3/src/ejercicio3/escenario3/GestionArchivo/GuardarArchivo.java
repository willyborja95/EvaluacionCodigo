package Ejercicio3.Escenario3.GestionArchivo;

import Ejercicio3.Escenario3.Clases.Maquila;
import java.io.File;
import java.io.FileNotFoundException;
import java.lang.SecurityException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.FormatterClosedException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class GuardarArchivo {

    private Formatter salida; // objeto usado para enviar texto al archivo
    
    // permite al usuario abrir el archivo
    public void AbrirArchivo() {
        try {
            salida = new Formatter("Ejercicio3.Escenario3.txt");
        } // fin de try
        catch (SecurityException securityException) {
            System.err.println(
                    "No tiene acceso de escritura a este archivo.");
            System.exit(1);
        } // fin de catch
        catch (FileNotFoundException filesNotFoundException) {
            System.err.println("Error al crear el archivo. hooooola"+filesNotFoundException.getStackTrace());
            System.exit(1);
        } // fin de catch
    } // fin del método abrir_archivo


    // agrega registros al archivo
    public void AgregarInformacion(String strMaquila) {
        try // envía valores al archivo
        {
            salida.format(strMaquila);

        } // fin de try
        catch (FormatterClosedException formatterClosedException) {
            System.err.println("Error al escribir en el archivo.");
            return;
        } // fin de catch

    } // fin del método agregarRegistros
    
    // cierra el archivo
    public void CerrarArchivo() {
        if (salida != null) {
            salida.close();
        }
    } // fin del método cerrarArchivo
} // fin de la clase ArchivoTexto

