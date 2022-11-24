package CharacterController;

import java.awt.*;

public class Player {
    private int x, y, dir, playerSpeed;
    private Color color;

    public Player(int x, int y){
        this.x = x;
        this.y = y;
        this.color = generateRandomColor();
        this.playerSpeed = 5;
        this.dir = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Color getColor() {
        return color;
    }

    public void setDir(int dir){
        this.dir = dir;
    }

    public void movePlayer(){
        if(dir == 0) x += playerSpeed;
        else if(dir == 1) x -= playerSpeed;
        else if(dir == 2) y += playerSpeed;
        else y -= playerSpeed;
    }

    private Color generateRandomColor(){
        return new Color((int) (Math.random() * 256), (int) (Math.random() * 256), (int) (Math.random() * 256));
    }
}
