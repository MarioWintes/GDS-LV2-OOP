public class PersonDemoApp {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.firstname = "Hermann";
        person1.lastname = "Maier";
        person1.age = 31;
        person1.height = 187;

        System.out.println("person1.firstname = " + person1.firstname);
        System.out.println("person1.lastname = " + person1.lastname);
        System.out.println("person1.age = " + person1.age);
        System.out.println("person1.height = " + person1.height);
        
    }
}
