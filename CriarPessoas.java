/*Aqui vamos instanciar os objetos da classe pessoas.java */

/*Import do scanner que possibilita a leitura de entradas */
import java.util.Scanner;

public class CriarPessoas {

    public static void main(String[] args) {

        /* Instanciação do Scanner */
        Scanner entra = new Scanner(System.in);

        /* Instanciação de um scanner reserva */
        Scanner entrada = new Scanner(System.in);

        /* Instanciação / criação do obejto pessoa */

        Pessoas p1 = new Pessoas();
        /* Impressão do pedido de entrada ao usuário */
        System.out.println("Informe o nome: ");
        p1.setNome(entra.nextLine());

        System.out.println("Informe o id: ");
        p1.setId(entra.nextInt());

        System.out.println("Informe o endereço: ");
        p1.setEndereco(entrada.nextLine());
        /* Resultado final com a impressão das informações passadas */
        System.out.println("---------------------");
        System.out.println("Dados informados");
        p1.imprimirPessoas();

        System.out.println("-------------------------------------");

    }

}
