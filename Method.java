import java.util.Scanner;
public class Method
{
static int add(int a,int b, int c)
{
return a+b+c;
}
static double average(int total)
{
return total/3;
}
static void check(double average)
{
if(average>=40){
System.out.println("pass");
}
else
{
System.out.println("fail");
}
}
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter a value:");
int a=sc.nextInt();
System.out.println("enter b value:");
int b=sc.nextInt();
System.out.println("enter c value:");
int c=sc.nextInt();
int total=add(a,b,c);
double average=average(total);
System.out.println("total="+total);
System.out.println("average="+average);
check(average);
}
}