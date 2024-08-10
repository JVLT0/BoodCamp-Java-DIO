public enum Estados {
    SAO_PAULO ("SP", "São Paulo"),
    RIO_JANEIRO ("RJ", "Rio de Janeiro"),
    PIAUI ("PI", "Piaui"),
    MARANHAO("MA", "Maranhão");
    
    private String nome;
    private String sigla;

    private Estados(String sigla, String nome){
        this.nome = nome;
        this.sigla = sigla;
    }


    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public String getNomeMaiusculo(){
        return nome.toUpperCase();
    }

}
