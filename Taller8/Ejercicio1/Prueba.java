package Ejercicio1;

public class Prueba{
    public static void main(String[] args) {
        
        Vehiculo vehiculo = new Vehiculo("BMW", 180);
        System.out.println("Información del vehículo:");
        vehiculo.mostrarInformacion();

        System.out.println();

       
        Coche coche = new Coche("AUDI", 200, 4);
        System.out.println("Información del coche:");
        coche.mostrarInformacion();
    }
}

