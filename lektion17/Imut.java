public class Imut {
    public static void main(String[] args) {
        AddressNew addr = new AddressNew("Bosse", "Storgatan 1", "412 50", "Göteborg", "SWEDEN");

        AddressNew addr2 = new AddressNew(addr.name() + " Bredsladd",
                addr.street(), addr.zip(), addr.city(), addr.country());

        System.out.println(addr2);
    }
}
