package JavaBasics;

class A{
     void display(){
        System.out.println("parent");
    }
}
class B extends A{
    void display(){
        System.out.println("child");
    }
}
public class expo {
    public static void main(String[] args) {
            B obj = new B();
            obj.display();
    }
}
