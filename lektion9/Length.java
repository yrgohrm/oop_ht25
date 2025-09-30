public class Length {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4};
        String str = "fyra";

        System.out.println(arr.length);
        System.out.println(str.length());

        System.out.println(str.charAt(1));

        System.out.println(str.substring(1, 3));

        String str2 = str.replace("y", "x");
        System.out.println(str);
        System.out.println(str2);

        str = "hej " + str + " då";
    }
}
