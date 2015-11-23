import java.io.Console;

class Test {

	public static void main(String[] args) {
		Console c = System.console();
		String n = c.readLine("Enter name: ");
		System.out.println(n);
	}
}