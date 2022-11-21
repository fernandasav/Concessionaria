import br.com.concessionaria.cliente.FormaDePagamento;

public abstract class Cliente {
    private String nome;
    private String telefone;
    private String email;
    private FormaDePagamento formaDePagamento;
    private Endereco endereco;

    public Cliente(){
    }
    public Cliente(String nome, String telefone, String email, FormaDePagamento formaDePagamento, Endereco endereco) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.formaDePagamento = formaDePagamento;
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public FormaDePagamento getFormaDePagamento() {
        return formaDePagamento;
    }

    public void setFormaDePagamento(FormaDePagamento formaDePagamento) {
        this.formaDePagamento = formaDePagamento;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public abstract void validarDocumento();

    @Override
    public String toString() {
        return "--------- DADOS DO CLIENTE --------- \n" +
                "Nome: " + nome +
                ", telefone: " + telefone +
                ", email: " + email +
                ", formaDePagamento: "+ formaDePagamento;
    }
}


