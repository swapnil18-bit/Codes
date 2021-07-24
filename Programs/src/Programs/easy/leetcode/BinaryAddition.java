package Programs.easy.leetcode;

public class BinaryAddition {
    public static void main(String[] args) {
        String s1 = "11";
        String s2 = "1";
        int a = Integer.parseInt(s1, 2);
        int b = Integer.parseInt(s2, 2);
        int output = a + b;
        System.out.println(Integer.toBinaryString(output));
    }
}
