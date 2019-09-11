import java.util.HashMap;
import java.util.Set;


public class AA {

	public static void main(String[] args) {
		
		
		String str="abcadb";
		
		char[] c= str.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<>();
		
		for(Character ch:c)
		{
			if(map.containsKey(ch))
			{
				map.put(ch, map.get(ch)+1);
			}
			else
			{
				map.put(ch, 1);
			}
		}
		
		Set<Character> s= map.keySet();
		
		for(Character c1:s)
		{
			int ii=map.get(c1);
			if(ii>1)
			{
				System.out.println(ii+" "+c1);
			}
		}
	}
}
