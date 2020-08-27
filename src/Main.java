public class Main {
    public static void main(String[] args) {
        long balance = 100;
        int replenishment = 2100;
        long totalBonus;
        if (replenishment < 1000) {
            System.out.print("Your balance =  0 ");
        }
        else {
            totalBonus = replenishment / 100;
            System.out.println("Your bonus = " + totalBonus);
                    }

    }
}
