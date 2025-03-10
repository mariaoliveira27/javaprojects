package Companhia aerea;

public class Assento {
    private int numeroAssento;
    private boolean ocupado;
    private Passageiro passageiro;
    private Voo voo;
    private int volumeBagagem;

    public Assento(int numeroAssento, boolean ocupado, Passageiro passageiro, Voo voo, int volumeBagagem) {
        this.numeroAssento = numeroAssento;
        this.ocupado = ocupado;
        this.passageiro = passageiro;
        this.voo = voo;
        this.volumeBagagem = volumeBagagem;
    }

    public int getNumeroAssento() {
        return numeroAssento;
    }
    public void setNumeroAssento(int numeroAssento) {
        this.numeroAssento = numeroAssento;
    }
    public boolean isOcupado() {
        return ocupado;
    }
    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }
    public Passageiro getPassageiro() {
        return passageiro;
    }
    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }
    public Voo getVoo() {
        return voo;
    }
    public void setVoo(Voo voo) {
        this.voo = voo;
    }
    public int getVolumeBagagem() {
        return volumeBagagem;
    }
    public void setVolumeBagagem(int volumeBagagem) {
        this.volumeBagagem = volumeBagagem;
    }
    public boolean reservarAssento(Passageiro passageiro, int volumeBagagem) {
        if (!ocupado) {
            this.passageiro = passageiro;
            this.volumeBagagem = volumeBagagem;
            ocupado = true;
            return true;
        }
        return false;
    }
}
