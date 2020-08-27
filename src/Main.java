public class Main {
    public static void main(String[] args) {
        long balance = 100;
        int replenishment = 1010;
        long bonusPercent = 1;
        long totalBonus;
        long totalBalance;
        if (replenishment < 1000) {
            System.out.print("Your balance = ");
            totalBalance = balance + replenishment;
            System.out.println(totalBalance);
        } else {
            totalBonus = replenishment / 100 * bonusPercent;
            totalBalance = balance + replenishment + totalBonus;
            System.out.print("Your bonus = ");
            System.out.println(totalBonus);
            System.out.print("Your balance = ");
            System.out.println(totalBalance);
        }

    }
}
