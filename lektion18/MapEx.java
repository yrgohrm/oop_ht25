import java.util.HashMap;
import java.util.Map;

public class MapEx {
    public static void main(String[] args) {
        Map<String, String> addressBook = new HashMap<>();
        
        addressBook.put("Hans Ramberg", "Programmerargränd 2");
        addressBook.put("Elin Lahti", "Storgatan 12B");
        addressBook.put("James Smith", "Tellus Drive 27");

        for (String key : addressBook.keySet()) {
            System.out.println(key);
        }

        for (String value : addressBook.values()) {
            System.out.println(value);
        }

        for (Map.Entry<String, String> entry : addressBook.entrySet()) {
            System.out.println(entry.getKey() 
                               + " bor på " + entry.getValue());
        }

        String elinsAddress = addressBook.get("Elin Lahti");
        System.out.println(elinsAddress);
    }
}
