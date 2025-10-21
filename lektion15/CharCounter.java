import java.util.*;

public class CharCounter {
    private static String vowels = "aouåeiyäö";
    private static String consonants = "bcdfghjklmnpqrstvwxz";

    public static CharacterType getType(char ch) {
        char small = Character.toLowerCase(ch);
        if (vowels.indexOf(small) != -1) {
            return CharacterType.VOWEL;
        }

        if (consonants.indexOf(small) != -1) {
            return CharacterType.CONSONANT;
        }

        return CharacterType.OTHER;
    }

    public static void stringStats(String str) {
        int vowels = 0;
        int consonants = 0;
        int other = 0;

        for (char ch : str.toCharArray()) {
            CharacterType type = getType(ch);
            switch (type) {
                case VOWEL -> vowels++;
                case CONSONANT -> consonants++;
                case OTHER -> other++;
            }
        }

        System.out.printf(
                """
                    Vowels: %d
                    Consonants: %d
                    Other: %d
                        """, vowels, consonants, other);
    }

    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Skriv in en mening:");
            String str = input.nextLine();
            stringStats(str);
        }
    }
}
