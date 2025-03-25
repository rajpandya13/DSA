/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class RemoveDuplicateCharacter
{
	public static void main(String[] args) {
		
		String s = "kjdcnkweujCKsJNChvrbssjdcn";
		
	//	String str = s.toLowerCase();
		
		StringBuilder sb = new StringBuilder();
		int count[] = new int[126];
		
		for (int i=0;i<s.length();i++){
		    
		    char c = s.charAt(i);
		    
		    if(count[c]==0){
		        
		        sb.append(c);
		        
		        count[c]++;
		        
		    }
		} 
		System.out.print(sb);
	}
}
