package Ejercicio3.Escenario1.Clases;

public class LenguajeProgramacion{
    private String nombre;

    public LenguajeProgramacion(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return String.format(getNombre());
    }
    
    
    
}