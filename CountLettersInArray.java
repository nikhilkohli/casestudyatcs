package atcs;

import java.util.*;
import java.util.Random;

public class CountLettersInArray {

	public char [] createArray()
	{
		String str = "limheyaorkijdhuampsy";
		char[] ch = new char[str.length()];
		  
        
        for (int i = 0; i < str.length(); i++) {
            ch[i] = str.charAt(i);
        }
        
       return ch ;
		
	}
	
	
	public static void displayCounts(char b[]) 
	{
		int length = b.length;
		int freq[]= new int[length];
		System.out.println(b);
		for(int i = 0; i <length; i++) 
		{
			
	            freq[i] = 1;  
	            for(int j = i+1; j <length; j++)
	            {  
	                if(b[i] == b[j]) 
	                {  
	                    freq[i]++;  
	                    b[j] = '0';  
	                }  
		
	            }
		}
		
		System.out.println("Characters and their corresponding frequencies");  
        for(int i = 0; i <freq.length; i++) 
        {  
            if(b[i] != ' ' && b[i] != '0')  
                System.out.println(b[i] + "-" + freq[i]);  
        }  
    }  
	
	
	
	public static char[] RandomCharacter(int len) {
		
			String alphabet =
					"ABCDEFGHIJKLMNOPQRSTUVWXYZ" +
					"abcdefghijklmnopqrstuvwxyz";

			StringBuilder b = new StringBuilder();

			for (int i = 0; i < len; i++) {
				int Rnum = new Random().nextInt(alphabet.length());
				char rChar = alphabet.charAt(Rnum);
				b.append(rChar);
			}

			return b.toString().toCharArray();
		}
		
	
	public static void main(String args[]) {
		char str[] = RandomCharacter(20);
		displayCounts(str);
		
		
	}
}
