package javachallenge8;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class JavaProblem9 
{
	public static int firstUniqChar(String s)
	{
        Set<Character> repeating = new HashSet<Character>(); 
        Set<Character> nonRepeating = new LinkedHashSet<Character>(); 
        for (char c : s.toCharArray()) {
            if (repeating.contains(c)) {
                continue; 
            }
           
            if (nonRepeating.contains(c)) {
                nonRepeating.remove(c); 
                repeating.add(c);
                System.out.println("Repeating Character");
                System.out.println(repeating);
            }
         
            else 
            {
                nonRepeating.add(c);
                
            }
            
            System.out.println("Non Repeating Character");
            System.out.println(nonRepeating);
        }
        
        if (nonRepeating.isEmpty()) {
            return -1; 
        } else {
            return s.indexOf(nonRepeating.iterator().next()); 
        }
    }

	public static void main(String[] args) {
		 String s = "leetcode";
	        int result = firstUniqChar(s);
	        System.out.println(result);
	    }

	}


