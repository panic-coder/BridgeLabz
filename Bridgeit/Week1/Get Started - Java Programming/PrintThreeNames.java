/*1. Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and Alice.".*/
import java.util.*;

public class PrintThreeNames {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size");
		int size = s.nextInt();

		Values c[] = new Values[size];
		System.out.println("Enter " + size + " names  ");
		for (int i = 0; i < size; i++) {

			Values val = new Values();
			val.name = s.next();
			c[i] = val;

		}

		/*System.out.println("unsorted");
		for (int i = 0; i < c.length; i++) {
			System.out.println(c[i]);
		}*/

		for (int i = 0; i < c.length; i++) {
			for (int j = 0; j < c.length - 1; j++)
				if (compare(c[j].name, c[j + 1].name) > 0) {
					Values temp = c[j];
					c[j] = c[j+1];
					c[j+1] = temp;
				}
		}
		System.out.print("Hi ");
		for (int i = 0; i < c.length; i++) {
			if(i>=0 && i<c.length-1)
				System.out.print(c[i]+", ");
			else if(i<c.length)
				System.out.print("and "+c[i]);
			s.close();
		}

	}

	public static int compare(String str1, String str2) {
		int l = 0;
		if (str1.length() > str2.length())
			l = str2.length();
		else
			l = str1.length();
		for (int i = 0; i < l; i++) {

			while (i < l && str2.charAt(i) - str1.charAt(i) == 0) {

				i++;
			}
			if (str1.length() == str2.length() && str1.length() == i)
				return 0;
			if (str1.length() == i || str2.length() == i) {
				if (str2.length() == i)
					return +1;
				else
					return -1;
			}
			return str2.charAt(i) - str1.charAt(i);
		}
		return 0;
	}

}
