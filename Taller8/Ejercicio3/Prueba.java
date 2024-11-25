package Ejercicio3;

public class Prueba {
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado("Eduardo", 6000);
        System.out.println("Información del empleado:");
        empleado.mostrarDetalles();

        System.out.println();

        
        Gerente gerente = new Gerente("Ana", 5000, "Ventas");
        System.out.println("Información del gerente:");
        gerente.mostrarDetalles();
    }
}

