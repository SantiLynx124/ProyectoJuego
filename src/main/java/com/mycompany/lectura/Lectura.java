/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lectura;

import Clases.Player;

import java.io.IOException;

/**
 *
 * @author ESTUDIANTE
 */
public class Lectura {

    public static void main(String[] args) throws IOException  {
        GestorDialogos g = new GestorDialogos(Player.player());
        g.dialogos("Dialogo.csv", "Opciones.csv");
    }
}
