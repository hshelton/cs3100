package javaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class test {

	
	public static void main (String[] args)
	{
		
		
		readInput();
		
		
		
	}
	
	public static String readInput ()
	{
		InputStreamReader iR = new InputStreamReader(System.in);
		BufferedReader bR = new BufferedReader(iR);
	
	    String line=null;
	    String input = "";
        try {
			while( (line=bR.readLine()) != null) {
			       input += line + "\n";
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return input;
	}
	

	
	
}
