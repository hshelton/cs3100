package javaa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part4 {

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
 * Print every properly-formatted string that appears in the input.  
 * A properly-formatted string begins with a quote mark (") and ends with the next quote mark (that isn't preceded by a backslash) on the same line.
 * @param _input
 */
public static void PrintStrings(String _input)
{

	String bck = Pattern.quote("\\");
	String pString  =  "(\".*(?<!" + bck + ")\")";
	Pattern p = Pattern.compile(pString);
	Matcher m = p.matcher(_input);

	while(m.find())
	{
		System.out.println(m.group());
	}

	
	
}

}
