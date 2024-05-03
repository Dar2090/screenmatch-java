import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");
        // System.out.println("Película Matrix");

        // Declaracion de variables:
        // int, double, boolean son variables primitivas.
        // String es una clase pero la usamos para guardar cadena de caracteres tambien, en comillas dobles.

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio,
                la actuacion de Keanu es muy buena.
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Pelicula: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluacion: " + evaluacion);
        System.out.println("Incluido en el plan basico: " + incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;

        System.out.println("Media de la evaluacion de " + nombre + ": " +  mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("Pelicula popular del momento");
        }
        else {
            System.out.println("Pelicula Retro que vale la pena ver.");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa la nota que le darias a Matrix: ");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + notaMatrix;
        }
        System.out.println("La media de la pelicula " +
                "Matrix calculada por el usuario es: " + (mediaEvaluacionesUsuario/3));

    }
}