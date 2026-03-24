import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;

class Tela extends JFrame {

    private ImageProcessor processor;
    private FloodFill floodFill;
    private JLabel imagemLabel;
    private boolean isPilha = true;

    int novaCor = 0xFFFF0000; // vermelho



    public Tela() {
        processor = new ImageProcessor();
        floodFill = new FloodFill(new Pilha());
        processor.carregarImagem("star.png");
        JButton botaoTrocar = new JButton("usando: Pilha");
        setTitle("Flood Fill");
        setSize(processor.getWidth(), processor.getHeight());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        botaoTrocar.addActionListener(e -> {
            isPilha = !isPilha;

            if (isPilha) {
                floodFill = new FloodFill(new Pilha());
                botaoTrocar.setText("Usando: Pilha");
            } else {
                floodFill = new FloodFill(new Fila());
                botaoTrocar.setText("Usando: Fila");
            }
        });

        imagemLabel = new JLabel(new ImageIcon(processor.getImage()));

        setLayout(new java.awt.BorderLayout());

        add(imagemLabel, java.awt.BorderLayout.CENTER);
        add(botaoTrocar, java.awt.BorderLayout.SOUTH);
        setVisible(true);
        imagemLabel.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int labelWidth = imagemLabel.getWidth();
                int labelHeight = imagemLabel.getHeight();

                int imgWidth = processor.getWidth();
                int imgHeight = processor.getHeight();

                // calcula o deslocamento da imagem dentro do label
                int offsetX = (labelWidth - imgWidth) / 2;
                int offsetY = (labelHeight - imgHeight) / 2;

                // ajusta o clique
                int x = e.getX() - offsetX;
                int y = e.getY() - offsetY;


                if (x < 0 || y < 0 || x >= imgWidth || y >= imgHeight) {
                    return; // clicou fora da imagem
                }

                floodFill.iniciar(processor, x, y, novaCor);

                Timer timer = new Timer(0, ae -> {
                    boolean continua = floodFill.passo();

                    atualizarImagem();

                    if (!continua) {
                        ((Timer) ae.getSource()).stop();
                    }
                });

                timer.start();

                atualizarImagem();
            }

            private void atualizarImagem() {
                imagemLabel.setIcon(new ImageIcon(processor.getImage()));
            }
        });

    }
}