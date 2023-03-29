import java.awt.Graphics;

public class Board {
	public String[][] gameBoard;
	public int col,row;
	public int X, Y, W, H;
	
	/*public Board(int x, int y, int w, int h) {
		x=10;
		x=10;
		w=30;
		h=30;
		col=6;
		row=6;
		gameBoard= new String [col][row];
		setBoard();
	}*/
	public Board(int x, int y, int w, int h, int cols, int rows) {
		x=X;
		y=Y;
		w=W;
		h=H;
		col = cols;
		row = rows;
		gameBoard = new String[col][row];
		setBoard(x, y, w, h);
	}

	/*public void setBoard() {
		for (int i=0; i<col;i++) {
			for(int j=0; j<row; j++) {
				gameBoard[i][j]="-";
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
			
	}*/
	public void setBoard(int x, int y, int w, int h) {
		for (int i = 0; i < col; i++) {
			for (int j = 0; j < row; j++) {
				gameBoard[i][j] = "-";
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
	}

	public String getBoard(int c, int r) {
		return gameBoard[c][r];
		
	}
		

	public void changeSpot(int c, int r, String s) {
		gameBoard[c][r]=s;
	}

}
