import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame{
    private static final int WIDTH =1000;
    private static final int HEIGHT=800;
    public Main () {
        super("Wordle- Zaara Bilal");
        setSize(WIDTH, HEIGHT);
        Game play = new Game();
        ((Component) play).setFocusable(true);
        Color background=new Color(224,202,237);
        setBackground(background);
        getContentPane().add(play);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }
public static void main(String[] args) {   
    Main run = new Main();
    }
}
