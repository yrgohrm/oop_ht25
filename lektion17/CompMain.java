public class CompMain {
    public static void main(String[] args) {

        Address addr = new Address("Smågatan 1", "412 50", "Lillbyn", "SWEDEN");

        Company acme = new Company("ACME AB", "5562-691234", addr);

        System.out.println(addr);
        System.out.println(acme);
        System.out.printf("%s, org: %s, address: %s%n",
            acme.name(), acme.orgNo(), acme.address());
    }
}
