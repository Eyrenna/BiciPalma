package estacion;

import bicicleta.Bicicleta;

import java.util.concurrent.ThreadLocalRandom;

public class Estacion {
    //Atributos
    private int id = 0;
    private String direccion = "";
    private int numeroAnclajes = 0;

    private Bicicleta[] anclajes = null;

    //Constructor
    public Estacion(int id, String direccion, int numeroAnclajes) {
        this.id = id;
        this.direccion = direccion;
        this.numeroAnclajes = numeroAnclajes;
        this.anclajes = new Bicicleta[numeroAnclajes];
    };

    //SETs

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
    public void consultarEstacion() {
        System.out.println("\nId: " + getId() + "\nDirección: " + getDireccion() + "\nAnclajes: " + getNumeroAnclajes());
    }

    public int anclajesLibres() {
        int libres = 0;
        for (Bicicleta anclaje : anclajes) {
            if (anclaje == null) {
                libres = libres + 1;
            }
            else {
                continue;
            }
        }return libres;
    }

    public int generarAnclaje() {
        return ThreadLocalRandom.current().nextInt(numeroAnclajes);
    } //método que funciona pero comentamos en el main


}
