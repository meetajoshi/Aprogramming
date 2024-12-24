package rev;

public class SecondLrgest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] n= {1,7,4,9};
int temp=0;
for(int i=0; i<n.length; i++)
{
	for(int j=i+1; j<n.length; j++)
	{
		temp=n[i];
		n[i]=n[j];
		n[j]=temp;
		
	}
}
System.out.println("second largest number=="+n[1]);
	}

}
