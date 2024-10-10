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

    public Videojuegos() {
    }

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

    //-----------metodo personalizados


}
