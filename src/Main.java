//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.printf("'\n\n\n--------LOS LIBRO DE LA BIBLIOTECA-----------\n");
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
        System.out.println(libro5.imprimir_Cubiertas());
    }
}