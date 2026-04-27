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

    public static Camino elegirCamino(){
        Camino c = Camino.Imitador;
        int option = 0;

        while (option == 0){
            System.out.println("Elegi un camino:\n" + Camino.Imitador.name()+" (1)\n"+Camino.Herborista.name()+ " (2)");
            option = Player.sc.nextInt();

            switch (option){
                case 1 -> {
                    c = Camino.Imitador;
                }
                case 2-> {
                    c = Camino.Herborista;
                }
                default -> {
                    option = 0;
                }
            }
        }
        return c;
    }
}
