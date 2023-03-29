public class Words {
	public String [] wordList;
	private String answer;
	public String dash;
	
	
	
	public Words() 
	{
		
		wordList= new String[20];
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
		answer=getWord();
		dash= "";
		
		
		
		//gameDisplay= new String [col][row];
		//setDisplayWord();
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
	

	/*public char getRelation(String inputWord) {
	    String relatedWord = "";
	    for (String word : wordList) {
	        if (word.charAt(0) == inputWord.charAt(0) || word.charAt(word.length()-1) == inputWord.charAt(inputWord.length()-1)) {
	            relatedWord = word;
	            break;
	        }
	    }
	    return relatedWord;
	}
*/

			
}
