import java.awt.Color;

import java.util.ArrayList;



public class Words {

    private String[] wordList;
    private String answer;
    
    
    public Words(){
        wordList = new String[20];
        wordList[0]= "SALMON";
		wordList[1]="ORANGE";
		wordList[2]="YELLOW";
		wordList[3]="PURPLE";
		wordList[4]="MAROON";
		wordList[5]="COBALT";
		wordList[6]="BRONZE";
		wordList[7]="AUBURN";
		wordList[8]="SILVER";
		wordList[9]="INDIGO";
		wordList[10]="GOLDEN";
		wordList[11]="ORCHID";
		wordList[12]="COPPER";
		wordList[13]="VIOLET";
		wordList[14]="CANARY";
		wordList[15]="ALMOND";
		wordList[16]="CHERRY";
		wordList[17]="VERMIL";
		wordList[18]="BLONDE";
		wordList[19]="SIENNA";
 
		
		String s= getWord();
	        answer = s;
        
    }

    public int getRandom() {
    	return (int)(Math.random()*(wordList.length-1-0+1))+0;
    	}
    	
    	public String getWord() {
    		System.out.println(wordList[getRandom()]);
    		return wordList[getRandom()];
    	}
    		
    	public String getAnswer() {
    		return answer;
    	}
    	
          
    public String[] getwordList(){
        return wordList;
    }
    
 
    
    
    
    public boolean Check(Board[][] gameBoard, String Guess, int rows){
        if(Guess.equals(answer)){
           
            for(int i = 0; i < 6; i++){
                gameBoard[rows][i].setColor(Color.green);
            }
            return true;
        }
        else{
           
            ArrayList<Character> chars = new ArrayList<Character>();
            for (int i = 0; i < 6; i++) {
                chars.add(answer.charAt(i));
            }
            for(int i = 0; i < Guess.length(); i++){
                if(chars.contains(Guess.charAt(i))){
                    if(Guess.charAt(i) == answer.charAt(i)){
                    	Color correct= new Color (31, 74, 20);
                        gameBoard[rows][i].setColor(Color.GREEN);
                        gameBoard[rows+1][i].setColor(Color.GREEN);
                        chars.remove(Character.valueOf(Guess.charAt(i)));
                    }
                    else{
                    	Color almost= new Color (163, 148, 7);
                        gameBoard[rows][i].setColor(Color.yellow);
                        chars.remove(Character.valueOf(Guess.charAt(i)));
                    }
                }
                else{
                	Color wrong= new Color (74, 20, 20);
                    gameBoard[rows][i].setColor(Color.red);
                }
            }
            return false;
        }
    }

   
        
}