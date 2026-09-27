class Student
{
String name;
int rollno;
int marks1;
int marks2;
int marks3;
static int total(int a,int b,int c)
{
return a+b+c;
}
static Double average(int total)
{
return total/3.0;
}
void display()
{
int totalmarks=total(marks1, marks2, marks3);
Double averagemarks=average(totalmarks);
System.out.println("=======STUDENT DETAILS======");
System.out.println("name of the student:"+name);
System.out.println("roll no:"+rollno);
System.out.println("mark1:"+marks1);
System.out.println("marks:"+marks2);
System.out.println("marks:"+marks3);
System.out.println("total marls of the student:"+totalmarks);
System.out.println("average marks of the student:"+averagemarks);
}
}
public class Classobject
{
public static void main(String args[])
{
Student s1=new Student();
s1.name="lahari";
s1.rollno=123;
s1.marks1=90;
s1.marks2=98;
s1.marks3=96;
s1.display();
}
}

 