package TechGig;
import java.util.HashSet;
import java.util.Set;

import icsV1dot1.Time;

public class TechGigMedium {

	static int counter1 = 0;
	static String input = "";
	
	public static void main(String[] args) {

		int input1 = 4;
		int input2 = 11;
		
		String input3 = "cAdaa";
		String input4 = "AbrAcadAbra";
		Time.startTime();
		int res = appearanceCount(input1,input2,input3,input4);
		Time.endTime();
		System.out.println(res);
		}

	public static int appearanceCount(int input1, int input2, String input3, String input4) {

		input = input4;
		permutation(input3);
//		Set<String> set = new HashSet<String>();
/*		set = generatePerm(input3);
		String string = "";
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			string = iterator.next();
			if (input4.contains(string))
				count++;
		}
*/		
		//doPerm(new StringBuffer(input3), input3.length(), input4, 0);
		return counter1;
	}
	public static void doPerm(StringBuffer str, int index, String input4, int count){
		int counter = count;
	    if(index <= 0){
//	    	System.out.println(str);            
	    	if (input4.contains(str)){
	    		counter1++;
	    		count++;
	    		counter++;
	    	}
	    }
	    else { //recursively solve this by placing all other chars at current first pos 
	        doPerm(str, index-1, input4, counter);
	        int currPos = str.length()-index;
	        for (int i = currPos+1; i < str.length(); i++) {//start swapping all other chars with current first char
	            swap(str,currPos, i);
	            doPerm(str, index-1, input4, counter);
	            swap(str,i, currPos);//restore back my string buffer
	        } 
	    } 
	} 
	 
	private  static void swap(StringBuffer str, int pos1, int pos2){
	    char t1 = str.charAt(pos1);
	    str.setCharAt(pos1, str.charAt(pos2));
	    str.setCharAt(pos2, t1);
	}  
	public static Set<String> generatePerm(String input)
	{
	    Set<String> set = new HashSet<String>();
//	    ArrayList<String> set = new ArrayList<>();
	    if (input == "")
	        return set;

	    Character a = input.charAt(0);

	    if (input.length() > 1)
	    {
	        input = input.substring(1);

//	        Set<String> permSet = generatePerm(input);
	        Set<String> permSet = generatePerm(input);

	        for (String x : permSet)
	        {
	            for (int i = 0; i <= x.length(); i++)
	            {
	                set.add(x.substring(0, i) + a + x.substring(i));
	            }
	        }
	    }
	    else
	    {
	        set.add(a + "");
	    }
	    return set;
	}
	
	
	public static void permutation(String str) { 
	    permutation("", str); 
	}

	private static void permutation(String prefix, String str) {
	    int n = str.length();
	    if (n == 0){
//	    	System.out.println(prefix);
	    	if (input.contains(prefix)){
//	    		System.out.println(prefix);
	    		counter1++;
	    	}
	    }
	    else {
	        for (int i = 0; i < n; i++)
	            permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
	    }
	}

}
