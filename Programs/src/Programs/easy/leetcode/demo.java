package Programs.easy.leetcode;

public class demo {
    void a(){
        System.out.println("1st method");
    }
    void b(){
        System.out.println("2nd");
        this.a();
    }
    public static void main(String[] args) {
        demo d = new demo();
        d.a();
        d.b();
    }
}
