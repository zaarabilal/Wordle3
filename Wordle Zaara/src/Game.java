import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
public class Game extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{
private BufferedImage back;
private Board[][] gameBoard;
private int rows;
private int columns;
private Words w;
private boolean win;
private boolean lose;
private Player p;

private ImageIcon background;
public Game() {
    w = new Words();
    win = false;
    lose = false;
    new Thread(this).start();
    this.addKeyListener(this);
    rows = 0;
    columns = 0;
    gameBoard = new Board[6][6]; 
    gameBoard = DisplayBoard(); 
    back=null;
    p= new Player();
    
   
}




    public void run() {
    try {
        while(true) {
        Thread.currentThread().sleep(5);
        repaint();
    }
    }
    catch(Exception e) {}
    }
   
    
    
        
   
    public void paint (Graphics g)
    {   
        Graphics2D twoDgraph = (Graphics2D)g;
    if (back==null) {
        back =(BufferedImage) (createImage(getWidth(), getHeight()));
    }
        Graphics g2d = back.createGraphics();
        g2d.clearRect(0, 0, getSize().width, getSize().height);
      
        
        g2d.setFont(new Font("Arial", Font.BOLD,50 ));;
        Color title=new Color(74, 68, 252);
        g2d.setColor(title);
		g2d.drawString("WORDLE - Color Edition", 220, 60);
		g2d.drawString("Enter a 6 letter color!", 250, 130);
		
		String salmon= "SALMON";
		String orange= "ORANGE";
		String yellow= "YELLOW";
		String purple= "PURPLE";
		String maroon= "MAROON";
		String cobalt= "COBALT";
		String bronze= "BRONZE";
		String auburn= "AUBURN";
		String silver= "SILVER";
		String indigo= "INDIGO";
		String golden= "GOLDEN";
		String orchid= "ORCHID";
		String copper= "COPPER";
		String violet= "VIOLET";
		String canary= "CANARY";
		String almond= "ALMOND";
		String cherry= "CHERRY";
		String vermil= "VERMIL";
		String blonde= "BLONDE";
		String sienna= "SIENNA";
		  if(win == true){
			  g2d.setFont(new Font("Arial", Font.BOLD,50 ));
	        	g2d.setColor(Color.WHITE);
	        	if (salmon==w.getAnswer()) {
	        		background=new ImageIcon("salmon.png");
	        		g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        		
	        	}
	        	if (orange==w.getAnswer()) {
	        		background=new ImageIcon("orange.png");
	        		g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        		
	        	}
	        	if (yellow==w.getAnswer()) {
	        		background=new ImageIcon("yellow.png");
	        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        		
	        	}
	        	if (purple==w.getAnswer()) {
	        		background=new ImageIcon("purple.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        		g2d.drawRect(20, 20, 30, 30);
	        	}
	        	if (maroon==w.getAnswer()) {
	        		background=new ImageIcon("maroon.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (cobalt==w.getAnswer()) {
	        		background=new ImageIcon("cobalt.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (bronze==w.getAnswer()) {
	        		background=new ImageIcon("bronze.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (auburn==w.getAnswer()) {
	        		background=new ImageIcon("auburn.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (silver==w.getAnswer()) {
	        		background=new ImageIcon("silver.jpeg");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (golden==w.getAnswer()) {
	        		background=new ImageIcon("golden.jpeg");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (orchid==w.getAnswer()) {
	        		background=new ImageIcon("orchid.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (copper==w.getAnswer()) {
	        		background=new ImageIcon("copper.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (violet==w.getAnswer()) {
	        		background=new ImageIcon("violet.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (canary==w.getAnswer()) {
	        		background=new ImageIcon("canary.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (almond==w.getAnswer()) {
	        		background=new ImageIcon("almond.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (cherry==w.getAnswer()) {
	        		background=new ImageIcon("cherry.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (vermil==w.getAnswer()) {
	        		background=new ImageIcon("vermil.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (blonde==w.getAnswer()) {
	        		background=new ImageIcon("blonde.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (sienna==w.getAnswer()) {
	        		background=new ImageIcon("sienna.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	        	if (indigo==w.getAnswer()) {
	        		background=new ImageIcon("indigo.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
	        	}
	            g2d.drawString("YOU WIN!", 350, 100);
	            g2d.drawString("RESTART TO PLAY AGAIN", 200, 200);
	        }
	            else if(lose == true){
	            	 g2d.setFont(new Font("Arial", Font.BOLD,50 ));
	            	g2d.setColor(Color.white);
	            	if (salmon==w.getAnswer()) {
		        		background=new ImageIcon("salmon.png");
		        		g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        		
		        	}
		        	if (orange==w.getAnswer()) {
		        		background=new ImageIcon("orange.png");
		        		g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        		
		        	}
		        	if (yellow==w.getAnswer()) {
		        		background=new ImageIcon("yellow.png");
		        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        		
		        	}
		        	if (purple==w.getAnswer()) {
		        		background=new ImageIcon("purple.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        		g2d.drawRect(20, 20, 30, 30);
		        	}
		        	if (maroon==w.getAnswer()) {
		        		background=new ImageIcon("maroon.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (cobalt==w.getAnswer()) {
		        		background=new ImageIcon("cobalt.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (bronze==w.getAnswer()) {
		        		background=new ImageIcon("bronze.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (auburn==w.getAnswer()) {
		        		background=new ImageIcon("auburn.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (silver==w.getAnswer()) {
		        		background=new ImageIcon("silver.jpeg");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (golden==w.getAnswer()) {
		        		background=new ImageIcon("golden.jpeg");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (orchid==w.getAnswer()) {
		        		background=new ImageIcon("orchid.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (copper==w.getAnswer()) {
		        		background=new ImageIcon("copper.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (violet==w.getAnswer()) {
		        		background=new ImageIcon("violet.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (canary==w.getAnswer()) {
		        		background=new ImageIcon("canary.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (almond==w.getAnswer()) {
		        		background=new ImageIcon("almond.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (cherry==w.getAnswer()) {
		        		background=new ImageIcon("cherry.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (vermil==w.getAnswer()) {
		        		background=new ImageIcon("vermil.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (blonde==w.getAnswer()) {
		        		background=new ImageIcon("blonde.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (sienna==w.getAnswer()) {
		        		background=new ImageIcon("sienna.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
		        	if (indigo==w.getAnswer()) {
		        		background=new ImageIcon("indigo.png");
			        	g2d.drawImage(background.getImage(),0, 0, 1000,800,this);
		        	}
	                g2d.drawString("YOU LOSE", 350, 50);
	                g2d.drawString("The word was: " + w.getAnswer(), 80, 130);
	                g2d.drawString("RESTART TO PLAY AGAIN", 200, 200);
	            
	        }
        
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                gameBoard[i][j].DrawSquare(g2d);
                
            }
        }

      
        System.out.println(w.getAnswer());
        twoDgraph.drawImage(back, 0, 0, null);
    }
    
   
 
    public Board[][] DisplayBoard(){
        int x = 350;
        int y = 300;
        for(int i = 0; i < 6; i++){
            for(int j = 0; j < 6; j++){
                gameBoard[i][j] = new Board(x, y, 40, 40, '?', Color.BLACK);
                x += 50;
            }
            y += 60;
            x = 350;
        }
       
        	return gameBoard;
        
    }
    
    
    public void keyPressed(KeyEvent e) {
     
        int keyCode = e.getKeyCode();
        char keyChar = e.getKeyChar();

         if (columns <= 5 && keyCode != 10 && lose==false) { 
            gameBoard[rows][columns].setC(keyChar);
            columns++;
        }

      
        
        String guess = "";
        if (keyCode == 10) { 
        	p.playmusic("sound.wav");
           
            for (int i = 0; i < columns; i++) {
                guess += gameBoard[rows][i].getC();
                
                
                
              
                }
            
            if (columns > 5 && lose==false) {
                if (w.Check(gameBoard, guess, rows) == false) {
                    rows++;
                    columns = 0;
                    if (rows > 5) {
                        lose = true;
                    }
                } else {
                    win = true;
                }
               
        }
            }
    }

    
    
   
    
    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
       
    }
    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
       
    }
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
