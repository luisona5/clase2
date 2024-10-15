public class Pelicula {
     String titulo;
     String genero;
     String productora;
     Double duracion;
     int anio;


     public Pelicula(String titulo, String genero, String productora, Double duracion, int anio) {
         this.titulo = titulo;
         this.genero = genero;
         this.productora = productora;
         this.duracion = duracion;
         this.anio = anio;
     }
     public Pelicula() {}


     public String getTitulo() { return titulo; }
     public String getGenero() { return genero; }
     public String getProductora() { return productora; }
     public Double getDuracion() { return duracion; }
     public int getAnio() { return anio; }

    public void setTitulo(String titulo) { this.titulo = titulo; }
    public void setGenero(String genero) { this.genero = genero; }
    public void setProductora(String productora) { this.productora = productora; }
    public void setDuracion(Double duracion) { this.duracion = duracion; }
    public void setAnio(int anio) { this.anio = anio; }


    public void pantalla(){
         System.out.println("titulo: " + titulo);
         System.out.println("genero: " + genero);
         System.out.println("productora: " + productora);
         System.out.println("duracion: " + duracion);
         System.out.println("anio: " + anio);
        System.out.println("-----------------------------------------");
    }
}
