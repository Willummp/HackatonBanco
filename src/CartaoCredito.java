public class CartaoCredito extends Produto {
    private int numCartao;

    public CartaoCredito(Cliente cliente, Banco banco, int numCartao) {
        super(cliente, banco);
        this.numCartao = numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public int getNumCartao() {
        return numCartao;
    }

}
