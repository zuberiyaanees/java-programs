import java.util.*;
class LinkedListDemo1{
public static void main(String[] args){
LinkedList<String> al =new LinkedList <String>();
al.add("Rohit");
al.add("Mohit");
al.add("Mudit");
al.add("Nawaz");
al.add(2,"Sadaf");
System.out.println(al);
System.out.println("list of my friends");
for(String name:al){
System.out.println(name);
}
}
}