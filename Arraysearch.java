import java.util.Scanner;
public class Arraysearch
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the size of array:");
int n=sc.nextInt();
int[] number=new int[n];
System.out.println("enter the elements:");
for(int i=0;i<n;i++)
{
number[i]=sc.nextInt();
}
System.out.println("the array elements are:");
for(int i=0;i<n;i++)
{
System.out.println(number[i]);
}
System.out.println("enter the element to search in array:");
int search=sc.nextInt();
Boolean found=false;
for(int i=0;i<n;i++)
{
if(number[i]==search)
{
found=true;
break;
}
}
if(found==true)
{
System.out.println("element found");
}
else
{
System.out.println("not found");
}
}
}

