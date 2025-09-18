public class PlusPlus {
    public static void main(String[] args) {
        int i = 1;
        int foo = 3 * ++i;

        int j = 1;
        int bar = 3 * j++;
        
        System.out.println("i=" + i);
        System.out.println("j=" + j);
        System.out.println("foo=" + foo);
        System.out.println("bar=" + bar);
    }
}
