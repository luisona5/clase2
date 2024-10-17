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
        System.out.println(libro5.imprimir_Cubiertas());
*/

/*
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
        // voy a setear el valor=cambiar el año en  este caso
        System.out.println(series2.getYear());
        series1.setYear(2014);
        System.out.println(series1.getYear());



        series2.setName("los indestructibles");
        series2.setYear(2014);
        series2.setGenre("terror");
*/
        /*
        series1.imprimir();
        series2.imprimir();
        series3.imprimir();
        */

        System.out.println("\n----------------------------AUTOS-------------------------");
        Auto auto1 = new Auto("Chevrolte","family","azul",5);
        Auto auto2 = new Auto("Hyundai","tucson","blanco",5);
        Auto auto3 = new Auto("Hyundai","h1","negro",12);
        Auto auto4 = new Auto("Kia","rio","blanco",5);


        auto1.mostrar();
        auto2.mostrar();
        auto3.mostrar();
        auto4.mostrar();

        System.out.println("\n----------------------------PERSONAS-------------------------");
        Persona persona1 = new Persona("luis","Oña","masculino",22,1.65);
        Persona persona2 = new Persona("Carla","morales","femenino",19,1.56);

        persona1.indicar();
        persona2.indicar();

        System.out.println("\n-------------------TRANSPORTE------------------------------");
        Transporte transporte1= new Transporte("TURISMO","NUEVO","CEPEDA","SCANNIA");
        Transporte transporte2= new Transporte("FLOTA IMBABURA","NUEVO","IMPEDSA","HINO");

        transporte1.indicar();
        transporte2.indicar();

        System.out.println("\n--------------------PELICULAS-----------------------------------");
        Pelicula pelicula1=new Pelicula("Intensamente_2","Infantil","Pixar",1.36,2024);
        Pelicula pelicula2=new Pelicula("Robot Salvaje","infanil","DreamWorks",1.42,2024);

        pelicula1.pantalla();
        pelicula2.pantalla();

        System.out.println("\n--------------------ZAPATOS-----------------------------------");
        zapato zapato1=new zapato("cali","nike","blanco",38,68.75);
        zapato zapato2=new zapato("sack","adiddas","fucsia",40,125.12);

        zapato1.ventana();
        zapato2.ventana();


        System.out.println("----------INSTRUMENTOS MUSICALES------------");
        Instrumento_Musical instrumento1= new Instrumento_Musical("trompeta","viento","mediano",988);
        Instrumento_Musical instrumento2= new Instrumento_Musical("bombo","percusion","grande",147);

        instrumento1.vista();
        instrumento2.vista();

        System.out.println("----------Video Juegos------------");
        Videojuegos juego1=new Videojuegos("freefire","battle",2018,"Garena");
        Videojuegos juego2=new Videojuegos("fifa","deportivo",2020,"EA SPORT");

        juego1.demostrar();
        juego2.demostrar();

        System.out.println("---------------MTERIAS-------------------");
        Materia materia1=new Materia("POO","Se enfoca en los objetos que los programadores necesitan manipular, en lugar de centrarse en la lógica necesaria para esa manipulación",192,4);
        Materia materia2=new Materia("Diseño de interfaces","responsable de la apariencia, la interactividad, la usabilidad, el comportamiento y la sensación general de un producto.",96,2);

        materia1.pestania();
        materia2.pestania();


    }

}