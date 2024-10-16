public class Instrumento_Musical {
    String nombre;
    String tipo;
    String tamano;
    int frecuencia;

    public Instrumento_Musical(){}


    public Instrumento_Musical(String nombre, String tipo, String tamano, int frecuencia) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.tamano = tamano;
        this.frecuencia = frecuencia;
    }


    //-------------------- construyendo los getters------------
    public String getNombre() {return nombre;}
    public String getTipo() {return tipo;}
    public String getTamano() {return tamano;}
    public int getFrecuencia() {return frecuencia;}

    //----------construyendo los setters-----------------------

    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setTipo(String tipo) {this.tipo = tipo;}
    public void setTamano(String tamano) {this.tamano = tamano;}
    public void setFrecuencia(int frecuencia) {this.frecuencia = frecuencia;}


    //-----------personalizando---------------------

    public void vista(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Tamano: " + tamano);
        System.out.println("Frecuencia: " + frecuencia);
        System.out.println("--------------------------------");
    }
}
