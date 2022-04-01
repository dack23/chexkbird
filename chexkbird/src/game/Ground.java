package game;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class Ground {

    BufferedImage image;

    int x,y;//位置;

    int width,height; //宽高

    //地面初始化
    public Ground() throws Exception{
        image = ImageIO.read(getClass().getResource("/resources/ground.png"));
        width = image.getWidth();
        height = image.getHeight();
        x = 0;
        y = 500;
    }
    //向左移动一步
    public void step() {
        x--;
        if (x == -109) {
            x = 0;
        }
    }

}
