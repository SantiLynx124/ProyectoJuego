/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.util.EnumMap;

/**
 *
 * @author ESTUDIANTE
 */
public class Player {
   private String nombre;
   private String apellidoP;
   private String apellidoM;
   private Camino camino;
   private Secuencia secuencia;  
   private int cordura;
   
   EnumMap<Rasgo, Integer> personalidad = new EnumMap<>(Rasgo.class);


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public Camino getCamino() {
        return camino;
    }

    public void setCamino(Camino camino) {
        this.camino = camino;
    }

    public Secuencia getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(Secuencia secuencia) {
        this.secuencia = secuencia;
    }
    
    public int getCordura() {
        return cordura;
    }

    public void setCordura(int cordura) {
        this.cordura = cordura;
    }

    public EnumMap<Rasgo, Integer> getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(EnumMap<Rasgo, Integer> personalidad) {
        this.personalidad = personalidad;
    }

    public Player(String nombre, String apellidoP, String apellidoM, Camino camino) {
        this.nombre = nombre;
        this.apellidoP = apellidoP;
        this.apellidoM = apellidoM;
        this.camino = camino;
        
        this.secuencia = this.camino.getSecuenciaPorNumero(9);
        
        this.cordura = 10;
        
        for (Rasgo r : Rasgo.values()) {
            personalidad.put(r, 0);
        }
    }
    
    public String getNombreCompleto() {
        return nombre + " " + apellidoP + " " + apellidoM;
    }

    public void modificarRasgo(Rasgo rasgo, int valor) {
        personalidad.put(rasgo, personalidad.get(rasgo) + valor);
    }

    public int getRasgo(Rasgo rasgo) {
        return personalidad.get(rasgo);
    }
    
    
}
