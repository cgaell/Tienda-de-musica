package musica;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        tienda miTienda = new tienda("Radio Gaga");
        int opcion;

        System.out.println("Bienvenido a la tienda de música: " + miTienda.getNombre());

        do {
            System.out.println("\nElige una opción:"
                    + "\n1. Agregar álbum"
                    + "\n2. Mostrar álbumes"
                    + "\n3. Buscar álbum"
                    + "\n4. Buscar canción"
                    + "\n5. Salir");
            System.out.print("Opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Agregar álbum
                    System.out.print("Nombre del álbum: ");
                    String nombreAlbum = scanner.nextLine();
                    System.out.print("Nombre del artista: ");
                    String artista = scanner.nextLine();

                    ArrayList<cancion> canciones = new ArrayList<>();
                    String continuar;
                    do {
                        System.out.print("Título de la canción: ");
                        String titulo = scanner.nextLine();
                        System.out.print("Duración en segundos: ");
                        int duracion = scanner.nextInt();
                        scanner.nextLine(); // Limpiar buffer
                        canciones.add(new cancion(titulo,artista, duracion));

                        System.out.print("Agregar otra canción? (s/n): ");
                        continuar = scanner.nextLine();
                    } while (continuar.equalsIgnoreCase("s"));

                    album nuevoAlbum = new album(nombreAlbum, artista, canciones);
                    miTienda.agregarAlbum(nuevoAlbum);
                    System.out.println("album agregado exitosamente.");
                    break;

                case 2:
                    miTienda.mostrarAlbumes();
                    break;

                case 3:
                    System.out.print("Nombre del álbum a buscar: ");
                    String nombreBusqueda = scanner.nextLine();
                    boolean encontrado = false;
                    for (album a : miTienda.getAlbums()) {
                        if (a.getNombre().equalsIgnoreCase(nombreBusqueda)) {
                            System.out.println("album encontrado: " + a.getNombre());
                            encontrado = true;
                            break;
                        }
                    }
                    if (!encontrado) {
                        System.out.println("album no encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Título de la canción a buscar: ");
                    String tituloBuscado = scanner.nextLine();
                    miTienda.buscarCancion(tituloBuscado);
                    break;

                case 5:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }

        } while (opcion != 5);

        scanner.close();
    }
}
