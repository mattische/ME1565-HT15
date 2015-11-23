import java.util.Scanner;

class First
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("How old are you? ");

		int age = s.nextInt();
		
		if(age < 15)
			System.out.println("You are under 15!");
		else if(age > 15)
			System.out.println("You are over 15!");
		else 
			System.out.println("YOU ARE 15");

	}
}