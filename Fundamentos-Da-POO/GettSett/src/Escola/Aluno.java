package Escola;

public class Aluno {
    
    private String nome;
    private int idade;


//GET
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    
//SET
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }


}
