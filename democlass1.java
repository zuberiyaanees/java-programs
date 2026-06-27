class Employee {
int empid;
String empname;
double salary;

public void setvalue(int eid , String ename , double sal){
empid = eid;
empname = ename;
salary = sal;
}
public void display(){
System.out.println("employee id = " + empid);
System.out.println(" employee name = " + empname);
System.out.println(" employee salary = " + salary);
}
}

class Democlass1{
public static void main(String[] args){
Employee e1 = new Employee();
Employee e2 = new Employee();
e1.setvalue(1001 , "Prince" , 80000);
e2.setvalue(1002 , "vaibhav" , 50000);
e1.display();
e2.display();
}
}


