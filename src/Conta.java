class Conta extends Produto {

    private int numConta;

    public Conta(Cliente cliente, Banco banco, int numConta) {
        super(cliente, banco);
        this.numConta = numConta;

    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getNumConta() {
        return numConta;
    }


}