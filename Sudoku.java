//import java.lang.reflect.Array;
import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
import java.util.HashSet;
public class Sudoku {
	private int[][] puzzle;
	private ArrayList<String> blanks;
	private boolean solved;
	private int n;
	//private int[][] blanks;
	
	public Sudoku(int[][] puzzle) {
		this.puzzle = puzzle;
		blanks = new ArrayList<String>();
		solved = false;
		for(int i = 0; i < puzzle.length;i++) {
			for(int j = 0; j < puzzle[i].length; j++) {
				if(puzzle[i][j] == 0) {
					blanks.add(i + "," + j);
				}	
			}
		}
		
	}
	
	public void printBlanks() {
		for(String a: blanks) {
			System.out.println(a);
		}
	}
	public void reset() {
		System.out.println(n);
		n = 0;
		System.out.println(n);
	}
	public void solve(int pos) {
		//System.out.println(n);
		n++;
		
		if(check() && !hasZeros()) {
			System.out.println("Finished");
			print();
			System.out.println(n);
			solved = true;
		}
		if(!solved){
			int a = Integer.parseInt(blanks.get(pos).split(",")[0]);
			int b = Integer.parseInt(blanks.get(pos).split(",")[1]);
			for(int i = puzzle[a][b]+ 1; i <= 9; i++) {
				puzzle[a][b] = i;
				
				if(check()) {
					//print();
					solve(pos+1);
					
				}
				
			}
			//sprint();
			puzzle[a][b] = 0;
			
			if(pos< blanks.size()) {
				
				solve(pos-1);
			}
		}
		
	}
	
	
	public void print() {
		for(int i = 0; i < puzzle.length; i++) {
			for(int j = 0; j < puzzle[i].length;j++) {
				System.out.print(puzzle[i][j] + "  ");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public boolean hasZeros() {
		for(int i = 0; i < puzzle.length; i++) {
			for(int j = 0; j < puzzle[i].length;j++) {
				if(puzzle[i][j] == 0) return true;
			}
		}
		return false;
	}
	
	public boolean check() {
		return rowCheck() && columnCheck() && squaresCheck();
	}
	
	public boolean rowCheck() {
		for(int i = 0; i < puzzle.length; i++) {
			HashSet<Integer> a = new HashSet<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			for (int j = 0; j < puzzle.length; j++) {
				int curr = puzzle[i][j];
				if(curr != 0) {
					a.add(curr);
					b.add(curr);
				}
			}
			if(b.size() != a.size()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean columnCheck() {
		for(int i = 0; i < puzzle.length; i++) {
			HashSet<Integer> a = new HashSet<Integer>();
			ArrayList<Integer> b = new ArrayList<Integer>();
			for (int j = 0; j < puzzle.length; j++) {
				int curr = puzzle[j][i];
				if(curr != 0) {
					a.add(curr);
					b.add(curr);
				}
			}
			if(b.size() != a.size()) {
				return false;
			}
		}
		return true;
	}
	
	public boolean squaresCheck() {
		
		for(int a = 0; a <= 6; a += 3) {
			for(int b = 0 ; b <= 6; b+= 3) {
				HashSet<Integer> hash = new HashSet<Integer>();
				ArrayList<Integer> listy = new ArrayList<Integer>();
				for(int i = a; i < a + 3; i++) {
					for(int j = b; j < b+ 3; j++) {
						int curr = puzzle[i][j];
						if(curr != 0) {
							listy.add(curr);
							hash.add(curr);
						}
					}
				}
				if(listy.size() != hash.size()) {
					return false;
				}
				
			}
			
		}
		return true;
	}
}
