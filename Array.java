import java.util.Scanner;
public class Array
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array:");
int n=sc.nextInt();
int[] marks=new int[n];
System.out.println("enter the elements of array;");
for(int i=0;i<n;i++)
{
marks[i]=sc.nextInt();
}
System.out.println("array elemnts are:");
for(int i=0;i<n;i++)
{
System.out.println(marks[i]);
}
System.out.println("=====student marks====");
for(int i=0;i<n;i++)
{
System.out.println("index["+i+"]="+marks[i]);
}
}
}
