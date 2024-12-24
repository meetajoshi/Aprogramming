package rev;

public class allzerosattheend {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,3,0,5,0,2};
int count=0;
for(int i=0; i<a.length; i++)
{
	if(a[i]>0)
	{
		a[count]=a[i];
		count++;
	}
	
}


if(count<a.length)
{
	a[count]=0;
	count++;
}
for(int i=0; i<a.length; i++)
{
	System.out.print(a[i]);
}
	
}
}
