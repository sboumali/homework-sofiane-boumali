package homework2.shufflegame;

import java.util.Scanner;

public class AssignementGame {
	
	public static void main(String[] args) {
		
		int array [] = {1,0,1};
		char answer;
		int position;
	
		Test game = new Test();
		//t array2[] =game.shuffleGame(array);
		System.out.println("*****************WELCOME TO SHUFFLE GAME****************");
		System.out.println("GUESS WHERE THE 0 IS");
		do {
		System.out.println("ARE YOU READY TO PLAY? Y/N");
		Scanner sc = new Scanner (System.in);
		
		answer= sc.next().charAt(0);
		while(answer!= 'Y' && answer !='y' && answer != 'N' && answer != 'n') {
			System.out.println("Enter Y or N");
			answer= sc.next().charAt(0);
			if (answer =='Y'|| answer=='y' || answer == 'N'||answer=='n') {
				break;
			}
				}
		if(answer=='Y' || answer =='y') {
			int array2[]=game.shuffleGame(array);
			System.out.println("Pick 1 or 2 or 3");
			while(!sc.hasNextInt()) {
				System.out.println("Pick 1 or 2 or 3");
				sc.next();
			}
			position = sc.nextInt();
			while (position !=1 && position !=2 && position !=3) {
				System.out.println("Pick 1 or 2 or 3");
				position = sc.nextInt();
				if (answer==1 || answer==2 || answer==3) {
					
				
				break;
				}
			}
			if (array2[position-1]==0) {
				System.out.println("GOOD GUESS");
				for (int i=0; i<array2.length; i++) {
					System.out.print(array2[i]);
					
				}
				System.out.println();
			}
			else{
				System.out.println("SORRY!! WRONG GUESS");	
				for (int i=0; i<array2.length; i++) {
					System.out.print(array2[i]);
					
				}
				System.out.println();
			}
			
		}
		
		

		else{
			break;
		}
		System.out.println("Do you want to try again?Y/N");
		answer= sc.next().charAt(0);
		while(answer!= 'Y' && answer !='y' && answer != 'N' && answer != 'n') {
			System.out.println("Enter Y or N");
			answer= sc.next().charAt(0);
			if (answer =='Y'|| answer=='y' || answer == 'N'||answer=='n') {
				break;
			}
				}
		}
		while (answer=='Y' || answer =='y');
		  System.out.println("GOOD BYE, SEE YOU NEXT TIME");
	}
		
	}