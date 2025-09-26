package cars;
public class DrivingTestMain {
    public static void main(String[] args) {
        BugattiChiron bugatti = new BugattiChiron();
        VolvoV70 volvo = new VolvoV70();
        FordSMax max = new FordSMax();

        TheStig.testDrive(bugatti);
        TheStig.testDrive(volvo);
        TheStig.testDrive(max);

        TheStig.streetTest(volvo);
    }
}
