class Cliente  {

    private String nome;
    private String telefone;
    private double saldo;

    public Cliente(String nome, String telefone, double saldo) {

        this.nome = nome;
        this.telefone = telefone;
        this.saldo = saldo;
    }

    public String getNome() {
        return nome;
    }
}