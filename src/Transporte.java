public class Transporte {

    String cooperativa;
    String estado;
    String carroceria;
    String chasis;

    public Transporte() {}

    public  Transporte( String cooperativa, String estado, String carroceria, String chasis) {

        this.cooperativa = cooperativa;
        this.estado = estado;
        this.carroceria = carroceria;
        this.chasis = chasis;

    }
    //-----construyendo los getters-----

    public String getCooperativa() { return cooperativa; }
    public String getEstado() { return estado; }
    public String getCarroceria() { return carroceria; }
    public String getChasis() { return chasis; }

    // -----------construyendo los setters--------

    public void setCooperativa(String cooperativa) { this.cooperativa = cooperativa; }
    public void setEstado(String estado) { this.estado = estado; }
    public void setCarroceria(String carroceria) {this.carroceria = carroceria;}
    public void setChasis(String chasis) { this.chasis = chasis; }

    //----------PERSONALIZACION--------------------
    public void indicar() {

        System.out.println("Cooperativa: " + cooperativa);
        System.out.println("Estado: " + estado);
        System.out.println("Carroceria: " + carroceria);
        System.out.println("Chasis: " + chasis);
        System.out.println("----------------------------------");
    }

}

