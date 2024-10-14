public class Videojuegos {
    String nombre;
    String genero;
    int anio;
    String desarrollador;

    public Videojuegos(String nombre, String genero, int anio, String desarrollador) {
        this.nombre = nombre;
        this.genero = genero;
        this.anio = anio;
        this.desarrollador = desarrollador;
    }

    // construyendo una clase vacia

    public Videojuegos() {}

    // construyendo los getters--------

    public String getNombre() {
        return nombre;
    }
    public String getGenero() {
        return genero;
    }
    public int getAnio() {
        return anio;
    }
    public String getDesarrollador() {
        return desarrollador;
    }

    //-------------construyendo los setters----------
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public void setAnio(int anio) {
        this.anio = anio;
    }
    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    //-----------metodo personalizados-------------

    public void demostrar(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Genero: " + genero);
        System.out.println("Anio: " + anio);
        System.out.println("Desarrollador: " + desarrollador);

    }


}
