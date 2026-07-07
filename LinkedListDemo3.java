import java.util.*;
class Student{
int id;
String name;
Student(int sid , String sname){
id=sid;
name=sname;
}
}
class LinkedListDemo3{
public static void main(String[] args){
LinkedList<Student> l=new LinkedList<Student>();
Student e1=new Student(1001 , "Zuberiya" );
Student e2=new Student(1002, " Afiya" );
Student e3=new Student(1003 , "Kaif" );
Student e4=new Student(1004 , "Arzu" );
l.add(e1);
l.add(e2);
l.add(e3);
l.add(e4);
System.out.println("Details of Student");
for(Student s:l){
System.out.println(s.id + "\t"+ s.name + "\t");
}
}
}

