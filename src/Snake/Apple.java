package Snake;

import java.util.Random;

public class Apple {
    private int x, y;

    public Apple(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int getX() {
        return x;
    }

    public void randomizeLocation(int xBound, int yBound){
        Random random = new Random();

        x = random.nextInt(xBound);
        y = random.nextInt(yBound);
    }
}
