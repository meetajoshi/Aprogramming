package rev;

public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int n=786543561;
	int even=0; 
	int odd=0;
	
	while(n>0)
	{
		int rem=n%10;
		if(n%2==0)
		{
			even++;
		}else
		{
			odd++;
		}
		n=n/10;
	}
	System.out.println("total number of even"+even);
	System.out.println("total number of odd"+odd);

}
}
