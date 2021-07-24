package HackerRank;

public class JumpingClouds {
    static int Jumps(int[] a){
        int end = a.length-1;
        int index = 0;
        int steps = -1;//else loop will increase steps by 1 in every case
        while (end>=index){
            if(index+2<=end && a[index+2]==0){
                index = index + 2;
                steps++;
            }else{
                index++;
                steps++;
            }
        }
        return steps;
    }
    public static void main(String[] args) {
        int[] a = new int[]{0,0,1,0,0,1,0};
        System.out.println(Jumps(a));
    }
}
