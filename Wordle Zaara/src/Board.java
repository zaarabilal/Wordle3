import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;


public class Board {
    private int X, Y, W, H;
    private Color Color;
    private char C;
    

    public Board(){
        X = 20;
        Y = 0;
        W = 0;
        H = 0;
        C = 'Z';
        Color = new Color(0,0,0);
    }
    
    public Board(int x, int y, int w, int h, char c, Color color){

        X = x;
        Y = y;
        W = w;
        H = h;
        C = c;
        Color = color;

    }
    public int getX(){
        return X;
    }
    public void setX(int x){
        X = x;
    }
    public int getY(){
        return Y;
    }
    public void setY(int x){
        Y = x;
    }
    public int getH(){
        return H;
    }
    public void setH(int x){
        H = x;
    }
    public int getW(){
        return W;
    }
    public void setW(int x){
        W = x;
    }
    public char getC(){
        return C;
    }
    public void setC(char x){
        C = x;
    }
    public Color getColor(){
        return Color;
    }
    public void setColor(Color x){
        Color = x;
    }
    public void DrawSquare(Graphics g2d){
        g2d.setColor(Color);
   
        g2d.drawRect(X, Y, W, H);
        g2d.setColor(Color.BLACK);
        String s = String.valueOf(C);
        g2d.setFont(new Font("Times New Roman", Font.BOLD, 25));
        g2d.drawString(s, X + (W/2)-5, Y + (H/2)+5);
        
    }

}
