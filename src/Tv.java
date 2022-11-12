public class Tv {
    String manufacturer;
    String type;
    int productionYear;
    float screenDiagonal;
    boolean isSmartTv;

    public void printBasicData(){
        System.out.println("Manufacturer: " + this.manufacturer
        + "\ntype: " + this.type + " \nscreen diagonal: " + this.screenDiagonal + " inch");
    }
}
