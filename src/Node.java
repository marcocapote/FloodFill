public class Node {
    private Pixel valor;
    private Node proximo;

    public Node(Pixel valor) {
        this.valor = valor;
        this.proximo = null;
    }

    public Pixel getValor() {
        return valor;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }
}