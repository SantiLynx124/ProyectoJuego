/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lectura;

import java.io.IOException;
import Clases.Player;

/**
 *
 * @author ESTUDIANTE
 */
public class Lectura {

    public static void main(String[] args) throws IOException  {
        GestorDialogos g = new GestorDialogos();
        g.dialogos("Dialogo.csv", "Opciones.csv");
    }
}
