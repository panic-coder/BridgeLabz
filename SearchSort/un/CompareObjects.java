import java.util.Scanner;

public class CompareObjects {

	public static int compareTo(String str1,String str2)
	{
		int l=0;
		if(str1.length()>str2.length())
			l=str2.length();
		else
			l=str1.length();
		for (int i = 0; i < l; i++) {
			
			while(i<l&&str1.charAt(i)-str2.charAt(i)==0)
			{
				
				i++;
			}
			if(str1.length()==str2.length()&&str2.length()==i)
				return 0;
			if(str1.length()==i||str2.length()==i)
			{
				if(str1.length()==i)
					return -1;
				else return 1;
			}
			return str1.charAt(i)-str2.charAt(i);
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ghjkjkjk");
		String s1 = sc.next();
		String s2 = sc.next();
		System.out.println(compareTo(s1, s2));
	}

}