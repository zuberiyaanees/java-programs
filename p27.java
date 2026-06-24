import java.util.*;
class p27{
public int volume(int l,int b,int h ){
return l*b*h;
}
public static void main(String[] args){

int x ,y ,z , v;
Scanner sc = new Scanner(System.in);
System.out.print("enter length of cuboid:");
x = sc.nextInt();
System.out.print("enter breadth of cuboid:");
y = sc.nextInt();

System.out.print("enter height of cuboid:");
z = sc.nextInt();
p27 p = new p27();
v = p.volume(x,y,z);
System.out.println("volume of cuboid :" + v);
}
}
