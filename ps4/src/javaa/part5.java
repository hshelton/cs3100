package javaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part5 {

	public static void main(String[] args)
	{
		PrintStrings(readInput());
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
 * Print the input with every HTML tag removed.  For our purposes, 
 * an HTML tag starts with a < and ends with the next > (not necessarily on the same line) or the 
 * end of the file.  Any > that appears within a properly-formatted string does not close the tag.
 */
public static void PrintStrings(String _input)
{

	
	String pString  = "(<.*?[\n]*>(?!\"))";
	Pattern p = Pattern.compile(pString);
	Matcher m = p.matcher(_input);
	boolean found = false;
	while(m.find())
	{
		found = true;
		System.out.println(m.replaceAll(""));
		
	}
	if(!found)
	{
		System.out.print(_input);
	}
	
	
}

}
