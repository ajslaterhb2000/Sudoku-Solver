class Main {
	static int log(int n) {
		  int result = 0;
		  
		  while (n > 1) {
			  result = result + 1;
			  n = n /2;
		  }
		  return result;
	  }
	
	static String baseb2(int n, int b) {
		String[] ASCII = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9","A","B","C","D","E","F"}; 
		int q = n;
		int k = 0;
		while (q != 0) {
			
		}
		return "";
	}
  public static void main(String[] args) {
      int[][] a = {
          {8, 0, 0, 0, 0, 0, 0, 0, 0},
          {0, 0, 3, 6, 0, 0, 0, 0, 0},
          {0, 7, 0, 0, 9, 0, 2, 0, 0},
          {0, 5, 0, 0, 0, 7, 0, 0, 0},
          {0, 0, 0, 0, 4, 5, 7, 0, 0},
          {0, 0, 0, 1, 0, 0, 0, 3, 0},
          {0, 0, 1, 0, 0, 0, 0, 6, 8},
          {0, 0, 8, 5, 0, 0, 0, 1, 0},
          {0, 9, 0, 0, 0, 0, 4, 0, 0}
      };
      int[][] b = {
              {0, 0, 5, 6, 0, 0, 0, 2, 0},
              {0, 0, 0, 2, 0, 9, 1, 0, 0},
              {0, 2, 0, 4, 0, 0, 7, 0, 0},
              {3, 0, 0, 0, 0, 0, 6, 0, 2},
              {4, 0, 0, 0, 1, 0, 0, 0, 7},
              {5, 0, 9, 0, 0, 0, 0, 0, 4},
              {0, 0, 6, 0, 0, 8, 0, 4, 0},
              {0, 0, 4, 9, 0, 6, 0, 0, 0},
              {0, 7, 0, 0, 0, 3, 2, 0, 0}
          };
      int abs = 012;
      int asdf = 12;
      //System.out.println(abs == asdf);	 
      Sudoku board = new Sudoku(a);
	  board.print();
	  board.printBlanks();
	  board.solve(0);
	  
	  
	  
  }
  
}