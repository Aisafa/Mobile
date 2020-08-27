public class Main {
    public static void main(String[] args) {
        long balance = 500;
        int replenishment = 1000;
        long bonusPercent = 3;
        long totalBonus = replenishment/100*bonusPercent;
        long totalBalance = balance+replenishment+totalBonus;
        System.out.print("Your bonus = ");
        System.out.println(totalBonus);
        System.out.print("Your balance = ");
        System.out.println(totalBalance);
    }
}
