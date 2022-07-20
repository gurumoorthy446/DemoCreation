package practicejava;

public class ReverseInteger {

	public static void ReverseInt() {
		int num = 1912;
		int rev=0;
		int sum=num;
		while (num!=0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if (rev==sum) {
			System.out.println("Number is palindrome");
		}else {
			System.out.println("Number is not palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  ReverseInt();
	}

}
