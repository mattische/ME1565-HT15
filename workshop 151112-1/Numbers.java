import java.util.Scanner;

class Numbers
{

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		System.out.print("Enter nbr 1: ");	
		int nbr1 = s.nextInt();

		System.out.print("Enter nbr 2: ");
		int nbr2 = s.nextInt();

		int result = Numbers.add(nbr1, nbr2);
		int result2 = Numbers.sub(nbr1, nbr2);

		System.out.println("Result of add: " + result);
		System.out.println("Result of sub: " + result2);

	}

	
	public static int add(int x, int y) 
	{
		int sum = x + y;
		return sum;
	}

	public static int sub(int x, int y) 
	{
		int sum = x - y;
		return sum;
	}

}