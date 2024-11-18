import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {

	public static void main(String[] args) {
//		String str[]= {"Kiran","Arjuna","Karna","Bhimaa","Dhrama","Krishna"};
//		System.out.println("Aarry elements oririnal order : "+Arrays.toString(str));
//		System.out.print("Arrays in reverse order : "+"[ " );
//
//		for(int i=str.length-1;i>=0;i--) {
//			System.out.print(" , "+str[i]);
//		
//		}
//		System.out.println("]");

//		int a[]= {33,5,2,8,0,45,88};
//		
//		for(int i=0;i<a.length-1;i++) {
//			for(int j=0;j<a.length-1;j++) {
//				if(a[j]>a[j+1]) {
//					int temp=a[j];
//					a[j]=a[j+1];
//					a[j+1]=temp;
//				}
//			}
//		}
//		System.out.println(Arrays.toString(a));

//		
//		Scanner sn=new Scanner(System.in);
//		System.out.println("Enter first num : ");
//		int num1=sn.nextInt();
//		
//		System.out.println("Enter second num : ");
//		double num2=sn.nextDouble();
//		
//		System.out.println("Enter add/sub/divide/mul :");
//		String str=sn.next();
//		
//		double result;
//		
//		switch(str.toLowerCase()) {
//		case "add":
//			result=num1+num2;
//			System.out.println("Result :"+result);
//			break;
//			
//		case "sub":
//			result=num1-num2;
//			System.out.println("Result :"+result);
//			break;
//			
//		case "multi":
//			result=num1*num2;
//			System.out.println("Result :"+result);
//			break;
//			
//		case "divide":
//			if(num2 !=0) {
//				result=num1/num2;
//				System.out.println("Result :"+result);		
//			}else {
//				System.out.println("Error: divide by zero.");
//			}
//			break;
//		default:
//				System.out.println("Error : Invalid operator");
//			
//		}
//		
//		sn.close();

//		
//		//String a[]= {"Kiran","Arjuna","Karna","Kiran","Bhimaa","Dhrama","Krishna","Kiran"};
//		int a[]= {44,2,8,9,1,2,3,8,9,3,2,1};
//		boolean flag=false;
//		int count=0;
//		for(int i=0;i<a.length;i++) {
//			for(int j=i+1;j<a.length;j++) {
//				if(a[i]==a[j]) {
//					//String temp=a[i];
////					a[j]=a[j+1];
////					a[j+1]=temp;
//					System.out.println("Duplicates available in  :"+a[i]);
//					//count++;
//					flag=true;
//					
//				}
//				
//				}
//			}
//			
//		if(flag==false) {
//			System.out.println("Duplicates not available");
//		}
//		

//		String str= "KiranKumarReddy";
//		
//		String org =str;
//		String 	rev="";
//		for(int i=org.length()-1;i>=0;i--) {
//			rev= rev+org.charAt(i);	
//		}
//		
//		System.out.println("Reverse the string : "+rev);

//		int num=1234;
//		int org=num;
//		int rev=0;
//		
//		while(org !=0) {
//			int rem=org%10;
//			rev=rev*10+rem;
//			org=org/10;
//			
//		}
//		System.out.println(rev);

//		int arm=153;
//		int org=arm;
//		int rem,sum=0;
//		
//		while(org !=0) {
//			rem=org%10;
//			sum=sum+(rem*rem*rem);
//			org=org/10;
//			
//		}
//		if(arm==sum) {
//			System.out.println("It is armstrong number :"+sum);
//		}else {
//			System.out.println("It is not an armstrong number");
//		}

//	Scanner sn=new Scanner(System.in);
//	System.out.println("Enter the first num :");
//	int num1=sn.nextInt();
//		
//	System.out.println("Enter the second num :");
//	int num2=sn.nextInt();
//	
//	System.out.println("Enter an operator add/sub/multi/divide :");
//	String operator=sn.next();
//	
//	double result;
//	switch(operator.toLowerCase()) {
//	case "add":
//		result=num1+num2;
//		System.out.println("Result : "+result);
//		break;
//	case "sub":
//		result=num1-num2;
//		System.out.println("result : "+result);
//		break;
//	case "multi":
//		result=num1*num2;
//		System.out.println("result : "+result);
//		break;
//	case "divide":
//		if(num2 !=0) {
//			result=num1/num2;
//			System.out.println("result : "+result);
//		}else {
//			System.out.println("Error: num2 is zero ,divide by zero getting error");
//		}
//		break;
//	default:
//		System.out.println("Error: Invalid operator .");
//	}

		// Factorial.
//		int num=5;
//		int org=num;
//		int result=1;
//		
//		for(int i=1;i<=org;i++) {
//			result *=i;
//		}
//		System.out.println(result);

		// PalindromeNumber

//		int num=6543456;
//		
//		int org=num;
//		int rem;
//		int rev=0;
//		for(int i=1;i<=org;i++) {
//			rem=org%10;
//			rev=rev*10+rem;
//			org=org/10;
//			
//		}
//		
//		if(num==rev) {
//			System.out.println(num+" It is a palindrome ");
//		}else {
//			System.out.println(num+" it is not an palindrome ");
//		}

		// PalindromeString

//		
//		String str="KiranKumarReddy";
//		char vowels[]= {'a','e','i','o','u'};
//		
//		for(int i=0;i<str.length();i++) {
//			char[]	vowels1=str.toCharArray();
//		
//		System.out.println(vowels1);
//		if(vowels1==vowels) {
//			System.out.println("Print vowels :"+ vowels1);
//		}else {
//			System.out.println("Error");
//		}
//			

		int obj[] = { 33, 6, 555, 7, 3, -9, -3, 7, -50, -60,105, 9, 49, 46, 98, 70, 78, 77 };

		int count = 0;
		for (int i = 0; i < obj.length; i++) {
			if (obj[i] % 5 == 0 && obj[i] > 99 && obj[i] < 999 && obj[i] % 10 == 5) {
				count++;
				//System.out.println("Count of elements divisible by 5 and 3digit number ,ending with 5 : "+count);
			}

		}
		System.out.println("count : "+count);
//int count=0;
//for(int i=0;i<obj.length;i++) {
//	if(obj[i]%2==0) {
//		count++;
//		System.out.println(obj[i]);	
//	}
//	
//}
//	
//	System.out.println("Count : "+count);	
		// double sum =0;
//		for(int i=0;i<obj.length;i++) {
//			if(obj[i]>0 && obj[i]%2==0) {
//				 sum=sum+obj[i];
//			System.out.println("Sum of even number : "+sum);			
//			}
//		}
//		
//		double prod=1;
//		for(int i=0;i<obj.length;i++) {
//			
//			if(obj[i]>0 && obj[i]%2!=0 && obj[i]>9 && obj[i]<100) {
//				prod=prod*obj[i];
//				System.out.println(prod);
//			}
//		}

//		for(int i=0;i<obj.length;i++) {
//			System.out.print(Math.pow(obj[i],3)+" ");

//		for(int i=0;i<obj.length;i++) {
//			
//			if(obj[i]!=0 && obj[i]%5==0 && obj[i]%10==7) {
//				System.out.println("Printing positive divible by 5 and ending with 7: "+obj[i]);
//			}
//			
//		}

//		for(int i=0;i<obj.length;i++) {
//		if(obj[i]>9 && obj[i]<100) {
//			System.out.println("Printing two digit numbers : "+obj[i]);
//		}
//		
//		
//		}
//		for(int i=0;i<obj.length;i++) {
//			if(obj[i]%2==0) {
//				System.out.println("Printing even number : "+obj[i]);
//			}else {
//				System.out.println("Printing odd numbers : "+obj[i]);
//			}
//		}

	}

}
