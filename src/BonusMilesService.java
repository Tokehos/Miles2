public class BonusMilesService {
    public int calculate(int cost) {
        int miles = 20;  // цена за 1 милю //
        int bonus = cost / miles;
        return bonus;
    }
}
