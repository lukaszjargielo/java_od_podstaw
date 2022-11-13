public class Wallet {
    float money;

    public Wallet() {
        this.money = 0.00f;
    }

    public Wallet(float cashAmount) {
        this.money = cashAmount;
    }

    public void addMoney(float income) {
        this.money += income;
    }
    public void removeMoney(float expenses) {
        this.money -= expenses;
    }
    public void printAmount() {
        System.out.println("Amount of cash in wallet: " + money + "z³");
    }
}
