import java.util.*;
class ArrayListDemo2{
public static void main(String[]  args){
ArrayList<Integer> al = new ArrayList<Integer>();
al.add(10);
al.add(5);
al.add(15);
al.add(20);
al.add(6);
System.out.println("original list="+al);
Collections.sort(al);
System.out.println("list in ascending order="+al);
Collections.reverse(al);
System.out.println("list in descending order =" +al);
}
}