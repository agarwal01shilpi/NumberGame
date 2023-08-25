package project;
import java.util.Random;
import java.util.Scanner;

class Game1{
	  int computer;
	  public Game1() {
		  Random ran=new Random();
		  int bound;
		computer = ran.nextInt(bound= 100);
		  System.out.println("Guess The Number From 1 to 100");
		 }
	  public int computerNum() {
		  return computer;
	  }
	  
}
public class NumberGame {
    static int takeInput(){
    	int user;
    	System.out.println("Enter Input : ");
    	Scanner sc=new Scanner(System.in);
    	user=sc.nextInt();
    	return user;
    }
    static void isCorrectNum(int i,int j) {
    	if(i==j) {
    		System.out.println("Correct Number Guess");
    	}
    	else if(i>j) {
    		System.out.println("Your Number Is Bigger Than computerNum");
    	}
    	else {
    		System.out.println("Your Number Is Smaller Than computerNum");
    	}
    }
    public static void main(String... args) {
    	int user=0,computer=0,iteration=0;
    	Game1 g1=new Game1();
    	do {
    		user=takeInput();
    		computer=g1.computerNum();
    		//System.out.println(user);
    		//System.out.println(computer);
    		isCorrectNum(user,computer);
    		iteration++;
    		}while(user!=computer);
    	System.out.println("You Guess Number In "+iteration+" iterations");
    }
}
