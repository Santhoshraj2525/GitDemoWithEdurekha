
public class fibonaciwthrecurssion {
static int a=0, b=1, c=0;
static void fibo(int count)
{
	if (count>0)
		{
		c=a+b;
		a=b;
		b=c;
		System.out.print(" "+c);
		fibo(count-1);
		}
}
	public static void main(String[] args) {
		int count =15;
		System.out.print(a+" "+b);
		fibo(count - 2);

	}

}
