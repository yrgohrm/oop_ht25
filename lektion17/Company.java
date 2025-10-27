import java.util.*;

public record Company(String name, String orgNo, Address address) {
    public Company {
        Objects.requireNonNull(name, "name must not be null");
        Objects.requireNonNull(orgNo, "orgNo must not be null");
        Objects.requireNonNull(address, "address must not be null");

        if (orgNo.length() != 11) {
            throw new IllegalArgumentException("orgNo must be 10 digits");
        }
    }

    @Override
    public String toString() {
        return String.format("""
                Company: %s (%s)
                Address:
                    %s
                    %s
                    %s
                    %s
                """, name, orgNo, address.street(),
                address.zip(), address.city(), address.country());
    }
}
