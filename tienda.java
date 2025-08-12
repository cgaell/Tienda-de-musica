package musica;
import java.util.*;

public class tienda {
    private String nombre;
    private ArrayList<album> albums;

    public tienda(String nombre) {
        this.nombre = nombre;
        this.albums = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<album> getAlbums() {
        return albums;
    }

    public void agregarAlbum(album nuevoAlbum) {
        this.albums.add(nuevoAlbum);
    }

    public void mostrarAlbumes() {
        for (album a : albums) {
            System.out.println("Álbum: " + a.getNombre());
            for (cancion c : a.getCanciones()) {
                System.out.println("  Canción: " + c.getTitulo() + " - Duración: " + c.getDuracion() + " segundos");
            }
        }
    }

public void buscarAlbum(String nombrealbum) {
    boolean encontrado = false;
    for (album i : albums) {
        if (nombrealbum.toUpperCase() == i.getNombre().toUpperCase()) {
            System.out.println("SI! El album que buscabas" + i.getNombre() + "esta aqui en " + this.getNombre());
            encontrado = true;
        if (encontrado == false){
                System.out.println("No se encontro el album :( ");
                encontrado = false;
            }
            return;
        }
    }

}
public void buscarCancion(String nombrecancion) {
    boolean encontrado = false;
    for (album i : albums) {
        for (cancion j : i.getCanciones()) {
            if (nombrecancion.toUpperCase().equals( j.getTitulo().toUpperCase())) {
                System.out.println("SI! La cancion que buscabas " + j.getTitulo() + " esta en el album " + i.getNombre());
                encontrado = true;
            }
        }
    }
    if (!encontrado) {
        System.out.println("No se encontro la cancion :( ");
    }

}
}


