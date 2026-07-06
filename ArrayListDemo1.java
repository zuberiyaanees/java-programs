import java.util.*;
class ArrayListDemo1{
public static void main(String[] args){
ArrayList<String>al=new ArrayList<String>();
al.add("c");
al.add("c++");
al.add("java");
al.add("python");
al.add("c#");
//System.out.println(al);
System.out.println("list of programming languages");
for(String p:al){
System.out.println(p);
}
}
}