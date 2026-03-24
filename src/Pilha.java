import java.util.Stack;

public class Pilha implements Estrutura {

    private Stack<Pixel> pilha;

    public Pilha() {
        pilha = new Stack<>();
    }

    @Override
    public void adicionar(Pixel p) {
        pilha.push(p);
    }

    @Override
    public Pixel remover() {
        return pilha.pop();
    }

    @Override
    public boolean estaVazia() {
        return pilha.isEmpty();
    }
}