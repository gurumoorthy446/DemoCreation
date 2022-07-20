package practicejava;

public class MissingnummArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		addtwomatrices();
		largersmallerelement();
		evenodd();
		searchstringelement();
		searchnumarray();
		sumarray();
         int []a= {2,4,5,6,7,8}; //a[0]=2,a[1]=4
         int sum=0;
         for(int i=0;i<a.length;i++) {
        	 sum=sum+a[i];
         }
         int sum1=0;
         for(int j=2;j<=8;j++) {
        	 sum1=sum1+j;
         }
         int missnum = sum1-sum;
         System.out.println("Missing number is: "+missnum);
	}
public static void sumarray() {
	int a[]= {10,20,30};
	int sum=0;
	for(int i=0;i<a.length;i++) {
		sum=sum+a[i];
	}
	System.out.println(sum);
}
 public static void searchnumarray() {
	 int a[]= {20,30,40};
	 boolean flag=false;
	 for(int i=0;i<a.length;i++) {
		 if(a[i]==30) {
			 System.out.println("element present");
			 flag=true;
			 break;
		 }
	 }
	 if(flag==false) {
		 System.out.println("element not present");
	 }
 }
 public static void searchstringelement() {
	 String s[]= {"aaaa","bbbbb","good","java"};
	 boolean flag=false;
	 for(int i=0;i<s.length;i++) {
		 if(s[i]=="java") {
			 System.out.println("String element found");
			 flag=true;
			 break;
		 }
	 }
	 if(flag==false) {
		 System.out.println("String element not found");
	 }
 }
 public static void evenodd() {
	 int a[]= {10,11,14,9};
	 for(int i=0;i<a.length;i++) {
		 if(a[i]%2==0) {
			 System.out.println("Number is even");
		 }else {
			 System.out.println("Number is odd");
		 }
	 }
 }
 public static void largersmallerelement() {
	 int a[]= {10,70,80,120};
	 int max=a[0];
	 for(int i=1;i<a.length;i++) {
		 if(a[i]>max) {
			 max=a[i];
		 }
	 }
	 int min=a[0];
	 for(int i=1;i<a.length;i++) {
		 if(a[i]<min) {
			 min=a[i];
		 }
	 }
	 System.out.println("Largest element in an array is : "+max);
	 System.out.println("smallest element in an array is : "+min);
 }
 
 public static void addtwomatrices() {
	 int a[][]= {{1,2,3},{0,1,2},{2,4,6}};
	 int b[][]= {{0,2,1},{0,3,1},{2,1,3}};
	 int c[][]=new int[3][3];
	 int i,j;
	 System.out.println("A Matrix : ");
	 for(i=0;i<3;i++) {
		 for(j=0;j<3;j++) {
			 System.out.print(a[i][j]+" ");
		 }
		 System.out.println();
	 }
	 System.out.println("B Matrix : ");
	 for(i=0;i<3;i++) {
		 for(j=0;j<3;j++) {
			 System.out.print(b[i][j]+" ");
		 }
		 System.out.println();
	 }
	 System.out.println("Addition of two Matrix : ");
	 for(i=0;i<3;i++) {
		 for(j=0;j<3;j++) {
			 c[i][j]=a[i][j]+b[i][j];
		 }
		// System.out.print(c[i][j]+"\t");
	 }
	 System.out.println();
	 for(i=0;i<3;i++) {
		 for(j=0;j<3;j++) {
			 System.out.print(c[i][j]+" ");
		 }
		 System.out.println();
	 }
 }
}
