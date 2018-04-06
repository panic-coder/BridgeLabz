package com.bridgeit.programs;

public class Node<T> {
	public Node<T> next;
	public T data;
	public Integer key;
	public Node(T key) {
		this.data=key;
	}
	public Node(Integer key, T data) {
		this.key=key;
		this.data=data;
	}
	
	
	
}

/*Utility utility = new Utility();
File file = new File("/home/bridgeit/eclipse-workspace/Bridgeit/DataStructurePrograms/Text");
BufferedReader br = new BufferedReader(new FileReader(file));
String st,st1="";
while((st=br.readLine())!=null) {
*/	//System.out.println(st);
	//st1=st1+st;
	//utility.add(st);
//}br.close();
//System.out.println(st1);
/*utility.printList();
//
System.out.println("Enter the word to be removed");
st1=utility.inputString();

utility.remove(st1);
utility.printList();*/


