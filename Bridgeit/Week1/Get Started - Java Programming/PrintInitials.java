import java.util.Scanner;
public class PrintInitials {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the initials");
		String initials = s.next();
		char c[] = initials.toCharArray();
		int length  = c.length;
		int n=9;
		int sp=n-1,st=1;
		//System.out.println(m);
		System.out.println();
		while(length>0) {
			for(int i=1;i<=n;i++) {
				for(int j=1;j<=sp;j++) 
					System.out.print(" ");
				for(int j=1;j<=st;j++) {
					if(j==1 || j==st || j==2 || j==st-1)
						System.out.print("*");
					else if(i==((n/2)+2))
							System.out.print("*");
					else
						System.out.print(" ");
				}
				System.out.println();
				if(i<=n) {
				sp=sp-1;
				st=st+2;
				}
			}
			length--;
		}
		s.close();
	}
}
