package dayoneinterview;

import java.util.Scanner;

public class DayOneIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int num=153;
	int fnum=num;
	int sum=0;
	while(fnum !=0) {
		
		int rem=fnum%10;
		sum=sum+rem*rem*rem;
		fnum=fnum/10;
	}
	System.out.println(sum);
	if(num==sum) {
		System.out.println(num+" is an Armstrong number.");
	}else {
		System.out.println(num+" is not an Armstrong number.");
	}
	
	
	}

	

}
