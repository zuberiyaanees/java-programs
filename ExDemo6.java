import java.util.*;
class ExDemo6{
public static void main(String[] args){
int x,y,z;
Scanner sc = new Scanner(System.in);
try{
System.out.print("enter 1st number :");
x=sc.nextInt();
System.out.print("enter 2nd number :");
y=sc.nextInt();
z=x/y;
System.out.println("Result = "+ z);
}
catch(InputMismatchException ex1){
System.out.println("enter numbers only");
}
catch(ArithmeticException ex2){
System.out.println("Are you trying to / by zero?");
}
finally{
System.out.println("this is finally block");
}
}
}