package musica;
import java.util.*;

public class album {
    private String nombre;
    private String artista;
    private ArrayList<cancion> canciones;

    public album(String nombre, String artista, ArrayList<cancion> canciones) {
        this.nombre = nombre;
        this.artista = artista;
        
        this.canciones = canciones;
    }

    public String getNombre() {
        return nombre;
    }

    public String getArtista() {
        return artista;
    }
    public ArrayList<cancion> getCanciones() {
        return canciones;
}
    public void agregarCancion(cancion nuevaCancion) {
        this.canciones.add(nuevaCancion);
    }
}   