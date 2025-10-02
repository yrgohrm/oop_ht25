public class Args {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.err.println("Fel kommandorad.");
            System.exit(-1);
        }

        int count = Integer.parseInt(args[0]);
        for (int i = 0; i < count; i++) {
            System.out.println("hello");
        }
    }
}
