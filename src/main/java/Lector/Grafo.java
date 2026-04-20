/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lector;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 *
 * @author ESTUDIANTE
 */
public class Grafo {
   private final HashMap<Integer, NodoDialogo> grafo = new HashMap<>();

    public HashMap<Integer, NodoDialogo> getGrafo() {
        return grafo;
    }
   
   public void cargarDialogo (String ruta)throws IOException{
       try (BufferedReader br = new BufferedReader(new FileReader (ruta))) {
           String linea;
           
           while ((linea = br.readLine()) != null) {
               String[] partes = linea.split(";");
               int id = Integer.parseInt(partes[0].trim());
               String speaker =partes[1].trim();
               String txt =partes[2].trim();
               
               grafo.put(id, new NodoDialogo(id, speaker, txt));
           }
       }
   }
   
   public void cargarOpciones(String rutaCSV) throws IOException {
       try (BufferedReader br = new BufferedReader(new FileReader(rutaCSV))) {
           String linea;
           
           while ((linea = br.readLine()) != null) {
               String[] partes = linea.split(";");
               int idOrigen = Integer.parseInt(partes[0].trim());
               String txtOpcion = partes[1].trim();
               int idDestino = Integer.parseInt(partes[2].trim());
               
               NodoDialogo nodo = grafo.get(idOrigen);
               nodo.agregarOpcion(new Opcion(txtOpcion, idDestino));
           }
       }
   }
   
   public void mostrarDialogos(){
       for (int i = 0; i < grafo.size(); i++) {
           String txt = grafo.get(i).getTxt();
           System.out.println(txt);
       }
   }
   
   public void mostrarNodo(){
       for (int i = 0; i < grafo.size(); i++) {
           String t = grafo.get(i).getTxt();
           System.out.println(t);
           grafo.get(i).mostrarOpciones();
       }
   }
   
}
