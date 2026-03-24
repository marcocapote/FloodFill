public class Fila implements Estrutura {

    private Node inicio;
    private Node fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    @Override
    public void adicionar(Pixel p) {
        Node novo = new Node(p);

        if (estaVazia()) {
            inicio = novo;
            fim = novo;
        } else {
            fim.setProximo(novo);
            fim = novo;
        }
    }

    @Override
    public Pixel remover() {
        if (estaVazia()) return null;

        Pixel valor = inicio.getValor();
        inicio = inicio.getProximo();

        // se ficou vazia, zera o fim também
        if (inicio == null) {
            fim = null;
        }

        return valor;
    }

    @Override
    public boolean estaVazia() {
        return inicio == null;
    }
}