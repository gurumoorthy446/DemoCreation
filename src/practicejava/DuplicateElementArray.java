package practicejava;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateElementArray {
	
	static String names[] = {"Honda","Hero","TVS","Baja","Hero"};
	
 public static void UsingSetFunction() {
	 
	 Set<String> read = new HashSet<String>();
	 for(String name:names) {
		 if(read.add(name)==false) {
			 System.out.println("Duplicate element found by set method is :"+name);
			// Arrays.parallelSort(names);
		 }
	 }
 }
 
	public static void main(String[] args) {
      UsingSetFunction();

      for(int i=0;i<names.length;i++) {
			for(int j=i+1;j<names.length;j++) {
				if(names[i].equals(names[j])) {
					System.out.println("Duplicate element in array is: "+names[i]);
				}
			}
		}
	}

}
