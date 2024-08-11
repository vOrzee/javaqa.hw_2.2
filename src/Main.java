public class Main {
    public static void main(String[] args) {

        // Объявляете переменные для входных данных и
        // параметров программы: начального счёта,
        // суммы пополнения и тп

        // Условным оператором проверяете, превысила ли
        // сумма пополнения порог, и для этих двух разных
        // сценариев рассчитываете сумму бонуса и выводите
        // на экран.

        int balance = 1000;
        int bonusBound = 1000;
        int ratioBonus = 100;
        int bonus = 0;
        System.out.println("\nТекущий баланс: " + balance);
        int incomingPayment = 1234;
        System.out.println("Введите сумму пополнения: " + incomingPayment);

        balance += incomingPayment;
        if (incomingPayment > bonusBound) {
            bonus = (incomingPayment / ratioBonus);
            balance += bonus;
        }

        System.out.println("Ваш бонус: " + bonus);
        System.out.println("Ваш счёт: " + balance);
    }
}