package Snake;

public class Coordinate {
    private final int x, y, dir;

    /**
     * Detailed list of coordinate parameters
     *
     * @param x - x position of coordinate
     * @param y - y position of coordinate
     * @param dir - 0: up, 1: right, 2: down, 3:left
     */

    public Coordinate(int x, int y, int dir){
        this.x = x;
        this.y = y;
        this.dir = dir;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getDir() {
        return dir;
    }
}
