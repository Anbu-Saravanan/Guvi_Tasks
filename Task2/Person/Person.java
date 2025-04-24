package AssignmentPurpose.Task2.Person;

public class Person {
    private String name;
    private int age;

    public Person(String name){
        this.name=name;
        age = 18;
    }
    public Person(String name, int age){
        this.name = name;
        this.age = age;

    }
    public void display(){
        System.out.println("Person name is: "+ name + "\nAge is: "+ age);
    }

    public static void main(String[] args) {
        Person person = new Person("Saravanan");
        Person person1 = new Person("Alex",36);

        person.display();
        System.out.println("-----");
        person1.display();
    }
}
