/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lectura;
import Clases.Camino;
import Clases.Player;
import Lector.Grafo;
import Lector.NodoDialogo;
import java.io.IOException;
import java.util.Scanner;
/**
 *
 * @author ESTUDIANTE
 */
public class GestorDialogos {
    private Grafo grafo = new Grafo();
    private Player p = new Player("Santi", "Huaman", "Reyes", Camino.Imitador);
    static Scanner sc = new Scanner(System.in);

    public Grafo getGrafo() {
        return grafo;
    }

    public void setGrafo(Grafo grafo) {
        this.grafo = grafo;
    }
    
    public void dialogos(String dialogos, String opciones) throws IOException{
        int nextId= 0;
        NodoDialogo nodo;
        grafo.cargarDialogo(dialogos);
        grafo.cargarOpciones(opciones);
        
        while (nextId != -1) {            
            nodo = grafo.getGrafo().get(nextId);
            if (!"|".equals(nodo.getSpeaker())) {
                System.out.print(nodo.getSpeaker()+ ": ");
            }
            String txt = ReemplazoCorchetes(nodo.getTxt());
            System.out.println(txt);
            nextId = elegir(nodo);
        }
    }
    
    int elegir(NodoDialogo nodo){
       int selec = -1;
       
        if ("".equals(nodo.getOpciones().get(0).getTxt())) {
            return -1;
        }
        while(selec < 0 || selec > nodo.getOpciones().size() - 1){
            nodo.mostrarOpciones();
            selec = sc.nextInt();
        }
        
       return nodo.getOpciones().get(selec).getDestinoId();
    }
    
    public String ReemplazoCorchetes(String txt) {
        String resultado = txt.replaceAll("\\[n\\]", p.getNombre());
        resultado = resultado.replaceAll("\\[N\\]", p.getNombreCompleto());
        resultado = resultado.replaceAll("\\[ap\\]", p.getApellidoP());
        resultado = resultado.replaceAll("\\[am\\]", p.getApellidoM());
        resultado = resultado.replaceAll("\\[c\\]", p.getCamino().name());
        resultado = resultado.replaceAll("\\[s\\]", p.getSecuencia().toString());
        return resultado;
    }
}
