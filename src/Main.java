public class Main {
    public static void main(String[] args) {

        int bonus = 0;
        int amount = 1200;
        boolean bonus1 = amount > 1000;
        if (bonus1) {
            bonus = amount / 100;
        } else {
            bonus = 0;
        }
        System.out.println("Сумма покупки");
        System.out.println(amount);
        System.out.println("Бонус за покупку");
        System.out.println(bonus);
        System.out.println("Итоговый счет");
        System.out.println(amount + bonus);
    }
}