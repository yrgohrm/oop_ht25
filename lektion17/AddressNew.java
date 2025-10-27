public record AddressNew(String name, String street, String zip, String city, String country) {
    
    // public AddressNew(String name) {
    //     this(name, "", "", "", "");
    // }
    
    
    @Override
    public String toString() {
        return String.format("""
        AddressNew:
            %s
            %s
            %s    
        """, name, street, zip);
    }


}
