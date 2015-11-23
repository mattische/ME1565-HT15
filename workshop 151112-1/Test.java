import java.util.Scanner;

class Test
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.print("How old are you? ");

		int age = s.nextInt();
		
		if(age < 15)
			System.out.println("You're not welcome! =<");
		else if(age > 15)
			System.out.println("You're welcome!");
		else if(age == 15)
			System.out.println("You're 15. Woot");
	}
}