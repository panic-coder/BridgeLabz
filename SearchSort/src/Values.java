
public class Values implements Comparable{
	Values(){}	
	String name;
	int roll;
	
/*	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}*/

	Values(String name,int roll){
		this.name = name;
		this.roll = roll;
	}
	
	public String toString() {
		return roll+"  "+name;
	}

	@Override
	public int compareTo(Values v)
	{
		if(roll==v.roll)
			return 0;
		else if(roll>v.roll)
			return 1;
		else
			return -1;
	}
	



	


}
