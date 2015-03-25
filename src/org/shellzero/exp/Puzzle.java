package org.shellzero.exp;
import java.io.IOException;

public class Puzzle {

		public static void main(String[]args){
			try{
				Puzzle.puzzle();
				}
				catch(Throwable t){
					if(t instanceof IOException){
						//your goal to make the code reach the next line
						//and print "You win"
						System.out.println("You win");
					}
				}
				}

		private static void puzzle() throws IOException{
			//you should write code here.you cannot change 
			//method signature or other parts of this program
			 throw new IOException("Puzzled");
			}
	}

