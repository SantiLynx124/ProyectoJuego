/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lector;

/**
 *
 * @author ESTUDIANTE
 */
public class Opcion {
    private String txt;
    private int destinoId;

    public String getTxt() {
        return txt;
    }

    public void setTxt(String txt) {
        this.txt = txt;
    }

    public int getDestinoId() {
        return destinoId;
    }

    public void setDestinoId(int destinoId) {
        this.destinoId = destinoId;
    }

    public Opcion(String txt, int destinoId) {
        this.txt = txt;
        this.destinoId = destinoId;
    }
}
