public class Auto {
    String marca;
    String nombre;
    String color;
    int capacidad;
    public Auto(String marca, String nombre, String color, int capacidad) {
        this.marca = marca;
        this.nombre = nombre;
        this.color = color;
        this.capacidad = capacidad;
    }


    // haciendo un contructor vacio
    public Auto(){  }



    //construyendo los getters

    public String getMarca() {return marca;}
    public String getNombre() {return nombre;}
    public String getColor() {return color;}
    public int getCapacidad() {return capacidad;}


    //construyendo los setters
    public void setMarca(String marca) {this.marca = marca;}
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setColor(String color) {this.color = color;}
    public void setCapacidad(int capacidad) {this.capacidad = capacidad;}
}
