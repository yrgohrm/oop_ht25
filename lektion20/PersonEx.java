import java.util.*;

public class PersonEx {
    enum Animal {
        DOG,
        CAT,
        BIRD,
        FISH,
        OTHER
    }

    record Person(String name, int age, Animal favorite) {
    }

    public static void main(String[] args) {
        List<Person> database = List.of(
                new Person("Moa", 25, Animal.CAT),
                new Person("Bosse", 64, Animal.OTHER),
                new Person("Lena", 45, Animal.CAT),
                new Person("Karin", 32, Animal.DOG),
                new Person("Johan", 19, Animal.BIRD),
                new Person("Sara", 28, Animal.CAT),
                new Person("Erik", 52, Animal.DOG),
                new Person("Nils", 71, Animal.OTHER),
                new Person("Anna", 34, Animal.DOG),
                new Person("Pontus", 41, Animal.FISH),
                new Person("Elin", 23, Animal.CAT),
                new Person("Markus", 29, Animal.OTHER),
                new Person("Camilla", 37, Animal.BIRD),
                new Person("Rasmus", 46, Animal.CAT),
                new Person("Ylva", 55, Animal.DOG),
                new Person("Oskar", 62, Animal.FISH),
                new Person("Hanna", 21, Animal.OTHER),
                new Person("Gabriel", 27, Animal.CAT),
                new Person("Tove", 48, Animal.DOG),
                new Person("Felix", 33, Animal.BIRD),
                new Person("Emilia", 30, Animal.CAT),
                new Person("Stefan", 69, Animal.OTHER),
                new Person("Petra", 58, Animal.DOG),
                new Person("Viktor", 26, Animal.FISH),
                new Person("Lovisa", 24, Animal.CAT),
                new Person("Isak", 39, Animal.OTHER),
                new Person("Miriam", 44, Animal.DOG),
                new Person("Joel", 50, Animal.BIRD),
                new Person("Sofie", 31, Animal.CAT));

        var catLadies = database.stream()
            // .filter(PersonEx::isCatLover)
            .filter(p -> p.favorite() == Animal.CAT)
            // .filter(PersonEx::isOld)
            .filter(p -> p.age() >= 45)
            .map(Person::name)
            .toList();

        for (String name : catLadies) {
            System.out.println(name);
        }
    }

    private static boolean isCatLover(Person p) {
        return p.favorite() == Animal.CAT;
    }

    private static boolean isOld(Person p) {
        return p.age() >= 45;
    }
}
