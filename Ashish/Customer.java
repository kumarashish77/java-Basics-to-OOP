package in.Ashish;

public class Customer {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("0950","Ashish kumar");
        bankAccount.depositMoney(100);
        System.out.println(bankAccount.withdrawMoney(200));
        bankAccount.depositMoney(-100);
        bankAccount.withdrawMoney(0);
    }
}
