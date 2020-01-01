
public class Fibonacii implements Batman {
	static int a=0,b=1,c=0;

	public static void main(String[] args) {
		
		Fibonacii a1= new Fibonacii();
		a1.fibonaci();

	}
	@Override
	public void fibonaci() {
		int n1=0,n2=1,n3,i,Count=10;
		System.out.print(n1+" "+n2);
		for (i=1;i<Count;i++)
		{
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
		
	}
	public void fibonaciwthrec()
	{
		
	}

}

