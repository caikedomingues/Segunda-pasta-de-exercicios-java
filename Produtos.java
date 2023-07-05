
/** Produtos: codProduto(int), descrição(String), preço(double ou float) */

public class Produtos {
    /* Atributo da classe produtos */
    private int codProduto;
    private String descricao;
    private float preco;

    /* Getters e Setters */

    public void setCodProduto(int c) {

        this.codProduto = c;
    }

    public int getCodProduto() {

        return this.codProduto;
    }

    public void setDescricao(String d) {

        this.descricao = d;
    }

    public String getDescricao() {

        return this.descricao;
    }

    public void setPreco(float p) {

        this.preco = p;
    }

    public float getPreco() {

        return this.preco;
    }

    /* Metodo de impressão */

    public void imprimirProduto() {

        System.out.println("Código do produto: " + this.codProduto);
        System.out.println("Descrição do produto: " + this.descricao);
        System.out.println("Preço do produto: " + this.preco);

    }
}
