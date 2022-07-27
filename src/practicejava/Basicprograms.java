package practicejava;

import java.util.Iterator;

public class Basicprograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   ReverseString();
		CharacterCount();
	}

	public static void ReverseString() {
		String str="HaiGuru";
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev=rev+str.charAt(i);
		}
		 System.out.println(rev);
	}
	public static void CharacterCount() {
		String str ="HaiGUrU";
		int lower=0;
		int upper=0;
		char c;
		for(int i=0;i<str.length();i++) {
        c=str.charAt(i);
        if(c>'A'&&c<='Z') {
        	upper++;
        }else if(c>'a'&&c<='z'){
        	lower++;
        }
		}
		System.out.println("Lowercase count: "+lower);
		System.out.println("Uppercase count: "+upper);
	}
}
