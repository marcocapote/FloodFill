import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageProcessor {
    private BufferedImage image;

    public void carregarImagem(String caminho){
        try{
            File file = new File(caminho);
            image = ImageIO.read(file);
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public int getRGB(int x, int y){
        return image.getRGB(x,y);
    }

    public int getHeight(){
        return image.getHeight();
    }

    public int getWidth(){
        return image.getWidth();
    }

    public void setRGB(int x, int y, int rgb){
        image.setRGB(x, y, rgb);
    }

    public void setImage(BufferedImage image) {
        this.image = image;
    }

    public BufferedImage getImage() {
        return image;
    }


}
