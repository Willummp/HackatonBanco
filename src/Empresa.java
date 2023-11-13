import java.util.ArrayList;
import java.util.List;

class Empresa {
    private String nome;
    public void adicionarCliente(Cliente cliente) {
        listaDeFuncionarios.add(cliente);
    }
    List<Cliente> listaDeFuncionarios = new ArrayList<Cliente>();

    public Empresa(String nome) {
        this.nome = nome;
    }



}
