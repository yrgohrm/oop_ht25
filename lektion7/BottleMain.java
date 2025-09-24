public class BottleMain {
    public static void main(String[] args) {
        Bottle bottle = new Bottle();
        bottle.setVolume(100);
        System.out.println(bottle.getVolume());


        //-----------------------

        Bottle2 bottle2 = new Bottle2();
        bottle2.volumeInMillilitres = 100;
        System.out.println(bottle2.volumeInMillilitres);
    }
}
