
public class MaxAndMinArray {

	public static void main(String[] args) {
		int obj[] = { 33, 6, 555, 7, 3, -9, -3, 7, -50, -60,105, 9, 49, 46, 98, 70, 78, 77 };
		int max=obj[0],min=obj[0];
		for (int i = 0; i < obj.length; i++) {
			if(obj[i]>max) {
				max=obj[i];
			}
			if(obj[i]<min) {
				min=obj[i];
			}
			
		}
System.out.println("Max : "+max);
System.out.println("Min : "+min);
	}

}
