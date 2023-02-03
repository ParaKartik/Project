
public class Demo {

	public static void main(String[] args) {
		
		
		 String ss= "kartik";
	        String ab = "";
	        
	        for(int i = 0; i<ss.length();i++) {
	        	  
	        	     ab= ab+(char)(ss.charAt(i)-32);
	        }
	           System.out.println(ab);

	      ///Lower
		  String kk= "KARTIK";
	      String aa = "";
	      
	      for(int i = 0; i<kk.length();i++) {
	      	  
	      	     aa= aa+(char)(kk.charAt(i)+32);
	      }
	         System.out.println(aa);
	         System.out.println();
	}

}
