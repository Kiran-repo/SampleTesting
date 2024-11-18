
public class ArrayDemo {

	public static void main(String[] args) {
		int []obj= {87,67,4,90,23,54,87,48,25};
		
		int searchelement=468;
		boolean status =false;
		for(int i=0;i<obj.length;i++) {
			
			if(obj[i]==searchelement) {
				System.out.println("Element avaialable : "+obj[i]);
				status=true;
			
				break;
			}
		
		}
		if(status==false) {
			System.out.println("Element not found");
		}
		
	}

}
