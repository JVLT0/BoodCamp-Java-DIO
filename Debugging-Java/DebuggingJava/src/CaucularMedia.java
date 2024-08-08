import java.util.Scanner;

public class CaucularMedia {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String[] alunos = {"João", "Matheus", "Ana", "Julia", "Bruno"};
        int media = caucularMediaDaTurma(alunos, input);

        System.out.println("Media da turma: " + media);
        
    }

     static int caucularMediaDaTurma(String[] alunos, Scanner input){

        int soma = 0;
        for(String aluno : alunos){
            System.out.println("Nota do aluno: " + aluno);
            int nota = input.nextInt();

            soma += nota;
        }
        return soma/alunos.length;
     }
}
