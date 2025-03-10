public class Passageiro {
    private String nomePassageiro;
    private String numeroId;
    private String telefone;
    private String endereco;

    public Passageiro(String nomePassageiro, String numeroId, String telefone, String endereco) {
        this.nomePassageiro = nomePassageiro;
        this.numeroId = numeroId;
        this.telefone = telefone;
        this.endereco = endereco;
    }
    public String getNomePassageiro() {
        return nomePassageiro;
    }
    public void setNomePassageiro(String nomePassageiro) {
        this.nomePassageiro = nomePassageiro;
    }
    public String getNumeroId() {
        return numeroId;
    }
    public void setNumeroId(String numeroId) {
        this.numeroId = numeroId;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String registrarPassageiro() {
        return "Passageiro registrado com sucesso!";
    }
    public void atualizarPassageiro( String telefone, String endereco) {  
        this.telefone = telefone;
        this.endereco = endereco;
    }
}
