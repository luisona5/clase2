public class Persona {
    String nombre;
    String apellido;
    String sexo;
    int edad;
    Double altura;

    public Persona(String nombre,String apellido,String sexo, int edad, Double altura) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.edad = edad;
        this.altura = altura;
    };

    public Persona() {};

    //--------contruyendo los getters-----------
    public String getNombre() {return nombre;}
    public String getApellido() {return apellido;}
    public String getSexo() {return sexo;}
    public int getEdad() {return edad;}
    public Double getAltura() {return altura;}

    //-------contruyendo los setters--------
    public void setNombre(String nombre) {this.nombre = nombre;}
    public void setApellido(String apellido) {this.apellido = apellido;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public void setEdad(int edad) {this.edad = edad;}
    public void setAltura(Double altura) {this.altura = altura;}

    //--------personalizacion--------

    public void indicar() {
        System.out.println("nombre: " + nombre);
        System.out.println("apellido: " + apellido);
        System.out.println("sexo: " + sexo);
        System.out.println("edad: " + edad);
        System.out.println("altura: " + altura);
        System.out.println("----------------------------------------------");
    }



}
