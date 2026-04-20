/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

/**
 *
 * @author ESTUDIANTE
 */
public enum Ora implements  Secuencia{
    Imitador(9),
    Manipulador(8),
    Predicador(7),
    Orador(6);
    
    int secuencia;

    @Override
    public int getSecuencia() {
        return secuencia;
    }

    public void setSecuencia(int secuencia) {
        this.secuencia = secuencia;
    }

    private Ora(int secuencia) {
        this.secuencia = secuencia;
    }
    
    public static Ora fromSecuencia(int secuencia) {
        for (Ora o : values()) {
            if (o.getSecuencia() == secuencia) {
                return o;
            }
        }
        throw new IllegalArgumentException("Secuencia inválida para Ora: " + secuencia);//hola
    }
    
    
}
