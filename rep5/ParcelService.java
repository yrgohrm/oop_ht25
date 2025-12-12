import java.util.*;

public class ParcelService {
    record Parcel(String name, int weight) {}

    static class Truck {
        private final int maxWeight;
        private List<Parcel> parcels;

        public Truck(int maxWeight) {
            this.maxWeight = maxWeight;
            this.parcels = new ArrayList<>();
        }

        public void add(Parcel p) {
            int newTotalWeight = totalWeight() + p.weight();
            if (newTotalWeight > maxWeight) {
                throw new IllegalArgumentException("parcel does not fit!");
            }

            parcels.add(p);
        }

        public List<Parcel> getParcels() {
            return Collections.unmodifiableList(parcels);
        }

        public int totalWeight() {
            // int weight = 0;
            // for (Parcel p : parcels) {
            //     weight += p.weight();
            // }
            // return weight;

            return parcels.stream().mapToInt(Parcel::weight).sum();
        }
    }

    public static void main(String[] args) {
        Truck truck = new Truck(100);

        Parcel p1 = new Parcel("Partridge in a pear tree", 68);
        Parcel p2 = new Parcel("two turtle doves", 1);
        Parcel p3 = new Parcel("three french hens", 6);

        try {
            truck.add(p1);
            truck.add(p2);
            truck.add(p3);
        }
        catch (IllegalArgumentException ex) {
            System.out.println("some packages did not fit");
        }

        System.out.println(truck.getParcels());
    }
}
