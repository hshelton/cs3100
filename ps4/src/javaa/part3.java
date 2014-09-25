package javaa;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class part3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneNumberCount(readInput());
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
     * Count the number of times a telephone number formatted as (xxx) xxx-xxxx appears in the input and write this count to the output
	 */
	public static void PhoneNumberCount(String _input)
	{	
	
		String openLiteral = Pattern.quote("(");
		String closeLiteral = Pattern.quote(")");
			
		String pString  = openLiteral + "([0-9]{3}" + closeLiteral + " [0-9]{3}-[0-9]{4})";
		Pattern p = Pattern.compile(pString);
		Matcher m = p.matcher(_input);
		int count = 0;
		while(m.find())
		{
			count ++;
		}
		System.out.println(count);

	}
}
