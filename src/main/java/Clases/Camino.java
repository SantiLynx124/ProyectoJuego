/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Clases;

/**
 *
 * @author ESTUDIANTE
 */
public enum Camino {
    Imitador(Ora.class, true),
    Herborista(Alq.class, false);
    
    private boolean bandera;
    private Class<?> tipo;

    public boolean isBandera() {
        return bandera;
    }

    public void setBandera(boolean bandera) {
        this.bandera = bandera;
    }

    public Class<?> getTipo() {
        return tipo;
    }

    public void setTipo(Class<?> tipo) {
        this.tipo = tipo;
    }
    
    private Camino(Class<?> tipo, boolean bandera) {
        this.tipo = tipo;
        this.bandera = bandera;
    }
    
    public Secuencia getSecuenciaPorNumero(int numero) {
        return switch (this) {
            case Imitador -> Ora.fromSecuencia(numero);
            case Herborista -> Alq.fromSecuencia(numero);
        };
    }
}
