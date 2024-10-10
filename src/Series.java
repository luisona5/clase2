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
    //----------construyendo los getters
    public String getName() {
        return name;
    }
    public String getGenre(){
        return genre;
    }
    public int getYear(){
        return year;
    }
    public String getCountry(){
        return country;
    }
    public Double getPrice(){
        return price;
    }

    //-------------------------------SETTER

    public void setName(String name) {
        this.name = name;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public void setPrice(Double price) {
        this.price = price;
    }










    /*
    public void imprimir(){
        System.out.println("nombre: "+this.name);
        System.out.println("genero: "+this.genre);
        System.out.println("año de estreno: "+this.year);
        System.out.println("pais de origen: "+this.country);
        System.out.println("duracion: "+this.price);
        System.out.println("\n-------------------------------- ");
    }
    */

}