import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {

    public static void main(String[] args){


        try{
        Scanner input = new Scanner(System.in);

        System.out.println("DIGITE SEU NOME: ");
        String nome = input.nextLine();

        System.out.println("DIGITE SEU SOBRENOME: ");
        String sobrenome = input.nextLine();

        System.out.println("DIGITE SUA IDADE: ");
        int idade = input.nextInt();

        System.out.println("DIGITE SUA ALTURA: ");
        double altura = input.nextDouble();


        System.out.println("Nome: " + nome.toUpperCase() + sobrenome.toUpperCase());
        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura + "cm");
        
        }catch(InputMismatchException e){
            System.out.println("Os campos idade e altura precisam ser numericos");
        }
    }
    
}
