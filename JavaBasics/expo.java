package JavaBasics;

public class expo {
    static void sample(){
        int n=127, i=0, s=0;
        while (n>10){
            int r = n%10;
            int p = 8^i;
            s = s + p*r;
            i++;
            n = n/10;
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        expo e = new expo();
        sample();
    }
}
