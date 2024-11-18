
public class DuplicatesInArray {

	public static void main(String[] args) {
		int obj[]= {11,22,33,11,22,33,44,11,44,33,22};
		int num=11;
		int count=0;
		for(int value:obj) {
			if(value==num) {
				count++;
			}
		}
		System.out.println(count);
		
		
		
	}

	
	
}
