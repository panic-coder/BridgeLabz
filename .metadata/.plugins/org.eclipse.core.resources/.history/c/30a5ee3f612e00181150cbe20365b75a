
public class Ascending {
	Values a[];
	int size;
	int top;
	
	/*public Ascending() {
		top=-1;
		this.size=50;
		a= new AscendingValues[this.size];
	}*/
	
	public Ascending(int i) {
		top=-1;
		this.size=i;
		a=new Values[this.size];
	}


	public void push(Values item) {
		if(isFull()) {
			top++;
			a[top]=item;
		}
	}
	
	public boolean isFull() {
		if(top==size)
			return false;
		else
			return true;
	}
	
	public Values Compare(Values a,Values b,Values c) {
		
		return a;
	}
	
	
	public void display() {
		Values t = a[top--];
		System.out.println(t);
		
	}
	
}
