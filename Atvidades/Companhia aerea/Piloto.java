import java.util.Date;

public class Piloto {
    private String nomePiloto;
    private String numeroRegistro;
    private Date dataValidadeRegistro;

    public Piloto(String nomePiloto, String numeroRegistro, Date dataValidadeRegistro) {
        this.nomePiloto = nomePiloto;
        this.numeroRegistro = numeroRegistro;
        this.dataValidadeRegistro = dataValidadeRegistro;
    }
    public String getNomePiloto() {
        return nomePiloto;
    }
    public void setNomePiloto(String nomePiloto) {
        this.nomePiloto = nomePiloto;
    }
    public String getNumeroRegistro() {
        return numeroRegistro;
    }
    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }
    public Date getDataValidadeRegistro() {
        return dataValidadeRegistro;
    }
    public void setDataValidadeRegistro(Date dataValidadeRegistro) {
        this.dataValidadeRegistro = dataValidadeRegistro;
    }
   public boolean validarRegistro() {
        Date dataAtual = new Date();
        return dataAtual.before(dataValidadeRegistro);
    }
}
