package equipamentos.impressora;
public class Deskjet implements Impressora{

    @Override
    public void imprimir() {
        System.out.println("IMPRIMINDO DESKJET");
        throw new UnsupportedOperationException("Unimplemented method 'imprimir'");
    }
    
}
