import java.util.Scanner;
import modelo.Movie;
import modelo.Serie;

public class Principal {
    private Movie peliculaUsuario = new Movie();
    private Serie serieUsuario = new Serie();
    public void muestraElMenu(){
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);
        while (opcion != 9){
            String menu = """
                    Bienvenido(a) a Screenmatch
                    Ingrese la opcion que corresponda:
                    1) Registrar nueva película.
                    2) Registrar nueva serie.
                    3) Calculadora de tiempo para maratonear.
                    
                    9) Salir del menú.
                    
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();
            switch (opcion){
                case 1:
                    System.out.println("Ingrese el nombre de la pelicula: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el anio de lanzamiento de la pelicula: ");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duracion en minutos de la pelicula: ");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();

                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;

                case 2:
                    System.out.println("Ingrese el nombre de la serie");
                    String nombreSerie = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento de la serie");
                    int fechaDeLanzamientoSerie = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa el numero de temporadas para esta serie");
                    int temporadas = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la cantidad de episodios por cada temporada");
                    int episodiosPorTemporada = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Por favor ingresa la duración en minutos de cada episodio");
                    int minutosPorEpisodio = teclado.nextInt();
                    teclado.nextLine();

                    serieUsuario.setNombre(nombreSerie);
                    serieUsuario.setFechaDeLanzamiento(fechaDeLanzamientoSerie);
                    serieUsuario.setTemporadas(temporadas);
                    serieUsuario.setEpisodiosPorTemporada(episodiosPorTemporada);
                    serieUsuario.setDuracionPorEpisodio(minutosPorEpisodio);
                    serieUsuario.muestraFichaTecnica();
                    break;

                case 3:
                    System.out.println();


                case 9:
                    System.out.println("Saliendo del programa. Nos vemos luego.");
                    break;

                default:
                    System.out.println("Opcion no válida, vuelva a intentar.\n");
            }

        }
    }
}
