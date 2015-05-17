package scrambling;

import java.io.*;
import java.util.Random;


public class Main{
	
	
	
public static void main(String[] args) throws IOException{
	
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String str = br.readLine();
	/*
	String[] str_array= str.split(" ");
	
	String super_string;
	
	if(str_array[0].length()>3){
	super_string = scrambleWord(str_array[0]);
	}
	else
	{
	super_string = 	str_array[0];
	}
	
	
	for(int i=1; i<str_array.length;i++)
	{
		String str_temp;
		
		if(str_array[i].length()>3){
			str_temp= scrambleWord(str_array[i]);
		}
		else{
			str_temp=str_array[i];
		}
		super_string= (super_string+" "+str_temp);
		
	}
	
*/
		System.out.println(scrambleText(str));
		System.out.println(scrambleText(scrambleText(str)));
			
}

public static String scrambleText(String text){
	
	String[] str_array= text.split(" ");
	
	String super_string;
	
	if(str_array[0].length()>3){
	super_string = scrambleWord(str_array[0]);
	}
	else
	{
	super_string = 	str_array[0];
	}
	
	
	for(int i=1; i<str_array.length;i++)
	{
		String str_temp;
		
		if(str_array[i].length()>3){
			str_temp= scrambleWord(str_array[i]);
		}
		else{
			str_temp=str_array[i];
		}
		super_string= (super_string+" "+str_temp);
		
	}
	

	return super_string;
}


public static String scrambleWord(String start_word){
	
	
	//Csak a kozepe
		String middle= start_word.substring(1, start_word.length()-1);
	
		
	
	//Elso es az utolso szo
		char[] str_array=  start_word.toCharArray();
		char first= str_array[0];
		char last= str_array[start_word.length()-1];
		
		
		
		int i, len = middle.length();
	    StringBuilder dest = new StringBuilder(len);

	    for (i = (len - 1); i >= 0; i--){
	        dest.append(middle.charAt(i));
	    }

	    String newword = dest.toString();
		
	  
	    
       return first+newword+last;
}
}


