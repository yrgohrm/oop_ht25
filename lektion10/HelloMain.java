public class HelloMain {
    public static void main(String[] args) {
        Person p1 = new Person("Bosse");
        Person p2 = new Student("Nisse", "Java25");

        p1.sayHello();
        p2.sayHello();

        foo(p2);
    }

    public static void foo(Person p) {
        // do stuff
        if (p instanceof Student student) {
            System.out.println("Är en student");
            System.out.println("och läser " + student.getProgram());
        }
        else {
            System.out.println("är inte en student");
        }
    }
}
