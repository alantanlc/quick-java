public class Account {
    private int funds = 0;

    void deposit(int amount) {
        // amount must be positive else we end up deducting from funds
        if (amount > 0) {
            funds += amount;
        }
    }

    void withdraw(int amount) throws Exception {
        // amount must be positive else we end up increasing the funds
        if (amount <= 0) {
            throw new Exception("Cannot withdraw negative amount);
        }

        // ensure that there is sufficient funds before deducting amount
        if (funds >= amount) {
            funds -= amount;
        } else {
            throw new Exception("Insufficient funds");
        }
    }

    int getBalance() {
        return funds;
    }

    void transferFrom(Account other, int amount) throws Exception {
        other.withdraw(amount);
        deposit(amount);
    }

    public static void main(String[] args) throws Exception {
        Account john = new Account();
        Account mary = new Account();
        john.deposit(100);
        mary.transferFrom(john, 75);
        System.out.println(john.getBalance());
    }
}

