import java.util.Scanner;

public class StackMain {
	
	 public static void main(String args[])
	    {
		 Scanner sc = new Scanner(System.in);
		 
		String st;
		 String st2="";
		 System.out.println("enter the value");
		 st=sc.nextLine();
		 char c1[] = st.toCharArray();
		 int d=st.length();
		 Stack s = new Stack(d);
		 
	        for(int i=0;i<c1.length;i++) {
	        	s.push(c1[i]);
	        	//st=st+1;
	        }
	       	      st="";
	       // s.search(2);
	        
	        StackS ss = new StackS(d);
	        while(d>0)
	        {
	        	char tmp =  s.pop();
	        	st=st+tmp;
	        	//System.out.print(tmp);
	        	ss.push(tmp);
	        	d--;
	        }
	        
	        d=st.length();
	        
	       while(d>0) {
	    	   char c= ss.pop();
	    	   //System.out.print(c);
	    	   st2=st2+c;
	    	   d--;
	       }
	       
	      /* System.out.println(st);
	       System.out.println(st2);
	      */
	       if(st.equals(st2)) 
	    	   System.out.println("Palindrome");
	       else
	    	   System.out.println("Not Palindrome");
	       
	       sc.close();
	    }
}
	        
	        
	        	 

	        
	    
	 
