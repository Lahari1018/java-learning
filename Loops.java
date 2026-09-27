import java.util.Scanner;
public class Loops
{
public static void main(String args[])
{
int evencount=0;
int oddcount=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter a number:");
int num=sc.nextInt();
for(int i=1;i<=num;i++)
{
System.out.println(i);
if(i%2==0)
{
evencount++;
}
else
{ oddcount++;
}
System.out.println("even count="+evencount);
System.out.println("odd count="+oddcount);
}
if(num%2==0)
System.out.println("the number is even");
else
System.out.println("the number is odd");
for(int i=1;i<=num;i++)
{
if(i==6)
{
continue;
}
if(i==8)
{
break;
}
System.out.println(i);
}
}
}
