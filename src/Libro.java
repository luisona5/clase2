//----------------------------------CLASE--------

public class Libro {
    //---------------------------ATRIBUTOS
    String titulo;
    String autor;
    String editora;
    int paginas;


    //-------------------------------METODOS
    // DEBE TENER UN CONSTRUCTOR 100PRE

    public Libro(String autor, String titulo, int paginas, String editora) {
        this.autor = autor;
        this.titulo = titulo;
        this.paginas = paginas;
        this.editora = editora;
        //THIS ES UN PUNTERO ANINISMO, ES UNA DIRECCION DE MEMORIA, LA VARIABLE SE VA A GUARDAR EN ALGUN LUGAR
    }
    public void imprimir(){
        System.out.println("autor: "+this.autor);
        System.out.println("titulo: "+this.titulo);
        System.out.println("numero de paginas: "+this.paginas);
        System.out.println("editorial: "+this.editora);
        System.out.println("\n-------------------------------- ");
    }

    public int imprimir_Cubiertas(){

        return this.paginas+5; // para imprimir paginas adicionales a las que estan establecidas

    }

}
