package rev;

public class againallzeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {2,0,4,0,5};
int count=0;
for(int i=0; i<a.length; i++)
{
	if(a[i]!=0)
	{
		a[count]=a[i];
		count++;
	}
}
while(count<a.length)
{
	a[count]=0;
	count++;
}
	
for(int i=0; i<a.length; i++)
{
	System.out.println(a[i]);
}
	}

}
