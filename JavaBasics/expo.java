package JavaBasics;

class A{
    public void display(){
        System.out.println("parent 1");
    }
    public void show(){
        System.out.println("iuuaebgvyhu");
    }
}
class B extends A{
    public void display(){
        System.out.println("child");
    }

}
class C extends B{
    B obj = new B();
    public void display(){
        obj.display();
    }
}
public class expo {

    public static void main(String[] args) {
        C obj = new C();
        obj.show();
        obj.display();
    }
}
