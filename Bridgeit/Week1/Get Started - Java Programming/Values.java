/*1. Write a program “ PrintThreeNames.java ” that takes three names as input and
prints out a proper sentence with the names in the reverse of the order given, so
that for example, " java PrintThreeNames Alice Bob Carol " gives "Hi Carol, Bob,
and Alice.".*/
public class Values{
	Values(){}	
	String name;
	
	Values(String name){
		this.name = name;
	}
	
	public String toString() {
		return name+" ";
	}
}
