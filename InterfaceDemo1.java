interface MyInterface{
void m1();
void m2();
}
class TestMyInterface implements MyInterface{
public void m1(){
System.out.println("this message from m1() method");
}
public void m2() {
System.out.println("this message from m2() method");
}
}
class InterfaceDemo1{
public static void main(String[] args){
TestMyInterface mi = new TestMyInterface();
mi.m1();
mi.m2();
}
}
   