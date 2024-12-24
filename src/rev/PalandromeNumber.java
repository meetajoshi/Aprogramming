package rev;

public class PalandromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=12321;
int org_num=n;
int rev=0;
while(n!=0)
{
	rev=rev*10+n%10;
	n=n/10;
	
}
if(org_num==rev)
{
	System.out.println("The number is palandrome");
}
else
{
	System.out.println("The number is not palandrome");
}
	}

}
