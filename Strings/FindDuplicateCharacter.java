/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class FindDuplicateCharacter
{
	public static void main(String[] args) {
		
		String s = "programming";
		
		int count[] = new int[126];
		
		Map<Character,Integer> map = new HashMap<>();
		
		
		for (int i=0;i<s.length();i++){
		    count[s.charAt(i)]++;
		} 
		
		for (int i=0;i<126 ;i++) {
		    
		    if(count[i]>1){
		        
		        map.put((char)i,count[i]);
		       // System.out.println((char)i+" "+count[i]);
		    }
		}
		
// 		for(Map.Entry<Character,Integer> e:map.entrySet()){
		    
// 		    System.out.print(" "+e.getKey()+" "+e.getValue());
// 		}
	}
}
