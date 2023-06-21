class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

public class encapsulation {
    public static void main(String args[]) {
        Person p1 = new Person("John", 30);
        System.out.println("Name: " + p1.getName());
        System.out.println("Age: " + p1.getAge());

    }
}
