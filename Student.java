import java.util.Scanner;
public class Student
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the student name:");
String name=sc.nextLine();
System.out.println("enter the marks of java:");
double javamarks=sc.nextDouble();
System.out.println("enter the marks of python:");
double pythonmarks=sc.nextDouble();
System.out.println("enter the  marks of c:");
double cmarks=sc.nextDouble();
double total=javamarks+pythonmarks+cmarks;
double average=total/3;
System.out.println("student details:");
System.out.println("student name is:"+name);
System.out.println("java marks:"+javamarks);
System.out.println("python marks:"+pythonmarks);
System.out.println("c marks:"+cmarks);
System.out.println("total marks of the student is:"+total);
System.out.println("the average marks of the student is:"+average);
System.out.println(average>=40);
}
}

