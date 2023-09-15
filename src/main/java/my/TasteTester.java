package my;

public class TasteTester {
    public static void main(String[] args) {
        BirthdayCake bdayCake = new BirthdayCake();
        bdayCake.setPrice(100.0);

        WeddingCake wCake = new WeddingCake();

        wCake.setPrice(10.0);
        wCake.setFlavor("vanilla");
        wCake.setTiers(30);
        bdayCake.setCandles(100);
        System.out.println(wCake.getFlavor() + wCake.getTiers() + wCake.getPrice());
        System.out.println(bdayCake.getCandles()+ bdayCake.getPrice());
    }
}
