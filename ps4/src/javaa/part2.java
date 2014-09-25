package javaa;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		//read input until EOF and call PrintSS method
		PrintCommentRemoved(readInput());
	

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
	*Print the input with every Java-style single-line comment (beginning with // and ending with the end of the line) removed
	 */
	public static void PrintCommentRemoved(String _input)
	{

	
	
		Pattern p = Pattern.compile("(//.*)");
		Matcher m = p.matcher(_input);
		boolean found = false;
		while(m.find())
		{
			System.out.println(m.replaceAll(""));
			found = true;
			
		}
		if (!found)
		{
			System.out.print(_input);
		}
		

		
		
	}
	
	 

}



















