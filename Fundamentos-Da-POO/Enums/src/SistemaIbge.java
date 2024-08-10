public class SistemaIbge {

    public static void main(String[] args) {
        for(Estados e: Estados.values()){
            System.out.println(e.getSigla() + "-" +e.getNome());
        }

        Estados eb = Estados.SAO_PAULO;

        System.out.println(eb.getNome());
        System.out.println(eb.getSigla());
    }
    
}
