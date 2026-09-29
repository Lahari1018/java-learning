class Student
{
String name;
int rollno;
int java;
int c;
int python;
Student(String n,int r,int j,int c,int p)
{
name=n;
rollno=r;
java=j;
c=c;
python=p;
}
int sum()
{
return java+c+python;
}
double average()
{ 
return sum()/3.0;
}
void check()
{
if(average()>=40)
System.out.println("result :pass");
else
System.out.println("result:fail");
}
void display()
{
System.out.println("====STUDENT DETAILS====");
System.out.println("name:"+name);
System.out.println("roll no:"+rollno);
System.out.println("java marks:"+java);
System.out.println("c marks:"+c);
System.out.println("pyrthon marks:"+python);
System.out.println("total:"+sum());
System.out.println("average:"+average());
check();
}
}
public class Constructor
{
public static void main(String args[])
{
Student s1=new Student("lallu",123,98,90,87);
s1.display();
}
}


