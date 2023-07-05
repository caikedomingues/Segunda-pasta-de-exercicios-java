
/*Pedidos: numeroPed(int), dataPed(String), valorPed(double ou float)*/
public class Pedidos {
    /* Atributos da classe */
    private int numeroPed;
    private String dataPed;
    private float valorPed;

    /* Getters e Setters */

    public void setNumeroPed(int n) {

        this.numeroPed = n;
    }

    public int getNumeroPed() {

        return this.numeroPed;

    }

    public void setDataPed(String d) {

        this.dataPed = d;
    }

    public String getDataPed() {

        return this.dataPed;
    }

    public void setValorPed(float v) {

        this.valorPed = v;
    }

    public float getValorPed() {

        return this.valorPed;
    }

    /* Método de impressão */

    public void imprimirPedido() {

        System.out.println("Numero do pedido: " + this.numeroPed);
        System.out.println("Data do pedido: " + this.dataPed);
        System.out.println("Valor do pedido: " + this.valorPed);
        System.out.println("-------------------------------------------");

    }

}
