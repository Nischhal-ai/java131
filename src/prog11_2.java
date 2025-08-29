public class prog11_2 {
    private int balance=10000;
    public void withdrawal(int amount) {
        if (amount > balance) {
            throw new prog11("Insufficient balance");
        } else {
            balance = balance - amount;
        System.out.println("Your amount has been withdrawl .");
        System.out.println("Remaining balance = " + balance);
    }
    }
}
