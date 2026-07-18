import java.util.*;
class LinkedHashDemo1{
public static void main(String[] args){
LinkedHashSet<Integer>hs = new LinkedHashSet<Integer>();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(10);
System.out.println("elements of set");
for(Integer n:hs){
System.out.println(n);
}
}
}

