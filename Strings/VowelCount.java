/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;

public class VowelCount
{
	public static void main(String[] args) {
		
		String name = "Hello My Name is Raj Pandya";
		
		Map<Character,Integer> map = new HashMap<>();
		
		int count = 0;
		
		for (int i=0;i<name.length() ;i++ ){
		    
		    if (name.charAt(i)=='a' || name.charAt(i)=='e' || 
		    name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
		        map.put(name.charAt(i),map.getOrDefault(name.charAt(i),0)+1);
		        count++;
		    } 
		} for(Map.Entry<Character,Integer> entry:map.entrySet()){
		    System.out.print(" "+entry.getKey()+":"+entry.getValue());
		}
		System.out.println();
		System.out.print("Total Vowel Count : "+count);
	}
}
