package Ejercicio2cont;

public class Prueba {
    public static void main(String[] args) {
        
        Estudiante estudiante1 = new Estudiante("Juan", 21, "2023XYZ456");
        Estudiante estudiante2 = new Estudiante("María", 19, "2024ABC789");

       
        System.out.println("Información del estudiante 1:");
        estudiante1.mostrarInformacion();

        System.out.println();

        System.out.println("Información del estudiante 2:");
        estudiante2.mostrarInformacion();
    }
}
