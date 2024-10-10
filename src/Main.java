//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*System.out.printf("'\n\n\n--------LOS LIBRO DE LA BIBLIOTECA SABROSON -----------\n");
        // para declarar el objeto
        // para instamciar una clase
        Libro libro1=new Libro("stephen king","el resplandor",600,"de bolsillo");

        Libro libro2=new Libro("julio verne","viaje al centro de la tierra",320,
                "Anaya Infantil y Juvenil");

        Libro libro3=new Libro("Juan leon Mera","Cumanda",269,"Ediciones Cátedra");
        Libro libro4=new Libro("Eve Babitz","Días lentos, malas compañías: El mundo, la carne y L.A",220,"Colectivo Bruxista");
        Libro libro5=new Libro("Nerea Pascual", "Cuando el cielo se vuelva amarillo",336,"Esencia");

        libro1.imprimir();
        System.out.println(libro1.imprimir_Cubiertas());
        libro2.imprimir();
        System.out.println(libro2.imprimir_Cubiertas());
        libro3.imprimir();
        System.out.println(libro3.imprimir_Cubiertas());
        libro4.imprimir();
        System.out.println(libro4.imprimir_Cubiertas());
        libro5.imprimir();
        System.out.println(libro5.imprimir_Cubiertas());*/


        System.out.println("----------------------------------------------MUSICA-----------------------\n");
        Cancion cancion1=new Cancion("payaso","regueton",3.25,"Hector el ¨FATHER¨","GOLD STAR");
        Cancion cancion2=new Cancion("sola","regueton",2.45,"Hector el ¨FATHER¨","GOLD STAR");
        Cancion cancion3=new Cancion("dejalo caer todo el peso","regueton",4.35,"Hector el ¨FATHER¨ft Yomo","Sangre nueva");
        Cancion cancion4=new Cancion("duele", "pop",5.34,"jessy y joy","un besito mas");

        cancion1.imprimir();
        cancion2.imprimir();
        cancion3.imprimir();
        cancion4.imprimir();


        System.out.println("----------------------------------------------SERIES-----------------------\n");
        Series series1=new Series("ranma 1/2","familiar",1987,"Japon",35.6);
        Series series2=new Series("los gargolas","familiar",1997,"Estados Unidos",40.5);
        Series series3=new Series("yugi-OH","familiar",1998,"Japon ",40.5);

        System.out.println(series1.getName());
        // voy a setear el valor=cambiar el año en este caso
        System.out.println(series2.getYear());
        series1.setYear(2014);
        System.out.println(series1.getYear());

        /*
        series1.imprimir();
        series2.imprimir();
        series3.imprimir();
        */


    }
}