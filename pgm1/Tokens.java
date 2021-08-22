package pgm1;

import java.util.StringTokenizer;

public class Tokens {public static void main(String args[])
	{
	String s="nikita,f,7338555485,05/09/2000,nikitaagarwal05092000@gmil.com";
	StringTokenizer st = new StringTokenizer(s,",");
	while(st.hasMoreTokens())
		System.out.println(st.nextToken());
	
	}

}
