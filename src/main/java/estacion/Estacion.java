package estacion;

public class Estacion {
    //Atributos
    public int id = 0;
    public String direccion = "";
    public int numeroAnclajes = 0;

    //Constructor
    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
    };

    //GETs
    private int getId() {
        return this.id;
    }

    private String getDireccion() {
        return this.direccion;
    }

    private int getNumeroAnclajes() {
        return this.numeroAnclajes;
    }

    //Métodos
    public String consultarEstacion() {
        return "La estación " + getId() + " con dirección en " + getDireccion() + " tiene " + getNumeroAnclajes() + " anclajes.";
    }
}
