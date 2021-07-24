package general.programs;

public class TotalEnergyProduced {
    static int totalEnergy(int initialEnergy, int rate, int time){
        int curEnergy = initialEnergy;
        int finalEnergy = 5;
        for (int i = 1; i < time; i++) {
            curEnergy = curEnergy + rate;
            finalEnergy = finalEnergy + curEnergy;
        }
        return finalEnergy;
    }
    public static void main(String[] args) {
        int initialEnergy = 5;
        int rate = 3;
        int sec = 3;
        System.out.println(totalEnergy(initialEnergy, rate, sec));
    }
}
