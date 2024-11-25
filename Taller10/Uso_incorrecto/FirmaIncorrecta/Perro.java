
public class Perro extends Animal {

    public void hacerSonido(String tipoDeSonido) {
        System.out.println("El perro hace el sonido: " + tipoDeSonido);
    }
}

/*Este error no produce un error de compilación,
 pero no logra sobrescribir el método de la clase base,
  por lo que no se cumple el propósito de sobrescritura.
   Para sobrescribir correctamente el método, necesitamos mantener la misma firma. */

/**************************************************************************************** */

   /*CODIGO CORREGIDO */

   /*public class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("El perro ladra.");
    }
}
 */