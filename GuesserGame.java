
import java.util.*;



class Guesser
{
	int guessNum;
	
	int guessingNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser Please Enter Any Number ");
		guessNum=scan.nextInt();
		return guessNum;
	}	

}

class Player
{
	int guessNum;
	int guessingNumber()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Player Please Enter Any Number");
		guessNum=scan.nextInt();
		return guessNum;
	}
	
	
}

class Umpire
{
	String play1,play2,play3;
	int guesserNumber,player1,player2,player3;
	
	void playerName()
	{
		System.out.println();
		Scanner scan=new Scanner(System.in);
		System.out.println("Please Enter Player1 Name");
		play1=scan.nextLine();
		
		System.out.println("Please Enter Player2 Name");
		play2=scan.nextLine();
		
		System.out.println("Please Enter Player3 Name");
		play3=scan.nextLine();	
		
	}
	
	
	void numFromGuesser()
	{
		Guesser g=new Guesser();
		guesserNumber=g.guessingNumber();
		
	}
	
	
	
	void numFromPlayer()
	{
		Player p1=new Player();
		player1=p1.guessingNumber();
		Player p2=new Player();
		player2=p2.guessingNumber();
		Player p3=new Player();
		player3=p3.guessingNumber();
		
		
	}
	
	void compare()
	{
		if(guesserNumber==player1)
		{
			if(guesserNumber==player2)
			{
				if(guesserNumber==player3)
				{
					
					System.out.println("All Are Winners");
				}
				else
				{
					
					System.out.println("First Player "+play1+"  "+"Second Player "+play2+" both are Winners");
				}
			}
		    else if(guesserNumber==player3)
			{
				System.out.println("First Player "+play1+"  "+"Third Player "+play3+" both are Winners");
			}
		    else
		    {
		    	System.out.println("First Player "+play1+"  Winner");
		    	
		    }
		}
		else if(guesserNumber==player2)
		{
			if(guesserNumber==player3)
			{
				System.out.println("Second Player "+play2+"  "+"Third Player "+play3+"  both are Winners");
				
			}
			else
			{
				System.out.println("Second Player "+play2+" Winner");
			}
		}
		else if(guesserNumber==player3)
		{
			System.out.println("Third Player "+play3+" Winner");
			
		}
		else
		{
			System.out.println("Match Drawn! Please Try Again");
			
		}
	}
	
	void game()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Are u want more game please type '1' or '0' ");
		int c=scan.nextInt();
		if(c==1)
		{
		playerName();
		numFromGuesser();
		numFromPlayer();
		compare();
		
		}
		else
		{
			System.out.println("Thanks A Lot For Ur Valuable Time ");
		}
	}
}




public class GuesserGame {

	public static void main(String[] args) {
		
		Umpire u=new Umpire();
		
		u.playerName();
		u.numFromGuesser();
		u.numFromPlayer();
		u.compare();
		u.game();
		

	}

}
