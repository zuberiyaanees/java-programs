
import java.util.*;
class Figure{
public int area(int s){
return s*s;
}
public int area(int l , int b){
return l*b; 
}
}
class OverloadingDemo4{
public static void main(String[] args){
Figure fig = new Figure();
int s,l, b, a1,a2;
Scanner sc=new Scanner(System.in);
System.out.print("enter side of square :");
s=sc.nextInt();
System.out.print("enter length of rectangle : ");
l=sc.nextInt();
System.out.print("enter breadth of rectangle : ");
b=sc.nextInt();
a1=fig.area(s);
a2=fig.area(l,b);
System.out.println("Area of square=" + a1);
System.out.println("Area of rectangle=" +a2);
}
}
