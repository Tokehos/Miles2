public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();

        int cost = 10000;
        int bonus = service.calculate(cost);
        System.out.println(bonus);

        int cost1 = 20000;
        int bonus1 = service.calculate(cost1);
        System.out.println(bonus1);

        int cost2 = 30000;
        int bonus2 = service.calculate(cost2);
        System.out.println(bonus2);

        int cost3 = 40000;
        int bonus3 = service.calculate(cost3);
        System.out.println(bonus3);
    }
}

