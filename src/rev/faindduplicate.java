package rev;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class faindduplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[] a= {1,2,4,2,6,4,9,1};
Set<Integer> s=new HashSet<>();
for(int n:a)
{
	if(s.add(n)==false)
	{
		System.out.println(n);
	}
}

	}

}
