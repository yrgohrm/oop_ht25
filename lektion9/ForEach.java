public class ForEach {
    public static void main(String[] args) {
        String[] names = { "Nisse", "Lena", "Bosse", "Leyla", "Sebastian" };

        // for (int i = 0; i < names.length; i++) {
        //     System.out.println(names[i]);
        // }
        
        for (String name : names) {
            System.out.println(name);
        }
    }
}
