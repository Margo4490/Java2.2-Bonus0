public class Main {
    public static void main(String[] args) {

     // вход
      int initialAccount = 100;
      int depositAmount = 100;
      int bonus = 1;
      int theAmountForTheBonus = 100;

      // условие
       int bonusAmount;
       if (depositAmount > 1000) {
            bonusAmount = depositAmount / theAmountForTheBonus;
           } else {
           bonusAmount = 0;
       }
       int totalAmount = initialAccount + bonusAmount +depositAmount;

           System.out.println("Ваш бонус: " + bonusAmount );
           System.out.println("Баланс Вашего счета: " + totalAmount);

       int receivedBonus = 0;
       int balance = 200;
    }
}