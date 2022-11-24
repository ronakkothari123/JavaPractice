package Snake;

import java.awt.*;
import java.util.ArrayList;

public class Player {
    private int x, y, size, dir;
    private ArrayList<Coordinate> rotations = new ArrayList<Coordinate>();
    private Color color;

    public Player(int x, int y, Color color){
        this.color = color;
        this.x = x;
        this.y = y;
        dir = 0;
        size = 3;
    }
}
