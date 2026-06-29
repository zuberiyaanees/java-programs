class Shape {
int s; //Instance variable
public void setValue(int side) {
s=side;
}
}
class Square extends Shape {
public int area() {
return s*s;
}
}
class Cube extends Shape {
public int volume() {
return s*s*s;
}
}
class InDemo3 {
public static void main(String [] args) {
Square sq=new Square();
sq.setValue(10);
System.out.println("Area of square="+sq.area());
Cube cu=new Cube();
cu.setValue(5);
System.out.println("Volume of cube="+cu.volume());
}
}