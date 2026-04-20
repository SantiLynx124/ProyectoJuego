/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

/**
 *
 * @author ESTUDIANTE
 */
public enum Alq implements Secuencia{
    Herborista(9), Boticario(8), Medico_Brujo(7), Alquimista(6);
    
    int secuencia;

    @Override
    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    private Alq(int secuencia) {
        this.secuencia = secuencia;
    }
    
    public static Alq fromSecuencia(int secuencia) {
        for (Alq a : values()) {
            if (a.getSecuencia() == secuencia) {
                return a;
            }
        }
        throw new IllegalArgumentException("Secuencia inválida para Alq: " + secuencia);
    }
}
