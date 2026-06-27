class Base {
public void ShowBase(){
System.out.println("this is Base class");

}
}
class Derived extends Base{
public void ShowDerived() {
System.out.println("this is derived class ");
}
}
class InDemo1 {
public static void main(String[] args){
Derived obj = new Derived() ;
obj.ShowBase();
obj.ShowDerived();
}
}