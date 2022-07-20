package practicejava;

public class Reversestring {

	public static void Palindrome() {
		String s="Happy";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		if(s.equalsIgnoreCase(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}
	}
	public static void Reversestringchar() {
		String s= "AutomationTester";
		int len=s.length();
		String rev="";
		for(int i=len-1;i>=0;i--) {
			rev=rev+s.charAt(i);
			System.out.println(rev);
		}
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.reverse());
	}
	
	public void ReplaceSpecialchars() {
		String s ="!@#$%^&*good program 1233455876*&^%$#";
		String replace = s.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(replace);
	}
	public static void main(String[] args) {
         Palindrome();
		Reversestringchar();
		Reversestring reverse = new Reversestring();
                reverse.ReplaceSpecialchars();
}
}
