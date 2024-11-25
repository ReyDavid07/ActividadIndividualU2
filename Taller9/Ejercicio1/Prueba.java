package Ejercicio1;

public class Prueba {
    public static void main(String[] args) {
        
        Persona persona = new Persona("Rey", 17);
        System.out.println("Detalles de la persona:");
        persona.mostrarDetalles();

        System.out.println();

       
        Empleado empleado = new Empleado("Sara", 47, "Profesora");
        System.out.println("Detalles del empleado:");
        empleado.mostrarDetalles();
    }
}

