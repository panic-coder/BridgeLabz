
public class StackS {
	int top;
    char a[];
    int size;
   
 
     boolean isEmpty()
    {
        return (top < 0);
    }
    StackS(int size)
    {
        top = -1;
        this.size=size;
        a=new char[size];
    }
 
    boolean push(char x)
    {
        if (top >= size)
        {
            System.out.println("Stack Overflow");
            return false;
        }
        else
        {
            a[++top] = x;
            return true;
        }
    }
 
    char pop()
    {
        if (top < 0)
        {
            System.out.println("Stack Underflow");
            return 0;
        }
        else
        {
            char x = a[top--];
            //System.out.println(x);
            return x;
        }
    }
    
    public int peek() {
		return a[top];
	}

}