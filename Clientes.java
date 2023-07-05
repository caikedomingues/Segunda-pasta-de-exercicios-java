/* Clientes: codCliente(int), nomeCli(String), enderecoCli(String), 
 * telefoneCli(int) */

public class Clientes {
    /* Atributos da classe */
    private int codCliente;
    private String nomeCliente;
    private String enderecoCliente;
    private int telefoneCliente;

    /* Getters e Setters */

    public void setCodCliente(int c) {

        this.codCliente = c;

    }

    public int getCodCliente() {

        return this.codCliente;
    }

    public void setNomeCliente(String n) {

        this.nomeCliente = n;
    }

    public String getNomeCliente() {

        return this.nomeCliente;
    }

    public void setEnderecoCliente(String e) {

        this.enderecoCliente = e;
    }

    public String getEnderecoCliente() {

        return this.enderecoCliente;
    }

    public void setTelefoneCliente(int t) {
        this.telefoneCliente = t;
    }

    public int getTelefoneCliente() {

        return this.telefoneCliente;
    }

    /* Metodo de impressão */

    public void imprimirClientes() {

        System.out.println("Cod do cliente: " + this.codCliente);
        System.out.println("Nome do cliente: " + this.nomeCliente);
        System.out.println("Endereço do cliente: " + this.enderecoCliente);
        System.out.println("Telefone do cliente: " + this.telefoneCliente);
        System.out.println("-------------------------------------------");
    }

}
