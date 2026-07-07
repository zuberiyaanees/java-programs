import java.util.*;
class Employee{
int empid;
String empname;
double salary;
Employee(int eid , String ename , double sal){
empid=eid;
empname=ename;
salary=sal;
}
}
class ArrayListDemo3{
public static void main(String[] args){
ArrayList<Employee> al = new ArrayList<Employee>();
Employee e1=new Employee(1001,"Rohit",80000.0);
Employee e2=new Employee(1002,"Sabhan",50000.0);
Employee e3=new Employee(1003,"Arzuu",90000.0);
al.add(e1);
al.add(e2);
al.add(e3);
System.out.println("Details of employees");
for(Employee e:al){
System.out.println(e.empid+"\t"+e.empname+"\t"+e.salary);
}
}
}