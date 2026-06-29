class Rundog{
public void bark(){
System.out.println("sheruuu ....");
System.out.println("Bhauu.....bhauuu....");

}
}
class Bulldog extends Rundog{
public void growl(){
System.out.println("tuffy....");
System.out.println("gurrr..........gurrr...");
}
}
class InDemo2{
public static void main(String[] args){
Bulldog dog=new Bulldog();
dog.bark();
dog.growl();
}
}