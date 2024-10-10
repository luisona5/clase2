public class Series {
    String name;
    String genre;
    int year;
    String country;
    Double price;

    public Series(String name, String genre, int year, String country, Double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.country = country;
        this.price = price;
    }
    public void imprimir(){
        System.out.println("nombre: "+this.name);
        System.out.println("genero: "+this.genre);
        System.out.println("año de estreno: "+this.year);
        System.out.println("pais de origen: "+this.country);
        System.out.println("duracion: "+this.price);
        System.out.println("\n-------------------------------- ");
    }
}