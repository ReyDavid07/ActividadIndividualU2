

public class Prueba {
    public static void main(String[] args) {
        
        Persona persona = new Persona();        
        Persona estudiante = new Estudiante();     
        Persona profesor = new Profesor();        
        System.out.println("Presentación de Persona:");
        persona.presentarse();
        System.out.println();
        System.out.println("Presentación de Estudiante:");
        estudiante.presentarse();
        System.out.println();
        System.out.println("Presentación de Profesor:");
        profesor.presentarse();
    }
}

