package practicejava;

public class LargeandSmallnumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {12,14,-88,89,101,109,-100};
		int largest = a[0];
		int smallest = a[0];
		for (int i=1;i<a.length;i++) {
			if(a[i]>largest) {
				largest=a[i];
			}else if(a[i]<smallest) {
				smallest=a[i];
			}
			
		}
		System.out.println("Largest number is: "+largest);
		System.out.println("Smallest number is: "+smallest);
}
	}
