package equipamentos.copiadora;
public class Xerox implements Copiadora {

    @Override
    public void copiar() {
        System.err.println("COPIANDO");
        throw new UnsupportedOperationException("Unimplemented method 'Copiar'");
    }
    
}
