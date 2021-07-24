package Programs.easy.leetcode;


class A {
    public int add(int a, int b) {
        System.out.println("I am in A");
        return a + b;
    }
}
    class B extends A {
        public int add(int a, int b, int c) {
            System.out.println("I am in b 3");
            return a + b + c;
        }
      public int add(int a, int b) {
            System.out.println("I am in b");
            return a + b;
        }
    }
        class c extends A {
            public  String add(String s) {
                return s;
            }
            public  int add(int a,int b)
            {
                System.out.println("I am in c");

                return a+b;
            }
        }
public class JavaOverride extends  A{
public static  void  main (String args[])
{
    A test3 = new JavaOverride();
    A test = new A();
    A test1 = new B();
    A test2 = new c();
    c test4 = new c();
    B test5 = new B();
    System.out.println(test.add(3,5));
    System.out.println(test1.add(1,2));
    System.out.println(test2.add(1,1));
    System.out.println(test1.add(7,7));
    System.out.println(test3.add(0,7));
    System.out.println(test4.add("string"));
    System.out.println(test5.add(1,2,3));
}
    public  int add(int a,int b)
    {
        System.out.println("I am in BOSS");

        return a+b;
    }


}
