package Snake;

import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static boolean game = true;
    public static int[][] plane;

    public static Player player;
    public static ArrayList<Apple> apples = new ArrayList<>();

    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    public static final int TILE_SIZE = 30;
    public static final int FRAMERATE = 60;

    public static DrawingPanel window;
    public static Graphics ctx;

    public static void main(String[] args) {
        initialize();

        while(game){
            update();
            render();
            window.sleep(1000 / FRAMERATE);
        }
    }

    public static void render(){

    }

    public static void update(){

    }

    public static void initialize(){
        Random random = new Random();
        window = new DrawingPanel(WINDOW_WIDTH, WINDOW_HEIGHT);
        ctx = window.getGraphics();

        plane = new int[WINDOW_HEIGHT / TILE_SIZE][WINDOW_WIDTH / TILE_SIZE];
        player = new Player(random.nextInt(WINDOW_WIDTH / TILE_SIZE), random.nextInt(WINDOW_WIDTH / TILE_SIZE), Color.BLUE);
    }
}
