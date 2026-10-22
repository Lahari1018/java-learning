import java.util.Scanner;
public class StringAnalyzer
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a sentence:");
String sentence=sc.nextLine();
System.out.println("number of characters in a sentence is:"+ sentence.length());
System.out.println("the sentence in upper case is:"+ sentence.toUpperCase());
System.out.println("the sentence in lower case:"+ sentence.toLowerCase());
System.out.println("the first character is:"+ sentence.charAt(0));
sc.close();
}
}

