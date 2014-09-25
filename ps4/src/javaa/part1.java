package javaa;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//read input until EOF and call PrintSS method
		PrintSS(readInput());

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
	
	
	/**
	 * Matches social security number patterns of 3 digits 1 hyphen, 2 digits 1 hyphen, 4 digits 1 hyphen
	 * replaces ss numbers with ###-##-####
	 */
	public static void PrintSS(String _input)
	{
		
		Pattern p = Pattern.compile("([0-9]{3}-{1}[0-9]{2}-{1}[0-9]{4})");
		Matcher m = p.matcher(_input);
		boolean found = false;
		while(m.find())
		{
			System.out.println(m.replaceAll("###-##-####"));
			found = true;
			
		}
		if (!found)
		{
			System.out.print(_input);
		}

	}
}
