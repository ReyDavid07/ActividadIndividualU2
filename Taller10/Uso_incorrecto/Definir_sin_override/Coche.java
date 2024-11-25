

public class Coche extends Vehiculo {
    // Método sobrescrito sin usar @Override
    public void moverse() {
        System.out.println("El coche se mueve rápidamente.");
    }

    /*Si no usamos @Override, el compilador no verifica 
    si realmente estamos sobrescribiendo un método de la clase base. */

}

/************************************************************ */

//correctamente escrito:

/*public class Coche extends Vehiculo {
    @Override
    public void moverse() {
        System.out.println("El coche se mueve rápidamente.");
    }
}
 */
