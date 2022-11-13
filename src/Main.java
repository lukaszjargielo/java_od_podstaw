public class Main {
    public static void main(String[] args) {

    Wallet wallet = new Wallet(3000.00f);

    for(int i = 1; i <= 6; i++) {
        System.out.println("Month " + i);
        wallet.addMoney(5000.00f);
        wallet.removeMoney(2000.00f);
        wallet.removeMoney(1000.00f);
        wallet.printAmount();

    }

    }
}
