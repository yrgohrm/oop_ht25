public class Ex4 {
    private static String vowels = "aouåeiyäöAOUÅEIYÄÖ";
    private static String consonants = "bcdfghjklmnpqrstvwxz";

    public static String robber(String str) {
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char chLower = Character.toLowerCase(ch);
            if (consonants.indexOf(chLower) != -1) {
                res.append(ch);
                res.append("o");
                res.append(chLower);
            }
            else {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static String robber2(String str) {
        StringBuilder res = new StringBuilder();
        for (char ch : str.toCharArray()) {
            char chLower = Character.toLowerCase(ch);
            if (consonants.indexOf(chLower) != -1) {
                res.append(ch);
                res.append("o");
                res.append(chLower);
            }
            else {
                res.append(ch);
            }
        }

        return res.toString();
    }

    public static void main(String[] args) {
        System.out.println(robber2("hej"));
        System.out.println(robber2("Hej på er alla glada!"));
    }
}
