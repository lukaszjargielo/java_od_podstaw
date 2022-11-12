public class Main {

    public static void main(String[] args) {

        Tv tv1 = new Tv();
        tv1.manufacturer = "Sony";
        tv1.type = "plasma";
        tv1.screenDiagonal = 65.6f;
        tv1.productionYear = 2022;
        tv1.isSmartTv = true;

        tv1.printBasicData();

    }
}
