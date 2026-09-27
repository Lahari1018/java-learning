import java.util.Scanner;
public class Password
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the username:");
String username=sc.nextLine();
System.out.println("enter the Password:");
String password=sc.nextLine();
if(username.equals("student")&&password.equals("java123"))
{
System.out.println("login is successful");
System.out.println("username in uppercase is:"+username.toUpperCase());
System.out.println("Password in lowercase is:"+password.toLowerCase());
System.out.println("the length of the username is:"+username.length());
}
else
{
System.out.println("invalid usernameor password");
}
}
}