
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    
		String x="LISTEN";
		String y="SILENT";
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result = Arrays.equals(a,b);
		if(result==true)
		{
		  System.out.println("anagram");  
		}else{
		    System.out.println("not");
		}
	}
}
