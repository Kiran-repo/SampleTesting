import java.util.Arrays;

public class AscOrderWithOutSortArrays {

	public static void main(String[] args) {
		int obj[]= {5,3,1,4,3,9,2};
     System.out.println("Printing the Array elements Before sort : "+Arrays.toString(obj));
     
     for(int i=0;i<obj.length-1;i++) {
    	 
    	 for(int j=0;j<obj.length-1;j++) {
    		 if(obj[j]<obj[j+1]) {
    			 int temp=obj[j];
    			 obj[j]=obj[j+1];
    			 obj[j+1]=temp;
    			 
    		 }
    	 }
     }
     System.out.println("Printing after sort : "+Arrays.toString(obj));
     
     
     
	}

}
