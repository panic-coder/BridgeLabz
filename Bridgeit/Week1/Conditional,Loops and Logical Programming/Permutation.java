import java.util.Scanner;

public class Permutation {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a string");
		String st=s.next();
		char[] c = st.toCharArray();
		int l=c.length;
		/*while(l>0) {
			for(int i=l-1;i>0;i--) {
				char t =c[i-1];
				c[i-1] = c[i];
				c[i] = t;
				for(int j=0;j<c.length;j++)
					System.out.print(c[j]);
				System.out.println();
			}
			for(int i=0;i<c.length-2;i++) {
				char t = c[i+1];
				c[i+1] = c[i];
				c[i] = t;
				for(int j=0;j<c.length;j++)
					System.out.print(c[j]);
				System.out.println();
			}
			l--;
		}*/
		
		for(int i=0;i<c.length;i++) {
			for(int j=0;j<c.length-1;j++) {
				
				char t = c[j];
				c[j]=c[j+1];
				c[j+1]=t;
				for(int k=0;k<c.length;k++)
					System.out.print(c[k]);
				System.out.println();
				for(int m=0;m<c.length;m++) {
					for(int n=0;n<c.length-1;n++) {
						char temp = c[n];
						c[n] = c[n+1];
						c[n+1] = temp;
						for(int a=0;a<c.length;a++)
							System.out.print(c[a]);
						System.out.println();
					}
				}
				//System.out.println();
			}
		}
	}
}
