package practicejava;

public class Swapstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a = "1stString";
		String b = "2ndString";
		a=a+b;
		System.out.println(a);
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		System.out.println("Afterswapping");
		System.out.println(a);
		System.out.println(b);
	}

}
