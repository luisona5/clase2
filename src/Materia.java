public class Materia {
    String nombre;
    String descripcion;
    int horas;
    int creditos;

    public Materia(){}


    public Materia(String nombre, String descripcion, int horas, int creditos) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.horas = horas;
        this.creditos = creditos;
    }

    // -----------construyendo los getters----------
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public int getHoras() { return horas; }
    public int getCreditos() { return creditos; }

    //------- construyendo los setters---------------

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public void setHoras(int horas) { this.horas = horas; }
    public void setCreditos(int creditos) { this.creditos = creditos; }

    //-----------PERSONALIZADOS DE IMPRESION------------

    public void pestania(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Horas: " + horas);
        System.out.println("Creditos: " + creditos);
        System.out.println("-----------------------------------------");
    }


}
