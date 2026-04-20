/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lector;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ESTUDIANTE
 */
public class NodoDialogo {
    private int id;
    private String speaker;
    private String txt;
    private List<Opcion> opciones = new ArrayList<>();

    public List<Opcion> getOpciones() {
        return opciones;
    }

    public String getSpeaker() {
        return speaker;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public void setOpciones(List<Opcion> opciones) {
        this.opciones = opciones;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public NodoDialogo(int id, String speaker, String txt) {
        this.id = id;
        this.speaker = speaker;
        this.txt = txt;
    }
    
    public void agregarOpcion(Opcion opcion) {
        this.opciones.add(opcion);
    }
     
    public void mostrarOpciones(){
        System.out.println("Opciones:");
        for (int i = 0; i < this.opciones.size(); i++) {
            String tx = opciones.get(i).getTxt();
            if (!"".equals(tx)) {
                System.out.println(i+". "+tx);
            }
        }
    }

    @Override
    public String toString() {
        return txt;
    }
    
}
