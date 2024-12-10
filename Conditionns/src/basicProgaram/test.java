package basicProgaram;

public class test {
       private boolean b1;
       private String s1 ;
       
          void setS1(String s1 ) {
        	  this.s1=s1;
        	  if(true) {
        		  System.out.println();
        	  }
        	  else if(false) {
        		  System.out.println();
        	  }
        	  else {
        		  System.out.println("out");
        	  }
        	  
          }
          String getS1()
          {
        	  return s1;
          }       
          void setB1(boolean b1) {
    	   this.b1=b1;
    	  
    	   if(b1==true) {
    	   System.out.println("member is avilable");
    	   }
    	   else {
    		   System.out.print("not available");
    	   }
    	   
       }
       boolean getB1() {
    	   return b1;
       }
       
}
