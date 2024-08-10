public class Pessoa 
{
    private String nome;
    private String cpf;
    private String endereco;

    public Pessoa(String nome, String cpf){
        this.nome = nome;
        this.cpf = cpf;
    }

//GET
    public String getEndereco() {
        return endereco;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

//SET
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
