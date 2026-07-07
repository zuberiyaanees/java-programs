import java.util.*;
class LinkedListDemo2{
public static void main(String[] args){
LinkedList<String> al = new LinkedList<String>();
al.add("c");
al.add("c++");
al.add("java");
al.add("python");
Iterator it=al.iterator();
while(it.hasNext()){
System.out.println(it.next());
}
}
}

