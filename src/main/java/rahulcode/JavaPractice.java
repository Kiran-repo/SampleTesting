package rahulcode;

import java.util.Scanner;

public class JavaPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	Scanner sn=new Scanner (System.in);
	System.out.println("Enter the number (it breaks at zero) : ");
	int num;
	int sum=0;
	
	while(true) {
		num=sn.nextInt();
		
		if(num ==0) {
			break;
		}
		sum +=num;
	}
	System.out.println("Sum of numbers : "+sum);
	sn.close();
		
		
		
		//1=10 & 10-1;
		
//		int i =10;
//		
//		while(i>0) {
//			System.out.println(i);
//			i--;
//		}
		
//		int j=20;
//				
//				do {
//					System.out.println(j);
//					j++;
//				}while(j<30) ;
		

//	for(int i=1;i<=3;i++) {
//			System.out.println("Outer loop started.");
//			for(int j=1;j<=3;j++) {
//				System.out.println("Inner loop.");
//				
//			}
//			System.out.println("Outer loop ended");
//		}
		
//		int k=1;
//		for(int i=0;i<=4;i++) {
//			
//			for(int j=1;j<=4-i;j++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//				
//			}
//			System.out.println("");
//		}
		
		
		
//		1 2 3 4
//		5 6 7
//		8 9
//		10
//	int k=1;
//		for(int i=0;i<=3;i++) {
//			for(int j=1;j<=1+i;j++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println("");
//		}
				
//		1
//		2 3
//		4 5 6
//		7 8 9 10
		
		
//		int k=1;
//		for(int i=0;i<=4;i++) {
//			for(int j=1;j<=1+i;j++) {
//				System.out.print(k);
//				System.out.print("\t");
//				k++;
//			}
//			System.out.println("");
//		}
		
//	1
//	1 2
//	1 2 3
//	1 2 3 4
		
		//int k=1;
//		for(int i=1;i<=4;i++) {
//			for(int j=1;j<=i;j++) {
//				System.out.print(j);
//				System.out.print("\t");
//				//k++;
//			}
//			System.out.println("");
//		}
		
//		1
//		2 2
//		3 3 3
//		4 4 4 4
//		5 5 5 5 5
		
		
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<i;j++) {
//				System.out.print(j);
//				System.out.print("\t");
//				//k++;
//			}
//			System.out.println(i);
//		}
		
		
//	3
//	6 9
//	12 15 18
		
	
//		for(int i=3;i<=18;i=i*2) {
//			for(int j=0;j<=i;j++) {
//				System.out.print(j);
//				System.out.print("\t");
//			}
//			System.out.println(" ");
//		}
		
		
		
	
		
	}

}
