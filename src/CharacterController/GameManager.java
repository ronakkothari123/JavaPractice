package CharacterController;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class GameManager {
    public static DrawingPanel window;
    public static Graphics ctx;

    public static Player player;

    public static final int WINDOW_WIDTH = 600;
    public static final int WINDOW_HEIGHT = 600;
    public static final int PLAYER_SIZE = 10;
    public static final int FRAMERATE = 60;

    public static boolean gameOn = true;

    public static void main(String[] args) {
        initialize();

        while(gameOn){
            update();
            render();
            window.sleep(1000 / FRAMERATE);
        }
    }

    public static void update(){
        player.movePlayer();
    }

    public static void render(){
        ctx.setColor(Color.WHITE);
        ctx.fillRect(0, 0, WINDOW_WIDTH, WINDOW_HEIGHT);
        ctx.setColor(player.getColor());
        ctx.fillRect(player.getX(), player.getY(), PLAYER_SIZE, PLAYER_SIZE);
    }

    public static void initialize(){
        window = new DrawingPanel(WINDOW_WIDTH, WINDOW_HEIGHT);
        ctx = window.getGraphics();

        player = new Player((WINDOW_WIDTH - PLAYER_SIZE) / 2, (WINDOW_HEIGHT - PLAYER_SIZE) / 2);

        window.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                System.out.println(e.getKeyCode());
                if(e.getKeyCode() == 87) player.setDir(3);
                else if(e.getKeyCode() == 65) player.setDir(1);
                else if(e.getKeyCode() == 83) player.setDir(2);
                else if(e.getKeyCode() == 68) player.setDir(0);
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }
}
