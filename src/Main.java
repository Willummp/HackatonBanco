import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Empresa");

        List<Cliente> = new ArrayList<Cliente>();

        Cliente cliente = new Cliente("João", "9999-9999", 1000);
        Cliente cliente2 = new Cliente("Maria", "8888-8888", 2000);
        Banco banco = new Banco("Banco do Brasil");
        Conta conta = new Conta(cliente, banco, 123);

        empresa.adicionarCliente(cliente);
        empresa.adicionarCliente(cliente2);

        System.out.println("Nome do Cliente 1: " + empresa.listaDeFuncionarios.get(0).getNome());
        System.out.println("Nome do Cliente 2: " + empresa.listaDeFuncionarios.get(1).getNome());

        System.out.println("Qual funcionario deseja acessar? 1 ou 2?");
        int opcaoAcesso = 1;
        if (opcaoAcesso == 1) {
            System.out.println("Nome do Cliente 1: " + empresa.listaDeFuncionarios.get(0).getNome());
        } else {
            System.out.println("Nome do Cliente 2: " + empresa.listaDeFuncionarios.get(1).getNome());
        }




    }
}