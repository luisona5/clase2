public class Cancion {
    String nombre;
    String genero;
    Double duracion;
    String artista;
    String album;

    public Cancion(String nombre, String genero, Double duracion, String artista, String album) {
        this.nombre = nombre;
        this.genero = genero;
        this.duracion = duracion;
        this.artista = artista;
        this.album = album;
    }
    public void imprimir(){
        System.out.println("nombre: "+this.nombre);
        System.out.println("genero: "+this.genero);
        System.out.println("duracion: "+this.duracion);
        System.out.println("artista: "+this.artista);
        System.out.println("album: "+this.album);
        System.out.println("\n-------------------------------- ");
    }
}
