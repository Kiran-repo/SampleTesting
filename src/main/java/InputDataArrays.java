
import java.util.Arrays;
import java.util.Scanner;
public class InputDataArrays {

	public static void main(String[] args) {
		int obj[]=new int[5];
		Scanner sn=new Scanner(System.in);

		for(int i=0;i<obj.length;i++) {
			System.out.println("Enter the elements at position of "+i+" : ");
			obj[i]=sn.nextInt();
		}
		System.out.println("Array Elements : "+Arrays.toString(obj));
	}

}
