package fundamentalsOfCoding;
//take a string as a input from the user
//using for loop transverse througgh string
//split the string

import java.util.Scanner;

public class StringExample {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	System.out.print("enter a string to print words of it:");
	String str=in.nextLine();
	toPrintwordsInAString(str);

	}

	private static void toPrintwordsInAString(String str) {
		// TODO Auto-generated method stub
		String word="";
		String []words=new String[0];
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i) !=' ') {
				word=word+str.charAt(i);
				
			}
			else {
				String[] oddWords=new String[words.length+1];
				for(int j=0;j<word.length();j++) {
					oddWords[j]=
					
				}
				 
			}
		}
			//System.out.print(word);
		
			
		
		
	}

}
