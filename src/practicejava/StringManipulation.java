package practicejava;

public class StringManipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="I am a Good Automation-tester";
		System.out.println("Length of String is: "+s.length());
		System.out.println("Replace the - string "+s.replace("-", " "));
		System.out.println("Character at index 8: "+s.charAt(8));
		System.out.println("Character at index a: "+s.indexOf('a'));
		System.out.println("Character at index a: "+s.indexOf('a', s.indexOf('a')+1));
		System.out.println("Substring: "+s.substring(0, 6));
		System.out.println("Replace string is: "+s.replace("Good", ""));
	//	System.out.println("char array : "+s.toCharArray());
		String s2="ABCD";
		String s3="ABCD";
		System.out.println("String comparision :"+s2.compareTo(s3));
		System.out.println("String equals checck:  "+s2.equals(s3));
		String s4="Iam-a-good-Manual-tester";
		System.out.println("STring split: ");
		String splitvalue[] = s4.split("-");
		for(int i=0;i<splitvalue.length;i++) {
			System.out.println("SPlit: "+splitvalue[i]);
		}
		System.out.println("Concatenate : "+s2.concat(s3));
	}

}
