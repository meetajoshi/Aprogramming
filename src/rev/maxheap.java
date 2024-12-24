package rev;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map.Entry;

public class maxheap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String, Integer> hm=new HashMap<>();
hm.put("a", 6);
hm.put("b", 12);
hm.put("c", 34);
hm.put("d", 9);
int max=Collections.max(hm.values());
for(Entry<String,Integer> e:hm.entrySet())
{
	if(e.getValue()==max)
	{
		System.out.println(e.getValue());
	}
}

	}

}
