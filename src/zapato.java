public class zapato {
    String nombre;
    String marca;
    String color;
    int medida;
    Double precio;

    public zapato() {}

    public zapato(String nombre, String marca, String color, int medida, Double precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.color = color;
        this.medida = medida;
        this.precio = precio;
    }

    //----------construyendo los getters-------------------
    public String getNombre() { return nombre; }
    public String getMarca() { return marca; }
    public String getColor() { return color; }
    public int getMedida() { return medida; }
    public Double getPrecio() { return precio; }

    //------------construyendo los setters----------------
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setMarca(String marca) { this.marca = marca; }
    public void setColor(String color) { this.color = color; }
    public void setMedida(int medida) { this.medida = medida; }
    public void setPrecio(Double precio) { this.precio = precio; }


    //--------personalizando la impresion-----------------------

    public void ventana(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Marca: " + marca);
        System.out.println("Color: " + color);
        System.out.println("Medida: " + medida);
        System.out.println("Precio: " + precio);
        System.out.println("--------------------------------\n");
    }

}
