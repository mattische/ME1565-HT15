class Array
{

	public static void main(String[] args) {
		int number[] = new int[10000];

		//number[0]
		System.out.println(number[2]);

		number[0] = 100;
		number[1] = 100 + number[0];
		number[2] = 90 - number[9];

		

		for (int i=0; i < 10000; i++) 
			number[i] = number[i] + 10;
		
		for (int i=0; i < 10; i = i + 2) 
			System.out.println("number[" + i + "]: " + number[i]);




		/*String words[] = new String[5000];
		words[3] = "mamma";
		System.out.println(words[3]);*/
	}
}