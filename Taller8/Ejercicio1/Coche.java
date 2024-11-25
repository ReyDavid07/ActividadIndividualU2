package Ejercicio1;

public class Coche extends Vehiculo {
    private int numeroDePuertas; 

   
    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Llamada al método de la clase padre
        System.out.println("Número de Puertas: " + numeroDePuertas);
    }
}

