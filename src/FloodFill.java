public class FloodFill {
    private Estrutura estrutura;

    private ImageProcessor img;
    private int novaCor;
    private int corOriginal;

    public FloodFill(Estrutura estrutura){
        this.estrutura = estrutura;
    }

    // 👉 inicia o flood fill (sem loop)
    public void iniciar(ImageProcessor img, int x, int y, int novaCor) {
        this.img = img;
        this.novaCor = novaCor;
        this.corOriginal = img.getRGB(x, y);

        if (corOriginal == novaCor) return;

        estrutura.adicionar(new Pixel(x, y));
    }

    // 👉 executa UM passo (1 pixel)
    public boolean passo() {
        if (estrutura.estaVazia()) return false;

        Pixel p = estrutura.remover();

        int px = p.getX();
        int py = p.getY();

        if (px < 0 || py < 0 || px >= img.getWidth() || py >= img.getHeight()) {
            return true;
        }

        if (img.getRGB(px, py) != corOriginal) {
            return true;
        }

        img.setRGB(px, py, novaCor);

        estrutura.adicionar(new Pixel(px + 1, py));
        estrutura.adicionar(new Pixel(px - 1, py));
        estrutura.adicionar(new Pixel(px, py + 1));
        estrutura.adicionar(new Pixel(px, py - 1));

        return true;
    }
}