public class Main {
    
    public static void main(String[] args) {
    
        System.out.println("iniciou o programa main");
        a();
        System.out.println("finalizou o programa main");

    }

    static void a(){
        System.out.println("entrou no metodo a");
        b();
        System.out.println("saiu do metodo a");
    }

    static void b(){
        System.out.println("entrou no metodo b");
        for(int i = 0; i <= 4; i++) 
        System.out.println(i);
        c();
        System.out.println("saiu do metodo b");
    }

    static void c(){
        System.out.println("entrou no metodo c");
        Thread.dumpStack();
        System.out.println("saiu do metodo c");
    }

}
