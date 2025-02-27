package Hora;
import java.util.Scanner;

public class Hora {
    public byte hora;
    public byte minuto;
    public byte segundo;

    public void ajustarHora(byte hora, byte minuto, byte segundo){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public boolean validar(){
        if(hora < 0 || hora > 23){
            return false;
        }
        if(minuto < 0 || minuto > 59){
            return false;
        }
        if(segundo < 0 || segundo > 59){
            return false;
        }
        return true;
    }
    public void incrementar() {
        segundo++;
        if (segundo == 60) {
            segundo = 0;
            minuto++;
            if (minuto == 60) {
                minuto = 0;
                hora++;
                if (hora == 24) {
                    hora = 0;
                }
            }
        }
    }


    
     public boolean comparar(Hora h){
        if(hora == h.hora && minuto == h.minuto && segundo == h.segundo){
            return true;
        }
        return false;
        
    }
    public void imprimir(){
        System.out.println(hora + ":" + minuto + ":" + segundo);
    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Hora h = new Hora();
    Hora h2 = new Hora();
    h.ajustarHora((byte) 23, (byte) 59, (byte) 59);
    h2.ajustarHora((byte) 23, (byte) 25, (byte) 59);
    h.imprimir();
    h2.imprimir();
    h.incrementar();
    h.imprimir();
    h2.incrementar();
    h2.imprimir();
    System.out.println(h.comparar(h2));
    sc.close();
}
}
