/*Considere a necessidade de implementar classes para um sistema de vendas
 * implemente as classes:
 * 
 * Clientes: codCliente(int), nomeCli(String), enderecoCli(String), 
 * telefoneCli(int)
 * 
 * Pedidos: numeroPed(int), dataPed(String), valorPed(double ou float);
 * 
 *Produtos: codProduto(int), descrição(String), preço(double ou float)

 para produtos use o exemplo dos slides.
 */

/*Import do scanner que irá ler as entradas */
import java.util.Scanner;

public class RegistroDeVendas {
    public static void main(String[] args) {
        /* Instanciação do Scanner de clientes */
        Scanner codigo = new Scanner(System.in);
        Scanner nome = new Scanner(System.in);
        Scanner endereco = new Scanner(System.in);
        Scanner telefone = new Scanner(System.in);

        /* Instanciação do scanner de pedidos */
        Scanner numero = new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        Scanner valor = new Scanner(System.in);

        /* Instanciação do scanner de produtos */
        Scanner codigopod = new Scanner(System.in);
        Scanner descProduto = new Scanner(System.in);
        Scanner precoProduto = new Scanner(System.in);

        /* instanciação da classe cliente */

        Clientes c1 = new Clientes();

        System.out.println("Informe os dados do cliente");
        System.out.println("Código do cliente: ");
        c1.setCodCliente(codigo.nextInt());

        System.out.println("Informe o nome do cliente: ");
        c1.setNomeCliente(nome.nextLine());

        System.out.println("Informe o telefone do cliente: ");
        c1.setTelefoneCliente(telefone.nextInt());

        System.out.println("Informe o endereço do cliente: ");
        c1.setEnderecoCliente(endereco.nextLine());

        System.out.println("------------------------------");

        /* Instanciação da classe pedidos */
        Pedidos p1 = new Pedidos();

        System.out.println("Informe os dados do pedido");
        System.out.println("Informe o numero do pedido: ");
        p1.setNumeroPed(numero.nextInt());

        System.out.println("data do pedido: ");
        p1.setDataPed(data.nextLine());

        System.out.println("Valor do pedido: ");
        p1.setValorPed(valor.nextFloat());
        System.out.println("---------------------------------");

        /* Instanciação da classe produtos */
        Produtos pr = new Produtos();

        System.out.println("Informe os dados do produto");

        System.out.println("Informe o código do produto: ");
        pr.setCodProduto(codigopod.nextInt());

        System.out.println("Informe a descrição do produto: ");
        pr.setDescricao(descProduto.nextLine());

        System.out.println("Informe o preço do produto: ");
        pr.setPreco(precoProduto.nextFloat());
        System.out.println("-----------------------------------");

        /* impressão dos dados informados */

        System.out.println("Dados do cliente");
        c1.imprimirClientes();
        System.out.println("-----------------------------------");

        System.out.println("Dados do pedido");
        p1.imprimirPedido();
        System.out.println("-----------------------------------");

        System.out.println("Dados do produto");
        pr.imprimirProduto();

    }

}
