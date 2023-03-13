public class BonusMilesService {

    public int calculate(int cost) {

        int bonus = cost / 20; // стоимость билета / на количество миль для 1 бонуса
        return bonus;
    }

}
