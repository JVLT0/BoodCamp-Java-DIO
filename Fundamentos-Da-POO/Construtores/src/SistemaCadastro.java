public class SistemaCadastro {

    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos","12345678912");

        marcos.setEndereco("Av. José Porcelli");

        
        System.out.println("O cliente "+ marcos.getNome() + " com o cpf: "+ marcos.getCpf() + ". Mora no endereco " + marcos.getEndereco());

    }
    
}
