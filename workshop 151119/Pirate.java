import java.io.Console;

class Pirate
{
	

	public static void main(String[] args) {

		String result = "";
		PirateLang pl = new PirateLang();
		Console c = System.console();

		String seq = "";
		System.out.print("Enter string (q - to quit): ");
		seq = c.readLine();
		while(!seq.equals("q")) {
			System.out.println("Original string: " + seq);

			result = pl.toPirateLang(seq);

	        System.out.println("Converted string: ");
	        System.out.println(result);
	        System.out.println("");
	        System.out.print("Enter string (q - to quit): ");
	        seq = c.readLine();
    	}
	}


}