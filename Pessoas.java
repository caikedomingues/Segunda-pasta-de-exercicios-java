
/*Considere a necessidade de criar uma classe definida pelo nome pessoas.
 * Os atributos dessa classe serão os seguintes: id, nome e endereço
 */

public class Pessoas {

    /* Atributos da classe */
    private int id;// Ira guardar o id
    private String nome;// Ira guardar o nome
    private String endereco;// Ira guardar o endereço

    /* getters e setters */
    public void setId(int i) {

        this.id = i;
    }

    public int getId() {

        return this.id;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public String getNome() {

        return this.nome;
    }

    public void setEndereco(String e) {

        this.endereco = e;
    }

    public String getEndereco() {

        return this.endereco;
    }

    /* Método de impressão */

    public void imprimirPessoas() {
        /* Ira imprimir os resultados passados pelo usuário */
        System.out.println("Id: " + this.id);
        System.out.println("Nome: " + this.nome);
        System.out.println("Endereço: " + this.endereco);
    }

}