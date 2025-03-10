package Companhia aerea;

public class Voo {
    private String idVoo;
    private DateTime horarioChegada;
    private DateTime horarioPartida;
    private String localPartida;
    private String localChegada;
    private Piloto piloto;
    private Piloto copiloto;
    private List<Passageiro> passageiros;

    public Voo(String idVoo, DateTime horarioChegada, DateTime horarioPartida, String localPartida, String localChegada, Piloto piloto, Piloto copiloto, List<Passageiro> passageiros) {
        this.idVoo = idVoo;
        this.horarioChegada = horarioChegada;
        this.horarioPartida = horarioPartida;
        this.localPartida = localPartida;
        this.localChegada = localChegada;
        this.piloto = piloto;
        this.copiloto = copiloto;
        this.passageiros = passageiros;
    }
    public String getIdVoo() {
        return idVoo;
    }
    public void setIdVoo(String idVoo) {
        this.idVoo = idVoo;
    }
    public DateTime getHorarioChegada() {
        return horarioChegada;
    }
    public void setHorarioChegada(DateTime horarioChegada) {
        this.horarioChegada = horarioChegada;
    }
    public DateTime getHorarioPartida() {
        return horarioPartida;
    }
    public void setHorarioPartida(DateTime horarioPartida) {
        this.horarioPartida = horarioPartida;
    }
    public String getLocalPartida() {
        return localPartida;
    }
    public void setLocalPartida(String localPartida) {
        this.localPartida = localPartida;
    }
    public String getLocalChegada() {
        return localChegada;
    }
    public void setLocalChegada(String localChegada) {
        this.localChegada = localChegada;
    }
    public Piloto getPiloto() {
        return piloto;
    }
    public void setPiloto(Piloto piloto) {
        this.piloto = piloto;
    }
    public Piloto getCopiloto() {
        return copiloto;
    }
    public void setCopiloto(Piloto copiloto) {
        this.copiloto = copiloto;
    }
    public List<Passageiro> getPassageiros() {
        return passageiros;
    }
    public void setPassageiros(List<Passageiro> passageiros) {
        this.passageiros = passageiros;
    }

    public void adicionarPassageiro(Passageiro passageiro) {
        passageiros.add(passageiro);
    }
    public void removerPassageiro(Passageiro passageiro) {
        passageiros.remove(passageiro);
    }
}
