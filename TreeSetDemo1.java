import java.util.*;
class TreeSetDemo1{
public static void main(String[] args){
TreeSet<Integer> ts  = new TreeSet<Integer>();
ts.add(10);
ts.add(15);
ts.add(20);
ts.add(5);
System.out.println("element of TreeSet");
for(Integer n:ts){
System.out.println(n);
}
}
}
