public abstract class Produto {

    private Cliente cliente;
    private Banco banco;

    //Constructor
    protected Produto(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }
}