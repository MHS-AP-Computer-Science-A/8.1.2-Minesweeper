
public class Minesweeper {
	
	static String[][] minefield = { 
			{ "X", "X", "X", " ", " ", " ", "X", "X" }, 
			{ "X", "X", " ", " ", " ", " ", " ", " " }, 
			{ " ", " ", " ", " ", " ", " ", " ", " " }, 
			{ " ", " ", " ", " ", "X", " ", " ", " " }, 
			{ " ", " ", " ", "X", "X", " ", " ", " " }, 
			{ " ", " ", " ", "X", " ", " ", " ", " " }, 
			{ " ", " ", " ", " ", " ", " ", " ", "X" },
			{ "X", "X", " ", " ", " ", "X", "X", " " } };
	
	public static void main(String[] args) {
		for(int i = 0; i < 10; i++) {
			//Generate a random row and column
			int row = (int)(Math.random() * 8);
			int col = (int)(Math.random() * 8);
			
			//Check this spot and display the results
			System.out.println("[" + row + "]" + "[" + col + "] -> " + checkMinefield(row, col));
		}
	}
	
	public static String checkMinefield(int row, int col) {
		//Your code here

		
		return "Safe";		
	}

}
