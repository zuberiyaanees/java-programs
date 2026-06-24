import java.util.*;
class z3{
static int add(int x , int y){
return x+y;
}
public static void main(String[] args){
int a,b,s;
Scanner sc = new Scanner(System.in);
System.out.print("enter first number : ");
a=sc.nextInt();
System.out.print("enter second number : ");
b=sc.nextInt();
s=add(a,b);
System.out.println("Sum ="+s);
}
}
