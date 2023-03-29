import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage; 
import java.awt.event.*; 


public class Game  extends JPanel implements Runnable, KeyListener, MouseListener, MouseMotionListener{

	
	private BufferedImage back; 
	private int key;
	private int wrong;
	private Words w;
	private Board b;
	public char charkey;
	
	
	
	
	
	
	
	
	
	
	public Game() {
		new Thread(this).start();	
		this.addKeyListener(this);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		key =-1; 
		wrong=0;
		w= new Words();
		//b= new Board(30,30,30,30);
		b = new Board(300, 200, 40, 40, 6, 6);

		charkey= (char)(key);
		

	}
	
	public void run()
	   {
	   	try
	   	{
	   		while(true)
	   		{
	   		   Thread.currentThread().sleep(5);
	            repaint();
	         }
	      }
	   		catch(Exception e)
	      {
	      }
	  	}
	

	

	
	
	
	public void paint(Graphics g){
		super.paint(g);
		Graphics2D twoDgraph = (Graphics2D) g; 
		if( back ==null)
			back=(BufferedImage)( (createImage(getWidth(), getHeight()))); 
		

		Graphics g2d = back.createGraphics();
	
		g2d.clearRect(0,0,getSize().width, getSize().height);
		
		//g2d.drawImage(background.getImage(), 0, 0, getSize().width, getSize().height, this);g2d.setColor(Color.WHITE);
		g2d.setFont(new Font("Arial", Font.BOLD,40 ));;
		g2d.drawString("WORDLE - Color Edition", 220, 60);
		g2d.drawString("Enter a 6 letter color!", 250, 100);
	
		for (int row = 0; row < b.col; row++) {
            for (int col = 0; col < b.row; col++) {
                g2d.drawRect(b.X+50, b.Y+50, 50, 50);
                g2d.drawString(String.valueOf(b.gameBoard[row][col]), b.X + 20, b.Y + 30);
                b.X += 60;
            }
            b.X = 50;
            b.Y += 60;
            
		}
				
	/*	for (int i=0; i<6;i++) {
			for(int j=0; j<6; j++) {
				g2d.drawString(b.getBoard(i,j), 40*i+300, 40*j+200);
			}
		}*/
		/*for (int i = 0; i < b.col; i++) {
			for (int j = 0; j < b.row; j++) {
				g2d.drawString(b.getBoard(i, j), b.X + b.Y * i, b.W+ b.H * j);
			}
		}*/
		 

				
			
			g2d.setColor(Color.WHITE);
			g2d.setFont(new Font("Times New Roman", Font.BOLD, 20));
			g2d.drawString("KEY "+ key, 5, 30);
			
  
		

		g2d.setColor(Color.WHITE);
		
		
		
	
			
		
        
        
    
		

		twoDgraph.drawImage(back, null, 0, 0);

		
		if (!b.gameBoard[5][5].equals("-")) {
			 System.out.println("YOU LOSE.The word was" + w.getAnswer());
		 }
	}

	
	
@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
	
		
	}



	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}



	//@Override
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
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
		 
			
		}
		
	
	





	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
		key= e.getKeyCode();
		System.out.println(key);
		char typedChar = e.getKeyChar();
		 
		/*for (int i=0; i<6;i++) {
			for(int j=0; j<6; j++) {
				 if (b.gameBoard[j][i].equals("-")) { 
		                
		               
		                b.gameBoard[j][i] = String.valueOf(typedChar);
		                return;
		                
		                
			}
				 
				
						 
					 }
				 }*/
		for (int i = 0; i < 6; i++) {
	        for (int j = 0; j < 6; j++) {
	            if (b.gameBoard[j][i].equals("-")) {
	                b.gameBoard[j][i] = String.valueOf(typedChar);
	                // Call repaint() after updating the game board
	                return;
	            }
	        }
	    }
		
	}
  
		
	
	
		
		
	
	
		
  
		
	
	
	
		
	
		
		
	
		
		
		
		
		
		



	@Override
	public void keyReleased(KeyEvent e) {
	
		
		
		
	}
	
	
	

	
}
